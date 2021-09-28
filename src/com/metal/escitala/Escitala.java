package com.metal.escitala;

/**
 * Set of methods to encrypt and decrypt using Escitala encryption.
 * More information: https://es.wikipedia.org/wiki/Esc%C3%ADtala
 *
 * @author SoldierFC, A.K.A. MetalDroid
 */
public class Escitala {

    private String text;
    private int tSize;
    private int columns;
    private int rows;
    private char[][] escitala;
    private int index;

    public Escitala() {
    }

    public String encrypt(String text, int columns){
        setData(text, columns);
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                getEscitala()[i][j] = index < gettSize() ? getText().charAt(index++) : ' ';
            }
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < getColumns(); i++) {
            for (int j = 0; j < getRows(); j++) {
                res.append(getEscitala()[j][i]);
            }
        }
        return res.toString().trim();
    }

    public String decrypt(String text, int columns){
        setData(text, columns);
        for (int i = 0; i < getColumns(); i++) {
            for (int j = 0; j < getRows(); j++) {
                getEscitala()[j][i] = index < gettSize() ? getText().charAt(index++) : ' ';
            }
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                res.append(getEscitala()[i][j]);
            }
        }
        return res.toString().trim();
    }

    private void setData(String text, int columns){
        this.text = text.trim();
        this.columns = columns;
        this.tSize = this.text.length();
        this.rows = tSize / columns + (tSize % columns > 0 ? 1 : 0);
        this.escitala = new char[rows][columns];
        this.index = 0;
    }

    private String getText() {
        return text;
    }

    private int gettSize() {
        return tSize;
    }

    private int getColumns() {
        return columns;
    }

    private int getRows() {
        return rows;
    }

    private char[][] getEscitala() {
        return escitala;
    }
}
