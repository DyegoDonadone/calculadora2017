package br.com.munif.android.calculadora2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TelaPrincipalActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et1;
    private EditText et2;
    private TextView tvRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        et1=(EditText)findViewById(R.id.etOp1);
        et2=(EditText)findViewById(R.id.etOp2);
        tvRes=(TextView)findViewById(R.id.tvResultado);
        findViewById(R.id.btMulti).setOnClickListener(this);
        findViewById(R.id.btSoma).setOnClickListener(this);
        findViewById(R.id.btSub).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        double op1=Double.parseDouble(et1.getText().toString());
        double op2=Double.parseDouble(et2.getText().toString());
        if (view.getId()==R.id.btSoma) {
           tvRes.setText("" + (op1 + op2));
        }
        else if (view.getId()==R.id.btSub) {
            tvRes.setText("" + (op1 - op2));
        }
        else if (view.getId()==R.id.btMulti) {
            tvRes.setText("" + (op1 * op2));
        }

    }


    public void sobre(View view) {
        Intent intent = new Intent(this, SobreActivity.class);
        startActivity(intent);

    }
}
