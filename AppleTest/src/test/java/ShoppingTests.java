import org.testng.annotations.Test;
import page.*;

public class ShoppingTests extends CommonConditions

{

    @Test
    public void LockMAP()  {
       new Map(driver)
               .openPage();
    }
   @Test
    public void NewPerxodSait()
   {
       new NewPerexod(driver)
               .openPage();
   }
   @Test
   public void NewPerexodSaitToFor4Mobile()
   {
       new NewPerexodFor4Mobile(driver)
               .openPage();
   }
    @Test
    public void NewPerexodSaitToLoockMap()
    {
        new NewPerexodForLoockMap(driver)
                .openPage();
    }
    @Test
    public void NewPerexodSaitToLoockMan()
    {
        new NewPerexodForMan(driver)
                .openPage();
    }

    @Test
    public void NewPerexodSaitToAnimal()
    {
        new NewPerexodToAnima(driver)
                .openPage();
    }

    @Test
    public void NewPerexodSaitToBackForMenu()
    {
        new NewPrexodToBackForMenu(driver)
                .openPage();
    }




}
