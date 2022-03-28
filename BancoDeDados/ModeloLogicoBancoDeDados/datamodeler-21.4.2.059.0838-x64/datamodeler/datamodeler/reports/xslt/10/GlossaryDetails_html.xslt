<?xml version="1.0" encoding="UTF-8"?><!--Designed and generated by Altova StyleVision Enterprise Edition 2014 (x64) - see http://www.altova.com/stylevision for more information.--><xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:altova="http://www.altova.com" xmlns:altovaext="http://www.altova.com/xslt-extensions" xmlns:clitype="clitype" xmlns:fn="http://www.w3.org/2005/xpath-functions" xmlns:iso4217="http://www.xbrl.org/2003/iso4217" xmlns:ix="http://www.xbrl.org/2008/inlineXBRL" xmlns:java="java" xmlns:link="http://www.xbrl.org/2003/linkbase" xmlns:n1="http://oracle.com/datamodeler/reports/glossary" xmlns:sps="http://www.altova.com/StyleVision/user-xpath-functions" xmlns:xbrldi="http://xbrl.org/2006/xbrldi" xmlns:xbrli="http://www.xbrl.org/2003/instance" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" exclude-result-prefixes="altova altovaext clitype fn iso4217 ix java link n1 sps xbrldi xbrli xlink xs xsd xsi">	<xsl:output version="4.0" method="html" indent="no" encoding="UTF-8" doctype-public="-//W3C//DTD HTML 4.01 Transitional//EN" doctype-system="http://www.w3.org/TR/html4/loose.dtd"/>	<xsl:param name="SV_OutputFormat" select="'HTML'"/>	<xsl:param name="p1"/>	<xsl:param name="p2"/>	<xsl:variable name="XML" select="/"/>	<xsl:variable name="altova:nPxPerIn" select="96"/>	<xsl:template match="/">		<html>			<head>				<title/>				<meta name="generator" content="Altova StyleVision Enterprise Edition 2014 (x64) (http://www.altova.com)"/>				<meta http-equiv="X-UA-Compatible" content="IE=7"/>				<xsl:value-of select="normalize-space(concat('&lt;link rel=&quot;stylesheet&quot; type=&quot;text/css&quot; href=&quot;', $p1, '&quot;>'))" disable-output-escaping="yes"/>                <xsl:value-of select="normalize-space(concat('&lt;link rel=&quot;stylesheet&quot; type=&quot;text/css&quot; href=&quot;', $p2, '&quot;>'))" disable-output-escaping="yes"/>				<xsl:comment>[if IE]&gt;&lt;STYLE type=&quot;text/css&quot;&gt;.altova-rotate-left-textbox{filter: progid:DXImageTransform.Microsoft.BasicImage(rotation=3)} .altova-rotate-right-textbox{filter: progid:DXImageTransform.Microsoft.BasicImage(rotation=1)} &lt;/STYLE&gt;&lt;![endif]</xsl:comment>				<xsl:comment>[if !IE]&gt;&lt;!</xsl:comment>				<style type="text/css">.altova-rotate-left-textbox{-webkit-transform: rotate(-90deg) translate(-100%, 0%); -webkit-transform-origin: 0% 0%;-moz-transform: rotate(-90deg) translate(-100%, 0%); -moz-transform-origin: 0% 0%;-ms-transform: rotate(-90deg) translate(-100%, 0%); -ms-transform-origin: 0% 0%;}.altova-rotate-right-textbox{-webkit-transform: rotate(90deg) translate(0%, -100%); -webkit-transform-origin: 0% 0%;-moz-transform: rotate(90deg) translate(0%, -100%); -moz-transform-origin: 0% 0%;-ms-transform: rotate(90deg) translate(0%, -100%); -ms-transform-origin: 0% 0%;}</style>				<xsl:comment>&lt;![endif]</xsl:comment>				<style type="text/css">@page { margin-left:2cm; margin-right:2cm; margin-top:2cm; margin-bottom:2cm } @media print { br.altova-page-break { page-break-before: always; } }</style>			</head>			<body style="font-family:Tahoma; font-size:xx-small; ">				<xsl:for-each select="$XML">					<xsl:for-each select="n1:Glossary">						<center>							<xsl:for-each select="n1:ReportCaption">								<span class="caption">									<xsl:apply-templates/>								</span>							</xsl:for-each>						</center>						<p/>						<table class="w_16">							<xsl:variable name="altova:CurrContextGrid_0" select="."/>							<tbody>								<tr>									<td class="td_h_v w_4">										<span>											<xsl:text>Glossary Name</xsl:text>										</span>									</td>									<td class="td obj_name w_12">										<xsl:for-each select="n1:GlossaryName">											<xsl:apply-templates/>										</xsl:for-each>									</td>								</tr>								<tr>									<td class="td_h_v">										<span>											<xsl:text>Description</xsl:text>										</span>									</td>									<td class="td">										<xsl:for-each select="n1:Description">											<xsl:apply-templates/>										</xsl:for-each>									</td>								</tr>								<tr>									<td class="td_h_v">										<span>											<xsl:text>File Name</xsl:text>										</span>									</td>									<td class="td">										<xsl:for-each select="n1:FileName">											<xsl:apply-templates/>										</xsl:for-each>									</td>								</tr>								<tr>									<td class="td_h_v">										<span>											<xsl:text>Incomplete Modifiers</xsl:text>										</span>									</td>									<td class="td">										<xsl:for-each select="n1:IncompleteModifiers">											<xsl:apply-templates/>										</xsl:for-each>									</td>								</tr>								<tr>									<td class="td_h_v">										<span>											<xsl:text>Case Sensitive</xsl:text>										</span>									</td>									<td class="td">										<xsl:for-each select="n1:CaseSensitive">											<xsl:apply-templates/>										</xsl:for-each>									</td>								</tr>								<tr>									<td class="td_h_v">										<span>											<xsl:text>Unique Abbreviations</xsl:text>										</span>									</td>									<td class="td">										<xsl:for-each select="n1:UniqueAbbreviations">											<xsl:apply-templates/>										</xsl:for-each>									</td>								</tr>								<tr>									<td class="td_h_v">										<span>											<xsl:text>Separator Type</xsl:text>										</span>									</td>									<td class="td">										<xsl:for-each select="n1:SeparatorType">											<xsl:apply-templates/>										</xsl:for-each>									</td>								</tr>								<tr>									<td class="td_h_v">										<span>											<xsl:text>Separator Char</xsl:text>										</span>									</td>									<td class="td">										<xsl:for-each select="n1:SeparatorChar">											<xsl:apply-templates/>										</xsl:for-each>									</td>								</tr>							</tbody>						</table>						<p/>						<table class="w_25">							<xsl:variable name="altova:CurrContextGrid_1" select="."/>							<thead>								<tr style="height:0.13in; ">									<th class="td_h_h w_4">										<span>											<xsl:text>Term Name</xsl:text>										</span>									</th>									<th class="td_h_h w_4">										<span>											<xsl:text>Plural</xsl:text>										</span>									</th>									<th class="td_h_h w_4">										<span>											<xsl:text>Abbreviation</xsl:text>										</span>									</th>									<th class="td_h_h w_4">										<span>											<xsl:text>Alt Abbreviation</xsl:text>										</span>									</th>									<th class="td_h_h w_1">										<span>											<xsl:text>P</xsl:text>										</span>									</th>									<th class="td_h_h w_1">										<span>											<xsl:text>C</xsl:text>										</span>									</th>									<th class="td_h_h w_1">										<span>											<xsl:text>M</xsl:text>										</span>									</th>									<th class="td_h_h w_1">										<span>											<xsl:text>Q</xsl:text>										</span>									</th>									<th class="td_h_h w_5">										<span>											<xsl:text>Short Description</xsl:text>										</span>									</th>								</tr>							</thead>							<tbody>								<xsl:for-each select="n1:GlossaryCollection">									<xsl:for-each select="n1:GlossaryDetail">										<tr>											<td class="td">												<xsl:for-each select="n1:TermName">													<xsl:apply-templates/>												</xsl:for-each>											</td>											<td class="td">												<xsl:for-each select="n1:Plural">													<xsl:apply-templates/>												</xsl:for-each>											</td>											<td class="td">												<xsl:for-each select="n1:Abbreviation">													<xsl:apply-templates/>												</xsl:for-each>											</td>											<td class="td">												<xsl:for-each select="n1:AltAbbreviation">													<xsl:apply-templates/>												</xsl:for-each>											</td>											<td class="td_c">												<xsl:for-each select="n1:P">													<xsl:apply-templates/>												</xsl:for-each>											</td>											<td class="td_c">												<xsl:for-each select="n1:C">													<xsl:apply-templates/>												</xsl:for-each>											</td>											<td class="td_c">												<xsl:for-each select="n1:M">													<xsl:apply-templates/>												</xsl:for-each>											</td>											<td class="td_c">												<xsl:for-each select="n1:Q">													<xsl:apply-templates/>												</xsl:for-each>											</td>											<td class="td">												<xsl:for-each select="n1:SDescription">													<xsl:apply-templates/>													<br/>												</xsl:for-each>											</td>										</tr>									</xsl:for-each>								</xsl:for-each>							</tbody>						</table>					</xsl:for-each>				</xsl:for-each>			</body>		</html>	</xsl:template></xsl:stylesheet>