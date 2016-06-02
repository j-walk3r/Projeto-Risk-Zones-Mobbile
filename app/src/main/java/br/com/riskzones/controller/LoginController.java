package br.com.riskzones.controller;

import android.util.Log;
import android.widget.Toast;

import br.com.riskzones.model.ModelLogin;

/**
 * Created by jhone on 25/05/2016.
 */
public class LoginController {

    Login login = new Login();
    ModelLogin mLogin = new ModelLogin();

    public Boolean validaLogin(Login login){
        boolean isSenhaOk = false;


        if (login.getEmail() != null && login.getEmail() != null){
            String emailDb = "jhones.ns@gmail.com";
            String senhaDb = "12345";

            if(login.getEmail() == emailDb && login.getSenha() == senhaDb ) {
                Log.i("LoginOk", "Login aceito!");
                mLogin.salvarLoginTemp(login);
                isSenhaOk = true;
            }else{
                Log.i("LoginErro", "Email ou senhas incorretos");
                isSenhaOk = false;
            }

        }else{
            Log.i("LoginErro", "Informe Login e Senha!");
            isSenhaOk = false;
        }
        return isSenhaOk;
    }

}
