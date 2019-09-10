package UI.tests;

import org.junit.jupiter.api.Test;
public class Search extends Base{

    private String searchedGame = "Angel";

    @Test
    public void searchGameBySearchField (){
        Home.search(searchedGame);
        Results.verifyGameExist(searchedGame);
    }
    @Test
    public void navigateToBoardGamesFromBrowseTabMenu (){
        Home.selectFromTabPopupMenu("Browse", "All Boardgames");
        Results.verifyResulTableExist();
    }
}
