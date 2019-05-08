package game;

import javax.swing.*;
import java.awt.*;

public class BoardPrinter extends JFrame implements GameEngine {

    public BoardCell[][] cells;
    int[][] board;

    public BoardPrinter(int[][] board,String title){

        this.board = board;

        JPanel reversiBoard = new JPanel();
        reversiBoard.setLayout(new GridLayout(8,8));
        reversiBoard.setPreferredSize(new Dimension(250,250));
        reversiBoard.setBackground(new Color(41,100, 59));

        cells = new BoardCell[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                cells[i][j] = new BoardCell(this,reversiBoard,i,j);
                reversiBoard.add(cells[i][j]);
            }
        }

        this.add(reversiBoard);
        this.setTitle(title);
        this.pack();
        this.setVisible(true);

        reversiBoard.repaint();

    }

    public void showForm(){

    }


    @Override
    public int getBoardValue(int i, int j) {
        return board[i][j];
    }

    @Override
    public void setBoardValue(int i, int j, int value) {
        System.err.println("Printer cant edit !");
    }

    @Override
    public void handleClick(int i, int j) {
        //do nothing
    }
}
