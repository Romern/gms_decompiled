package p000;

import java.util.Arrays;

/* renamed from: bfkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfkv {

    /* renamed from: a */
    public final long f114319a;

    /* renamed from: b */
    public final float[] f114320b;

    public bfkv(long j, float[] fArr) {
        this.f114319a = j;
        this.f114320b = fArr;
    }

    public final String toString() {
        long j = this.f114319a;
        String arrays = Arrays.toString(this.f114320b);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 55);
        sb.append("SensorEvent [timestampNano=");
        sb.append(j);
        sb.append(", data=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
