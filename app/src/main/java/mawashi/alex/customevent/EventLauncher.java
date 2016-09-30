package mawashi.alex.customevent;

/**
 * Created by alessandro.argentier on 29/09/2016.
 */
public class EventLauncher {
    private TomatoEventListener tomatoEventListener;

    //si riceve come parametro un interfaccia, in realtà dall'altra parte sarà necessariamente passata una classe che implementa tale interfaccia
    public EventLauncher(TomatoEventListener t){
        this.tomatoEventListener = t;
    }

    public EventLauncher(){
        this.tomatoEventListener = new EventListener(); //N.B: non è un TomatoEventListener ma una classe che la implementa
    }

    public void getWord(String word){
        if(word.equals("tomato") || word.equals("Tomato") || word.equals("TOMATO"))
            tomatoEventListener.onTomatoEvent();
    }

}
