package contador.kassandrasalazar.android.contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    EditText mCampoConteo;
    Button mBotonContar;
    Button mBotonReiniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCampoConteo = (EditText) findViewById(R.id.etiqueta_conteo);
        mBotonContar = (Button) findViewById(R.id.boton_contar);
        mBotonReiniciar = (Button) findViewById(R.id.boton_reiniciar);

        mBotonContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m = mCampoConteo.getText().toString();
                int contar = Integer.parseInt(m);
                contar++;
                String resultadoConteo = Integer.toString(contar);
                mCampoConteo.setText(resultadoConteo);
            }
        });
        mBotonReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCampoConteo.setText("0");
            }
        });



    }
}
