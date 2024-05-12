public class inheritanceTest {




}
@Test
public void inheritsSuperInFirstConstructor(){
    HouseCat keyboardCat = new HouseCat("Keyboard Cat",7);
    assertEauals(7,keyboardCat.getWeight(),.001);
}