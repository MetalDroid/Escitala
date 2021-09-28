package com.metal;

import com.metal.escitala.Escitala;

public class Main {

    public static void main(String[] args) {

        String textDec = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme";
        String textEnc = "Ernu  n cyna dhoocuea  on ,nqr l oudladmiau ebergM rrmaaceoe";
        int columns = 10;

        Escitala escitala = new Escitala();

        String enc = escitala.encrypt(textDec, columns);
        System.out.println(enc);

        String dec = escitala.decrypt(textEnc, columns);
        System.out.println(dec);

    }
}
