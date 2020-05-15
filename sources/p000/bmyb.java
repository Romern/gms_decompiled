package p000;

import java.io.Serializable;

/* renamed from: bmyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmyb implements Serializable, bmxz {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Object f131190a;

    public bmyb(Object obj) {
        this.f131190a = obj;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        return this.f131190a.equals(obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bmyb) {
            return this.f131190a.equals(((bmyb) obj).f131190a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f131190a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f131190a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Predicates.equalTo(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
