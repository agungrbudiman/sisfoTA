/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfota;

/**
 *
 * @author SD
 */
public class Mahasiswa extends Orang {
    private TugasAkhir tugasAkhir = new TugasAkhir[];
    private int nSKS;
    private boolean StatusKP;
    private final long NIM;
    private String judulTA;

    
    public Mahasiswa (String Nama, long NIM){
        super(Nama);
        this.NIM = NIM;
    }
    
    public void CreateTA(String judulTA){
        tugasAkhir = new TugasAkhir();
        this.judulTA=judulTA;
        System.out.println("Input Dosen Pembimbing : "+super(setNama()));
    }
}
