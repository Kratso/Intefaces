this.Jpx=this.Jpx||{},this.Jpx.Pa=webpackJsonpJpx__name_([21],{448:function(e,t,n){"use strict";e.exports=n(449).default},449:function(e,t,n){"use strict";function i(e){return e&&e.__esModule?e:{default:e}}function o(e,t){for(var n=Object.getOwnPropertyNames(t),i=0;i<n.length;i++){var o=n[i],r=Object.getOwnPropertyDescriptor(t,o);r&&r.configurable&&void 0===e[o]&&Object.defineProperty(e,o,r)}return e}function r(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function a(e,t){if(!e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!t||"object"!=typeof t&&"function"!=typeof t?e:t}function p(e,t){if("function"!=typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function, not "+typeof t);e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,enumerable:!1,writable:!0,configurable:!0}}),t&&(Object.setPrototypeOf?Object.setPrototypeOf(e,t):o(e,t))}Object.defineProperty(t,"__esModule",{value:!0});var s=i(n(25)),l=i(n(450)),c=i(n(7));n(451);var d=new WeakMap,u=function(e){function t(n){r(this,t);var i=a(this,e.call(this,n)),o=i,p={};return d.set(o,p),p.di=n.di,i}return p(t,e),t.prototype._close=function(){var e=this;d.get(e).di.jAdFrame.getJDOMElement("container").removeClass(e.getPrefix()+"container-open"),e._isOpen=!1},t.prototype._open=function(){var e=this;return d.get(e).di.jAdFrame.getJDOMElement("container").addClass(e.getPrefix()+"container-open"),e._isOpen=!0,e},t.prototype._setPrefix=function(){this._prefix="jpx-pa-"},t.prototype.bindEvents=function(){var t=this,n=d.get(t).di.jAdFrame;return t._cancelClose=function(){},e.prototype.bindEvents.call(this),n.bindToJDOM("wrapper","mouseenter",function(){t._open()}),n.bindToJDOM("wrapper","mouseleave",function(){t._close()}),t},t.prototype.hide=function(){var e=this;d.get(e).di.jAdFrame.getJDOMElement("container").setStyle("overflow","hidden").setStyle("height",0).setStyle("width",0).transitionEnd(function(){e.publish("afterHide",[e]),e.destroy()},400)},t.prototype.setup=function(){var t=this,n=d.get(t),i=n.di.jDOM,o=n.di.jModel,r=c.default.isSafari(),a=n.di.jAdFrame,p=(a.getJDOMElement("ad"),a.getJDOMElement("container"));e.prototype.setup.call(this);var s="//cdn-cf.justpremium.com/adpa/img/peelad.svg";return r&&(s="//cdn-cf.justpremium.com/adpa/img/peelad-safari.svg"),i.createElement("img",{tag:"div",parent:p,attributes:{class:t.getPrefix()+"img"}}).createElement("img-svg",{tag:"img",parent:"img",attributes:{src:s,class:t.getPrefix()+"img-svg"}}),o.getData("width")&&a.getJDOMElement("ad").setStyle("width",o.getData("width")+"px"),o.getData("height")&&a.getJDOMElement("ad").setStyle("height",o.getData("height")+"px"),i.getElement("close").addClass("jpx-def-close-standard"),i.removeElement("brandlabel"),t},t.getCompatibilityAdapter=function(e){return new l.default(e)},t}(s.default);t.default=u},450:function(e,t,n){"use strict";function i(e,t){for(var n=Object.getOwnPropertyNames(t),i=0;i<n.length;i++){var o=n[i],r=Object.getOwnPropertyDescriptor(t,o);r&&r.configurable&&void 0===e[o]&&Object.defineProperty(e,o,r)}return e}function o(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function r(e,t){if(!e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!t||"object"!=typeof t&&"function"!=typeof t?e:t}function a(e,t){if("function"!=typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function, not "+typeof t);e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,enumerable:!1,writable:!0,configurable:!0}}),t&&(Object.setPrototypeOf?Object.setPrototypeOf(e,t):i(e,t))}Object.defineProperty(t,"__esModule",{value:!0});var p=function(e){return e&&e.__esModule?e:{default:e}}(n(12)),s=new WeakMap,l=function(e){function t(n){o(this,t);var i=r(this,e.call(this,n)),a=i;n=n||{};var p={};return p.di=n.di||{},s.set(a,p),i}return a(t,e),t.prototype._extendScope=function(t){var n=this,i=s.get(n).di;e.prototype._extendScope.call(this,t),t.options={branding:!1},t.skeleton={ad:null,adframe:null,skeleton:null,brandlabel:null,container:null},i.jAdFrame.subscribe("afterRender",function(e){var n=e[0];t.skeleton.skeleton=n.getJDOMElement("wrapper").getDOMElement(),t.skeleton.container=n.getJDOMElement("container").getDOMElement(),t.skeleton.content=n.getJDOMElement("content").getDOMElement(),t.skeleton.ad=n.getJDOMElement("ad").getDOMElement(),t.skeleton.adframe=n.getJDOMElement("adframe").getDOMElement()}),i.jDOM.subscribe("afterRender",function(e){var n=e[0];t.skeleton.closebutton=n.getElement("close").getDOMElement()})},t.prototype.setDependency=function(e,t){var n=this;return s.get(n).di[e]=t,n.publish(e+"DependencySet",[t]),n},t}(p.default);t.default=l},451:function(e,t,n){var i=n(452);"string"==typeof i&&(i=[[e.i,i,""]]);n(4)(i,{window:"top"});i.locals&&(e.exports=i.locals)},452:function(e,t,n){(e.exports=n(3)()).push([e.i,"[class*='jpx-def-'] {\n  background: url(\"https://cdn-cf.justpremium.com/adr/defaults_sprite.png\") no-repeat;\n  display: inline-block; }\n\n.jpx-def-close-br {\n  background-position: 0 0;\n  height: 188px;\n  width: 39px; }\n\n.jpx-def-close-collapse {\n  background-position: -140px 0;\n  height: 21px;\n  width: 21px; }\n\n.jpx-def-close-mobile {\n  background-position: -79px 0;\n  height: 35px;\n  width: 35px; }\n\n.jpx-def-close-small {\n  background-position: -113px -22px;\n  height: 18px;\n  width: 20px; }\n\n.jpx-def-close-standard {\n  background-position: -117px 0px;\n  height: 21px;\n  width: 21px; }\n\n.jpx-def-open-br {\n  background-position: -39px 0;\n  height: 188px;\n  width: 39px; }\n\n.jpx-pa-wrapper {\n  z-index: 314748461;\n  border: 0;\n  box-sizing: content-box;\n  cursor: pointer;\n  direction: ltr;\n  display: inline-block;\n  margin: 0;\n  position: fixed;\n  right: 0;\n  text-align: left;\n  text-decoration: none;\n  text-indent: 0;\n  top: 0;\n  visibility: visible;\n  -webkit-user-select: none; }\n  .jpx-pa-wrapper > .jpx-pa-container {\n    border: 0;\n    box-sizing: content-box;\n    direction: ltr;\n    display: inline-block;\n    height: 250px;\n    overflow: hidden;\n    position: relative;\n    text-align: left;\n    text-decoration: none;\n    text-indent: 0;\n    vertical-align: top;\n    visibility: visible;\n    width: 300px;\n    -webkit-transition: width 0.35s linear, height 0.35s linear;\n    -moz-transition: width 0.35s linear, height 0.35s linear;\n    -o-transition: width 0.35s linear, height 0.35s linear;\n    transition: width 0.35s linear, height 0.35s linear; }\n    .jpx-pa-wrapper > .jpx-pa-container.jpx-pa-container-open {\n      height: 450px;\n      width: 540px; }\n      .jpx-pa-wrapper > .jpx-pa-container.jpx-pa-container-open .jpx-pa-img {\n        filter: progid:DXImageTransform.Microsoft.Alpha(Opacity=80);\n        opacity: 0.8; }\n    .jpx-pa-wrapper > .jpx-pa-container > .jpx-pa-content {\n      height: 96%;\n      overflow: hidden;\n      position: absolute;\n      right: 0;\n      top: 0;\n      visibility: visible;\n      width: 95%;\n      z-index: 2; }\n      .jpx-pa-wrapper > .jpx-pa-container > .jpx-pa-content > .jpx-pa-ad {\n        z-index: 314748464;\n        border: 0;\n        position: absolute;\n        right: 0;\n        top: 0;\n        visibility: visible; }\n        .jpx-pa-wrapper > .jpx-pa-container > .jpx-pa-content > .jpx-pa-ad > .jpx-pa-ad-frame {\n          height: 100%;\n          width: 100%; }\n    .jpx-pa-wrapper > .jpx-pa-container > .jpx-pa-img {\n      height: 100%;\n      left: 0;\n      pointer-events: none;\n      position: absolute;\n      top: 0;\n      width: 100%;\n      z-index: 10;\n      filter: progid:DXImageTransform.Microsoft.Alpha(Opacity=100);\n      opacity: 1;\n      -webkit-transition: opacity 0.3s linear;\n      -moz-transition: opacity 0.3s linear;\n      -o-transition: opacity 0.3s linear;\n      transition: opacity 0.3s linear; }\n    .jpx-pa-wrapper > .jpx-pa-container > .jpx-pa-close {\n      z-index: 314748465;\n      cursor: pointer;\n      display: block;\n      position: absolute;\n      right: 5px;\n      top: 5px; }\n",""])}},[448]);