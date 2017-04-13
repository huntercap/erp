Ext.define(
    'erpSystem.view.main.region.Top',//ClassName 类名，需要与文件目录对应起来，oaSystem是应用程序的名称，这是说在view/main/region目录下，新建立了一个Top.js文件
    {
        extend: 'Ext.toolbar.Toolbar',//继承自Ext的工具条，可以有工具条的属性了，避免自己书写麻烦
        alias: 'widget.maintop',//别名，后期可以进行访问
        items: [
            {
                text: '首页',
                glyph: 0xf015,//首页图标
            }, {
                text: '帮助',
                glyph: 0xf059
            }, {
                text: '关于',
                glyph: 0xf05a
            },
            {
                xtype: 'textfield',//默认是一个button所以其他都没写
                name: 'searchField',
                emptyText: '输入您的搜索关键词'
            }, {
                text: '搜索',
                glyph: 0xf00e
            }, '->', {
                text: '用户登录',
                glyph: 0xf007
            }, {
                text: '注销',
                glyph: 0xf011
            }, {
                glyph: 0xf102,
                handler: 'hiddenTopBottom',
                tooltip: '隐藏顶部和底部区域',
                disableMouseOver: true
            }
        ]
    }
);
/*
 Ext.define(
 'store',
 {
 extend:'Ext.data.Store',
 alias:
 }
 );*/

Ext.define('grid',{
        extend: 'Ext.grid.Panel',
        alias: 'widget.gridList',//别名，后期可以进行访问
        width: 400,
        height: 170,
        frame: true,
        //加上底部分页条组件
        bbar: {
            xtype: 'pagingtoolbar', items: [
                '->',
                '查询输入框',
                {xtype: 'textfield', width: 160, id: 'searchText', emptyText: '请输入查询内容'},
                {
                    text: '查询', handler: function () {
                    alert(store);
                    var store1 = store;//怎么得到store?
                    var search = Ext.getCmp('searchText').getValue();
                    //alert(search);
                    if (search && search.length > 0) {
                        store1.currentPage = 1;
                        store1.filters.clear();
                        store1.filter('fullName', search);
                    }
                }
                },
                {
                    text: '显示全部', handler: function () {

                }
                }
            ]
        },
        store: {
            fields: [
                'id',
                {name: 'fullName'},
                'gender',
                {name: 'birthDate'},
                'jobNo',
                'salaryId',
                'endowmentNo',
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
            remoteFiler: true,//分页显示查询时设置
            remoteSort: true,//分页显示查询时设置
            autoLoad: true
        },
        columns: [//配置表格列
            new Ext.grid.RowNumberer(),//表格行号组件
            {text: "ID", width: 80, align: 'center', dataIndex: 'id', sortable: true},
            {
                text: '个人信息', flex: 1, columns: [
                {text: "姓名", width: 80, align: 'center', dataIndex: 'fullName', sortable: true},
                {text: "性别", width: 80, align: 'center', dataIndex: 'gender', sortable: true},
                {
                    text: "生日",
                    flex: 1,
                    align: 'center',
                    dataIndex: 'birthDate',
                    renderer: Ext.util.Format.dateRenderer('Y-m-d'),
                    sortable: true
                },
                {text: "民族", width: 80, align: 'center', dataIndex: 'nation.nation', sortable: true},
                {text: '养保号', width: 120, align: 'center', dataIndex: 'endowmentNo', sortable: true}
            ]},
            {
                text: '单位属性', flex: 1, columns: [
                {text: '编制', width: 80, align: 'center', dataIndex: 'contract.contractType', sortable: true},
                {text: '工号', width: 80, align: 'center', dataIndex: 'jobNo', sortable: true},
                {text: '工资号', width: 80, align: 'center', dataIndex: 'salaryId', sortable: true}
            ]
            }
        ]
});

