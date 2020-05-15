package p000;

import java.util.Arrays;

/* renamed from: bgms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgms {

    /* renamed from: a */
    public final long f116821a;

    /* renamed from: b */
    public final float[] f116822b;

    public bgms(long j, float[] fArr) {
        this.f116821a = j;
        this.f116822b = fArr;
    }

    public final String toString() {
        return "HardwareArSample[elapsedRealtimeMs=" + this.f116821a + ", confidences=" + Arrays.toString(this.f116822b) + "]";
    }
}
