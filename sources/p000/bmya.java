package p000;

import java.io.Serializable;
import java.util.List;

/* renamed from: bmya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmya implements Serializable, bmxz {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final List f131189a;

    public bmya(List list) {
        this.f131189a = list;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        for (int i = 0; i < this.f131189a.size(); i++) {
            if (!((bmxz) this.f131189a.get(i)).mo6527a(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bmya) {
            return this.f131189a.equals(((bmya) obj).f131189a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f131189a.hashCode() + 306654252;
    }

    public final String toString() {
        return bmyf.m108615a("and", this.f131189a);
    }
}
