package p000;

import java.io.Serializable;

/* renamed from: bnnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnnu extends bnny implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final bnny f131880a;

    public bnnu(bnny bnny) {
        this.f131880a = bnny;
    }

    /* renamed from: a */
    public final bnny mo67377a() {
        return this.f131880a.mo67377a().mo68138c();
    }

    /* renamed from: b */
    public final bnny mo68137b() {
        return this;
    }

    /* renamed from: c */
    public final bnny mo68138c() {
        return this.f131880a.mo68138c();
    }

    public final int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 != null) {
            return this.f131880a.compare(obj, obj2);
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bnnu) {
            return this.f131880a.equals(((bnnu) obj).f131880a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f131880a.hashCode() ^ 957692532;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f131880a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append(valueOf);
        sb.append(".nullsFirst()");
        return sb.toString();
    }
}
