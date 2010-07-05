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
        <h1 class="chartTitle"><span class="chartTitle"></span><br/>Attractiveness of design/appearance</h1>

        <g:each status="i" in="${detailsList}" var="data">
          <table id="table${data.id}">
            <tr>
              <th>Very good (${data.veryGoodDesign}%)</th>
              <td>${data.veryGoodDesign}</td>
            </tr>
            <tr>
              <th>Good (${data.goodDesign}%)</th>
              <td>${data.goodDesign}</td>
            </tr>
            <tr>
              <th>Neither (${data.neitherGoodNorPoorDesign}%)</th>
              <td>${data.neitherGoodNorPoorDesign}</td>
            </tr>
            <tr>
              <th>Poor (${data.poorDesign}%)</th>
              <td>${data.poorDesign}</td>
            </tr>
            <tr>
              <th>Very poor (${data.veryPoorDesign}%)</th>
              <td>${data.veryPoorDesign}</td>
            </tr>
            <tr>
              <th>Don't know (${data.dontKnowDesign}%)</th>
              <td>${data.dontKnowDesign}</td>
            </tr>
            <tr>
              <th>Not used (${data.notUsedDesign}%)</th>
              <td>${data.notUsedDesign}</td>
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
