<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>第4章 示例4-1 计算器</title>
    <link rel="stylesheet" type="text/css" href="../Ext4/resources/css/ext-all.css"/>
    <script type="text/javascript" src="../Ext4/bootstrap.js"></script>
    <script type="text/javascript" src="../Ext4/locale/ext-lang-zh_CN.js"></script>

</head>
<body>
</body>
<!--在此添加HTML代码-->
<script type="text/javascript">
    Ext.onReady(function(){
        //创建Grid表格组件
        Ext.create('Ext.grid.Panel', {
            title : '人员列表',
            renderTo: Ext.getBody(),
            width:400,
            height:170,
            frame:true,
            store: {
                fields: ['fullName','id','gender','birthday'],
                proxy: {
                    type: 'ajax',
                    url : '/emp-list',
                    reader: {
                        type: 'json',//Ext.data.reader.Json解析器
                        root: 'items'
                    }
                },
                autoLoad: true
            },
            columns: [//配置表格列
                new Ext.grid.RowNumberer(),//表格行号组件
                {header: "姓名", width: 80, dataIndex: 'fullName', sortable: true},
                {header: "年龄", width: 80, dataIndex: 'id', sortable: true},
                {header: "性别", width: 80, dataIndex: 'gender', sortable: true},
                {header: "生日", width: 80, dataIndex: 'birthday', sortable: true}
            ]
        });
    });
</script>

</html>
