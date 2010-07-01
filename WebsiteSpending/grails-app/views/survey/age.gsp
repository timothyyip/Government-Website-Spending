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
        <h1 class="chartTitle"><span class="chartTitle"></span><br/>User profile: age</h1>

        <g:each status="i" in="${detailsList}" var="data">
          <table id="table${data.id}">
            <tr>
              <th>16-19 (${data.age_16_19}%)</th>
              <td>${data.age_16_19}</td>
            </tr>
            <tr>
              <th>20-24 (${data.age_20_24}%)</th>
              <td>${data.age_20_24}</td>
            </tr>
            <tr>
              <th>25-34 (${data.age_25_34}%)</th>
              <td>${data.age_25_34}</td>
            </tr>
            <tr>
              <th>35-44 (${data.age_35_44}%)</th>
              <td>${data.age_35_44}</td>
            </tr>
            <tr>
              <th>45-54 (${data.age_45_54}%)</th>
              <td>${data.age_45_54}</td>
            </tr>
            <tr>
              <th>55-64 (${data.age_55_64}%)</th>
              <td>${data.age_55_64}</td>
            </tr>
            <tr>
              <th>65-74 (${data.age_65_74}%)</th>
              <td>${data.age_65_74}</td>
            </tr>
            <tr>
              <th>75+ (${data.age_74Plus}%)</th>
              <td>${data.age_74Plus}</td>
            </tr>
            <tr>
              <th>Prefer not to say (${data.notToSayAge}%)</th>
              <td>${data.notToSayAge}</td>
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
