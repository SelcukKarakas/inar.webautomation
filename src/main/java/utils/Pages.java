package utils;

import pages.*;
import pages.alerts.AlertTypesPage;
import pages.draggable.AutoScrollingTab;
import pages.draggable.ConstrainMovementPage;
import pages.draggable.DefaultFunctionalityTab;
import pages.draggable.Handless;
import pages.droppable.AcceptPage;
import pages.droppable.RevertDraggablePositionPage;
import pages.iframe.NormalIframePage;
import pages.resizeable.SynchronusResizePage;
import pages.resizeable.TextAreaPage;
import pages.selectable.SerializePage;

public class Pages {

	public HomePage getHomePage() {
		return new HomePage();
	}

	public WebAutomationPage getWebAutomationPage() {
		return new WebAutomationPage();
	}

	public DefaultFunctionalityTab getDefaultFunctionalityTab() {
		return new DefaultFunctionalityTab();
	}

	public AutoScrollingTab getAutoScrollingTab() {
		return new AutoScrollingTab();
	}

	public ConstrainMovementPage getConstrainMovementPage() {
		return new ConstrainMovementPage();
	}

	public Handless getHandlessPage() {
		return new Handless();
	}

	public AcceptPage getAcceptPage() {
		return new AcceptPage();
	}

	public RevertDraggablePositionPage getRevertDraggablePositionPage() {
		return new RevertDraggablePositionPage();
	}

	public SerializePage getSerializePage() {
		return new SerializePage();
	}

	public AlertTypesPage getAlertsTypePage() {
		return new AlertTypesPage();
	}

	public NormalIframePage getNormalIframePage() {
		return new NormalIframePage();
	}

	public SynchronusResizePage getsynchronusResizePage() {
		return new SynchronusResizePage();
	}

	public TextAreaPage getTextAreaPage() {
		return new TextAreaPage();
	}

}
