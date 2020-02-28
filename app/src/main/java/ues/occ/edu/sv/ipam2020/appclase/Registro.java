package ues.occ.edu.sv.ipam2020.appclase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Registro extends AppCompatActivity {

    private EditText _txtName;
    private EditText _txtApellido;
    private EditText _edad;
    private EditText _correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Bundle registros = this.getIntent().getExtras();

        _txtName = (EditText) findViewById(R.id.txtNombre);
        _txtName.setText(registros.getString("NAME"));
        _txtApellido = (EditText) findViewById(R.id.txt_apellido);
        _txtApellido.setText(registros.getString("APELLIDO"));
        _edad = (EditText) findViewById(R.id.txt_edad);
        _edad.setText(registros.getString("EDAD"));
        _correo = (EditText) findViewById(R.id.txt_correo);
        _correo.setText(registros.getString("CORREO"));
    }
}
