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
    alert('111');
    var personInfoModel = Ext.create('Ext.data.Model',{
        xtype:'pInfo'//会自动载入
    });
    alert(personInfoModel.id);
    alert('333');
    Ext.create('Ext.container.Viewport', {
        layout: 'border',
        items: [{
            region: 'north',
            html:'<div id="mainTop"><h10>.</h10></div>',
            border: false,
            margin: '0 0 5 0',
            xtype: 'maintop',//引入Top
        }, {
            region: 'west',
            layout:{type:'accordion'},
            split: true,
            weight: 100,//加入权重后，panel占据整个左边
            collapsible: true,
            title: 'Navigation',
            width: 150,
            items: [
                {
                    title: '项目资源管理器',
                    id: 'id1',
                    closable: true,
                    //listeners: {itemclick: itemclick}
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
                closable: true,
                html: '<div id="gridPanel">The first tab\'s content. Others may be added dynamically这里是gridPanel</div>',
                xtype: 'gridList',//引入gridPanel
            }

        }]
    });

});

