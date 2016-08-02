define(["controllers"], function(controllers) {
    controllers.controller('indexController', function($scope, $modal, TipService,$http) {
        TipService.showTip('欢迎');

        $scope.textToInsert = "ppppppppppp";
        
        $scope.init = function() {
            console.log("init....");
            $('#myCarousel').carousel({
                interval: 5000
            })
        }

        $scope.showArticle = function(article) {
            $modal({
                "html": true,
                "animation": 'am-fade',
                "title": article.title,
                "content": article.content
            });
        }
    });
});
