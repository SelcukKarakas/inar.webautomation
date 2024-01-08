import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WA_004_DRO_02_RDP_01 extends Hooks {

	@Test
	public void testRevertDraggablePositionPage() {
		pages.getHomePage().clickOnWebautomationLink();
		pages.getWebAutomationPage().clickOnDroppableLink();
		pages.getWebAutomationPage().clickOnRevertDraggablePositionLink();

		int initialX = pages.getRevertDraggablePositionPage().getXLocationOfFirstRevertedDraggable();
		int initialY = pages.getRevertDraggablePositionPage().getYLocationOfFirstRevertedDraggable();

		pages.getRevertDraggablePositionPage().moveFirstrevertedDraggableToTargetElement();

		BrowserUtils.wait(1.5);

		int finallX = pages.getRevertDraggablePositionPage().getXLocationOfFirstRevertedDraggable();
		int finalY = pages.getRevertDraggablePositionPage().getYLocationOfFirstRevertedDraggable();

		assertEquals(initialX, finallX);
		assertEquals(initialY, finalY);

		int initialX2 = pages.getRevertDraggablePositionPage().getXLocationOfSecondRevertedDraggable();
		int initialY2 = pages.getRevertDraggablePositionPage().getYLocationOfSecondRevertedDraggable();

		pages.getRevertDraggablePositionPage().moveSecondrevertedDraggableElementToTargetElement();

		BrowserUtils.wait(1.5);

		int finallX2 = pages.getRevertDraggablePositionPage().getXLocationOfSecondRevertedDraggable();
		int finalY2 = pages.getRevertDraggablePositionPage().getYLocationOfSecondRevertedDraggable();

		assertTrue(initialX2 < finallX2);
		assertTrue(initialY2 < finalY2);
	}

}
