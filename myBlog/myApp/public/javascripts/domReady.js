define(['angular', 'requirejs-domready', 'app'], function(angular, domReady) {
	require(['requirejs-domready!'], function(document) {
		angular.bootstrap(document, ['app']);
	});
});