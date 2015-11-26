define(['angular', 'requirejs-domready', 'angular-routeConfig'], function(angular, domReady) {
    require(['requirejs-domready!'], function(document) {
        angular.bootstrap(document, ['app']);
    });
});
