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
        <h1 class="chartTitle"><span class="chartTitle"></span><br/>Information that was clear and easy to understand</h1>

        <g:each status="i" in="${detailsList}" var="data">
          <table id="table${data.id}">
            <tr>
              <th>Very good (${data.veryGoodEditorial}%)</th>
              <td>${data.veryGoodEditorial}</td>
            </tr>
            <tr>
              <th>Good (${data.goodEditorial}%)</th>
              <td>${data.goodEditorial}</td>
            </tr>
            <tr>
              <th>Neither (${data.neitherGoodNorPoorEditorial}%)</th>
              <td>${data.neitherGoodNorPoorEditorial}</td>
            </tr>
            <tr>
              <th>Poor (${data.poorEditorial}%)</th>
              <td>${data.poorEditorial}</td>
            </tr>
            <tr>
              <th>Very poor (${data.veryPoorEditorial}%)</th>
              <td>${data.veryPoorEditorial}</td>
            </tr>
            <tr>
              <th>Don't know (${data.dontKnowEditorial}%)</th>
              <td>${data.dontKnowEditorial}</td>
            </tr>
            <tr>
              <th>Not used (${data.notUsedEditorial}%)</th>
              <td>${data.notUsedEditorial}</td>
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
