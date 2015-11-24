requirejs.config({
    baseUrl: '/',
    paths: {
        'angular': 'components/angular/angular',
        'angular-route': 'components/angular-route/angular-route',
        'requirejs-domready': 'components/requirejs-domready/domReady',
        'bootstrap': 'components/bootstrap/dist/js/bootstrap',
        'jquery': 'components/jquery/dist/jquery',
        'app': 'javascripts/app',
        'controllers': 'javascripts/base/controllers',
        'allController': 'javascripts/controllers/all'
    },
    shim: {
        'angular': {
            exports: "angular"
        },
        'angular-route': {
            deps: ['angular']
        },
        'bootstrap': {
            deps: ['jquery']
        },
        'jquery': {
            exports: "$"
        }
    },
    deps: ['javascripts/domReady']
})

require(['app', 'bootstrap'], function(app) {
    app.config(['$routeProvider', function($routeProvider) {
        $routeProvider.when('/index', {
            templateUrl: 'html/index.html',
            controller: 'indexController'
        });

        $routeProvider.when('/list', {
            templateUrl: 'html/list.html',
            controller: 'listController'
        });
    }]);

});


require(['jquery', 'requirejs-domready'], function($) {
    $(function() {
        $(".pc-navbar-nav > li").click(function() {
            $(".pc-navbar-nav > li").removeClass('active');
            $(this).addClass('active');
        });
    })
});
