package mawashi.alex.customevent;

/**
 * Created by alessandro.argentier on 30/09/2016.
 */
import android.widget.Toast;

/**
 * Created by alessandro.argentier on 29/09/2016.
 */
public class EventListener2 implements TomatoEventListener {

    @Override
    public void onTomatoEvent(){
        Toast.makeText(ApplicationClass.getContext(), this.getClass().getSimpleName() + ": Tomato Event Catched!", Toast.LENGTH_LONG).show();
    }
}