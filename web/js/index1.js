Ext.onReady(function(){
    Ext.create('Ext.grid.Panel',{
        title:'213',
        renderTo:Ext.getBody(),
        model:Ext.create('personInfo')
    });
    Ext.EventManager.addListener('btn','click',handler);//绑定处理函数
    function handler(){//事件处理函数
        alert('hello');
    }
});