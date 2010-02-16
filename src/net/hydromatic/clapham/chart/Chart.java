package net.hydromatic.clapham.chart;

import net.hydromatic.clapham.graph.Node;
import net.hydromatic.clapham.graph.Symbol;

/**
 * 
 * @author Edgar Espina
 * 
 */
public interface Chart {

	public enum Direction {
		LEFT, RIGHT, UP, DOWN
	}

	interface NodeVisitor {
		void visit(Node node);
	}

	/**
	 * The font height
	 * 
	 * @return The font height
	 */
	int getFontHeight();

	/**
	 * The component gap height
	 * 
	 * @return
	 */
	int componentGapHeight();

	/**
	 * The string width of the text
	 * 
	 * @param text
	 * @return
	 */
	int getStringWidth(String text);

	void drawString(String text, int x, int y);

	int symbolGapHeight();

	int symbolGapWidth();

	int componentArcSize();

	int componentGapWidth();

	boolean showBorders();

	void drawRectangle(int x, int y, int width, int height);

	void drawArcCorner(int x, int y, int arcSize, int angle);

	void drawLine(int x1, int y1, int x2, int y2);

	void drawArrow(int x1, int y1, int x2, int y2, Direction right);

	void drawArcCorner(int x, int y, int arcSize);

	int beginningXCoordinate();

	void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle);

	int arrowSize();

	void calcDrawing();

	void drawComponent(Symbol symbol);

}