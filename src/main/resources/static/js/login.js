/**登录**/
$(document).ready(function () {
    // $(function () {


    $("#login_from").submit(function () {
        $.ajax({
            type:"post",
            url : "http://localhost:8087/login"+"/doLogin",
            data:$("#login_from").serialize(),
            success: function (result) {

                console.log("后台传入信息",result);
                if (result=="0001"){
                    alert(
                        "用户名不能为空"
                    )
                }
                if (result=="0002"){
                    alert("密码不能为空")

                }
                if (result=="0003"){
                    alert("用户名或密码不正确")

                }
                if (result=="0004"){
                    alert("用户名或密码不正确")

                }
                else {
                    window.location = "regist.html"

                }

            }
        });

    });


});

