// 申明一个对象，作为stomp客户端
var stompClient = null;

// 浏览器加载页面后调用connect()，打开websocket通道
$(function () {
    connect();
})

// 打开通道
function connect() {
    // 连接ScokJS的endpoint,名称路径为/chatRoom/singleChat
    var socket = new SockJS("/chatRoom/endpointMark");
    // 使用Stomp协议的WebSocket客户端
    stompClient = Stomp.over(socket);
    // 连接客户端
    stompClient.connect({},function (frame) {
        // frame是服务端给客户端的应答
        console.log("connect " + frame);
        // 连接之后，订阅mass
        stompTopic();
    });
}
// 订阅mass
function stompTopic() {
    stompClient.subscribe("/mass",function (response) {
        // 第一个参数：订阅地址；第二个参数：发布的数据
        //打印返回信息
        console.log("response： " + response);
    })
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
    alert("JSON.stringify(postValue)-->"+JSON.stringify(postValue));
    // 通过stompClient.send()向指定地址发送消息。第一个参数：地址；第二个参数：；第三个参数：内容
    stompClient.send("/massRequest",{},JSON.stringify(postValue));

}
