package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebAutomationPage extends BasePage {

	@FindBy(linkText = "Accent Folding")
	private WebElement accentFoldingTab;

	@FindBy(linkText = "Accept")
	private WebElement acceptTab;

	@FindBy(linkText = "Alerts")
	private WebElement alertsTab;

	@FindBy(linkText = "Autocomplete")
	private WebElement autoComplateTag;

	@FindBy(linkText = "Constrain Movement")
	private WebElement constrainMovementTab;

	@FindBy(linkText = "Control Group")
	private WebElement controlGroupTab;

	@FindBy(linkText = "Dialog")
	private WebElement dialogTab;

	@FindBy(linkText = "Download Dialog")
	private WebElement downloadDiologTab;

	@FindBy(linkText = "Draggable")
	private WebElement draggableTab;

	@FindBy(linkText = "Droppable")
	private WebElement droppableTab;

	@FindBy(linkText = "Handles")
	private WebElement handlessTab;

	@FindBy(linkText = "Iframe")
	private WebElement iframeTab;

	@FindBy(linkText = "Modal Form")
	private WebElement modalFormTab;

	@FindBy(linkText = "Normal Iframe")
	private WebElement normalIframeTab;

	@FindBy(linkText = "Progress Bar")
	private WebElement progressBarTab;

	@FindBy(linkText = "Resizable")
	private WebElement resizableTab;

	@FindBy(linkText = "Revert draggable position")
	private WebElement revertDraggablePositionTab;

	@FindBy(linkText = "Selectable")
	private WebElement selectableTab;

	@FindBy(linkText = "Serialize")
	private WebElement serailizeTab;

	@FindBy(linkText = "Synchronus Resize")
	private WebElement synchronusResizeTab;

	@FindBy(linkText = "Textarea")
	private WebElement textAreaLink;

	@FindBy(linkText = "Toolbar")
	private WebElement toolbarTab;

	public WebAutomationPage() {
		super();
	}

	public void clickOnDraggableLink() {
		draggableTab.click();
	}

	public void clickOnConstrainMovementLink() {
		constrainMovementTab.click();
	}

	public void clickOnHandlessLink() {
		handlessTab.click();
	}

	public void clickOnAcceptLink() {
		acceptTab.click();
	}

	public void clickOnDroppableLink() {
		droppableTab.click();
	}

	public void clickOnRevertDraggablePositionLink() {
		revertDraggablePositionTab.click();
	}

	public void clickOnSelectableLink() {
		selectableTab.click();
	}

	public void clickOnSerializeLink() {
		serailizeTab.click();
	}

	public void clickOnAlertLink() {
		alertsTab.click();
	}

	public void clickOnIframeLink() {
		iframeTab.click();
	}

	public void clickOnNormalIframeLink() {
		normalIframeTab.click();
	}

	public void clickOnSynchronusResizeLink() {
		synchronusResizeTab.click();
	}

	public void clickOnResizableLink() {
		resizableTab.click();
	}

	public void clickOnTextAreaLink() {
		textAreaLink.click();
	}

	public void clickOnAutoComplatePage() {
		autoComplateTag.click();
	}

	public void clickOnAccentFoldingPage() {
		accentFoldingTab.click();
	}

	public void clickOnControlGroupPage() {
		controlGroupTab.click();
	}

	public void clickOnToolbarPage() {
		toolbarTab.click();
	}

	public void clickOnModalTabPage() {
		modalFormTab.click();
	}

	public void clickOnDialogPage() {
		dialogTab.click();
	}

	public void clickOnProgressBarPage() {
		progressBarTab.click();
	}

	public void clickOnDownloadDiologPage() {
		downloadDiologTab.click();
	}

}
