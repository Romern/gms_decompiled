package p000;

/* renamed from: bsbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsbp extends bsbw {

    /* renamed from: a */
    public final float f143995a;

    /* renamed from: b */
    public final int f143996b;

    /* renamed from: c */
    public final int f143997c;

    /* renamed from: d */
    public final int f143998d;

    /* renamed from: e */
    public final boolean f143999e;

    /* renamed from: f */
    public final int f144000f;

    public bsbp(float f, int i, int i2, int i3, boolean z, int i4) {
        this.f143995a = f;
        this.f143996b = i;
        this.f143997c = i2;
        this.f143998d = i3;
        this.f143999e = z;
        this.f144000f = i4;
    }

    /* renamed from: a */
    public final float mo70217a() {
        return this.f143995a;
    }

    /* renamed from: b */
    public final int mo70218b() {
        return this.f143996b;
    }

    /* renamed from: c */
    public final int mo70219c() {
        return this.f143997c;
    }

    /* renamed from: d */
    public final int mo70220d() {
        return this.f143998d;
    }

    /* renamed from: e */
    public final boolean mo70221e() {
        return this.f143999e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bsbw) {
            bsbw bsbw = (bsbw) obj;
            return Float.floatToIntBits(this.f143995a) == Float.floatToIntBits(bsbw.mo70217a()) && this.f143996b == bsbw.mo70218b() && this.f143997c == bsbw.mo70219c() && this.f143998d == bsbw.mo70220d() && this.f143999e == bsbw.mo70221e() && this.f144000f == bsbw.mo70223f();
        }
    }

    /* renamed from: f */
    public final int mo70223f() {
        return this.f144000f;
    }

    public final int hashCode() {
        return ((((((((((Float.floatToIntBits(this.f143995a) ^ 1000003) * 1000003) ^ this.f143996b) * 1000003) ^ this.f143997c) * 1000003) ^ this.f143998d) * 1000003) ^ (!this.f143999e ? 1237 : 1231)) * 1000003) ^ this.f144000f;
    }

    public final String toString() {
        float f = this.f143995a;
        int i = this.f143996b;
        int i2 = this.f143997c;
        int i3 = this.f143998d;
        boolean z = this.f143999e;
        int i4 = this.f144000f;
        StringBuilder sb = new StringBuilder(264);
        sb.append("FlpFusionOptions{gpsAccuracyNormalizationFactor=");
        sb.append(f);
        sb.append(", gpsPositionRequestTimePeriodSec=");
        sb.append(i);
        sb.append(", wifiLocationRequestTimePeriodSec=");
        sb.append(i2);
        sb.append(", nearIndoorsGpsSnrThreshold=");
        sb.append(i3);
        sb.append(", usePdrWithGpsPosition=");
        sb.append(z);
        sb.append(", flpMinimumOutputAccuracyMm=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
