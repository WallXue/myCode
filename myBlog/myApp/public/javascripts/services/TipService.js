define(["services"], function(services) {
    services.service('TipService', function($alert) {
        console.info('init...TipService');
        this.showTip = function(tip) {
            setTimeout(function() {
                $alert({
                    animation: "am-flip-x",
                    container: '#alerts-container',
                    content: tip,
                    placement: 'top',
                    type: 'info',
                    duration: 5,
                    show: true
                })
            }, 200)
        }
    })
});
