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
/*

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
 */
Ext.onReady(function () {
    Ext.create('Ext.container.Viewport', {
        layout: 'border',
        items: [{
            region: 'north',
            /*html:'<div id="mainTop"><h10>.</h10></div>',*/
            border: false,
            margin: '0 0 5 0',
            xtype: 'maintop',//引入Top
        }, {
            region: 'west',
            split: true,
            weight:100,//加入权重后，panel占据整个左边
            collapsible: true,
            title: 'Navigation',
            width: 150,
            items:[
                {
                title:'项目资源管理器',
                closable:true,
                listeners:{itemclick:itemOnClick}
                },

    ],
            // could use a TreePanel or AccordionLayout for navigational items
        }, {
            region: 'south',
            title: 'South Panel',
            collapsible: true,
            html: 'Information goes here',
            split: true,
            height: 100,
            minHeight: 100
        }, {
            region: 'east',
            title: 'East Panel',
            collapsible: true,
            split: true,
            width: 150
        }, {
            region: 'center',
            xtype: 'tabpanel', // TabPanel itself has no title
            activeTab: 0, // First tab active by default
            items: {
                title: 'Default Tab',
                closable:true,
                html: '<div id="gridPanel">The first tab\'s content. Others may be added dynamically这里是gridPanel</div>',
                xtype: 'gridList',//引入gridPanel
            }
        }]
    });

});

var itemOnClick = function (view,node) {
    alert(view + node);
}
/*title:'面板头部(header)',
 tbar:['顶端工具栏（top toolbars）',
 {},
 {}
 ],
 bbar:['低端工具栏（bottom toolbars）',
 {text:"按钮一"},
 {text:"按钮二",handler:function(){
 Ext.MessageBox.alert("单击","单击了按钮");
 }}
 ],
 layout
 height:400,
 width:300,
 frame:true,
 renderTo:Ext.getBody(),
 autoScroll:true,
 collapsible:true,
 bodyPadding:5,
 bodyStyle:'background-color:#FFFFFF',
 html:'面板体（body）',
 items:[
 {
 xtype:'datepicker',
 minDate:new Date()
 },
 {
 title:"数据表",
 id:"panelOne"
 }
 ],
 tools:[
 {id:'toggle'},
 {id:'close'},
 {id:'maximize'}
 ],
 buttons:[{
 text:'面板底部（footer）'
 }],
 contentEl:''
 })*/
//创建Grid表格组件


/*
 Ext.onReady(function () {
 extjsAlert = function () {
 Ext.MessageBox.alert("提示框", "这是一个提示框", function () {
 alert("提示框关闭了");
 });
 };
 extjsPrompt = function () {
 Ext.MessageBox.prompt("输入框", "请输入您的姓名:", function (btn, txt) {
 Ext.MessageBox.alert("结果", "你点击了" + btn + "按钮,<br>输入的内容为" + txt);
 });
 };
 extjsCustom = function () {
 var config = {
 title: "自定义对话框",
 msg: "这是一个自定义对话框",
 width: 400,
 multiline: true,//是否显示多行文本
 closable: true,//是否显示关闭按钮
 /!**
 * buttons:
 * OK:只有‘确定’按钮
 * CANCEL:只有‘取消’按钮
 * OKCANCEL:有‘确定’和‘取消’按钮
 * YESNO:有‘是’和‘否’按钮
 * YESNOCANCEL:有‘是’、‘否’和‘取消’按钮
 *!/
 buttons: Ext.MessageBox.YESNOCANCEL,
 /!**
 * icons（图标取值如下）
 * INFO:信息图标
 * WARNING:警告图标
 * QUESTION:询问图标
 * ERROR:错误图标
 *!/
 icon: Ext.MessageBox.QUESTION,
 fn: function (btn, txt) {
 Ext.MessageBox.alert("结果", "你点击了" + btn + "按钮，输入的值是:" + txt);
 }
 };
 Ext.MessageBox.show(config);
 };
 extjsProgress = function () {
 Ext.MessageBox.show({
 title: '请等待',
 msg: '正在加载项目...',
 progressText: '正在初始化...',
 width: 300,
 progress: true,//此属性证明这是一个进度条
 closable: false
 });
 var f = function (v) {
 return function () {
 if (v == 12) {
 Ext.MessageBox.hide();
 Ext.MessageBox.alert('完成', '所有项目加载完成!');
 } else {
 var i = v / 11;
 Ext.MessageBox.updateProgress(i, Math.round(100 * i) + '%已完成');
 }
 };
 };
 for (var i = 1; i < 13; i++) {
 setTimeout(f(i), i * 500);
 }
 };
 extjsAnimal = function () {
 var config = {
 title: "飞出的消息框",
 msg: "这是一个自定义对话框，飞出来",
 width: 400,
 multiline: true,
 closable: false,
 buttons: Ext.MessageBox.YESNOCANCEL,
 icon: Ext.MessageBox.QUESTION,
 animEL: "fly"
 };
 Ext.MessageBox.show(config);
 };
 Ext.get("btn1").on("click", function () {
 Ext.MessageBox.alert("点击", "我被点击了");
 });
 Ext.get("btn2").on("click", function () {
 var name = Ext.get("name").dom.value;
 Ext.Msg.alert("你好", "你好，" + name + ",这是来自extjs的问候");
 });
 });*/
