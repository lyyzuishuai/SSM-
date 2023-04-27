(function () {
    window.addEventListener("load", function () {
        var a = document.getElementsByClassName("needs-validation");
        var b = Array.prototype.filter.call(a, function (c) {
            c.addEventListener("submit", function (d) {
                if (c.checkValidity() === false) {
                    d.preventDefault();
                    d.stopPropagation()
                }
                c.classList.add("was-validated")
            }, false)
        })
    }, false)
})();