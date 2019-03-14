// 申明一个对象，作为stomp客户端
var stompClient = null;

// 浏览器加载页面后调用connect()，打开websocket通道
$(function () {
    connect();
})

// 打开通道
function connect() {
    // 连接ScokJS的endpoint,名称路径为/singleChat
    var socket = new SockJS("/endpointMark");
    // 使用Stomp协议的WebSocket客户端
    stompClient = Stomp.over(socket);
    // 连接客户端
    stompClient.connect({},function (frame) {
        // frame是服务端给客户端的应答
        console.log("connect --> " + frame);
    })
}
// 订阅mass
function stompTopic() {
    // 设置订阅id
    var sendId = {};
    // 获取发送者的姓名
    var userId =  $("#userName").val();
    // 赋值
    sendId.id = userId;
    stompClient.subscribe("/mass",function (response) {
        // 第一个参数：订阅地址；第二个参数：发布的数据
        //打印返回信息
        console.log("response--> " + response);
        // 获取原聊天内容，拼接新的内容
        var oldContext = $("#chatContext").val() + "\n";
        var newContextJson = JSON.parse("{" +response.toString().split("{")[1]);
        var newContext = newContextJson.senderId + ": " + newContextJson.sendInfo;
        var allContext = oldContext + newContext;
        // 在页面中现在出所有的消息
        $("#chatContext").val(allContext);
    },sendId)
}
// 发送消息
function sendMassMessage() {
    // 获取输入框的信息
    var postValue = {};
    var chatValue = $("#sendChatValue").val();
    var userName = $("#userName").val();
    // 发送者的名字

    postValue.senderId = userName;
    // 发送的内容
    postValue.sendInfo = chatValue;
    // 校验用户
    if (null == userName){
        alert("请输入姓名!");
        return;
    }
    if (null == chatValue || "" == chatValue){
        alert("不能发送空白消息!");
        return;
    }
    // 通过stompClient.send()向指定地址发送消息。第一个参数：地址；第二个参数：；第三个参数：内容
    stompClient.send("/massRequest",{},JSON.stringify(postValue));
}

// 发起私聊订阅
function stompQueue() {
    // 设置订阅id
    var sendId = {};
    // 获取发送者的姓名
    var userId =  $("#loginName").val();
    alert(userId)
    // 赋值
    sendId.id = userId;
        // 通过stompClient.subscribe订阅目标发送的消息（队列接收消息）
    stompClient.subscribe('/queue/'+ userId + '/alone',
        function (response) {
            console.log("response--> " + response);
            // 获取原聊天内容，拼接新的内容
            var oldContext = $("#chatContext").val() + "\n";
            var newContextJson = JSON.parse("{" +response.toString().split("{")[1]);
            var newContext = newContextJson.senderId + ": " + newContextJson.sendInfo;
            var allContext = oldContext + newContext;
            // 在页面中现在出所有的消息
            $("#chatContext").val(allContext);
    },sendId);
}

// 发送消息
function sendAloneMessage() {
    // 获取输入框的信息
    var postValue = {};
    var chatValue = $("#sendChatValue").val();
    var userId = $("#userId").val();
    var loginName = $("#loginName").val();
    var receiverId = $("#receiverId").val();
    // 发送者的名字
    postValue.senderId = userId;
    postValue.loginName = loginName;
    // 发送的内容
    postValue.sendInfo = chatValue;
    // 接收者的名字
    postValue.receiverId = receiverId;
    // 校验用户
    if (null == userName){
        alert("请输入姓名!");
        return;
    }
    if (null == receiverId){
        alert("请选择接受收者!");
        return;
    }
    if (null == chatValue || "" == chatValue){
        alert("不能发送空白消息!");
        return;
    }
    // 通过stompClient.send()向指定地址发送消息。第一个参数：地址；第二个参数：；第三个参数：内容
    stompClient.send("/singleRequest",{},JSON.stringify(postValue));
}
