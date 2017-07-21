/**
 * example:
 * <input type="text" required data-bv-notempty-message="姓名不能为空">
 * required data-bv-notempty-message="" 非空校验
 * data-bv-notempty data-bv-notempty-message="" 非空校验。
 * data-bv-choice="true" data-bv-choice-min="2" data-bv-choice-max="4" data-bv-choice-message=""  checkbox,多选校验 
 * 更多请参考bootstrapValidator官方网站http://plugins.jquery.com/bootstrapValidator/ 
 */

define(function (require) {
    var utils = require('assets/myPlugins/Utils');
    var Class = require('assets/myPlugins/Class');
    var BootStrapCore = require('assets/myPlugins/bootStrap/BootStrapCore');
    var BootStrapFrom = Class.create({
        initialize: function (props) {
            this.fromID = "";
            this.saveUrl = "";
            this.message = "";
            this.fromModal ="";
            this.tableID = "";
            this.feedbackIcons = {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            };
            this.fields = null;
            utils.merge(this, props);
            BootStrapCore.initFromToolbar(props);
        },
        validatorFrom: function () {
        	var url = this.saveUrl;
            var fromModal = this.fromModal;
            var tableID = this.tableID;
            $('#' + this.fromID).bootstrapValidator({
                message: this.message,
                feedbackIcons: this.feedbackIcons,
                fields:this.fields
            }).on('success.form.bv', function (e, data) {
                e.preventDefault();
                BootStrapCore.validatorSuccess(e, data,url,fromModal,tableID);
            });
            $('#'+this.fromID).fileupload({
                url: '/redcross/upload'
            });
        },
        getValidatorObj:function(){
            return $('#'+this.formID);
        }
    });
    return  BootStrapFrom;
});

