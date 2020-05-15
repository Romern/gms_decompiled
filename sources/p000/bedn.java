package p000;

import java.util.Arrays;

/* renamed from: bedn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bedn {

    /* renamed from: a */
    public final long f106978a;

    /* renamed from: b */
    public final boolean f106979b;

    /* renamed from: c */
    public final boolean f106980c;

    public bedn(long j, boolean z, boolean z2) {
        this.f106978a = j;
        this.f106979b = z;
        this.f106980c = z2;
    }

    /* renamed from: a */
    public final boolean mo58583a(bedl bedl) {
        if (this.f106979b && !bedl.f106975a) {
            return false;
        }
        return !this.f106980c || bedl.f106976b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bedn) {
            bedn bedn = (bedn) obj;
            return bedn.f106978a == this.f106978a && bedn.f106979b == this.f106979b && bedn.f106980c == this.f106980c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f106978a), Boolean.valueOf(this.f106979b), Boolean.valueOf(this.f106980c)});
    }

    public final String toString() {
        return String.format("{counter: %d, onBody: %s, authenticated: %s}", Long.valueOf(this.f106978a), Boolean.valueOf(this.f106979b), Boolean.valueOf(this.f106980c));
    }
}
