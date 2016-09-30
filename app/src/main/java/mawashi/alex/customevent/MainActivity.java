package mawashi.alex.customevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EventLauncher eventLauncher;
    EventListener eventListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eventListener = new EventListener();

        //notiamo come gli passiamo un Listener implementato, anche se la classe EventLauncher vorrebbe un'interfaccia
        eventLauncher = new EventLauncher(eventListener); //si associa un solo ascoltatore, non una lista come in Observable/Observer
        // eventLauncher = new EventLauncher();

    }

    public void Catch(View v){
        EditText editText = (EditText)findViewById(R.id.edit);
        String word = editText.getText().toString();
        eventLauncher.getWord(word);

    }
}
