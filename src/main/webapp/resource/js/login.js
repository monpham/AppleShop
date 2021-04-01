const container = document.getElementById("container");
const signIn = document.getElementById("sign-in");
const signUp = document.getElementById("sign-up");

setTimeout(() => {
    container.classList.add("sign-in");
}, 200);

const toggle = () => {
    container.classList.toggle("sign-in");
    container.classList.toggle("sign-up");
};

signIn.addEventListener("click", toggle);
signUp.addEventListener("click", toggle);

function validateEmail(email) {
    const re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return re.test(email);
}

function validate() {
    const $result = jQuery("#result");
    const email = jQuery("#email").val();
    $result.text("");
    console.log("validate", email);
    if (validateEmail(email)) {
        $result.text(email + " is valid :)");
        $result.css("color", "green");
    } else {
        $result.text(email + " is not valid :(");
        $result.css("color", "red");
        return false;
    }

}

jQuery(document).ready(function() {
   /* alert("Login App");*/
    jQuery(document).on("click", "#validate", validate);
})