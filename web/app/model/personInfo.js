Ext.define('ErpSys.model.personInfo', {//路径问题：personInfo.js文件在app/model/下，'app'使用'Ext.apliction'中的name属性代替
    extend: 'Ext.data.Model',
    alias: 'widget.pInfo',
    fields: [
        {name: 'id', type: 'int'},//,defaultValue:1
        {name: 'fullName', type: 'string'},
        {name: 'gender', type: 'string'},
        {name: 'birthDate', type: 'date', dateFormat: 'Y-m-d'},
        {name: 'jobNo', type: 'string'},
        {name: 'salaryId', type: 'string'},
        {name: 'endowmentNo', type: 'string'},
        {name: 'contract.contractType', mapping: 'contract.contractType'},//读取json子节点使用此映射
        {name: 'nation.nation', mapping: 'nation.nation'}
    ],
    proxy: {
        type: 'ajax',
        url: '/emp-list',
        reader: {
            type: 'json',//Ext.data.reader.Json解析器
            root: 'items'//key值
        }
    },

    idProperty: "piId"
});