(function (a) {
    a.mask.definitions["~"] = "[+-]";
    a("#date").mask("99/99/9999");
    a("#phone").mask("(999) 999-9999");
    a("#phoneExt").mask("(999) 999-9999? x99999");
    a("#iphone").mask("+33 999 999 999");
    a("#tin").mask("99-9999999");
    a("#ccn").mask("9999 9999 9999 9999");
    a("#ssn").mask("999-99-9999");
    a("#currency").mask("999,999,999.99");
    a("#product").mask("a*-999-a999", {placeholder: " "});
    a("#eyescript").mask("~9.99 ~9.99 999");
    a("#po").mask("PO: aaa-999-***");
    a("#pct").mask("99%");
    a("#phoneAutoclearFalse").mask("(999) 999-9999", {autoclear: false});
    a("#phoneExtAutoclearFalse").mask("(999) 999-9999? x99999", {autoclear: false});
    a("input").blur(function () {
        a("#info").html("Unmasked value: " + a(this).mask())
    }).dblclick(function () {
        a(this).unmask()
    })
})(jQuery);