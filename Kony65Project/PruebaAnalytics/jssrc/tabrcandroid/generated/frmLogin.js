//Form JS File
function frmLogin_frmLogin_onDeviceBack_seq0(eventobject) {
    onFrmLoginBack.call(this);
};

function frmLogin_button482559029417_onClick_seq0(eventobject) {
    test.call(this);
};

function addWidgetsfrmLogin() {
    var button482559029417 = new kony.ui.Button({
        "id": "button482559029417",
        "top": "20dp",
        "left": "0%",
        "width": "20%",
        "height": "60dp",
        "centerX": "50%",
        "zIndex": 1,
        "isVisible": true,
        "text": null,
        "onClick": frmLogin_button482559029417_onClick_seq0
    }, {
        "padding": [0, 0, 0, 0],
        "contentAlignment": constants.CONTENT_ALIGN_CENTER,
        "displayText": true,
        "marginInPixel": false,
        "paddingInPixel": false,
        "containerWeight": 13
    }, {});
    frmLogin.add(
    button482559029417);
};

function frmLoginGlobals() {
    var MenuId = [];
    frmLogin = new kony.ui.Form2({
        "id": "frmLogin",
        "enableScrolling": true,
        "bounces": false,
        "pagingEnabled": false,
        "needAppMenu": false,
        "title": null,
        "enabledForIdleTimeout": false,
        "layoutType": kony.flex.FREE_FORM,
        "addWidgets": addWidgetsfrmLogin
    }, {
        "padding": [0, 0, 0, 0],
        "displayOrientation": constants.FORM_DISPLAY_ORIENTATION_LANDSCAPE,
        "paddingInPixel": false
    }, {
        "retainScrollPosition": false,
        "windowSoftInputMode": constants.FORM_ADJUST_RESIZE,
        "titleBar": true,
        "footerOverlap": false,
        "headerOverlap": false,
        "inTransitionConfig": {
            "formAnimation": 0
        },
        "outTransitionConfig": {
            "formAnimation": 0
        },
        "onDeviceBack": frmLogin_frmLogin_onDeviceBack_seq0,
        "menuPosition": constants.FORM_MENU_POSITION_AFTER_APPMENU
    });
    frmLogin.setDefaultUnit(kony.flex.DP);
};