package p000;

/* renamed from: araa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class araa {

    /* renamed from: a */
    public long f87187a;

    /* renamed from: b */
    public long f87188b;

    public araa() {
        this(0, 0);
    }

    /* renamed from: b */
    static long m72310b(int i) {
        return 1 << ((int) ((long) (i - 1)));
    }

    /* renamed from: a */
    public final void mo48319a(int i, boolean z) {
        long b = m72310b(i);
        this.f87187a = !z ? this.f87187a & (-1 ^ b) : this.f87187a | b;
        this.f87188b |= b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            araa araa = (araa) obj;
            return this.f87187a == araa.f87187a && this.f87188b == araa.f87188b;
        }
    }

    public final int hashCode() {
        long j = this.f87187a;
        long j2 = this.f87188b;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        long j = this.f87187a;
        String binaryString = Long.toBinaryString(j);
        long j2 = this.f87188b;
        StringBuilder sb = new StringBuilder(String.valueOf(binaryString).length() + 82);
        sb.append("OptionFlags[flagValues=");
        sb.append(j);
        sb.append(" (");
        sb.append(binaryString);
        sb.append("), setIndicator=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }

    public araa(long j, long j2) {
        this.f87187a = j;
        if (j2 > 0) {
            this.f87188b = j2;
        } else {
            this.f87188b = j;
        }
    }

    /* renamed from: a */
    public final boolean mo48320a(int i) {
        return (this.f87187a & m72310b(i)) > 0;
    }
}
