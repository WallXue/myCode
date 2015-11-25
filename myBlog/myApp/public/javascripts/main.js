requirejs.config({
    baseUrl: '/',
    paths: {
        'angular': 'components/angular/angular',
        'angular-route': 'components/angular-route/angular-route',
        'requirejs-domready': 'components/requirejs-domready/domReady',
        'bootstrap': 'components/bootstrap/dist/js/bootstrap',
        'bootstrap-tooltip': 'components/bootstrap/js/tooltip',
        'bootstrap-popover': 'components/bootstrap/js/popover',
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
        'bootstrap-tooltip': {
            deps: ['jquery','bootstrap']
        },
        'bootstrap-popover': {
            deps: ['jquery','bootstrap']
        },
        'jquery': {
            exports: "$"
        }
    },
    deps: ['javascripts/domReady']
})

require(['app', 'bootstrap','bootstrap-tooltip','bootstrap-popover'], function(app) {
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


require(['jquery', 'requirejs-domready'], function($) {
    $(function() {
        $(".pc-navbar-nav > li").click(function() {
            $(".pc-navbar-nav > li").removeClass('active');
            $(this).addClass('active');
        });;
    })
});
