package ox;

import static org.junit.Assert.*;

import org.junit.Test;

public class OXGameTest {

    @Test
    public void เริ่มต้นเกมส์_ตารางต้องว่างทั้งหมด() {
        String[][] expectedTables = generateEmptyTable();
        OXGame game = new OXGame();
        String[][] tables = game.getTables();
    }
    
    @Test
    public void เริ่มต้นเกมส์_ต้องมีผู้เล่นสองคนและมีรคะแนนคนละศูนย์() {
        OXGame game = new OXGame();
       Player player1 = game.getPlayer1();
       Player player2 = game.getPlayer2();
       assertEquals(0, player1.getScore());
       assertEquals(0, player2.getScore());
    }

    @Test
    public void ผู้เล่นคนที่หนึ่งเริ่มต้นเล่นในตำแหน่ง0_0() {
        OXGame game = new OXGame();
        Player player1 = new Player("X");
        game.palyWith(player1, 0, 0);
        assertEquals("X", game.ValueAt(0, 0));
      
    }
    
    @Test
    public void เมื่อมีคนเล่นที่หนึ่งชนะ_ในแนวนอน() {
        OXGame game = new OXGame();
        Player player1 = new Player("X");
        Player player2 = new Player("O");
        game.palyWith(player1, 0, 0);
        game.palyWith(player2, 1, 0);
        game.palyWith(player1, 0, 1);
        game.palyWith(player2, 1, 1);
        game.palyWith(player1, 0, 2);
        assertTrue(game.isWinner());
             
    }
    @Test
    public void เมื่อมีคนเล่นที่สองชนะ_ในแนวนอนแถวที่1() {
        OXGame game = new OXGame();
        Player player1 = new Player("X");
        Player player2 = new Player("O");
        game.palyWith(player1, 1, 0);
        game.palyWith(player2, 0, 0);
        game.palyWith(player1, 1, 1);
        game.palyWith(player2, 0, 1);
        game.palyWith(player2, 0, 2);
        assertTrue(game.isWinner());
             
    }
    
    @Test
    public void เมื่อมีคนเล่นที่สองชนะ_ในแนวนอนแถวที่2() {
        OXGame game = new OXGame();
        Player player1 = new Player("X");
        Player player2 = new Player("O");
        game.palyWith(player1, 1, 0);
        game.palyWith(player2, 0, 0);
        game.palyWith(player1, 1, 1);
        game.palyWith(player2, 0, 1);
        game.palyWith(player1, 1, 2);
        assertTrue(game.isWinner());
             
    }
    @Test
    public void ผู้เล่นคนที่สองเริ่มต้นเล่นในตำแหน่ง1_0() {
        OXGame game = new OXGame();
        Player player1 = new Player("X");
        Player player2 = new Player("O");
        game.palyWith(player1, 0, 0);
        game.palyWith(player2, 1, 0);
        assertEquals("X", game.ValueAt(0, 0));
        assertEquals("O", game.ValueAt(1, 0));
      
    }

    private String[][] generateEmptyTable() {
        String[][] tables = new String[3][3];
        for (int i = 0; i < tables.length; i++ ) {
            for (int j = 0; j < tables.length; j++ ) {
                tables[i][j] = "";
            }
        }
        return tables;
    }

}
