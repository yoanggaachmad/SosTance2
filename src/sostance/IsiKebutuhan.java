/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sostance;

/**
 *
 * @author arulh
 */
public class IsiKebutuhan {
    String kebutuhan;
    String aksi;

    public IsiKebutuhan(String kebutuhan, String aksi) {
        this.kebutuhan = kebutuhan;
        this.aksi = aksi;
    }

    public String getKebutuhan() {
        return kebutuhan;
    }

    public void setKebutuhan(String kebutuhan) {
        this.kebutuhan = kebutuhan;
    }

    public String getAksi() {
        return aksi;
    }

    public void setAksi(String aksi) {
        this.aksi = aksi;
    }

    @Override
    public String toString() {
        return "IsiKebutuhan{" + "kebutuhan=" + kebutuhan + ", aksi=" + aksi + '}';
    }
    
    
}
