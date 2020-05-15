package p000;

import java.util.Arrays;

/* renamed from: bhtx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhtx {

    /* renamed from: a */
    public final bhub f119580a;

    /* renamed from: b */
    public final bhwr f119581b;

    /* renamed from: c */
    public final bhtu f119582c;

    /* renamed from: d */
    public final bhtr f119583d;

    /* renamed from: e */
    public final boolean f119584e;

    /* renamed from: f */
    public final boolean f119585f;

    public bhtx(bhub bhub, bhwr bhwr, bhtu bhtu, bhtr bhtr, boolean z, boolean z2) {
        this.f119580a = bhub;
        this.f119581b = bhwr;
        this.f119582c = bhtu;
        this.f119583d = bhtr;
        this.f119584e = z;
        this.f119585f = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bhtx)) {
            return false;
        }
        bhtx bhtx = (bhtx) obj;
        return bhxi.m101705a(bhtx.f119580a, this.f119580a) && bhxi.m101705a(bhtx.f119581b, this.f119581b) && bhxi.m101705a(bhtx.f119582c, this.f119582c) && bhxi.m101705a(bhtx.f119583d, this.f119583d) && bhtx.f119584e == this.f119584e && bhtx.f119585f == this.f119585f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f119580a, this.f119581b, this.f119582c, this.f119583d, Boolean.valueOf(this.f119584e)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f119580a);
        String valueOf2 = String.valueOf(this.f119581b);
        String valueOf3 = String.valueOf(this.f119582c);
        String valueOf4 = String.valueOf(this.f119583d);
        boolean z = this.f119585f;
        boolean z2 = this.f119584e;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 117 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("InferenceSignals{position=");
        sb.append(valueOf);
        sb.append(", wifiScan=");
        sb.append(valueOf2);
        sb.append(", beaconScan=");
        sb.append(valueOf3);
        sb.append(", activityRecord=");
        sb.append(valueOf4);
        sb.append(", isFromMockProvider=");
        sb.append(z);
        sb.append(", isWifiConnected=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
