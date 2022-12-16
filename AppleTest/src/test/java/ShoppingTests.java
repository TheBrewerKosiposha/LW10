import org.testng.annotations.Test;
import page.ProductPage;
import page.ShoesPage;

public class ShoppingTests extends CommonConditions

{

    @Test
    public void buyingTwoIdenticalPairs()  {
       new ShoesPage(driver)
               .openPage()
               .chooseTheFirstPair();


    }
    /*
    @Test
    public void Whhat()
    {
        new ProductPage(driver)
                .openPage()
                .addToBag();
    }
*/

}
