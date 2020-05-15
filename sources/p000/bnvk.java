package p000;

import java.io.Serializable;

/* renamed from: bnvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnvk implements Serializable {

    /* renamed from: a */
    public final bnvj f132222a;

    /* renamed from: b */
    public final bnvj f132223b;

    public bnvk() {
        this.f132222a = new bnvj();
        this.f132223b = new bnvj();
    }

    /* renamed from: a */
    public static bnvk m110505a() {
        return new bnvk(bnvj.m110496a(), bnvj.m110496a());
    }

    /* renamed from: b */
    public final bnvl mo68528b() {
        return new bnvl(this.f132222a.f132220a, this.f132223b.f132220a);
    }

    /* renamed from: c */
    public final bnvl mo68529c() {
        return new bnvl(this.f132222a.f132221b, this.f132223b.f132221b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bnvk) {
            bnvk bnvk = (bnvk) obj;
            return this.f132222a.equals(bnvk.f132222a) && this.f132223b.equals(bnvk.f132223b);
        }
    }

    public final int hashCode() {
        return (this.f132222a.hashCode() * 701) + this.f132223b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(mo68528b());
        String valueOf2 = String.valueOf(mo68529c());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8 + String.valueOf(valueOf2).length());
        sb.append("[Lo");
        sb.append(valueOf);
        sb.append(", Hi");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public static bnvk m110506a(bnvl bnvl, bnvl bnvl2) {
        return new bnvk(bnvj.m110497a(bnvl.f132224a, bnvl2.f132224a), bnvj.m110497a(bnvl.f132225b, bnvl2.f132225b));
    }

    public bnvk(bnvj bnvj, bnvj bnvj2) {
        this.f132222a = bnvj;
        this.f132223b = bnvj2;
    }

    /* renamed from: a */
    public final bnvk mo68527a(double d) {
        bnvl bnvl = new bnvl(d, d);
        bnvj c = this.f132222a.mo68522c(bnvl.f132224a);
        bnvj c2 = this.f132223b.mo68522c(bnvl.f132225b);
        if (c.mo68521b() || c2.mo68521b()) {
            return m110505a();
        }
        return new bnvk(c, c2);
    }

    public bnvk(bnvk bnvk) {
        this.f132222a = new bnvj(bnvk.f132222a);
        this.f132223b = new bnvj(bnvk.f132223b);
    }
}
