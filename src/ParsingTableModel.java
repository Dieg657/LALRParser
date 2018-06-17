
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego
 */
public class ParsingTableModel extends AbstractTableModel {
    private final String[][] tabelaParsing;
    private final String[] colunas = new String[] { ";", "if", "then", "else", "+", "(", ")", "*", "0", "1", "$", "S'", "S", "A", "I", "E", "T", "F" };
    private static final int PONTOVIRGULA = 0;
    private static final int SE = 1;
    private static final int ENTAO = 2;
    private static final int SENAO = 3;
    private static final int MAIS = 4;
    private static final int ABER_PARENTESES = 5;
    private static final int FECH_PARENTESES = 6;
    private static final int ASTERISCO = 7;
    private static final int ZERO = 8;
    private static final int UM = 9;
    private static final int CIFRAO = 10;
    private static final int ESSELINHA = 11;
    private static final int S = 12;
    private static final int A = 13;
    private static final int I = 14;
    private static final int E = 15;
    private static final int T = 16;
    private static final int F = 17;
    
    public ParsingTableModel(String[][] tabela){
        tabelaParsing = tabela;
    }
    
   @Override
    public int getRowCount() {
        return tabelaParsing.length;
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Pega o sócio referente a linha especificada.
        

        switch (columnIndex) {
        case PONTOVIRGULA:
            return tabelaParsing[rowIndex][columnIndex];
        case SE:
            return tabelaParsing[rowIndex][columnIndex];
        case ENTAO:
            return tabelaParsing[rowIndex][columnIndex];
        case SENAO:
            return tabelaParsing[rowIndex][columnIndex];
        case MAIS:
            return tabelaParsing[rowIndex][columnIndex];
        case ABER_PARENTESES:
            return tabelaParsing[rowIndex][columnIndex];
        case FECH_PARENTESES:
            return tabelaParsing[rowIndex][columnIndex];
        case ASTERISCO:
            return tabelaParsing[rowIndex][columnIndex];
        case ZERO:
            return tabelaParsing[rowIndex][columnIndex];
        case UM:
            return tabelaParsing[rowIndex][columnIndex];
        case CIFRAO:
            return tabelaParsing[rowIndex][columnIndex];
        case ESSELINHA:
            return tabelaParsing[rowIndex][columnIndex];
        case S:
            return tabelaParsing[rowIndex][columnIndex];
        case A:
            return tabelaParsing[rowIndex][columnIndex];
        case I:
            return tabelaParsing[rowIndex][columnIndex];
        case E:
            return tabelaParsing[rowIndex][columnIndex];
        case T:
            return tabelaParsing[rowIndex][columnIndex];
        case F:
            return tabelaParsing[rowIndex][columnIndex];
        default:
            // Não deve ocorrer, pois só existem 2 colunas
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

       switch (columnIndex) {
        case PONTOVIRGULA:
            tabelaParsing[rowIndex][columnIndex] = (String) (String) aValue;
            break;
        case SE:
            tabelaParsing[rowIndex][columnIndex] = (String) (String) aValue;
            break;
        case ENTAO:
            tabelaParsing[rowIndex][columnIndex] = (String) aValue;
            break;
        case SENAO:
            tabelaParsing[rowIndex][columnIndex] = (String) aValue;
            break;
        case MAIS:
            tabelaParsing[rowIndex][columnIndex] = (String) aValue;
            break;
        case ABER_PARENTESES:
            tabelaParsing[rowIndex][columnIndex] = (String) aValue;
            break;
        case FECH_PARENTESES:
            tabelaParsing[rowIndex][columnIndex] = (String) aValue;
            break;
        case ASTERISCO:
            tabelaParsing[rowIndex][columnIndex] = (String) aValue;
            break;
        case ZERO:
            tabelaParsing[rowIndex][columnIndex] = (String) aValue;
            break;
        case UM:
            tabelaParsing[rowIndex][columnIndex] = (String) aValue;
            break;
        case CIFRAO:
            tabelaParsing[rowIndex][columnIndex] = (String) aValue;
            break;
        case ESSELINHA:
            tabelaParsing[rowIndex][columnIndex] = (String) aValue;
            break;
        case S:
            tabelaParsing[rowIndex][columnIndex] = (String) aValue;
            break;
        case A:
            tabelaParsing[rowIndex][columnIndex] = (String) aValue;
            break;
        case I:
            tabelaParsing[rowIndex][columnIndex] = (String) aValue;
            break;
        case E:
            tabelaParsing[rowIndex][columnIndex] = (String) aValue;
            break;
        case T:
            tabelaParsing[rowIndex][columnIndex] = (String) aValue;
            break;
        case F:
            tabelaParsing[rowIndex][columnIndex] = (String) aValue;
            break;
        default:
            // Não deve ocorrer, pois só existem 2 colunas
            throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
        fireTableCellUpdated(rowIndex, columnIndex); // Notifica a atualização da célula
    } 
    
}
