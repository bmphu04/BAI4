
package model;

/**
 *
 * @author PC MSI
 */
public class SinhVien {
    private String idSV;
    private String nameSV;
    private boolean genderSV;
    private String majorofSV;

    public SinhVien(String idSV, String nameSV, boolean genderSV, String majorofSV) {
        this.idSV = idSV;
        this.nameSV = nameSV;
        this.genderSV = genderSV;
        this.majorofSV = majorofSV;
    }

    public String getIdSV() {
        return idSV;
    }

    public void setIdSV(String idSV) {
        this.idSV = idSV;
    }

    public String getNameSV() {
        return nameSV;
    }

    public void setNameSV(String nameSV) {
        this.nameSV = nameSV;
    }

    public boolean isGenderSV() {
        return genderSV;
    }

    public void setGenderSV(boolean genderSV) {
        this.genderSV = genderSV;
    }

    public String getMajorofSV() {
        return majorofSV;
    }

    public void setMajorofSV(String majorofSV) {
        this.majorofSV = majorofSV;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "idSV=" + idSV + ", nameSV=" + nameSV + ", genderSV=" + genderSV + ", majorofSV=" + majorofSV + '}';
    }
    
}
