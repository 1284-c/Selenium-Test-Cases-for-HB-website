package steps;

import io.cucumber.java.en.Given;
import pages.SearchPage;

public class SearchPageSteps {
        SearchPage searchpage = new SearchPage();
        @Given("Search with {} text")
        public void Search(String text ){
            searchpage.Search(text);
            searchpage.ClickSearchButton();

        }



}
