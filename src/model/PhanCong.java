
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import model.PhanCong.PhanCongPK;

@Entity
@IdClass(PhanCongPK.class)
public class PhanCong implements Serializable {

    @Id
    private int maCauThu;
    @Id
    private int maViTri;

    private int soTran;

    public static class PhanCongPK implements Serializable {

        private int maCauThu;
        private int maViTri;

        public PhanCongPK() {
        }

        public PhanCongPK(int maCauThu, int maViTri) {
            this.maCauThu = maCauThu;
            this.maViTri = maViTri;
        }

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 97 * hash + this.maCauThu;
            hash = 97 * hash + this.maViTri;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final PhanCongPK other = (PhanCongPK) obj;
            if (this.maCauThu != other.maCauThu) {
                return false;
            }
            if (this.maViTri != other.maViTri) {
                return false;
            }
            return true;
        }

    }

    public PhanCong() {
    }

    public PhanCong(int maCauThu, int maViTri, int soTran) {
        this.maCauThu = maCauThu;
        this.maViTri = maViTri;
        this.soTran = soTran;
    }

    public int getMaCauThu() {
        return maCauThu;
    }

    public int getMaViTri() {
        return maViTri;
    }
    
    public int getSoTran() {
        return soTran;
    }

    public void setSoTran(int soTran) {
        this.soTran = soTran;
    }
}
