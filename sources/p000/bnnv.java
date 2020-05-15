package p000;

import java.io.Serializable;

/* renamed from: bnnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnnv extends bnny implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final bnny f131881a;

    public bnnv(bnny bnny) {
        this.f131881a = bnny;
    }

    /* renamed from: a */
    public final bnny mo67377a() {
        return this.f131881a.mo67377a().mo68137b();
    }

    /* renamed from: b */
    public final bnny mo68137b() {
        return this.f131881a.mo68137b();
    }

    /* renamed from: c */
    public final bnny mo68138c() {
        return this;
    }

    public final int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 != null) {
            return this.f131881a.compare(obj, obj2);
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bnnv) {
            return this.f131881a.equals(((bnnv) obj).f131881a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f131881a.hashCode() ^ -921210296;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f131881a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append(valueOf);
        sb.append(".nullsLast()");
        return sb.toString();
    }
}
