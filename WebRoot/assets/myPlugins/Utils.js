define(function(require) {
	/** @lends Utils */

	/**
	 * @name Utils
	 * @class 辅助类。
	 */
	var Utils = {};

	Utils._counter = 0;

	/**
	 * 根据指定名字生成一个全局唯一的ID，如Stage1，Bitmap2等。
	 */
	Utils.createUID = function(name) {
		var charCode = name.charCodeAt(name.length - 1);
		if (charCode >= 48 && charCode <= 57) name += '_';
		return name + this._counter++;
	};

	/**
	 * 把props参数指定的属性或方法复制到obj对象上。
	 * @param  {Object} obj 被复制对象。
	 * @param  {Object} props 包含要复制到obj对象上的属性或方法的对象。
	 * @param  {Boolean} strict 指定是否采用严格模式复制。默认为false。
	 * @return {Object} 复制后的obj对象。
	 */
	Utils.merge = function(obj, props, strict) {
		for (var key in props) {
			if (!strict || obj.hasOwnProperty(key) || obj[key] != undefined) obj[key] = props[key];
		}
		return obj;
	};

	/**
	 * 转化命名格式为驼峰式。
	 * @param {String} str 字符串。格式为"foo-bar"。
	 */
	Utils.camelCase = function(str) {
		return str.replace(/-([a-z])/ig, function(all, letter) {
			return letter.toUpperCase();
		});
	};

	/**
	 * 判断val是否是对象。
	 * @param	{*} val
	 * @return {Boolean}
	 */
	Utils.isObject = function(val) {
		return val === Object(val);
	};

	/**
	 * 判断val是否是函数。
	 * @param	{Object} val
	 * @return {Boolean}
	 */
	Utils.isFunction = function(val) {
		return val instanceof Function;
		// return Object.prototype.toString.call(val) === '[object Function]';
	};

	/**
	 * 判断val是否是数组。
	 * @param	{Object} val
	 * @return {Boolean}
	 */
	Utils.isArray = function(val) {
		// wp8手机报错
		// return Object.prototype.toString.call(val) == '[object Array]';
		return val instanceof Array;
	};

	/**
	 * 判断对象是否为空对象。
	 * @param	{Object} obj
	 * @return {int} 返回对象包含的属性数。
	 */
	Utils.isEmptyObject = function(obj) {
		var i = 0, p;
		for (p in obj) {
			if (obj.hasOwnProperty(p)) i++;
		}
		return i;
	};

	/**
	 * 为指定的displayobject显示对象生成一个包含路径的字符串表示形式。如Stage1.Container2.Bitmap3。
	 */
	Utils.displayObjectToString = function(displayObject) {
		var result;
		for (var o = displayObject; o != null; o = o.parent) {
			var s = o.id != null ? o.id : o.name;
			result = result == null ? s : (s + '.' + result);
			if (o == o.parent) break;
		}
		return result;
	};

	/**
	 * 将16进制颜色转化成css颜色值。
	 * @param	{int} hex 16进制数字
	 * @return {Object}		 css对象。
	 */
	Utils.hexToRgb = function(hex) {
		var css;
		hex = hex.toString(16);

		if (hex == '0') {
			css = '#000';
		}
		css = '#' + hex.slice(-6);
		return {css: css};
	};

	/**
	 * 将16进制颜色转化成css颜色值和alpha透明度。
	 * @param	{int} hex 16进制数字
	 * @return {Object}		 css和alpha对象。
	 */
	Utils.hexToRgba = function(hex) {
		var css, alpha;
		hex = hex.toString(16);

		if (hex == '0') {
			css = '#000';
			alpha = 0;
		} else {
			if (hex.length == 6) hex = '00' + hex;
			if (hex.length == 7) hex = '0' + hex;
			css = '#' + hex.slice(-6);
			alpha = (parseInt('0x' + hex.slice(0, -6)) / 255).toFixed(2);
		}

		return {css: css, alpha: alpha};
	};

	/**
	 * 获取URL参数。
	 * @return {Object} 包含URL参数的键值对对象。
	 */
	Utils.getUrlParams = function() {
		var params = {};
		var url = window.location.href;
		var idx = url.indexOf('?');
		if (idx > 0) {
			var queryStr = url.substring(idx + 1);
			var args = queryStr.split('&');
			for (var i = 0, a, nv; a = args[i]; i++) {
				nv = args[i] = a.split('=');
				params[nv[0]] = nv.length > 1 ? nv[1] : true;
			}
		}
		return params;
	};

	/**
	 * 动态添加meta到head中。
	 */
	Utils.addMeta = function(props) {
		var meta = document.createElement('meta');
		for (var p in props) meta.setAttribute(p, props[p]);
		head.insertBefore(meta, metaAfterNode);
	};

	/**
	 * 根据id获得DOM对象。
	 * @param  {String} id DOM对象的id。
	 * @return {HTMLElement} DOM对象。
	 */
	Utils.getDOM = function(id) {
		return document.getElementById(id);
	};

	/**
	 * 创建一个指定类型的type和属性props的DOM对象。
	 * @param  {String} type 指定DOM的类型。比如canvas，div等。
	 * @param  {Object} props 指定生成的DOM的属性对象。
	 * @return {HTMLElement} 新生成的DOM对象。
	 */
	Utils.createDOM = function(type, props) {
		var dom = document.createElement(type);
		for (var p in props) {
			var val = props[p];
			if (p == 'style') {
				for (var s in val)
					dom.style[s] = val[s];
			} else {
				dom[p] = val;
			}
		}
		return dom;
	};

	/**
	 * 获取某个DOM元素在页面中的位置偏移量。格式为{left: leftValue, top: topValue}。
	 * @param  {HTMLElement} elem DOM元素。
	 * @return {Object}指定DOM元素在页面中的位置偏移。格式为{left: leftValue, top: topValue}。
	 */
	Utils.getElementOffset = function(elem) {
		var left = elem.offsetLeft, top = elem.offsetTop;
		while ((elem = elem.offsetParent) && elem != document.body && elem != document) {
			left += elem.offsetLeft;
			top += elem.offsetTop;
		}
		return {left: left, top: top};
	};

	/**
	 * 创建一个可渲染的DOM，可指定tagName，如canvas或div。
	 * @param  {Object} disObj 一个DisplayObject或类似的对象。
	 * @param  {Object} imageObj 指定渲染的image及相关设置，如绘制区域rect。
	 * @return {HTMLElement} 新创建的DOM对象。
	 */
	Utils.createDOMDrawable = function(disObj, imageObj) {
		var tag = disObj.tagName || 'div';
		var img = imageObj.image;
		var w = disObj.width || (img && img.width);
		var h = disObj.height || (img && img.height);

		var elem = Utils.createDOM(tag);
		if (disObj.id) elem.id = disObj.id;
		elem.style.position = 'absolute';
		elem.style.left = (disObj.left || 0) + 'px';
		elem.style.top = (disObj.top || 0) + 'px';
		elem.style.width = w + 'px';
		elem.style.height = h + 'px';

		if (tag == 'canvas') {
			elem.width = w;
			elem.height = h;
			if (img) {
				var ctx = elem.getContext('2d');
				var rect = imageObj.rect || [0, 0, w, h];
				ctx.drawImage(img, rect[0], rect[1], rect[2], rect[3],
					(disObj.x || 0), (disObj.y || 0),
					(disObj.width || rect[2]),
					(disObj.height || rect[3]));
			}
		} else {
			elem.style.opacity = disObj.alpha != undefined ? disObj.alpha : 1;
			elem.style.overflow = 'hidden';
			if (img && img.src) {
				elem.style.backgroundImage = 'url(' + img.src + ')';
				var bgX = disObj.rectX || 0, bgY = disObj.rectY || 0;
				elem.style.backgroundPosition = (-bgX) + 'px ' + (-bgY) + 'px';
			}
		}
		return elem;
	};

	/**
	 * 显示或关闭舞台上所有显示对象的外包围矩形。此方法主要用于调试物体碰撞区域等。
	 * @param	{Stage} stage
	 */
	Utils.toggleDebugRect = function(stage) {
		stage.debug = !stage.debug;
		if (stage.debug) {
			stage._render = function(context) {
				if (context.clear != null) context.clear(0, 0, stage.width, stage.height);
				// Stage.superclass._render.call(stage, context);
				stage.constructor.superclass._render.call(stage, context);

				var ctx = stage.context.context;
				if (ctx != null) {
					ctx.save();
					ctx.lineWidth = 1;
					ctx.strokeStyle = '#f00';
					ctx.globalAlpha = 0.5;
				}
				drawObjectRect(stage, ctx);
				if (ctx != null) ctx.restore();
			};
		} else {
			stage._render = function(context) {
				if (context.clear != null) context.clear(0, 0, stage.width, stage.height);
				// Stage.superclass._render.call(stage, context);
				stage.constructor.superclass._render.call(stage, context);
			};
		}
	};

	/**
	 * 简单的log方法。同console.log。
	 */
	Utils.log = function() {
		var logs = Array.prototype.slice.call(arguments);
		if (typeof console != 'undefined' && typeof(console.log) != 'undefined') {
			console.log(logs.join(' '));
		}
	};

	/**
	 * 返回start和end之间的随机整数。
	 */
	Utils.random = function(start, end) {
		if (typeof end == 'undefined') {
			end = start;
			start = 0;
		}
		return parseInt(Math.random() * (end - start)) + start;
	};

	/**
	 * 返回Util的字符串表示形式。
	 * @return {String} Util的字符串表示形式。
	 */
	Utils.toString = function() {
		return 'Utils by 7u7u';
	};

	/**
	 * 检测显示对象obj是否与点x，y发生了碰撞。
	 * @param  {DisplayObject} obj 要检测的显示对象。
	 * @param  {Number} x 指定碰撞点的x坐标。
	 * @param  {Number} y 指定碰撞点的y坐标。
	 * @param  {Boolean} usePolyCollision 指定是否采用多边形碰撞。默认为false。
	 * @return {Number} 如果点x，y在对象obj内为1，在外为-1，在边上为0.
	 */
	Utils.hitTestPoint = function(obj, x, y, usePolyCollision) {
		var b = obj.getBounds(), len = b.length;
		var hit = x >= b.x && x <= b.x + b.width && y >= b.y && y <= b.y + b.height;

		if (hit && usePolyCollision) {
			var cross = 0, onBorder = false, minX, maxX, minY, maxY;
			for (var i = 0; i < len; i++) {
				var p1 = b[i], p2 = b[(i+1)%len];

				if (p1.y == p2.y && y == p1.y) {
					p1.x > p2.x ? (minX = p2.x, maxX = p1.x) : (minX = p1.x, maxX = p2.x);
					if (x >= minX && x <= maxX) {
						onBorder = true;
						continue;
					}
				}

				p1.y > p2.y ? (minY = p2.y, maxY = p1.y) : (minY = p1.y, maxY = p2.y);
				if (y < minY || y > maxY) continue;

				var nx = (y - p1.y) * (p2.x - p1.x) / (p2.y - p1.y) + p1.x;
				if (nx > x) cross++;
				else if (nx == x) onBorder = true;
			}

			if (onBorder) return 0;
			else if (cross % 2 == 1) return 1;
			return -1;
		}
		return hit ? 1 : -1;
	};

	/**
	 * 检测显示对象obj1和obj2是否发生了碰撞。
	 * @param  {DisplayObject} obj1 要检测的显示对象
	 * @param  {DisplayObject} obj2 要检测的显示对象
	 * @param  {Boolean} usePolyCollision 指定是否采用多边形碰撞。默认为false。
	 * @return {Boolean} 发生碰撞为true，否则为false。
	 */
	Utils.hitTestObject = function(obj1, obj2, usePolyCollision) {
		var b1 = obj1.getBounds(), b2 = obj2.getBounds();
		var hit = b1.x <= b2.x + b2.width && b2.x <= b1.x + b1.width && b1.y <= b2.y + b2.height && b2.y <= b1.y + b1.height;
		if (hit && usePolyCollision) {
			hit = Utils.polygonCollision(b1, b2);
			return hit !== false;
		}
		return hit;
	};

	/**
	 * 采用Separating Axis Theorem(SAT)的多边形碰撞检测方法。
	 * @private
	 * @param  {Array} poly1 多边形顶点数组。
	 * @param  {Array} poly2 多边形顶点数组。
	 * @return {Boolean} 发生碰撞为true，否则为false。
	 */
	Utils.polygonCollision = function(poly1, poly2) {
		var result = doSATCheck(poly1, poly2, {overlap: -Infinity, normal: {x: 0, y: 0}});
		if (result) return doSATCheck(poly2, poly1, result);
		return false;
	};

	/**
	 * 浏览器的特性的简单检测。
	 */
	function detectBrowser(ns) {
		var ua = ns.ua = navigator.userAgent;
		ns.isWebKit = (/webkit/i).test(ua);
		ns.isMozilla = (/mozilla/i).test(ua);	
		ns.isIE = (/msie/i).test(ua);
		ns.isFirefox = (/firefox/i).test(ua);
		ns.isChrome = (/chrome/i).test(ua);
		ns.isSafari = (/safari/i).test(ua) && !ns.isChrome;
		ns.isOpera = (/opera/i).test(ua);
		ns.isIpad = (/ipad/i).test(ua);
		ns.isIpod = (/ipod/i).test(ua);
		ns.isIphone = (/iphone/i).test(ua) && !ns.isIpod;
		ns.isIOS = ns.isIpad || ns.isIpod || ns.isIphone;
		ns.isAndroid = (/android/i).test(ua);
		ns.isWPhone = (/windows phone/i).test(ua);
		ns.isMobile = (/mobile/i).test(ua);
		ns.supportStorage = "localStorage" in window;
		ns.supportOrientation = "orientation" in window;
		ns.supportDeviceMotion = "ondevicemotion" in window;
		ns.supportTouch = "ontouchstart" in window;
		ns.supportCanvas = document.createElement("canvas").getContext != null;
		ns.cssPrefix = ns.isWebKit ? "webkit" : ns.isFirefox ? "Moz" : ns.isOpera ? "O" : ns.isIE ? "ms" : "";
	}

	detectBrowser(Utils);

	function doSATCheck(poly1, poly2, result)
	{
		var len1 = poly1.length, len2 = poly2.length, currentPoint, nextPoint, distance, min1, max1, min2, max2, dot, overlap, normal = {x:0, y:0};

		for(var i = 0; i < len1; i++)
		{
			currentPoint = poly1[i];
			nextPoint = poly1[(i < len1-1 ? i+1 : 0)];

			normal.x = currentPoint.y - nextPoint.y;
			normal.y = nextPoint.x - currentPoint.x;

			distance = Math.sqrt(normal.x * normal.x + normal.y * normal.y);
			normal.x /= distance;
			normal.y /= distance;

			min1 = max1 = poly1[0].x * normal.x + poly1[0].y * normal.y;		
			for(var j = 1; j < len1; j++)
			{
				dot = poly1[j].x * normal.x + poly1[j].y * normal.y;
				if(dot > max1) max1 = dot;
				else if(dot < min1) min1 = dot;
			}

			min2 = max2 = poly2[0].x * normal.x + poly2[0].y * normal.y;		
			for(j = 1; j < len2; j++)
			{
				dot = poly2[j].x * normal.x + poly2[j].y * normal.y;
				if(dot > max2) max2 = dot;
				else if(dot < min2) min2 = dot;
			}

			if(min1 < min2)
			{
				overlap = min2 - max1;
				normal.x = -normal.x;
				normal.y = -normal.y;
			}else
			{
				overlap = min1 - max2;
			}

			if(overlap >= 0)
			{
				return false;
			}else if(overlap > result.overlap)
			{
				result.overlap = overlap;
				result.normal.x = normal.x;
				result.normal.y = normal.y;
			}
		}

		return result;
	};



	/**
	 * 绘制显示对象的外围矩形
	 * @private
	 * @param	{DisplayObject} obj
	 * @param	{Context} ctx
	 */
	function drawObjectRect(obj, ctx) {
		for (var i = 0; i < obj.children.length; i++) {
			var child = obj.children[i];
			if (child.children) {
				drawObjectRect(child, ctx);
			} else {
				if (ctx != null) {
					var b = child.getBounds();

					ctx.globalAlpha = 0.2;
					ctx.beginPath();
					var p0 = b[0];
					ctx.moveTo(p0.x - 0.5, p0.y - 0.5);
					for (var j = 1; j < b.length; j++) {
						var p = b[j];
						ctx.lineTo(p.x - 0.5, p.y - 0.5);
					}
					ctx.lineTo(p0.x - 0.5, p0.y - 0.5);
					ctx.stroke();
					ctx.closePath();
					ctx.globalAlpha = 0.5;

					ctx.beginPath();
					ctx.rect((b.x>>0)-0.5, (b.y>>0)-0.5, b.width>>0, b.height>>0);
					ctx.stroke();
					ctx.closePath();
				} else {
					if (child.drawable.domDrawable) child.drawable.domDrawable.style.border = '1px solid #foo';
				}
			}
		}
	};

	/**
	 * 从数组中随机n项。
	 * @param  {int} n       随机元素数量。
	 * @param  {Boolean} notUniq 是否可以重复。
	 */
	Array.prototype.random = function(n, notUniq) {
		var array = this.clone(), val = [], i = 0, r;
		if (typeof n === 'number' && n > 1) {
			if (notUniq) {
				for (; i < n; i++) {
					val.push(array.random());
				}
			} else {
				if (n >= array.length) {
					n = array.length;
				}
				for (; i < n; i++) {
					r = array.random();
					array.remove(r);
					val.push(r);
				}
			}
			return val;
		}
		return this[Math.floor(Math.random() * this.length)];
	};
	/**
	 * 清空数组.
	 */
	Array.prototype.clear = function() {
		this.length = 0;
	};
	/**
	 * 数组复制.
	 * 
	 * @return {Array}
	 */
	Array.prototype.clone = function() {
		return this.slice(0);
	};
	/**
	 * 判断数组是否包含item项.
	 * 
	 * @param {Object}
	 *            item
	 * @return {Boolean}
	 */
	Array.prototype.contains = function(item) {
		return this.indexOf(item) == -1 ? false : true;
	};
	/**
	 * 在index后插入一项.
	 * 
	 * @param {Object}
	 *            index
	 * @param {Object...}
	 *            item
	 */
	Array.prototype.insertAt = function(index, item) {
		this.splice(index, 0, item);
	};
	/**
	 * 如果数组包含item, 则删除.
	 * 
	 * @param {Object}
	 *            item
	 * @return {Boolean}
	 */
	Array.prototype.remove = function(item) {
		var index = this.indexOf(item);
		if (index >= 0) {
			this.splice(index, 1);
			return true;
		}
		return false;
	};
	/**
	 * 删除数组index位置的元素.
	 * 
	 * @param {Int}
	 *            index
	 * @return {Boolean}
	 */
	Array.prototype.removeAt = function(index) {
		if (index >= 0 && index < this.length) {
			this.splice(index, 1);
			return true;
		}
		return false;
	};
	/**
	 * 过滤数组的null和undefined.
	 * 
	 * @return {Array}
	 */
	Array.prototype.compact = function() {
		return this.filter(function(v) {
			return !(v == null || typeof v == "undefined");
		});
	};
	/**
	 * 返回不包含重复元素的数组.
	 * 
	 * @param {Function}
	 *            fn[Optional]
	 * @param {Object}
	 *            thisp[Optional]
	 * @return {Array}
	 */
	Array.prototype.uniq = function(fn, thisp) {
		if (this.length < 2)
			return this.clone();

		var temp = this.clone(), thisp = thisp || this;
		for ( var i = 0; i < temp.length; i++) {
			for ( var j = i + 1; j < temp.length;) {
				if (fn && fn.call(thisp, temp[i], temp[j], this)) {
					temp.splice(j, 1);
				} else if (temp[i] === temp[j]) {
					temp.splice(j, 1);
				} else {
					j++;
				}
			}
		}
		return temp;
	};
	Array.prototype.clear = function() {
	    this.length = 0;
	};

	Math.DEG_TO_RAD = Math.PI / 180;
	Math.RAD_TO_DEG = 180 / Math.PI;

	/**
	 * 改变函数执行的上下文环境。
	 */
	Function.prototype.bind = function(bind) {
		var self = this;
		return function() {
			var args = Array.prototype.slice.call(arguments);
			return self.apply(bind || null, args);
		};
	};

	/**
	 * 给图片添加getWidth接口。
	 */
	Image.prototype.getWidth = function() {
		return this.width;
	};
	/**
	 * 给图片添加getHeight接口。
	 */
	Image.prototype.getHeight = function() {
		return this.height;
	};

	return Utils;
});
