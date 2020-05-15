package p000;

/* renamed from: rzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rzj {

    /* renamed from: a */
    public final int f43894a;

    /* renamed from: b */
    public final int f43895b;

    public rzj(int i, int i2) {
        this.f43894a = i;
        this.f43895b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof rzj) {
            rzj rzj = (rzj) obj;
            return this.f43894a == rzj.f43894a && this.f43895b == rzj.f43895b;
        }
    }

    public final int hashCode() {
        int i = this.f43895b;
        int i2 = this.f43894a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public final String toString() {
        int i = this.f43894a;
        int i2 = this.f43895b;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }
}
