var JOBS_SEARCHER=JOBS_SEARCHER||{};function __init_JobsSearcher(){this.ajaxRequest({get_params:'command=types',callback:'fillTypes',self:this,});this.initSearchText();this.ajaxRequest({get_params:'command=categories',callback:'autocompleteSearchLanguage',self:this,});this.initSearchLanguage();this.initSearchLocation();this.initSearchDate();this.initSearchButton();}
function __fillTypes_JobsSearcher(params){var types=params.response||params.types;for(var i in types){this.addType({id_parent:params.id_parent||this.type_container,type_name:types[i],classes:params.classes||this.type_classes,});};}
function __addType_JobsSearcher(params){var id_parent=params.id_parent||null;var type_name=params.type_name||null;var classes=params.classes||null;var parent=document.getElementById(id_parent);var type=document.createElement('button');type.type="button";type.innerHTML=type_name;type.className=classes;type.ref=this;type.parent=parent;type.addEventListener("click",function(){var unselect=this.style.color=="white"&&this.style.backgroundColor=="rgb(26, 188, 156)";for(var i=0;i<parent.childNodes.length;i++){if(this.parent.childNodes[i].type=='button'){this.parent.childNodes[i].style.color="";this.parent.childNodes[i].style.backgroundColor="";}}
if(unselect)
{this.ref.setSearchCriteria({type:''});}else{this.ref.setSearchCriteria({type:type_name});this.style.color="white";this.style.backgroundColor="rgb(26, 188, 156)";}});parent.appendChild(type);}
function __initSearchText_JobsSearcher(params){if(this.search_text_id){var search_text=document.getElementById(this.search_text_id);search_text.ref=this;search_text.addEventListener('blur',function(){this.value=this.value.trim();this.ref.setSearchCriteria({text:this.value,});});}}
function __autocompleteSearchLanguage_JobsSearcher(params){var response=params.response;var source=[];this.language_labels=[];var mapping={};var search_language=document.getElementById(this.search_language_id);for(var i=0;i<response.length;++i){source.push(response[i].label);this.language_labels.push(response[i].label);mapping[response[i].label]=response[i].value;}
search_language.ref=this;$('#'+this.search_language_id).autocomplete({source:source,select:function(event,ui){this.ref.setSearchCriteria({language:mapping[ui.item.value],});}});}
function __initSearchLanguage_JobsSearcher(params){if(this.search_language_id){var search_language=document.getElementById(this.search_language_id);search_language.ref=this;search_language.onchange=function(){var found=$.inArray(this.value.trim(),this.ref.language_labels)>-1;if(!found)
{this.ref.setSearchCriteria({language:'',});this.value='';}};}}
function __initSearchLocation_JobsSearcher(params){if(this.search_location_id){var search_location=document.getElementById(this.search_location_id);search_location.ref=this;search_location.onchange=function(){this.value=this.value.trim();this.ref.setSearchCriteria({location:this.value.trim(),});};}}
function __initSearchDate_JobsSearcher(params){if(this.search_date_id){var search_date=document.getElementById(this.search_date_id);search_date.ref=this;search_date.addEventListener('keydown',function(){this.value='';this.ref.setSearchCriteria({date:'',});});search_date.onchange=function(){this.ref.setSearchCriteria({date:this.value,});};}}
function __initSearchButton_JobsSearcher(params){if(this.search_button_id){var search_button=document.getElementById(this.search_button_id);search_button.ref=this;search_button.addEventListener('click',function(){this.ref.search();});}}
function __ajaxRequest_JobsSearcher(params)
{var get_params=params.get_params||null;var callback=params.callback||null;var self=params.self||null;var xmlhttp;if(window.XMLHttpRequest)
{xmlhttp=new XMLHttpRequest();}
else
{xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");}
xmlhttp.ref=self;xmlhttp.onreadystatechange=function()
{if(xmlhttp.readyState==4&&xmlhttp.status==200&&xmlhttp.responseText.trim()!=="")
{json_response=$.parseJSON(xmlhttp.responseText);if(callback){this.ref.exec(callback,{response:json_response});}}}
xmlhttp.open("GET",this.ajax_url+'?'+get_params,true);xmlhttp.send();}
function __exec_JobsSearcher(func,params)
{if(func==='init'){this.init(params);return;}
if(func==='addType'){this.addType(params);return;}
if(func==='fillTypes'){this.fillTypes(params);return;}
if(func==='ajaxRequest'){this.ajaxRequest(params);return;}
if(func==='autocompleteSearchLanguage'){this.autocompleteSearchLanguage(params);return;}
if(func==='showSearchResults'){this.showSearchResults(params);return;}}
function __setSearchCriteria_JobsSearcher(params)
{if(params.text!=undefined){this.search_criteria.text=params.text!=''?params.text:undefined;return;}
if(params.type!=undefined){this.search_criteria.type=params.type!=''?params.type:undefined;return;};if(params.language!=undefined){this.search_criteria.language=params.language!=''?params.language:undefined;return;};if(params.location!=undefined){this.search_criteria.location=params.location!=''?params.location:undefined;return;};if(params.date!=undefined){this.search_criteria.date=params.date!=''?params.date:undefined;return;};}
function __showSearchResults_JobsSearcher(params)
{var result=params.response||[];var result_container=document.getElementById(this.result_container_id);var result_list="";if(result.length<1){result_list+='<li class="article-last-job" style="text-align:center;">';result_list+='<h2>No se han encontrado resultados con sus criterios de b&uacute;squeda.</h2>';result_list+='</li>';}else{for(var i=0;i<result.length;i++)
{result_list+='<li class="article-last-job" style="text-align:left;">';result_list+='<div class="fill-job" onclick="location.href=\''+Base64.decode(result[i].url)+'\';">';result_list+='<h2><a href="'+Base64.decode(result[i].url)+'" style="color:#333;">'+Base64.decode(result[i].name)+'</a></h2>';result_list+='<span class="glyphicon glyphicon-user article-last-icon"><span class="article-last-icon-count">'+Base64.decode(result[i].company)+'</span></span>&nbsp;';result_list+='<span class="glyphicon glyphicon-map-marker article-last-icon"><span class="article-last-icon-count">'+Base64.decode(result[i].place)+'</span></span>&nbsp;';result_list+='<span class="glyphicon glyphicon-calendar article-last-icon"><span class="article-last-icon-count">'+Base64.decode(result[i].date)+'</span></span>&nbsp;';result_list+='<span class="glyphicon glyphicon-tag article-last-icon"><span class="article-last-icon-count">'+Base64.decode(result[i].type)+'</span></span>';result_list+='</div>';result_list+='</li>';}}
result_container.innerHTML=result_list;}
function __search_JobsSearcher(params)
{var args='';if(this.search_criteria.text)
args+='&text='+this.search_criteria.text;if(this.search_criteria.type)
args+='&type='+this.search_criteria.type;if(this.search_criteria.language)
args+='&language='+this.search_criteria.language;if(this.search_criteria.location)
args+='&location='+this.search_criteria.location;if(this.search_criteria.date)
args+='&date='+this.search_criteria.date;this.ajaxRequest({get_params:'command=search'+ args,callback:'showSearchResults',self:this,});}
function JobsSearcher(params)
{this.ajax_url=params.ajax_url||"http://programacionnet.com/ajax/jobs_searcher.php";this.type_container=params.type_container||null;this.type_classes=params.type_classes||null;this.search_text_id=params.search_text_id||null;this.search_language_id=params.search_language_id||null;this.search_location_id=params.search_location_id||null;this.search_date_id=params.search_date_id||null;this.search_button_id=params.search_button_id||null;this.result_container_id=params.result_container_id||null;this.search_criteria=params.search_criteria||{};this.language_labels=params.language_labels||[];this.initSearchText=__initSearchText_JobsSearcher;this.initSearchLanguage=__initSearchLanguage_JobsSearcher;this.initSearchLocation=__initSearchLocation_JobsSearcher;this.initSearchDate=__initSearchDate_JobsSearcher;this.initSearchButton=__initSearchButton_JobsSearcher;this.init=__init_JobsSearcher;this.addType=__addType_JobsSearcher;this.fillTypes=__fillTypes_JobsSearcher;this.autocompleteSearchLanguage=__autocompleteSearchLanguage_JobsSearcher;this.ajaxRequest=__ajaxRequest_JobsSearcher;this.setSearchCriteria=__setSearchCriteria_JobsSearcher;this.search=__search_JobsSearcher;this.exec=__exec_JobsSearcher;this.showSearchResults=params.showSearchResults||__showSearchResults_JobsSearcher;this.init();}