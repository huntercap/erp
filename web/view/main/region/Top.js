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
                text : '帮助',
                glyph : 0xf059
            }, {
                text : '关于',
                glyph : 0xf05a
            },
            {
                xtype: 'textfield',//默认是一个button所以其他都没写
                name: 'searchField',
                emptyText: '输入您的搜索关键词'
            }, {
                text : '搜索',
                glyph : 0xf00e
            }, '->',{
                text : '用户登录',
                glyph : 0xf007
            },{
                text : '注销',
                glyph : 0xf011
            }, {
                glyph : 0xf102,
                handler : 'hiddenTopBottom',
                tooltip : '隐藏顶部和底部区域',
                disableMouseOver : true
            }
        ]
    }
);


Ext.define(
    'grid',
    {
        extend: 'Ext.grid.Panel',
        alias: 'widget.gridList',//别名，后期可以进行访问


        width: 400,
        height: 170,
        frame: true,
        store: {
            fields: ['fullName', 'id', 'gender', 'birthDate'],
            proxy: {
                type: 'ajax',
                url: '/emp-list',
                reader: {
                    type: 'json',//Ext.data.reader.Json解析器
                    root: 'items'//key值
                }
            },
            autoLoad: true
        },
        columns: [//配置表格列
            new Ext.grid.RowNumberer(),//表格行号组件
            {header: "姓名", width: 80, dataIndex: 'fullName', sortable: true},
            {header: "年龄", width: 80, dataIndex: 'id', sortable: true},
            {header: "性别", width: 80, dataIndex: 'gender', sortable: true},
            {header: "生日", width: 80, dataIndex: 'birthDate', sortable: true}
        ],
    });
