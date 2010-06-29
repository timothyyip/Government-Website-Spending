<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>


  <head>
    <title><g:layoutTitle default="PetClinic :: a Grails Framework demonstration" /></title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="Content-Language" content="en-gb" />
    <meta name="robots" content="all" />
    <meta http-equiv="imagetoolbar" content="false" />
    <meta name="MSSmartTagsPreventParsing" content="true" />
    <meta name="author" content="Cimex Media Ltd" />
    <meta name="Copyright" content="Copyright (c) Cimex Media Ltd 2010" />

    <link rel="stylesheet" href="${createLinkTo(dir:'css', file:'screen.css')}" type="text/css"/>
    <script type="text/javascript" src="${createLinkTo(dir:'js', file:'jquery.js')}"></script>
    <script type="text/javascript" src="${createLinkTo(dir:'js', file:'raphealjs.js')}"></script>

    <g:layoutHead />
  </head>
  <body>
    <div id="wrapper">
      <div id="header">
        <h1>Government web spending</h1>

        <ul id="navigation">

          <!--
                        <h:panelGroup layout="span" rendered="#{authContext.ifGranted['7']}">
                          <t:htmlTag styleClass="shift" value="li" rendered="#{page == 'Admins'}"><strong><a href="#{request.contextPath}/secure/admin/list.jsf" class="corners-sml-t">Admins</a></strong></t:htmlTag>
                          <t:htmlTag styleClass="shift" value="li" rendered="#{page != 'Admins'}"><a href="#{request.contextPath}/secure/admin/list.jsf" class="corners-sml-t">Admins</a></t:htmlTag>
                        </h:panelGroup>
          -->
        </ul><!-- /#navigation -->

      </div> <!-- /#header -->

      <div id="content-outer-wrapper" class="corners-lrg">
        <g:layoutBody />

      </div><!-- /#content-inner-wrapper -->

    </div>
    <noscript>
      <div id="no-javascript">
        <p>
          Please Turn on Javascript in your browser.
        </p>
      </div>
    </noscript>

  </body>
</html>
