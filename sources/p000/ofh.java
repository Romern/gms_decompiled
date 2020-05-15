package p000;

/* renamed from: ofh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ofh extends ohv {

    /* renamed from: a */
    private final int f37500a;

    /* renamed from: b */
    private final int f37501b;

    public ofh(int i, int i2) {
        this.f37500a = i;
        this.f37501b = i2;
    }

    /* renamed from: a */
    public final int mo22078a() {
        return this.f37500a;
    }

    /* renamed from: b */
    public final int mo22079b() {
        return this.f37501b;
    }

    /* renamed from: c */
    public final boolean mo22080c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ohv) {
            ohv ohv = (ohv) obj;
            return this.f37500a == ohv.mo22078a() && this.f37501b == ohv.mo22079b() && ohv.mo22080c();
        }
    }

    public final int hashCode() {
        return ((((this.f37500a ^ 1000003) * 1000003) ^ this.f37501b) * 1000003) ^ 1231;
    }

    public final String toString() {
        int i = this.f37500a;
        int i2 = this.f37501b;
        StringBuilder sb = new StringBuilder(131);
        sb.append("HuInfo{headUnitProtocolMajorVersionNumber=");
        sb.append(i);
        sb.append(", headUnitProtocolMinorVersionNumber=");
        sb.append(i2);
        sb.append(", sslHandshakeCompleted=true}");
        return sb.toString();
    }
}
