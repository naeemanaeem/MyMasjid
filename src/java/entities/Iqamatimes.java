/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nafzal
 */
@Entity
@Table(name = "iqamatimes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Iqamatimes.findAll", query = "SELECT i FROM Iqamatimes i")
    , @NamedQuery(name = "Iqamatimes.findByMasjidCode", query = "SELECT i FROM Iqamatimes i WHERE i.iqamatimesPK.masjidCode = :masjidCode")
    , @NamedQuery(name = "Iqamatimes.findByPrayerNum", query = "SELECT i FROM Iqamatimes i WHERE i.iqamatimesPK.prayerNum = :prayerNum")
    , @NamedQuery(name = "Iqamatimes.findByPrayerDate", query = "SELECT i FROM Iqamatimes i WHERE i.iqamatimesPK.prayerDate = :prayerDate")
    , @NamedQuery(name = "Iqamatimes.findByPrayerTime", query = "SELECT i FROM Iqamatimes i WHERE i.prayerTime = :prayerTime")})
public class Iqamatimes implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected IqamatimesPK iqamatimesPK;
    @Size(max = 45)
    @Column(name = "prayer_time")
    private String prayerTime;

    public Iqamatimes() {
    }

    public Iqamatimes(IqamatimesPK iqamatimesPK) {
        this.iqamatimesPK = iqamatimesPK;
    }

    public Iqamatimes(String masjidCode, int prayerNum, Date prayerDate) {
        this.iqamatimesPK = new IqamatimesPK(masjidCode, prayerNum, prayerDate);
    }

    public IqamatimesPK getIqamatimesPK() {
        return iqamatimesPK;
    }

    public void setIqamatimesPK(IqamatimesPK iqamatimesPK) {
        this.iqamatimesPK = iqamatimesPK;
    }

    public String getPrayerTime() {
        return prayerTime;
    }

    public void setPrayerTime(String prayerTime) {
        this.prayerTime = prayerTime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iqamatimesPK != null ? iqamatimesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Iqamatimes)) {
            return false;
        }
        Iqamatimes other = (Iqamatimes) object;
        if ((this.iqamatimesPK == null && other.iqamatimesPK != null) || (this.iqamatimesPK != null && !this.iqamatimesPK.equals(other.iqamatimesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Iqamatimes[ iqamatimesPK=" + iqamatimesPK + " ]";
    }
    
}
