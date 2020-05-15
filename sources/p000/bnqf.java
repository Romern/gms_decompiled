package p000;

import java.util.Set;

/* renamed from: bnqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bnqf extends bnpy implements Set {
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    public Set mo68281a() {
        return (Set) super.mo68281a();
    }

    public boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f131984g) {
            equals = mo68281a().equals(obj);
        }
        return equals;
    }

    public final int hashCode() {
        int hashCode;
        synchronized (this.f131984g) {
            hashCode = mo68281a().hashCode();
        }
        return hashCode;
    }

    public bnqf(Set set, Object obj) {
        super(set, obj);
    }
}
