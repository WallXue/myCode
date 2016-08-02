define(['app'], function(app) {

    app.config(['$routeProvider', function($routeProvider) {
        $routeProvider.when('/index', {
            templateUrl: 'html/index.html',
            controller: 'indexController'
        });

        $routeProvider.when('/other', {
            templateUrl: 'html/other.html',
            controller: 'otherController'
        });

        $routeProvider.otherwise({
            redirectTo: '/index'
        });
    }]);


});
