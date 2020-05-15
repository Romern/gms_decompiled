package p000;

import java.io.Serializable;
import java.util.List;

/* renamed from: bmye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmye implements Serializable, bmxz {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final List f131197a;

    public bmye(List list) {
        this.f131197a = list;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        for (int i = 0; i < this.f131197a.size(); i++) {
            if (((bmxz) this.f131197a.get(i)).mo6527a(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bmye) {
            return this.f131197a.equals(((bmye) obj).f131197a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f131197a.hashCode() + 87855567;
    }

    public final String toString() {
        return bmyf.m108615a("or", this.f131197a);
    }
}
