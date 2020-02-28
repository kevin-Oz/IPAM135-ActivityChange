package ues.occ.edu.sv.ipam2020.appclase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtName;
    private EditText txtApellido;
    private EditText txtEdad;
    private EditText txtCorreo;
    private Button btnProcesar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = (EditText) findViewById(R.id.txtname);
        txtApellido = (EditText) findViewById(R.id.txtapellido);
        txtEdad = (EditText) findViewById(R.id.txtedad);
        txtCorreo = (EditText) findViewById(R.id.txtcorreo);
        btnProcesar= (Button) findViewById(R.id.btnenviar);

        btnProcesar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openRegistry = new Intent(MainActivity.this,Registro.class);
                Bundle data = new Bundle();
                data.putString("NAME",txtName.getText().toString());
                data.putString("APELLIDO",txtApellido.getText().toString());
                data.putString("EDAD",txtEdad.getText().toString());
                data.putString("CORREO",txtCorreo.getText().toString());
                openRegistry.putExtras(data);
                startActivity(openRegistry);
            }
        });


    }
}
