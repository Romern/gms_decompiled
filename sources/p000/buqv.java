package p000;

/* renamed from: buqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buqv extends burk {

    /* renamed from: a */
    public final boolean f154743a;

    /* renamed from: b */
    public final boolean f154744b;

    public buqv(boolean z, boolean z2) {
        this.f154743a = z;
        this.f154744b = z2;
    }

    /* renamed from: a */
    public final boolean mo73005a() {
        return this.f154743a;
    }

    /* renamed from: b */
    public final boolean mo73006b() {
        return this.f154744b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof burk) {
            burk burk = (burk) obj;
            return this.f154743a == burk.mo73005a() && this.f154744b == burk.mo73006b();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((!this.f154743a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (this.f154744b) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.f154743a;
        boolean z2 = this.f154744b;
        StringBuilder sb = new StringBuilder(64);
        sb.append("FlagWrapper{isBlackListDeviceType=");
        sb.append(z);
        sb.append(", isManagedProfile=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
