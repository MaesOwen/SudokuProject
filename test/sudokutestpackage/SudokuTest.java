/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokutestpackage;

import org.junit.*;
import sudokupackage.Sudoku;

/**
 *
 * @author Owen
 */
public class SudokuTest {
    
    @Test
    public void testSudokuCreation() {
        Sudoku s = new Sudoku();
        Assert.assertNotNull(s);
    }
    
}
