package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;

/* renamed from: bdkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdkv extends bdkx {

    /* renamed from: a */
    public final float f105855a;

    /* renamed from: b */
    private final boolean f105856b;

    /* renamed from: c */
    private final bdql f105857c;

    /* renamed from: d */
    private final boolean f105858d;

    public bdkv(boolean z, float f, bdql bdql, boolean z2) {
        this.f105856b = z;
        this.f105855a = f;
        this.f105857c = bdql;
        this.f105858d = z2;
    }

    /* renamed from: a */
    public final boolean mo58131a() {
        return this.f105856b;
    }

    /* renamed from: b */
    public final float mo58132b() {
        return this.f105855a;
    }

    /* renamed from: c */
    public final bdql mo58133c() {
        return this.f105857c;
    }

    /* renamed from: d */
    public final boolean mo58134d() {
        return this.f105858d;
    }

    /* renamed from: e */
    public final cijl mo58135e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdkx) {
            bdkx bdkx = (bdkx) obj;
            return this.f105856b == bdkx.mo58131a() && Float.floatToIntBits(this.f105855a) == Float.floatToIntBits(bdkx.mo58132b()) && this.f105857c.equals(bdkx.mo58133c()) && this.f105858d == bdkx.mo58134d() && bdkx.mo58135e() == null;
        }
    }

    public final int hashCode() {
        int i;
        int i2 = 1237;
        if (!this.f105856b) {
            i = 1237;
        } else {
            i = 1231;
        }
        int floatToIntBits = (((((i ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f105855a)) * 1000003) ^ this.f105857c.hashCode()) * 1000003;
        if (this.f105858d) {
            i2 = 1231;
        }
        return (floatToIntBits ^ i2) * 1000003;
    }

    public final String toString() {
        boolean z = this.f105856b;
        float f = this.f105855a;
        String valueOf = String.valueOf(this.f105857c);
        boolean z2 = this.f105858d;
        String valueOf2 = String.valueOf((Object) null);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED + String.valueOf(valueOf2).length());
        sb.append("CrashConfigurations{enabled=");
        sb.append(z);
        sb.append(", startupSamplePercentage=");
        sb.append(f);
        sb.append(", stackTraceTransmitter=");
        sb.append(valueOf);
        sb.append(", deferredInitLogging=");
        sb.append(z2);
        sb.append(", metricExtensionProvider=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
