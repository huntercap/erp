
/**
 * Created by Administrator on 2017/3/13.
 */
/*
$('#p').panel({
    href:'index.jsp',
    onLoad:function(){
        alert('loaded successfully');
    }
});
*/
/*function af(){
    alert('nihao4');
    $('#tt').datagrid({
        width : 400,
        title : '用户列表',
        columns : [[
            {
                field : 'username',
                title : '账号',
            }
        ]]
    })
}*/

$(document).ready(function () {

    $("#listForm").attr("src", "/emp-list");
    $("#inputForm").attr("src", "/emp-input");
    //alert("nihao");
    $("#mainFrom").hide();

    $('#tt').datagrid({
        width : 400,
        title : '用户列表',
        columns : [[
            {
                field : 'username',
                title : '账号',
            }
        ]]
    })

});

