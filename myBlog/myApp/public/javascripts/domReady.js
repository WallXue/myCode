define(['angular', 'requirejs-domready', 'angular-routeConfig', 'directives'], function(angular, domReady) {
    require(['requirejs-domready!'], function(document) {
        angular.bootstrap(document, ['app']);
        setTimeout(function() {
            var loading = document.getElementById("loading");
            loading.parentNode.removeChild(loading);
            document.getElementById('hidden-dive').className = "";
        }, 100);
    });
});
