/**
 * Created by haris on 24/2/2016.
 */

var setupLevels = function() {
    var $selectOne = $("select[name='level_one']");
    var $selectOneCurrent = $selectOne.val();
    var $selectTwo = $("select[name='level_two']");
    var $selectTwoCurrent = $selectTwo.val();
    var $selectThree = $("select[name='level_three']");
    var $selectThreeCurrent = $selectThree.val();
    var $selectFour = $("select[name='level_four']");
    var $selectFourCurrent = $selectFour.val();

    $.ajax({
        url: "/levels",
        data: { "levelOne": $("select[name='level_one']").val(),
                "levelTwo" : $("select[name='level_two']").val(),
                "levelThree" : $("select[name='level_three']").val()
        },
        traditional: true,
        success: function( data ) {
            $selectOne.find('option').remove();
            $(data.levelOne).each(function(i, v) {
                $selectOne.append($("<option>", { value: v, html: v } ));
            });
            $selectOne.val($selectOneCurrent);

            $selectTwo.find('option').remove();
            $(data.levelTwo).each(function(i, v) {
                $selectTwo.append($("<option>", { value: v, html: v } ));
            });
            $selectTwo.val($selectTwoCurrent);

            $selectThree.find('option').remove();
            $(data.levelThree).each(function(i, v) {
                $selectThree.append($("<option>", { value: v, html: v } ));
            });
            $selectThree.val($selectThreeCurrent);

            $selectFour.find('option').remove();
            $(data.levelFour).each(function(i, v) {
                $selectFour.append($("<option>", { value: v, html: v } ));
            });
            $selectFour.val($selectFourCurrent);

        }
    });
}