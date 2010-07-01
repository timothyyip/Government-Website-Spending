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
<<<<<<< HEAD
    <script type="text/javascript" src="${createLinkTo(dir:'js', file:'yui-min.js')}"></script>
    <script type="text/javascript" src="${createLinkTo(dir:'js', file:'yahoo-dom-event.js')}"></script>
    <script type="text/javascript" src="${createLinkTo(dir:'js', file:'container-min.js')}"></script>
    <script type="text/javascript" src="${createLinkTo(dir:'js', file:'jquery.easing.js')}"></script>
    <script type="text/javascript" src="${createLinkTo(dir:'js', file:'menu-min.js')}"></script>
    <script type="text/javascript" src="${createLinkTo(dir:'js', file:'raphealjs.js')}"></script>

     <g:layoutHead />

    <script type="text/javascript">
        jQuery(document).ready(function(){

        //When mouse rolls over
        jQuery("li.oneitem").mouseover(function(){
            jQuery(this).stop().animate({height:'60px'},{queue:false, duration:600, easing: 'easeOutQuad'})
        });
        jQuery("li.twoitem").mouseover(function(){
            jQuery(this).stop().animate({height:'90px'},{queue:false, duration:600, easing: 'easeOutQuad'})
        });
        jQuery("li.threeitem").mouseover(function(){
            jQuery(this).stop().animate({height:'120px'},{queue:false, duration:600, easing: 'easeOutQuad'})
        });
    jQuery("li.fouritem").mouseover(function(){
            jQuery(this).stop().animate({height:'150px'},{queue:false, duration:600, easing: 'easeOutQuad'})
        });
    jQuery("li.fiveitem").mouseover(function(){
            jQuery(this).stop().animate({height:'180px'},{queue:false, duration:600, easing: 'easeOutQuad'})
        });
    jQuery("li.eightitem").mouseover(function(){
            jQuery(this).stop().animate({height:'270px'},{queue:false, duration:600, easing: 'easeOutQuad'})
        });
    jQuery("li.surveyitem").mouseover(function(){
            jQuery(this).stop().animate({height:'330px'},{queue:false, duration:600, easing: 'easeOutQuad'})
        });

        //When mouse is removed
        jQuery("li.menuitem").mouseout(function(){
            jQuery(this).stop().animate({height:'30px'},{queue:false, duration:600, easing: 'easeOutQuad'})
        });



    });
    </script>
   
=======
    <script type="text/javascript" src="${createLinkTo(dir:'js', file:'raphealjs.js')}"></script>

    <g:layoutHead />
>>>>>>> da42659bd8b94a2adf548f9b9a16488e9c36ac9e
  </head>
  <body>
    <div id="wrapper">
      <div id="header">
        <h1>Government web spending</h1>

        <ul id="navigation">
<<<<<<< HEAD
          <li id="surveymenu" class="menuitem surveyitem" >
            <a href="#" class="corners-sml-t">Survey Data</a>
            <g:link controller="survey" action="gotcontent">Did you get what you wanted from the site?</g:link>
            <g:link controller="survey" action="issatisfied">How satisfied are you with your visit today?</g:link>
            <g:link controller="survey" action="easeuse">Ease of use of the site</g:link>
            <g:link controller="survey" action="attractive">Attractiveness of design/appearance</g:link>
            <g:link controller="survey" action="finding">Ease of finding information/services</g:link>
            <g:link controller="survey" action="editorial">Information that was clear and easy to understand</g:link>
            <g:link controller="survey" action="accuracy">Accurate and up to date information</g:link>
            <g:link controller="survey" action="search">Usefulness of site search</g:link>
            <g:link controller="survey" action="recommend">recommend this website to a?</g:link>
          </li>
=======

          <!--
                        <h:panelGroup layout="span" rendered="#{authContext.ifGranted['7']}">
                          <t:htmlTag styleClass="shift" value="li" rendered="#{page == 'Admins'}"><strong><a href="#{request.contextPath}/secure/admin/list.jsf" class="corners-sml-t">Admins</a></strong></t:htmlTag>
                          <t:htmlTag styleClass="shift" value="li" rendered="#{page != 'Admins'}"><a href="#{request.contextPath}/secure/admin/list.jsf" class="corners-sml-t">Admins</a></t:htmlTag>
                        </h:panelGroup>
          -->
>>>>>>> da42659bd8b94a2adf548f9b9a16488e9c36ac9e
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
