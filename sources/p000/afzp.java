package p000;

/* renamed from: afzp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afzp extends afzz {

    /* renamed from: a */
    public final String f65029a;

    /* renamed from: b */
    private final boolean f65030b;

    /* renamed from: c */
    private final boolean f65031c;

    public afzp(String str, boolean z, boolean z2) {
        if (str != null) {
            this.f65029a = str;
            this.f65030b = z;
            this.f65031c = z2;
            return;
        }
        throw new NullPointerException("Null echoServerToken");
    }

    /* renamed from: a */
    public final String mo35113a() {
        return this.f65029a;
    }

    /* renamed from: b */
    public final boolean mo35114b() {
        return this.f65030b;
    }

    /* renamed from: c */
    public final boolean mo35115c() {
        return this.f65031c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afzz) {
            afzz afzz = (afzz) obj;
            return this.f65029a.equals(afzz.mo35113a()) && this.f65030b == afzz.mo35114b() && this.f65031c == afzz.mo35115c();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.f65029a.hashCode() ^ 1000003) * 1000003) ^ (!this.f65030b ? 1237 : 1231)) * 1000003;
        if (this.f65031c) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f65029a;
        boolean z = this.f65030b;
        boolean z2 = this.f65031c;
        StringBuilder sb = new StringBuilder(str.length() + 82);
        sb.append("LocationRequest{echoServerToken=");
        sb.append(str);
        sb.append(", includeBattery=");
        sb.append(z);
        sb.append(", includeConnectivity=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
