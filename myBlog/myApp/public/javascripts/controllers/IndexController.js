define(["controllers"], function(controllers) {
    controllers.controller('indexController', function($scope, $modal, TipService) {
        TipService.showTip('bom shakala~~welcome~~~');
        $scope.modal = {
            "title": "Title",
            "content": "Hello Modal<br />This is a multiline message!"
        };

        $scope.articles = [{
            id: 1232321,
            title: "父母眼中怎样才是乖孩子？",
            abstract: "《乖孩子之歌》0岁：不哭也不闹，闷声睡大觉。1岁：说话说得早，来把爸爸叫。2岁：能念两首诗，春眠不觉晓。3岁：不偏也不挑，吃饭吃得饱。4岁：不用妈妈抱，让梨我知道。5岁：智力水平高，挨个把数报。6岁：背上新书包，上学不迟到。7岁：在家不贪玩，学习…",
            content: "《乖孩子之歌》<br>0岁：不哭也不闹，闷声睡大觉。<br>1岁：说话说得早，来把爸爸叫。<br>2岁：能念两首诗，春眠不觉晓。<br>3岁：不偏也不挑，吃饭吃得饱。<br>4岁：不用妈妈抱，让梨我知道。<br>5岁：智力水平高，挨个把数报。<br>6岁：背上新书包，上学不迟到。<br>7岁：在家不贪玩，学习成绩好。<br>8岁：在家不贪玩，学习成绩好。<br>9岁：在家不贪玩，学习成绩好。<br>10岁：在家不贪玩，学习成绩好。<br>11岁：在家不贪玩，学习成绩好。<br>12岁：恋爱不谈早，学习成绩好。<br>13岁：恋爱不谈早，学习成绩好。<br>14岁：恋爱不谈早，学习成绩好。<br>15岁：恋爱不谈早，学习成绩好。<br>16岁：刷遍天下题，学习成绩好。<br>17岁：刷遍天下题，学习成绩好。<br>18岁：学习成绩好，去个好学校。<br>19岁：学习成绩好，恋爱不能要。<br>20岁：学习成绩好，恋爱不能要。<br>21岁：学习成绩好，恋爱不能要。<br>22岁：恋爱不能要，工作要找到。<br>23岁：工作干得好，薪水日日高。<br>24岁：薪水日日高，找到好女票。<br>25岁：结婚摆酒席，红包裹大钞。<br>26岁：升职加薪咯，孙子能抱到。<br>27岁：孙子说话早，来把爷爷叫。<br>Generation number ++<br>………………………………<br>Unlimited loops work.",
            bingo: 103,
            views: 4
        }, {
            id: 12333321,
            title: "父母眼中怎样才是乖孩子？",
            abstract: "《乖孩子之歌》0岁：不哭也不闹，闷声睡大觉。1岁：说话说得早，来把爸爸叫。2岁：能念两首诗，春眠不觉晓。3岁：不偏也不挑，吃饭吃得饱。4岁：不用妈妈抱，让梨我知道。5岁：智力水平高，挨个把数报。6岁：背上新书包，上学不迟到。7岁：在家不贪玩，学习…",
            content: "《乖孩子之歌》<br>0岁：不哭也不闹，闷声睡大觉。<br>1岁：说话说得早，来把爸爸叫。<br>2岁：能念两首诗，春眠不觉晓。<br>3岁：不偏也不挑，吃饭吃得饱。<br>4岁：不用妈妈抱，让梨我知道。<br>5岁：智力水平高，挨个把数报。<br>6岁：背上新书包，上学不迟到。<br>7岁：在家不贪玩，学习成绩好。<br>8岁：在家不贪玩，学习成绩好。<br>9岁：在家不贪玩，学习成绩好。<br>10岁：在家不贪玩，学习成绩好。<br>11岁：在家不贪玩，学习成绩好。<br>12岁：恋爱不谈早，学习成绩好。<br>13岁：恋爱不谈早，学习成绩好。<br>14岁：恋爱不谈早，学习成绩好。<br>15岁：恋爱不谈早，学习成绩好。<br>16岁：刷遍天下题，学习成绩好。<br>17岁：刷遍天下题，学习成绩好。<br>18岁：学习成绩好，去个好学校。<br>19岁：学习成绩好，恋爱不能要。<br>20岁：学习成绩好，恋爱不能要。<br>21岁：学习成绩好，恋爱不能要。<br>22岁：恋爱不能要，工作要找到。<br>23岁：工作干得好，薪水日日高。<br>24岁：薪水日日高，找到好女票。<br>25岁：结婚摆酒席，红包裹大钞。<br>26岁：升职加薪咯，孙子能抱到。<br>27岁：孙子说话早，来把爷爷叫。<br>Generation number ++<br>………………………………<br>Unlimited loops work.",
            bingo: 124,
            views: 54
        }, {
            id: 12344,
            title: "父母眼中怎样才是乖孩子？",
            abstract: "《乖孩子之歌》0岁：不哭也不闹，闷声睡大觉。1岁：说话说得早，来把爸爸叫。2岁：能念两首诗，春眠不觉晓。3岁：不偏也不挑，吃饭吃得饱。4岁：不用妈妈抱，让梨我知道。5岁：智力水平高，挨个把数报。6岁：背上新书包，上学不迟到。7岁：在家不贪玩，学习…",
            content: "《乖孩子之歌》<br>0岁：不哭也不闹，闷声睡大觉。<br>1岁：说话说得早，来把爸爸叫。<br>2岁：能念两首诗，春眠不觉晓。<br>3岁：不偏也不挑，吃饭吃得饱。<br>4岁：不用妈妈抱，让梨我知道。<br>5岁：智力水平高，挨个把数报。<br>6岁：背上新书包，上学不迟到。<br>7岁：在家不贪玩，学习成绩好。<br>8岁：在家不贪玩，学习成绩好。<br>9岁：在家不贪玩，学习成绩好。<br>10岁：在家不贪玩，学习成绩好。<br>11岁：在家不贪玩，学习成绩好。<br>12岁：恋爱不谈早，学习成绩好。<br>13岁：恋爱不谈早，学习成绩好。<br>14岁：恋爱不谈早，学习成绩好。<br>15岁：恋爱不谈早，学习成绩好。<br>16岁：刷遍天下题，学习成绩好。<br>17岁：刷遍天下题，学习成绩好。<br>18岁：学习成绩好，去个好学校。<br>19岁：学习成绩好，恋爱不能要。<br>20岁：学习成绩好，恋爱不能要。<br>21岁：学习成绩好，恋爱不能要。<br>22岁：恋爱不能要，工作要找到。<br>23岁：工作干得好，薪水日日高。<br>24岁：薪水日日高，找到好女票。<br>25岁：结婚摆酒席，红包裹大钞。<br>26岁：升职加薪咯，孙子能抱到。<br>27岁：孙子说话早，来把爷爷叫。<br>Generation number ++<br>………………………………<br>Unlimited loops work.",
            bingo: 230,
            views: 124
        }, {
            id: 3232,
            title: "父母眼中怎样才是乖孩子？",
            abstract: "《乖孩子之歌》0岁：不哭也不闹，闷声睡大觉。1岁：说话说得早，来把爸爸叫。2岁：能念两首诗，春眠不觉晓。3岁：不偏也不挑，吃饭吃得饱。4岁：不用妈妈抱，让梨我知道。5岁：智力水平高，挨个把数报。6岁：背上新书包，上学不迟到。7岁：在家不贪玩，学习…",
            content: "《乖孩子之歌》<br>0岁：不哭也不闹，闷声睡大觉。<br>1岁：说话说得早，来把爸爸叫。<br>2岁：能念两首诗，春眠不觉晓。<br>3岁：不偏也不挑，吃饭吃得饱。<br>4岁：不用妈妈抱，让梨我知道。<br>5岁：智力水平高，挨个把数报。<br>6岁：背上新书包，上学不迟到。<br>7岁：在家不贪玩，学习成绩好。<br>8岁：在家不贪玩，学习成绩好。<br>9岁：在家不贪玩，学习成绩好。<br>10岁：在家不贪玩，学习成绩好。<br>11岁：在家不贪玩，学习成绩好。<br>12岁：恋爱不谈早，学习成绩好。<br>13岁：恋爱不谈早，学习成绩好。<br>14岁：恋爱不谈早，学习成绩好。<br>15岁：恋爱不谈早，学习成绩好。<br>16岁：刷遍天下题，学习成绩好。<br>17岁：刷遍天下题，学习成绩好。<br>18岁：学习成绩好，去个好学校。<br>19岁：学习成绩好，恋爱不能要。<br>20岁：学习成绩好，恋爱不能要。<br>21岁：学习成绩好，恋爱不能要。<br>22岁：恋爱不能要，工作要找到。<br>23岁：工作干得好，薪水日日高。<br>24岁：薪水日日高，找到好女票。<br>25岁：结婚摆酒席，红包裹大钞。<br>26岁：升职加薪咯，孙子能抱到。<br>27岁：孙子说话早，来把爷爷叫。<br>Generation number ++<br>………………………………<br>Unlimited loops work.",
            bingo: 12,
            views: 532
        }];

        $scope.init = function() {
            console.log("init....");
            $('#myCarousel').carousel({
                interval: 5000
            })
        }

        $scope.bingo = function(article) {
            article.bingo = article.bingo + 1;
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
