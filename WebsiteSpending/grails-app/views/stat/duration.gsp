<!--
  To change this template, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
  <head>
    <meta name="layout" content="main">
    <title>Spending Home Page</title>
    <script type="text/javascript" src="${createLinkTo(dir:'js', file:'g.raphael-min.js')}"></script>
    <script type="text/javascript" src="${createLinkTo(dir:'js', file:'raphael.path.methods.js')}"></script>
    <script type="text/javascript" src="${createLinkTo(dir:'js', file:'analytics.js')}"></script>
    <script type="text/javascript" src="${createLinkTo(dir:'js', file:'helvetica.js')}"></script>
    <style type="text/css" media="screen">
      #holder {
        width: 100%;
        height: 100%;
      }
    </style>
  </head>
  <body id="details">



    <div id="content-inner-wrapper">
      <div id="module-a">
        <h1 class="chartTitle"><span class="chartTitle"></span><br/>Total time of Visits of at least two pages (in seconds)</h1>

        <g:each status="i" in="${detailsList}" var="data">
          <table id="table${data.id}">
            <tfoot>
                <tr>
                    <th>Apr 09</th>
                    <th>May 09</th>
                    <th>Jun 09</th>
                    <th>Jul 09</th>
                    <th>Aug 09</th>
                    <th>Sep 09</th>
                    <th>Oct 09</th>
                    <th>Nov 09</th>
                    <th>Dec 09</th>
                    <th>Jan 10</th>
                    <th>Feb 10</th>
                    <th>Mar 10</th>
                </tr>
            </tfoot>
            <tbody>
                <tr>
                    <td>${data.visitDuration_Apr_09}</td>
                    <td>${data.visitDuration_May_09}</td>
                    <td>${data.visitDuration_Jun_09}</td>
                    <td>${data.visitDuration_Jul_09}</td>
                    <td>${data.visitDuration_Aug_09}</td>
                    <td>${data.visitDuration_Sep_09}</td>
                    <td>${data.visitDuration_Oct_09}</td>
                    <td>${data.visitDuration_Nov_09}</td>
                    <td>${data.visitDuration_Dec_09}</td>
                    <td>${data.visitDuration_Jan_10}</td>
                    <td>${data.visitDuration_Feb_10}</td>
                    <td>${data.visitDuration_Mar_10}</td>
                </tr>
            </tbody>
          </table>
        </g:each>




        <div id="holder"></div>
      </div>
    </div><!-- /#content-outer-wrapper -->

    <div id="module-b">
      <g:each status="i" in="${detailsList}" var="item">
        <label>
          <input id="radio${item.id}" type="radio" name="site" value="${item.id}" onclick="$.analyticEngine.updategraph(${item.id});">
          <span id="label${item.id}">${item.website}[${item.department}]</span>
        </label>
        <br/>
      </g:each>
    </div>

  </body>
</html>
