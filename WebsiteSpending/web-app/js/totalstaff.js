$(function () {
    jQuery.staffEngine.init();
});

jQuery.staffEngine = {

    init: function() {
         $("table#data").hide();
        $("#radio1").attr("checked", true);
        jQuery.staffEngine.updatechart(1);
    },

    updatechart: function(id) {

        var title = $("span#label"+id).html();
        $("span.chartTitle").html(title);

        $('#holder').html("");
        var labels =  [],
        scss = [],
        sixs = [],
        sevens = [],
        seos = [],
        eos = [],
        aos = [],
        aas = [],
        others = [];
        $("table tfoot th").each(function () {
            labels.push([$(this).html()]);
        });
        $("td.scs").each(function () {
            var scs = $(this).html();
            if(!scs)scs=0;
            scss.push(scs);
        });
        $("td.six").each(function () {
            var six = $(this).html();
            if(!six)six=0;
            sixs.push(six);
        });
        $("td.seven").each(function () {
            var seven = $(this).html();
            if(!seven)seven=0;
            sevens.push(seven);
        });
        $("td.seo").each(function () {
            var seo = $(this).html();
            if(!seo)seo=0;
            seos.push(seo);
        });
         $("td.eo").each(function () {
            var eo = $(this).html();
            if(!eo)eo=0;
            eos.push(eo);
        });
        $("td.ao").each(function () {
            var ao = $(this).html();
            if(!ao)eo=0;
            aos.push(ao);
        });
        $("td.aa").each(function () {
            var aa = $(this).html();
            if(!aa)aa=0;
            aas.push(aa);
        });
        $("td.other").each(function () {
            var other = $(this).html();
            if(!other)other=0;
            others.push(other);
        });
       // alert(sixs);
     // alert(sixs.length)
        var r = Raphael("holder"),
        fin = function () {
            this.flag = r.g.popup(this.bar.x, this.bar.y, this.bar.value).insertBefore(this);
        },
        fout = function () {
            this.flag.animate({
                opacity: 0
            }, 400, function () {
                this.remove();
            });
        };
        r.g.txtattr.font = "12px 'Fontin Sans', Fontin-Sans, sans-serif; text-align:right";

        r.g.hbarchart(150, 20, 700, 980, [scss, sixs, sevens, seos,eos,aos,aas,others], {
            stacked: true
        }).hover(fin, fout).label(labels);
      



    }

};