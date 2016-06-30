requirejs.config({
    baseUrl: '/',
    paths: {
        'angular': 'components/angular/angular',
        'angular-route': 'components/angular-route/angular-route',
        'angular-animate': 'components/angular-animate/angular-animate',
        'angular-strap': 'components/angular-strap/dist/angular-strap',
        'angular-strap.tpl': 'components/angular-strap/dist/angular-strap.tpl',

        'bootstrap': 'components/bootstrap/dist/js/bootstrap',

        'requirejs-domready': 'components/requirejs-domready/domReady',
        'jquery': 'components/jquery/dist/jquery',
        'app': 'javascripts/app',
        'controllers': 'javascripts/base/controllers',
        'services': 'javascripts/base/services',
        'allController': 'javascripts/controllers/all',
        'allServices': 'javascripts/services/all',
        'angular-routeConfig': 'javascripts/angular-route.config',

        'directives': 'javascripts/base/directives'
    },
    shim: {
        'angular': {
            exports: "angular"
        },
        'app': {
            deps: ['angular']
        },
        'angular-route': {
            deps: ['angular']
        },
        'angular-strap': {
            deps: ['angular','jquery']
        },
        'angular-animate': {
            deps: ['angular']
        },
        'angular-strap.tpl': {
            deps: ['angular', 'angular-strap']
        },
        'jquery': {
            exports: "$"
        },
        'bootstrap': {
            deps: ['jquery']
        },
        'allController':{
            deps: ['controllers']
        },
        'controllers':{
            deps: ['angular']
        },
        'directives' : {
            deps: ['app']
        },
        'angular-routeConfig' : {
            deps: ['app']
        }
    },
    deps: ['javascripts/domReady']
})

require(['jquery','bootstrap'], function($) {

    $(function() {
        $(".pc-navbar-nav > li").click(function() {
            $(".pc-navbar-nav > li").removeClass('active');
            $(this).addClass('active');
        });;
    })
});
