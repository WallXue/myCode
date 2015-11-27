define(['angular', 'jquery', 'allController', 'allServices', 'angular-route', 'angular-strap.tpl', 'angular-strap', 'angular-animate'], function() {
    return angular.module('app', [
        'mgcrea.ngStrap.alert',
        'mgcrea.ngStrap.tooltip',
        'mgcrea.ngStrap.aside',
        'mgcrea.ngStrap.modal',
        'controllers1',
        'services1',
        'mgcrea.ngStrap',
        'ngAnimate',
        'ngRoute'
    ]);
});
