package br.com.riskzones.view;

import android.app.Activity;
import android.os.Bundle;

import br.com.riskzones.R;

/**
 * Created by jhone on 22/05/2016.
 */
public class LoginActivity extends Activity {

    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.tela_login);
    }
}
