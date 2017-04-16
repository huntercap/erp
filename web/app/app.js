
Ext.application({
    name: 'ErpSys',//'MyApp',
   /* models: ['personInfo'],*/    //这里的model要是是实例化的，直接用会出错，待继续学习，已经解决，其中定义type时候用"String"是错误的要用小写'string'.
    models:['personInfo'],
    launch: function () {
        Ext.Msg.alert(this.name, 'Ready to go!');

        console.log('Initialized Users! This happens before ' +
            'the Application launch() function is called');
    },

    onAppUpdate: function () {
        Ext.Msg.confirm('Application Update', 'This application has an update, reload?',
            function (choice) {
                if (choice === 'yes') {
                    window.location.reload();
                }
            }
        );
    }
});