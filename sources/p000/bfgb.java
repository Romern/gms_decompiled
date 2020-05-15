package p000;

import android.hardware.Sensor;
import java.util.Locale;

/* renamed from: bfgb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfgb {

    /* renamed from: a */
    public float[] f113735a;

    /* renamed from: b */
    public Sensor f113736b;

    /* renamed from: c */
    public long f113737c;

    /* renamed from: d */
    public long f113738d;

    public final String toString() {
        return String.format(Locale.US, "Value: %f; Sensor: %s; timestampNanos: %d; elapsedRealtimeNanos: %d", Float.valueOf(this.f113735a[0]), Integer.valueOf(this.f113736b.getType()), Long.valueOf(this.f113737c), Long.valueOf(this.f113738d));
    }
}
