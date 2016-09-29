package mawashi.alex.customevent;

/**
 * Created by alessandro.argentier on 29/09/2016.
 */
public class EventLauncher {
    private TomatoEventListener tomatoEventListener;

    public EventLauncher(TomatoEventListener t){
        this.tomatoEventListener = t;
    }

    public EventLauncher(){
        this.tomatoEventListener = new EventListener();
    }

    public void getWord(String word){
        if(word.equals("tomato") || word.equals("Tomato") || word.equals("TOMATO"))
            tomatoEventListener.onTomatoEvent();
    }
}
