define(['app'], function(app) {

    app.config(['$routeProvider', function($routeProvider) {
        $routeProvider.when('/index', {
            templateUrl: 'html/index.html',
            controller: 'indexController'
        });

        $routeProvider.when('/list', {
            templateUrl: 'html/list.html',
            controller: 'listController'
        });

        $routeProvider.otherwise({
            redirectTo: '/index'
        });
    }]);


});
