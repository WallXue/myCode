define(["controllers"], function(controllers) {
    controllers.controller('indexController', function($scope) {

        $scope.init = function() {
            console.log("init....");
            $('#myModal').unbind('shown.bs.modal').bind('shown.bs.modal', function() {
                alert("test");
            })
            $('[data-toggle="popover"]').popover();
        }


        $scope.test = function() {
            $('#myModal').modal('show');
        }
    });
});
