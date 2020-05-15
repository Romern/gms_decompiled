package p000;

import android.net.Uri;

/* renamed from: beik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class beik extends bejr {

    /* renamed from: a */
    public final Uri f111583a;

    /* renamed from: b */
    public final bxxc f111584b;

    /* renamed from: c */
    public final bngx f111585c;

    /* renamed from: d */
    public final beky f111586d;

    /* renamed from: e */
    public final bxus f111587e;

    /* renamed from: f */
    public final belm f111588f;

    public beik(Uri uri, bxxc bxxc, belm belm, bngx bngx, beky beky, bxus bxus) {
        this.f111583a = uri;
        this.f111584b = bxxc;
        this.f111588f = belm;
        this.f111585c = bngx;
        this.f111586d = beky;
        this.f111587e = bxus;
    }

    /* renamed from: a */
    public final Uri mo60727a() {
        return this.f111583a;
    }

    /* renamed from: b */
    public final bxxc mo60728b() {
        return this.f111584b;
    }

    /* renamed from: c */
    public final bngx mo60729c() {
        return this.f111585c;
    }

    /* renamed from: d */
    public final beky mo60730d() {
        return this.f111586d;
    }

    /* renamed from: e */
    public final bxus mo60731e() {
        return this.f111587e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bejr) {
            bejr bejr = (bejr) obj;
            return this.f111583a.equals(bejr.mo60727a()) && this.f111584b.equals(bejr.mo60728b()) && this.f111588f.equals(bejr.mo60733f()) && bnkn.m109669a(this.f111585c, bejr.mo60729c()) && this.f111586d.equals(bejr.mo60730d()) && this.f111587e.equals(bejr.mo60731e());
        }
    }

    /* renamed from: f */
    public final belm mo60733f() {
        return this.f111588f;
    }

    public final int hashCode() {
        return ((((((((((this.f111583a.hashCode() ^ 1000003) * 1000003) ^ this.f111584b.hashCode()) * 1000003) ^ this.f111588f.hashCode()) * 1000003) ^ this.f111585c.hashCode()) * 1000003) ^ this.f111586d.hashCode()) * 1000003) ^ this.f111587e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f111583a);
        String valueOf2 = String.valueOf(this.f111584b);
        String valueOf3 = String.valueOf(this.f111588f);
        String valueOf4 = String.valueOf(this.f111585c);
        String valueOf5 = String.valueOf(this.f111586d);
        String valueOf6 = String.valueOf(this.f111587e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 94 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("ProtoDataStoreConfig{uri=");
        sb.append(valueOf);
        sb.append(", schema=");
        sb.append(valueOf2);
        sb.append(", handler=");
        sb.append(valueOf3);
        sb.append(", migrations=");
        sb.append(valueOf4);
        sb.append(", variantConfig=");
        sb.append(valueOf5);
        sb.append(", extensionRegistry=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}
