package p000;

import java.io.Serializable;

/* renamed from: bmyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmyc implements Serializable, bmxz {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final bmxz f131191a;

    public bmyc(bmxz bmxz) {
        bmxy.m108581a(bmxz);
        this.f131191a = bmxz;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        return !this.f131191a.mo6527a(obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bmyc) {
            return this.f131191a.equals(((bmyc) obj).f131191a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f131191a.hashCode() ^ -1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f131191a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("Predicates.not(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
