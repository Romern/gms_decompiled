package p000;

import java.util.Arrays;

/* renamed from: bedk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bedk {

    /* renamed from: a */
    public final aysl f106972a;

    /* renamed from: b */
    public final bedm f106973b;

    /* renamed from: c */
    public final bedl f106974c;

    public bedk(aysl aysl, bedm bedm, bedl bedl) {
        this.f106972a = aysl;
        bmxy.m108581a(bedm);
        this.f106973b = bedm;
        bmxy.m108581a(bedl);
        this.f106974c = bedl;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bedk) {
            bedk bedk = (bedk) obj;
            return bedk.f106973b.equals(this.f106973b) && bedk.f106972a.equals(this.f106972a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f106972a, this.f106973b});
    }

    public final String toString() {
        return String.format("{key: %s, capabilities: %s}", this.f106973b, this.f106974c);
    }
}
