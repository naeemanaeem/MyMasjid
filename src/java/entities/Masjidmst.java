/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nafzal
 */
@Entity
@Table(name = "masjidmst")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Masjidmst.findAll", query = "SELECT m FROM Masjidmst m")
    , @NamedQuery(name = "Masjidmst.findByMasjidCode", query = "SELECT m FROM Masjidmst m WHERE m.masjidCode = :masjidCode")
    , @NamedQuery(name = "Masjidmst.findByMasjidName", query = "SELECT m FROM Masjidmst m WHERE m.masjidName = :masjidName")
    , @NamedQuery(name = "Masjidmst.findByAddressLine1", query = "SELECT m FROM Masjidmst m WHERE m.addressLine1 = :addressLine1")
    , @NamedQuery(name = "Masjidmst.findByAddressLine2", query = "SELECT m FROM Masjidmst m WHERE m.addressLine2 = :addressLine2")
    , @NamedQuery(name = "Masjidmst.findByCity", query = "SELECT m FROM Masjidmst m WHERE m.city = :city")
    , @NamedQuery(name = "Masjidmst.findByState", query = "SELECT m FROM Masjidmst m WHERE m.state = :state")
    , @NamedQuery(name = "Masjidmst.findByProvince", query = "SELECT m FROM Masjidmst m WHERE m.province = :province")
    , @NamedQuery(name = "Masjidmst.findByZip", query = "SELECT m FROM Masjidmst m WHERE m.zip = :zip")
    , @NamedQuery(name = "Masjidmst.findByCountryCode", query = "SELECT m FROM Masjidmst m WHERE m.countryCode = :countryCode")
    , @NamedQuery(name = "Masjidmst.findByCaclulationMethod", query = "SELECT m FROM Masjidmst m WHERE m.caclulationMethod = :caclulationMethod")
    , @NamedQuery(name = "Masjidmst.findByEmail", query = "SELECT m FROM Masjidmst m WHERE m.email = :email")})
public class Masjidmst implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "masjid_code")
    private String masjidCode;
    @Size(max = 45)
    @Column(name = "masjid_name")
    private String masjidName;
    @Size(max = 100)
    @Column(name = "address_line1")
    private String addressLine1;
    @Size(max = 100)
    @Column(name = "address_line2")
    private String addressLine2;
    @Size(max = 45)
    @Column(name = "city")
    private String city;
    @Size(max = 45)
    @Column(name = "state")
    private String state;
    @Size(max = 45)
    @Column(name = "province")
    private String province;
    @Size(max = 20)
    @Column(name = "zip")
    private String zip;
    @Size(max = 20)
    @Column(name = "country_code")
    private String countryCode;
    @Size(max = 45)
    @Column(name = "caclulation_method")
    private String caclulationMethod;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "email")
    private String email;

    public Masjidmst() {
    }

    public Masjidmst(String masjidCode) {
        this.masjidCode = masjidCode;
    }

    public String getMasjidCode() {
        return masjidCode;
    }

    public void setMasjidCode(String masjidCode) {
        this.masjidCode = masjidCode;
    }

    public String getMasjidName() {
        return masjidName;
    }

    public void setMasjidName(String masjidName) {
        this.masjidName = masjidName;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCaclulationMethod() {
        return caclulationMethod;
    }

    public void setCaclulationMethod(String caclulationMethod) {
        this.caclulationMethod = caclulationMethod;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (masjidCode != null ? masjidCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Masjidmst)) {
            return false;
        }
        Masjidmst other = (Masjidmst) object;
        if ((this.masjidCode == null && other.masjidCode != null) || (this.masjidCode != null && !this.masjidCode.equals(other.masjidCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Masjidmst[ masjidCode=" + masjidCode + " ]";
    }
    
}
