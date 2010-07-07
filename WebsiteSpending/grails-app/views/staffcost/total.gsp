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
    <script type="text/javascript" src="${createLinkTo(dir:'js', file:'totalstaff.js')}"></script>
    <script type="text/javascript" src="${createLinkTo(dir:'js', file:'helvetica.js')}"></script>

  </head>
  <body id="details">



    <div id="content-inner-wrapper">
      <div id="module-a" style="margin-right: 0">
        <h1 class="chartTitle"><span class="chartTitle"></span><br/>Number of full-time equivalents: Total count</h1>


        <table id="data">
          <tfoot>
            <tr>
          <g:each status="i" in="${detailsList}" var="data">
            <th>${data.website}</th>
          </g:each>
          </tr>
          </tfoot>
          <tbody>
            <tr>
          <g:each status="i" in="${detailsList}" var="data">
            <td  class="scs">${data.scs}</td>
          </g:each>
          </tr>
          <tr >
          <g:each status="i" in="${detailsList}" var="data">
            <td class="six">${data.gradesix}</td>
          </g:each>
          </tr>
          <tr >
          <g:each status="i" in="${detailsList}" var="data">
            <td class="seven">${data.gradeseven}</td>
          </g:each>
          </tr>
          <tr>
          <g:each status="i" in="${detailsList}" var="data">
            <td class="seo">${data.seoSio}</td>
          </g:each>
          </tr>
          <tr>
          <g:each status="i" in="${detailsList}" var="data">
            <td class="eo">${data.eo}</td>
          </g:each>
          </tr>
          <tr>
          <g:each status="i" in="${detailsList}" var="data">
            <td class="ao">${data.ao}</td>
          </g:each>
          </tr>
          <tr>
          <g:each status="i" in="${detailsList}" var="data">
            <td class="aa">${data.aa}</td>
          </g:each>
          </tr>
          <tr>
          <g:each status="i" in="${detailsList}" var="data">
            <td class="other">${data.otherStaff}</td>
          </g:each>
          </tr>
          </tbody>
        </table>



        <div id="holder"></div>


      </div>
    </div><!-- /#content-outer-wrapper -->

  </body>
</html>
