package com.mehdi.rotates;

import com.mehdi.core.Processor;
import com.mehdi.core.State;
import com.mehdi.core.puzzle.AbstractMove;

/**
 * @author Mehdi Afsari Kashi
 * @version 1.0.0
 *          <p/>
 *          Creation Date: 2015/07/17
 * @since 1.0.0
 */
public class RotateRightTest extends Rotater {

    public void doRotate() {
        int grid = 4;
        Processor processor = new Processor(grid);
        int[][] firstGrid = processor.fillEmptyGridCell(2);
        System.out.println(drawGrid(firstGrid));
        AbstractMove move = new AbstractMove(firstGrid, grid) {
            @Override
            public State doMove() {
                return null;
            }
        };

        int[][] secondGrid = move.rotateLeft();
        System.out.println(drawGrid(secondGrid));
    }
}
