import org.testng.annotations.Test;
import page.NewPerexod;
import page.ProductPage;
import page.ShoesPage;

public class ShoppingTests extends CommonConditions

{

    @Test
    public void buyingTwoIdenticalPairs()  {
       new NewPerexod(driver)
               .openPage();


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
