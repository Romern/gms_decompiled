package p000;

/* renamed from: ofg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ofg extends ohk {

    /* renamed from: a */
    public final int f37497a;

    /* renamed from: b */
    public final int f37498b;

    /* renamed from: c */
    public final boolean f37499c;

    public ofg(int i, int i2, boolean z) {
        this.f37497a = i;
        this.f37498b = i2;
        this.f37499c = z;
    }

    /* renamed from: a */
    public final int mo22072a() {
        return this.f37497a;
    }

    /* renamed from: b */
    public final int mo22073b() {
        return this.f37498b;
    }

    /* renamed from: c */
    public final boolean mo22074c() {
        return this.f37499c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ohk) {
            ohk ohk = (ohk) obj;
            return this.f37497a == ohk.mo22072a() && this.f37498b == ohk.mo22073b() && this.f37499c == ohk.mo22074c();
        }
    }

    public final int hashCode() {
        return ((((this.f37497a ^ 1000003) * 1000003) ^ this.f37498b) * 1000003) ^ (!this.f37499c ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f37497a;
        int i2 = this.f37498b;
        boolean z = this.f37499c;
        StringBuilder sb = new StringBuilder(102);
        sb.append("FramerConnectionSettings{fragmentSize=");
        sb.append(i);
        sb.append(", bufferedStreamSize=");
        sb.append(i2);
        sb.append(", isQoSEnabled=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
