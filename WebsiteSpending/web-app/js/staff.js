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
            values = [],
            comments = [];
            $("table tfoot th").each(function () {
                labels.push($(this).html());
            });
            $("table tbody tr.values td").each(function () {
                var value = $(this).html();
                if(!value)value=0;
                values.push(value);
            });
        //alert(values);
        if(values[0]){
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
            r.g.txtattr.font = "12px 'Fontin Sans', Fontin-Sans, sans-serif";

            r.g.barchart(0, 10, 1000, 500, values).hover(fin, fout).label(labels,true,true);
        }else{
            $('#holder').html("<h1 style='font-size:15em;text-align:center;color:crimson;'><br/>No data<h1>");
        }



    }

};