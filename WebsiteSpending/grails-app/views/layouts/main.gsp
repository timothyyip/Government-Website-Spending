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
    jQuery("li.manyitems").mouseover(function(){
            jQuery(this).stop().animate({height:'480px'},{queue:false, duration:600, easing: 'easeOutQuad'})
        });

        //When mouse is removed
        jQuery("li.menuitem").mouseout(function(){
            jQuery(this).stop().animate({height:'30px'},{queue:false, duration:600, easing: 'easeOutQuad'})
        });



    });
    </script>

  </head>
  <body>
    <div id="wrapper">
      <div id="header">
        <h1>Government web spending</h1>

        <ul id="navigation">
          <li id="surveymenu" class="menuitem manyitems" >
            <a href="#" class="corners-sml-t">Survey Data</a>
            <g:link controller="survey" action="gotcontent">Did you get what you wanted from the site?</g:link>
            <g:link controller="survey" action="issatisfied">How satisfied are you with your visit today?</g:link>
            <g:link controller="survey" action="easeuse">Ease of use of the site</g:link>
            <g:link controller="survey" action="attractive">Attractiveness of design/appearance</g:link>
            <g:link controller="survey" action="finding">Ease of finding information/services</g:link>
            <g:link controller="survey" action="editorial">Information that was clear and easy to understand</g:link>
            <g:link controller="survey" action="accuracy">Accurate and up to date information</g:link>
            <g:link controller="survey" action="search">Usefulness of site search</g:link>
            <g:link controller="survey" action="recommend">...recommend this website to a...?</g:link>
            <g:link controller="survey" action="age">User profile: age</g:link>
            <g:link controller="survey" action="gender">User profile: gender</g:link>
            <g:link controller="survey" action="disability">User profile: ...limits [to] your daily activities...</g:link>
            <g:link controller="survey" action="internetusage">User profile: How often do you personally use the Internet?</g:link>
          </li>

          <li id="statmenu" class="menuitem manyitems" >
            <a href="#" class="corners-sml-t">Statistical Data</a>
            <g:link controller="stat" action="user">Unique users</g:link>
            <g:link controller="stat" action="visit">Visit</g:link>
            <g:link controller="stat" action="twovisit">Two time visit</g:link>
            <g:link controller="stat" action="page">Page request/impression</g:link>
            <g:link controller="stat" action="duration">Visit duration</g:link>
          </li>

          <li id="costmenu" class="menuitem manyitems" >
            <a href="#" class="corners-sml-t">External Cost Data</a>
            <g:link controller="extcost" action="planning">Strategy and planning</g:link>
            <g:link controller="extcost" action="design">Design and build</g:link>
            <g:link controller="extcost" action="hosting">Hosting and infrastructure</g:link>
            <g:link controller="extcost" action="content">Content provision</g:link>
            <g:link controller="extcost" action="testing">Testing and evaluation</g:link>
            <g:link controller="extcost" action="total">Total external cost</g:link>
          </li>


          <li id="tcostmenu" class="menuitem manyitems" >
            <a href="#" class="corners-sml-t">Staff Data</a>
            <g:link controller="staffcost" action="scs">SCS</g:link>
            <g:link controller="staffcost" action="six">Grade 6</g:link>
            <g:link controller="staffcost" action="seven">Grade 7</g:link>
            <g:link controller="staffcost" action="seo">SEO/SIO</g:link>
            <g:link controller="staffcost" action="eo">EO</g:link>
            <g:link controller="staffcost" action="ao">AO</g:link>
            <g:link controller="staffcost" action="aa">AA</g:link>
            <g:link controller="staffcost" action="other">Other</g:link>
            <g:link controller="staffcost" action="total">Total count</g:link>
          </li>


          <li id="staffmenu" class="menuitem manyitems" >
            <a href="#" class="corners-sml-t">Total Cost Data</a>
            <g:link controller="extcost" action="total">Total cost (exc staff)</g:link>
            <g:link controller="staffcost" action="stotal">Total external (inc staff)</g:link>
          </li>
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
