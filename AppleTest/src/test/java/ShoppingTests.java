import org.testng.annotations.Test;
import page.*;

public class ShoppingTests extends CommonConditions

{
    /*
@Test
public void buyingTwoIdenticalPairs()  {
      new ShoesPage(driver)
            .openPage()
              .chooseTheFirstPair();
  }
 */

    @Test
    public void Whhat()
    {
        new ProductPage(driver)
                .openPage()
        .addToBag()
        .addToBagTwo();

    }

    /*
    @Test
    public void PerexodBRazdelMenUObratnoZad()
    {
        new PerexodBRazdelMenUObratno(driver).openPage();
    }
*/
    /*
    @Test
    public void Perexod()
    {
        new Perexod(driver).openPage();
    }
    */

     @Test
    public void PerxodKNew()
     {
         new PerxodKNew(driver).openPage();
     }


}
