requirejs.config({
    baseUrl: '/',
    paths: {
        'angular': 'components/angular/angular',
        'angular-route': 'components/angular-route/angular-route',
        'angular-animate': 'components/angular-animate/angular-animate',
        'angular-strap': 'components/angular-strap/dist/angular-strap',
        'angular-strap.tpl': 'components/angular-strap/dist/angular-strap.tpl',
        'requirejs-domready': 'components/requirejs-domready/domReady',
        'jquery': 'components/jquery/dist/jquery',
        'app': 'javascripts/app',
        'controllers': 'javascripts/base/controllers',
        'allController': 'javascripts/controllers/all',
        'angular-routeConfig': 'javascripts/angular-route.config',
    },
    shim: {
        'angular': {
            exports: "angular"
        },
        'angular-route': {
            deps: ['angular']
        },
        'angular-strap': {
            deps: ['angular']
        },
        'angular-animate': {
            deps: ['angular']
        },
        'angular-strap.tpl': {
            deps: ['angular']
        },
        'bootstrap': {
            deps: ['jquery']
        },
        'bootstrap-tooltip': {
            deps: ['jquery', 'bootstrap']
        },
        'bootstrap-popover': {
            deps: ['jquery', 'bootstrap']
        },
        'jquery': {
            exports: "$"
        }
    },
    deps: ['javascripts/domReady']
})

require(['jquery'], function($) {

    $(function() {
        $(".pc-navbar-nav > li").click(function() {
            $(".pc-navbar-nav > li").removeClass('active');
            $(this).addClass('active');
        });;
    })
});
