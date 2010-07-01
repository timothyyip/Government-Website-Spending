$(function () {
    jQuery.costEngine.init();
});

jQuery.costEngine = {

    init: function() {
        $("table").hide();
        $("#radio1").attr("checked", true);
        jQuery.costEngine.updatechart(1);
    },

    label: function(labels, isBottom, rotate) {
        labels = labels || [];
        isBottom = isBottom == undefined ? true : isBottom;
	rotate = rotate == undefined ? false : rotate;
        this.labels = paper.set();
        var L, l = -Infinity;
        if (opts.stacked) {
            for (var i = 0; i < len; i++) {
                var tot = 0;
                for (var j = 0; j < (multi || 1); j++) {
                    tot += multi ? values[j][i] : values[i];
                    if (j == 0) {
                        var label = paper.g.labelise(labels[j][i], tot, total);
                        L = paper.g.text(bars[j][i].x, isBottom ? y + height - barvgutter / 2 : bars[j][i].y - 10, label);
			if (rotate) {
				L.rotate(90);
			}
                        var bb = L.getBBox();
                        if (bb.x - 7 < l) {
                            L.remove();
                        } else {
                            this.labels.push(L);
                            l = bb.x + (rotate ? bb.height : bb.width);
                        }
                    }
                }
            }
        } else {
            for (var i = 0; i < len; i++) {
                for (var j = 0; j < (multi || 1); j++) {
                    // did not remove the loop because don't yet know whether to accept multi array input for arrays
                    var label = paper.g.labelise(multi ? labels[0] && labels[0][i] : labels[i], multi ? values[0][i] : values[i], total);
                     L = paper.g.text(bars[0][i].x, isBottom ? y + 5 + height - barvgutter / 2 : bars[0][i].y - 10, label);
			if (rotate) {
				L.rotate(90);
				// If we rotated it, we need to move it as well. Still have to use the width
				// to get the "length" of the label, divided it in two and shift down.
				L.translate(0, (L.getBBox().width / 2));
			}
                    var bb = L.getBBox();
//                    if (bb.x - 7 < l) {
                    if (bb.x - (this.getBBox().width) < l) {
                        L.remove();
                    } else {
                        this.labels.push(L);
                        l = bb.x + (rotate ? bb.height : bb.width);
                    }
                }
            }
        }
        return this;
    },

    updatechart: function(id) {

        var title = $("span#label"+id).html();
        $("span.chartTitle").html(title);

        $('#holder').html("");
       var labels = [],
            values = [45,300,6000];
            $("table tfoot th").each(function () {
                //labels.push($(this).html());
            });
            $("table tbody tr.values td").each(function () {
                var value = $(this).html();
                if(!value)value=0;
               // values.push(value);
            });
        alert(values);
        if(values[0]){
            var r = Raphael("holder",1000,1000),
            fin = function () {
                this.flag = r.g.popup(this.bar.x, this.bar.y, this.bar.value || "0").insertBefore(this);
            },
            fout = function () {
                this.flag.animate({
                    opacity: 0
                }, 300, function () {
                    this.remove();
                });
            },
            fin2 = function () {
                var y = [], res = [];
                for (var i = this.bars.length; i--;) {
                    y.push(this.bars[i].y);
                    res.push(this.bars[i].value || "0");
                }
                this.flag = r.g.popup(this.bars[0].x, Math.min.apply(Math, y), res.join(", ")).insertBefore(this);
            },
            fout2 = function () {
                this.flag.animate({
                    opacity: 0
                }, 300, function () {
                    this.remove();
                });
            };
            r.g.txtattr.font = "12px 'Fontin Sans', Fontin-Sans, sans-serif";

//            r.g.text(160, 10, "Single Series Chart");
//            r.g.text(480, 10, "Multiline Series Stacked Chart");
//            r.g.text(160, 250, "Multiple Series Chart");
//            r.g.text(480, 250, "Multiline Series Stacked Chart\nColumn Hover");

            r.g.barchart(10, 10, 500, 320, values).hover(fin, fout).label(labels,true,true);
            r.g.barchart.label(["ll"]);
//                r.g.hbarchart(330, 10, 300, 220, [[55, 20, 13, 32, 5, 1, 2, 10], [10, 2, 1, 5, 32, 13, 20, 55]], {
//                stacked: true
//            }).hover(fin, fout);
//            r.g.hbarchart(10, 250, 300, 220, [[55, 20, 13, 32, 5, 1, 2, 10], [10, 2, 1, 5, 32, 13, 20, 55]]).hover(fin, fout);
//            var c = r.g.barchart(330, 250, 300, 220, [[55, 20, 13, 32, 5, 1, 2, 10], [10, 2, 1, 5, 32, 13, 20, 55]], {
//                stacked: true,
//                type: "soft"
//            }).hoverColumn(fin2, fout2);
        // c.bars[1].attr({stroke: "#000"});
        }else{
            $('#holder').html("<h1 style='font-size:15em;text-align:center;color:crimson;'><br/>No data<h1>");
        }



    }

};