Raphael.fn.pieChart = function (cx, cy, r, values, labels, stroke) {
    var paper = this,
    rad = Math.PI / 180,
    chart = this.set();
    function sector(cx, cy, r, startAngle, endAngle, params) {
        var x1 = cx + r * Math.cos(-startAngle * rad),
        x2 = cx + r * Math.cos(-endAngle * rad),
        y1 = cy + r * Math.sin(-startAngle * rad),
        y2 = cy + r * Math.sin(-endAngle * rad);
        return paper.path(["M", cx, cy, "L", x1, y1, "A", r, r, 0, +(endAngle - startAngle > 180), 0, x2, y2, "z"]).attr(params);
    }
    var angle = 0,
    total = 0,
    start = 0,
    process = function (j) {
        var value = values[j],
        angleplus = 360 * value / total,
        popangle = angle + (angleplus / 2),
        color = "hsb(" + start + ", 1, .5)",
        ms = 500,
        delta = 70,
        bcolor = "hsb(" + start + ", 1, 1)",
        p = sector(cx, cy, r, angle, angle + angleplus, {
            gradient: "90-" + bcolor + "-" + color,
            stroke: stroke,
            "stroke-width": 3
        }),
        txt = paper.text(cx + (r + delta + 55) * Math.cos(-popangle * rad), cy + (r + delta + 25) * Math.sin(-popangle * rad), labels[j]).attr({
            fill: bcolor,
            stroke: "none",
            opacity: 0,
            "font-family": 'Fontin-Sans, Arial',
            "font-size": "20px"
        });
        p.mouseover(function () {
            p.animate({
                scale: [1.1, 1.1, cx, cy]
            }, ms, "elastic");
            txt.animate({
                opacity: 1
            }, ms, "elastic");
        }).mouseout(function () {
            p.animate({
                scale: [1, 1, cx, cy]
            }, ms, "elastic");
            txt.animate({
                opacity: 0
            }, ms);
        });
        angle += angleplus;
        chart.push(p);
        chart.push(txt);
        start += .1;
    };
    for (var i = 0, ii = values.length; i < ii; i++) {
        total += values[i];
    }
    for (var i = 0; i < ii; i++) {
        process(i);
    }
    return chart;
};


$(function () {
    jQuery.pieEngine.init();
});

jQuery.pieEngine = {

    init: function() {
        $("table").hide();
<<<<<<< HEAD
        $("#radio1").attr("checked", true);
        jQuery.pieEngine.updatepie(1);
    },

    updatepieWithout: function(id) {

        var title = $("span#label"+id).html();
        $("span.chartTitle").html(title);

=======
        jQuery.pieEngine.updatepie(1);
    },

    updatepie: function(id) {
>>>>>>> da42659bd8b94a2adf548f9b9a16488e9c36ac9e
        $('#holder').html("");
        var values = [],
        labels = [];
        $("#table"+id+ " tr").each(function () {
            values.push(parseInt($("td", this).text(), 10));
            labels.push($("th", this).text());
        });
        if(values[0]){
<<<<<<< HEAD
            Raphael("holder", 1000, 1000).pieChart(350, 350, 150, values, labels, "#fff");
        }else{
            $('#holder').html("<h1 style='font-size:15em;text-align:center;color:crimson;'><br/>No data<h1>");
        }
    },

    updatepie: function(id) {

        var title = $("span#label"+id).html();
        $("span.chartTitle").html(title);

        $('#holder').html("");
        var values = [],
        labels = [];
        $("#table"+id+ " tr").each(function () {
            var value = parseInt($("td", this).text());
            if(!value)value=0;
            values.push(value);
            labels.push("%%.%% – "+$("th", this).text());
        });
        if(values[0]){
            var r = Raphael("holder", 1000,1000);
            r.g.txtattr.font = "16px 'Fontin Sans', Fontin-Sans, sans-serif";

//            r.g.text(320, 100, "Interactive Pie Chart").attr({
//                "font-size": 20
//            });

            var pie = r.g.piechart(250, 240, 200,values, {
                legend: labels,
                legendpos: "east",
                legendcolor: 'white',
                strokewidth: 1
            });
            pie.hover(function () {
                this.sector.stop();
                this.sector.scale(1.1, 1.1, this.cx, this.cy);
                if (this.label) {
                    this.label[0].stop();
                    this.label[0].scale(1.5);
                    this.label[1].attr({
                        "font-weight": 800
                    });
                }
            }, function () {
                this.sector.animate({
                    scale: [1, 1, this.cx, this.cy]
                }, 500, "bounce");
                if (this.label) {
                    this.label[0].animate({
                        scale: 1
                    }, 500, "bounce");
                    this.label[1].attr({
                        "font-weight": 400
                    });
                }
            });
        }else{
            $('#holder').html("<h1 style='font-size:15em;text-align:center;color:crimson;'><br/>No data<h1>");
        }

       
        
    }

=======
            Raphael("holder", 1000, 1000).pieChart(550, 450, 250, values, labels, "#fff");
        }else{
            $('#holder').html("<h1 style='font-size:20em;text-align:center;color:crimson;'><br/>No data<h1>");
        }
    }
>>>>>>> da42659bd8b94a2adf548f9b9a16488e9c36ac9e
};