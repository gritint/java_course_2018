package ox;

public class OXGame {
    String[][] tables = new String[3][3];

    public OXGame() {
        initialTable();
    }

    private void initialTable() {
        for (int i = 0; i < tables.length; i++) {
            for (int j = 0; j < tables.length; j++) {
                tables[i][j] = "";
            }
        }
    }

    public String[][] getTables() {

        return tables;
    }

    public Player getPlayer1() {

        return new Player();
    }

    public Player getPlayer2() {

        return new Player();
    }

    public void palyWith(Player player, int i, int j) {
      
        tables[i][j] = player.getSymbol();
        }

    public String ValueAt(int i, int j) {
        
        return tables[i][j];
    }

    public boolean isWinner() {
        boolean result = false;
        // Row 0
        for(int column=0; column<3; column++) {
            if("".equals(ValueAt(0, column))) {
                result = false;
                break;
            }
            if("X".equals(ValueAt(0, column))) {
                result = true;
                
            }
            if("O".equals(ValueAt(0, column))) {
                result = true;
                
            }
            break;
        }
        // Row 1
        for(int column=0; column<3; column++) {
            if("".equals(ValueAt(1, column))) {
                result = false;
                break;
            }
            if("X".equals(ValueAt(1, column))) {
                result = true;
                
            }
            if("O".equals(ValueAt(1, column))) {
                result = true;
               
            }
            break;
         }
        // Row 2
        
        return result;
    }
    }


