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
    <script type="text/javascript" src="${createLinkTo(dir:'js', file:'g.pie-min.js')}"></script>
    <script type="text/javascript" src="${createLinkTo(dir:'js', file:'pie.js')}"></script>
    <script type="text/javascript" src="${createLinkTo(dir:'js', file:'helvetica.js')}"></script>
   
  </head>
  <body id="details">



    <div id="content-inner-wrapper">
      <div id="module-a">
        <h1 class="chartTitle"><span class="chartTitle"></span><br/>Accurate and up to date information</h1>

        <g:each status="i" in="${detailsList}" var="data">
          <table id="table${data.id}">
            <tr>
              <th>Very good (${data.veryGoodAccuracy}%)</th>
              <td>${data.veryGoodAccuracy}</td>
            </tr>
            <tr>
              <th>Good (${data.goodAccuracy}%)</th>
              <td>${data.goodAccuracy}</td>
            </tr>
            <tr>
              <th>Neither (${data.neitherGoodNorPoorAccuracy}%)</th>
              <td>${data.neitherGoodNorPoorAccuracy}</td>
            </tr>
            <tr>
              <th>Poor (${data.poorAccuracy}%)</th>
              <td>${data.poorAccuracy}</td>
            </tr>
            <tr>
              <th>Very poor (${data.veryPoorAccuracy}%)</th>
              <td>${data.veryPoorAccuracy}</td>
            </tr>
            <tr>
              <th>Don't know (${data.dontKnowAccuracy}%)</th>
              <td>${data.dontKnowAccuracy}</td>
            </tr>
            <tr>
              <th>Not used (${data.notUsedAccuracy}%)</th>
              <td>${data.notUsedAccuracy}</td>
            </tr>
          </table>
        </g:each>
        <div id="holder"></div>
      </div>
    </div><!-- /#content-outer-wrapper -->

    <div id="module-b">
      <g:each status="i" in="${detailsList}" var="item">
        <label>
          <input id="radio${item.id}" type="radio" name="site" value="${item.id}" onclick="$.pieEngine.updatepie(${item.id});">
          <span id="label${item.id}">${item.website}[${item.department}]</span>
        </label>
        <br/>
      </g:each>
    </div>

  </body>
</html>
