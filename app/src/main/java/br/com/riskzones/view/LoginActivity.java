package br.com.riskzones.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.riskzones.R;
import br.com.riskzones.controller.Login;
import br.com.riskzones.controller.LoginController;

/**
 * Created by jhone on 22/05/2016.
 */
public class LoginActivity extends Activity {

    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.tela_login);
    }
    public void getLogin(View v){

        EditText edtEmail = (EditText) findViewById(R.id.edtEmail);
        EditText edtSenha = (EditText) findViewById(R.id.edtSenha);

        LoginController loginCont = new LoginController();
        Login login = new Login();

        login.setEmail(edtEmail.toString());
        login.setSenha(edtSenha.toString());

        boolean isLogin = loginCont.validaLogin(login);

        if(isLogin == true){
            Toast.makeText(LoginActivity.this, "Logando...", Toast.LENGTH_SHORT).show();
        }
    }
}
