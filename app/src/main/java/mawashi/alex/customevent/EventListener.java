package mawashi.alex.customevent;

import android.widget.Toast;

/**
 * Created by alessandro.argentier on 29/09/2016.
 */
public class EventListener implements TomatoEventListener {

    @Override
    public void onTomatoEvent(){
        Toast.makeText(ApplicationClass.getContext(), "Tomato Event Catched!", Toast.LENGTH_LONG).show();
    }
}
