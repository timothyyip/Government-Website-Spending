<!--
  To change this template, choose Tools | Templates
   open the template in the editor.
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

  </head>
  <body id="details">



    <div id="content-inner-wrapper">
      <div id="module-a" style="margin-right: 0">
        <h1 class="chartTitle"><span class="chartTitle"></span><br/>Hosting and infrastructure cost (in £000s)</h1>


        <table id="data">
          <tfoot>
            <tr>
          <g:each status="i" in="${detailsList}" var="dataSmall">
            <th>${dataSmall.website}</th>
          </g:each>
          </tr>
          </tfoot>
          <tbody>
            <tr class="values">
          <g:each status="i" in="${detailsList}" var="dataSmall">
            <td>${dataSmall.housingInfrastructureCosts}</td>
          </g:each>
          </tr>
          </tbody>
        </table>



        <div id="holder"></div>

        <table class="stats-table">

          <tbody>
            <tr>
              <th>site</th>
              <th>comment</th>
            </tr>
          <g:each status="i" in="${comments}" var="dataSmall">
            <tr class="${ (i % 2) == 0 ? 'odd' : 'even'}">
              <td >${dataSmall.website}</td>
              <td >${dataSmall.housingInfrastructureComment}</td>
            </tr>
          </g:each>
          </tbody>
        </table>

      </div>
    </div><!-- /#content-outer-wrapper -->

  </body>
</html>
