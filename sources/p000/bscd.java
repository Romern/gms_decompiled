package p000;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: bscd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bscd {

    /* renamed from: a */
    final int f144034a;

    /* renamed from: b */
    final float f144035b;

    /* renamed from: c */
    final float[] f144036c;

    public bscd(int i, float f, float[] fArr) {
        this.f144034a = i;
        this.f144035b = f;
        float[] fArr2 = new float[fArr.length];
        this.f144036c = fArr2;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bscd) {
            bscd bscd = (bscd) obj;
            if (this.f144034a == bscd.f144034a && this.f144035b == bscd.f144035b && Arrays.equals(this.f144036c, bscd.f144036c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f144034a), Float.valueOf(this.f144035b), Integer.valueOf(Arrays.hashCode(this.f144036c))});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" GpsStatusInfo{");
        int i = this.f144034a;
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append(" numSatellites=");
        sb2.append(i);
        sb.append(sb2.toString());
        String valueOf = String.valueOf(String.format(Locale.US, "%.1f", Float.valueOf(this.f144035b)));
        sb.append(valueOf.length() == 0 ? new String(" averageSnr=") : " averageSnr=".concat(valueOf));
        String valueOf2 = String.valueOf(Arrays.toString(this.f144036c));
        sb.append(valueOf2.length() == 0 ? new String(" topFiveSnrs=") : " topFiveSnrs=".concat(valueOf2));
        sb.append("}");
        return sb.toString();
    }
}
