package UI.tests;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class Search extends Base{

    private String searchedGame = "Angel";

    @Test
    public void searchGameBySearchField (){
        home.search(searchedGame);
        Assert.assertFalse(results.areAllRowsContainGameText(searchedGame));
    }
    @Test
    public void navigateToBoardGamesFromBrowseTabMenu (){
        home.selectTab("Browse");
        home.SelectFromTabMenu("All Boardgames");
        results.verifyResultTableExist();
    }
}
