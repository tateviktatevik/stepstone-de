package am.itu.qa.stepstone.home.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static am.itu.qa.stepstone.home.page.StepStoneHomePageConstants.*;
import am.itu.qa.stepstone.base.page.StepStoneBasePage;
import am.itu.qa.stepstone.feedback.page.StepStoneFeedbackPage;
import am.itu.qa.stepstone.feedback.page.StepStoneLeavingFeedbackPage;
import am.itu.qa.stepstone.salaryplanner.page.StepStoneSalaryPlannerPage;
import am.itu.qa.stepstone.search.page.StepStoneAdvancedSearchPage;
import am.itu.qa.stepstone.search.page.StepStoneAvailableITJobsPage;
import am.itu.qa.stepstone.search.page.StepStoneQAEngineerInMuenchenSearch;

public class StepStoneHomePage extends StepStoneBasePage {

	public StepStoneHomePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = ACCEPT_COOKIES_XPATH)
	WebElement cookies;

	@FindBy(xpath = STEP_STONE_IT_LINK_XPATH)
	WebElement LinkIT;

	@FindBy(xpath = ADVANCED_SEARCH_XPATH)
	WebElement advancedSearch;

	@FindBy(xpath = STEP_STONE_JOB_SEARCHBOX_XPATH)
	WebElement jobSearch;

	@FindBy(xpath = STEP_STONE_CITY_SEARCHBOX_XPATH)
	WebElement citySearch;

	@FindBy(xpath = STEP_STONE_FIND_JOB_XPATH)
	WebElement find;

	@FindBy(xpath = LANGUAGE_BAR_XPATH)
	WebElement langBar;

	@FindBy(xpath = GERMAN_LANGUAGE_XPATH)
	WebElement germanLang;

	@FindBy(xpath = FOR_RECRUITERS_LINK_XPATH)
	WebElement recruiter;
	
	@FindBy (xpath = SALARY_PLANNER_ICON_XPATH)
	WebElement salaryPlanner;
	
	@FindBy (xpath = AVG_SALARY_EXPL_BTN_RIGHT_XPATH)
	WebElement rightBtn;
	
	@FindBy (xpath = COOK_SALARY_XPATH)
	WebElement cookSalary;
	
	@FindBy (xpath = GIVE_US_FEEDBACK_XPATH)
	WebElement giveFeedback;
	
	public StepStoneHomePage acceptCookies() {
		cookies.click();
		return new StepStoneHomePage(driver);
	}

	public StepStoneAvailableITJobsPage clickITLink() {
		LinkIT.click();
		return new StepStoneAvailableITJobsPage(driver);
	}

	public boolean findAdvancedSearch() {
		return advancedSearch.isDisplayed();
	}

	public void searchForQAJob(String jobToType) {
		jobSearch.sendKeys(jobToType);
	}

	public void searchForCityToWork(String city) {
		citySearch.sendKeys(city);
	}

	public StepStoneQAEngineerInMuenchenSearch clickFind() {
		find.click();
		return new StepStoneQAEngineerInMuenchenSearch(driver);
	}

	public StepStoneGermanHomePage changeLanguageToGerman() {
		langBar.click();
		germanLang.click();
		return new StepStoneGermanHomePage(driver);
	}

	public StepStoneLeavingFeedbackPage clickRecruitersLink() {
		recruiter.click();
		return new StepStoneLeavingFeedbackPage(driver);
	}

	public StepStoneSalaryPlannerPage clickSalaryPlannerLink() {
		salaryPlanner.click();
		return new StepStoneSalaryPlannerPage(driver);
	}
	
	public void exploreAvgSalaryInGermany() {
		rightBtn.click();
		rightBtn.click();
		rightBtn.click();
	}
	
	public boolean isCookSalaryDisplayed() {
		return cookSalary.isDisplayed();
	}
	
	public StepStoneAdvancedSearchPage clickAdvancedSearchIcon() {
		advancedSearch.click();
		return new StepStoneAdvancedSearchPage(driver);
	}
	
	public StepStoneFeedbackPage navigateToFeedbackPage() {
		giveFeedback.click();
		return new StepStoneFeedbackPage(driver);
	}
}