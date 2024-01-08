import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WA_002_DR_02_HL_01 extends Hooks {

	@Test
	public void testHandlesPage() {
		pages.getHomePage().clickOnWebautomationLink();
		pages.getWebAutomationPage().clickOnDraggableLink();
		pages.getWebAutomationPage().clickOnHandlessLink();

		int initialXOfFirstDraggableElement = pages.getHandlessPage().locationXOfFirstDraggableElement();
		int initialYOfFirstDraggableElement = pages.getHandlessPage().locationYOfFirstDraggableElement();

		pages.getHandlessPage().dragAndDropFirstDraggableElement(300, 100);

		int finalXOfFirstDraggableElement = pages.getHandlessPage().locationXOfFirstDraggableElement();
		int finalYOfFirstDraggableElement = pages.getHandlessPage().locationYOfFirstDraggableElement();

		assertTrue(finalXOfFirstDraggableElement > initialXOfFirstDraggableElement);
		assertTrue(finalYOfFirstDraggableElement > initialYOfFirstDraggableElement);

		int initialXOfSecondDraggableElement = pages.getHandlessPage().locationXOfSecondDraggableElement();
		int initialYOfSecondDraggableElement = pages.getHandlessPage().locationYOfSecondDraggableElement();

		pages.getHandlessPage().dragAndDropFirstDraggableElement(30, 30);

		int finalXOfSecondDraggableElement = pages.getHandlessPage().locationXOfSecondDraggableElement();
		int finalYOfSecondDraggableElement = pages.getHandlessPage().locationYOfSecondDraggableElement();

		assertEquals(finalXOfSecondDraggableElement, initialXOfSecondDraggableElement);
		assertEquals(finalYOfSecondDraggableElement, initialYOfSecondDraggableElement);

	}

}
