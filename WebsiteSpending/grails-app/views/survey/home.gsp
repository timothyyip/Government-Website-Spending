<!--
  To change this template, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
  <head>
    <meta name="layout" content="main">
    <title>Spending Home Page</title>
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
        <h1 class="chartTitle"><span class="chartTitle"></span><br/>Could you find what you wanted?</h1>
        
        <g:each status="i" in="${detailsList}" var="data">
          <table id="table${data.id}">
            <tr>
              <th>Got Every (${data.gotEveryThingIWanted}%)</th>
              <td>${data.gotEveryThingIWanted}</td>
            </tr>
            <tr>
              <th>Got Most (${data.gotEveryThingIWanted}%)</th>
              <td>${data.gotMostOfWhatIWanted}</td>
            </tr>
            <tr>
              <th>Got Some (${data.gotSomeOfWhatIWanted}%)</th>
              <td>${data.gotSomeOfWhatIWanted}</td>
            </tr>
            <tr>
              <th>Got None (${data.gotNoneOfWhatIWanted}%)</th>
              <td>${data.gotNoneOfWhatIWanted}</td>
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
