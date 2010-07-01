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
    <script type="text/javascript" src="${createLinkTo(dir:'js', file:'g.bar.js')}"></script>
    <script type="text/javascript" src="${createLinkTo(dir:'js', file:'cost.js')}"></script>
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


        <table>
          <tfoot>
            <tr>
          <g:each status="i" in="${detailsList}" var="data">
            <th>${data.website}[${data.department}]</th>
          </g:each>
          </tr>
          </tfoot>
          <tbody>
            <tr class="values">
          <g:each status="i" in="${detailsList}" var="data">
            <td>${data.strategyAndPlanningCosts}</td>
          </g:each>
          </tr>
          <tr class="comment">
          <g:each status="i" in="${detailsList}" var="data">
            <td>${data.strategyAndPlanningComment}</td>
          </g:each>
          </tr>
          </tbody>
        </table>




        <div id="holder"></div>
      </div>
    </div><!-- /#content-outer-wrapper -->

  </body>
</html>
