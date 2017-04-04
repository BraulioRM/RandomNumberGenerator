package braulio.ramirez.randomnumbergenerator;

import android.os.Bundle;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {


    int randomNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button guess =(Button)findViewById(R.id.Guess);




    }

    public void Guess(View view){

        EditText editText = (EditText)findViewById(R.id.RespuestaUsuario);

        String numeroUsuario = editText.getText().toString();

        System.out.println(numeroUsuario);

        //Convertimos a Integer el numeroUsuario
        int numeroUsuarioInt = Integer.parseInt(numeroUsuario);


        String message = "";


        if (numeroUsuarioInt > randomNumber){

            message = "Demasiado alto";
        } else if (numeroUsuarioInt < randomNumber){

            message = "Demasiado bajo";
        }else {

            message ="Le atinaste!, Felicidades";
        }


        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();

    }


    public void randonGenerator() {

        Random randomGenerator = new Random();

        int randomNumber = randomGenerator.nextInt(5);

        System.out.println("hola random number");
    }



}
