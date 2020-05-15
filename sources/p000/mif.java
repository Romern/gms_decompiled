package p000;

import android.os.Bundle;

/* renamed from: mif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mif extends min {

    /* renamed from: a */
    private final Bundle f33773a;

    /* renamed from: b */
    private final mhx f33774b;

    public mif(Bundle bundle, mhx mhx) {
        this.f33773a = bundle;
        this.f33774b = mhx;
    }

    /* renamed from: a */
    public final Bundle mo20064a() {
        return this.f33773a;
    }

    /* renamed from: b */
    public final mhx mo20065b() {
        return this.f33774b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof min) {
            min min = (min) obj;
            return this.f33773a.equals(min.mo20064a()) && this.f33774b.equals(min.mo20065b());
        }
    }

    public final int hashCode() {
        return ((this.f33773a.hashCode() ^ 1000003) * 1000003) ^ this.f33774b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f33773a);
        String valueOf2 = String.valueOf(this.f33774b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43 + String.valueOf(valueOf2).length());
        sb.append("RequestAndCallbackPair{request=");
        sb.append(valueOf);
        sb.append(", callback=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
