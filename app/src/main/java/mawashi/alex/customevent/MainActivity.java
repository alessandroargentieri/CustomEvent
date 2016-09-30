package mawashi.alex.customevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EventLauncher eventLauncher;
    EventListener eventListener;
    EventListener2 eventListener2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eventListener = new EventListener();
        eventListener2 = new EventListener2();

        eventLauncher = new EventLauncher(eventListener);
        // eventLauncher = new EventLauncher();

    }

    public void Catch(View v){
        EditText editText = (EditText)findViewById(R.id.edit);
        String word = editText.getText().toString();
        eventLauncher.getWord(word);

    }
}
