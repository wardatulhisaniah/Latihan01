package id.ac.poliban.mi.atul.latihan01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etNim = findViewById(R.id.etNim);
        final EditText etName = findViewById(R.id.etName);
        EditText etAddress = findViewById(R.id.etAddress);
        EditText etPhone = findViewById(R.id.etPhone);
        Button btClear = findViewById(R.id.btClear);
        Button btSubmit = findViewById(R.id.btSubmit);


        btClear.setOnClickListener(v -> {
            //Mengosongkan EditText
            etNim.setText("");
            etName.setText("");
            etAddress.setText("");
            etPhone.setText("");
        });

        btSubmit.setOnClickListener(v -> {
            //Mengosongkan EditText
            etNim.setText("");
            etName.setText("");
            etAddress.setText("");
            etPhone.setText("");
            etName.requestFocus();
            Toast.makeText(this, "Input Data Sukses", Toast.LENGTH_SHORT).show();
        });
    }
}
