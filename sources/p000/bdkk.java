package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;

/* renamed from: bdkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdkk extends bdkm {

    /* renamed from: a */
    private final boolean f105805a;

    /* renamed from: b */
    private final int f105806b;

    /* renamed from: c */
    private final int f105807c;

    /* renamed from: d */
    private final int f105808d;

    /* renamed from: e */
    private final int f105809e;

    /* renamed from: f */
    private final double f105810f;

    public bdkk(boolean z, int i, int i2, int i3, int i4, double d) {
        this.f105805a = z;
        this.f105806b = i;
        this.f105807c = i2;
        this.f105808d = i3;
        this.f105809e = i4;
        this.f105810f = d;
    }

    /* renamed from: a */
    public final boolean mo58107a() {
        return this.f105805a;
    }

    /* renamed from: b */
    public final int mo58108b() {
        return this.f105806b;
    }

    /* renamed from: c */
    public final int mo58109c() {
        return this.f105807c;
    }

    /* renamed from: d */
    public final int mo58110d() {
        return this.f105808d;
    }

    /* renamed from: e */
    public final int mo58111e() {
        return this.f105809e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdkm) {
            bdkm bdkm = (bdkm) obj;
            return this.f105805a == bdkm.mo58107a() && this.f105806b == bdkm.mo58108b() && this.f105807c == bdkm.mo58109c() && this.f105808d == bdkm.mo58110d() && this.f105809e == bdkm.mo58111e() && Double.doubleToLongBits(this.f105810f) == Double.doubleToLongBits(bdkm.mo58113f());
        }
    }

    /* renamed from: f */
    public final double mo58113f() {
        return this.f105810f;
    }

    public final int hashCode() {
        return (((((((((((!this.f105805a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f105806b) * 1000003) ^ this.f105807c) * 1000003) ^ this.f105808d) * 1000003) ^ this.f105809e) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f105810f) >>> 32) ^ Double.doubleToLongBits(this.f105810f)));
    }

    public final String toString() {
        boolean z = this.f105805a;
        int i = this.f105806b;
        int i2 = this.f105807c;
        int i3 = this.f105808d;
        int i4 = this.f105809e;
        double d = this.f105810f;
        StringBuilder sb = new StringBuilder((int) BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED);
        sb.append("CpuProfilingConfigurations{enabled=");
        sb.append(z);
        sb.append(", maxBufferSizeBytes=");
        sb.append(i);
        sb.append(", sampleDurationMs=");
        sb.append(i2);
        sb.append(", sampleDurationSkewMs=");
        sb.append(i3);
        sb.append(", sampleFrequencyMicro=");
        sb.append(i4);
        sb.append(", samplesPerEpoch=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
