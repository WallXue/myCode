define(['allController', 'angular-route', 'angular-strap', 'angular-strap.tpl', 'angular-animate'], function() {
    return angular.module('app', [
        'controllers1',
        'ngRoute',
        // 'ngSanitize',
        'mgcrea.ngStrap',
        'ngAnimate',
        'mgcrea.ngStrap.modal',
        'mgcrea.ngStrap.aside',
        'mgcrea.ngStrap.tooltip',
        'mgcrea.ngStrap.alert'
    ]);
});
