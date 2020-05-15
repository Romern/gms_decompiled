package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;

/* renamed from: omv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class omv extends onv {

    /* renamed from: a */
    private final boolean f37963a;

    /* renamed from: b */
    private final int f37964b;

    /* renamed from: c */
    private final int f37965c;

    /* renamed from: d */
    private final int f37966d;

    /* renamed from: e */
    private final int f37967e;

    public omv(boolean z, int i, int i2, int i3, int i4) {
        this.f37963a = z;
        this.f37964b = i;
        this.f37965c = i2;
        this.f37966d = i3;
        this.f37967e = i4;
    }

    /* renamed from: a */
    public final boolean mo22323a() {
        return this.f37963a;
    }

    /* renamed from: b */
    public final int mo22324b() {
        return this.f37964b;
    }

    /* renamed from: c */
    public final int mo22325c() {
        return this.f37965c;
    }

    /* renamed from: d */
    public final int mo22326d() {
        return this.f37966d;
    }

    /* renamed from: e */
    public final int mo22327e() {
        return this.f37967e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof onv) {
            onv onv = (onv) obj;
            return this.f37963a == onv.mo22323a() && this.f37964b == onv.mo22324b() && this.f37965c == onv.mo22325c() && this.f37966d == onv.mo22326d() && this.f37967e == onv.mo22327e();
        }
    }

    public final int hashCode() {
        return (((((((((!this.f37963a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f37964b) * 1000003) ^ this.f37965c) * 1000003) ^ this.f37966d) * 1000003) ^ this.f37967e;
    }

    public final String toString() {
        boolean z = this.f37963a;
        int i = this.f37964b;
        int i2 = this.f37965c;
        int i3 = this.f37966d;
        int i4 = this.f37967e;
        StringBuilder sb = new StringBuilder((int) MfiClientException.TYPE_MFICLIENT_STARTED);
        sb.append("UsbPortStatus{connected=");
        sb.append(z);
        sb.append(", currentDataRole=");
        sb.append(i);
        sb.append(", currentPowerRole=");
        sb.append(i2);
        sb.append(", supportedRoleCombinations=");
        sb.append(i3);
        sb.append(", currentMode=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
