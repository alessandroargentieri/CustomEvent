# CustomEvent
In this example a custom event (TomatoEvent) is created. 
When the EventLauncher.java class recognize this event, recall the void onTomatoEvent() of the TomatoEventListener interface.
So the EventLauncher recognizes the event and call a void of a custom listener interface which is implemented by the EventListener.

The main thread creates both the EventListener and the EventLauncher instances and let them run.

A class (ApplicationClass.java) extends Application and is used to get global state variables, using static methods.
This is used not to instance the ApplicationClass but to use its methods statically.
For example to get the Application Context from each class of the application, without instantiating the ApplicationClass every time.

