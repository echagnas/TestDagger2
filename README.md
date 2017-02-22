# TestDagger2
Test of injections with Dagger2

- 1 We have a interface PresentationInterface with 2 implementations : PresentationCharles and PresentationBenoit.
- 2 We have a module, PresentationModule, which create the 2 implementations. Each have a different @Named.
- 3 We have a component PresentationComponent. It uses PresentationModule and inject in MainActivity.
- 4 The Application class contains the object presentationComponent. We build here the component.
- 5 We have a method to get component from everywhere with Application.app().component().
- 6 In MainActivity, we inject a PresentationInterface with a @Named to select which one.
- 7 In the onCreate method, we say to the component that we want to inject in MainActivity.

If we change the @Named in MainActivity, the implementation of PresentationInterface will change.
