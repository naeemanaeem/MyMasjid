/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author nafzal
 */
@Embeddable
public class IqamatimesPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "masjid_code")
    private String masjidCode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prayer_num")
    private int prayerNum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prayer_date")
    @Temporal(TemporalType.DATE)
    private Date prayerDate;

    public IqamatimesPK() {
    }

    public IqamatimesPK(String masjidCode, int prayerNum, Date prayerDate) {
        this.masjidCode = masjidCode;
        this.prayerNum = prayerNum;
        this.prayerDate = prayerDate;
    }

    public String getMasjidCode() {
        return masjidCode;
    }

    public void setMasjidCode(String masjidCode) {
        this.masjidCode = masjidCode;
    }

    public int getPrayerNum() {
        return prayerNum;
    }

    public void setPrayerNum(int prayerNum) {
        this.prayerNum = prayerNum;
    }

    public Date getPrayerDate() {
        return prayerDate;
    }

    public void setPrayerDate(Date prayerDate) {
        this.prayerDate = prayerDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (masjidCode != null ? masjidCode.hashCode() : 0);
        hash += (int) prayerNum;
        hash += (prayerDate != null ? prayerDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IqamatimesPK)) {
            return false;
        }
        IqamatimesPK other = (IqamatimesPK) object;
        if ((this.masjidCode == null && other.masjidCode != null) || (this.masjidCode != null && !this.masjidCode.equals(other.masjidCode))) {
            return false;
        }
        if (this.prayerNum != other.prayerNum) {
            return false;
        }
        if ((this.prayerDate == null && other.prayerDate != null) || (this.prayerDate != null && !this.prayerDate.equals(other.prayerDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.IqamatimesPK[ masjidCode=" + masjidCode + ", prayerNum=" + prayerNum + ", prayerDate=" + prayerDate + " ]";
    }
    
}
