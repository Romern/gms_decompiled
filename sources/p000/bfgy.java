package p000;

import java.util.Locale;

/* renamed from: bfgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfgy {

    /* renamed from: a */
    public final int f113851a;

    /* renamed from: b */
    public final long f113852b;

    /* renamed from: c */
    public final long f113853c;

    /* renamed from: d */
    public int f113854d;

    /* renamed from: e */
    public long f113855e;

    public bfgy(int i, long j) {
        this.f113851a = i;
        this.f113852b = 1500;
        this.f113853c = j;
    }

    public final String toString() {
        return String.format(Locale.US, "SensorScannerConfig [mNumSamplesToSkip=%d/%d, mTimeoutForSkip=%d, mSensorTimeSpan=%d, mMotionTimeoutForStop=%d]", Integer.valueOf(this.f113854d), Integer.valueOf(this.f113851a), Long.valueOf(this.f113852b), Long.valueOf(this.f113853c), Long.valueOf(this.f113855e));
    }

    public bfgy(int i, long j, long j2, long j3) {
        this.f113851a = i;
        this.f113852b = j;
        this.f113853c = j2;
        this.f113855e = j3;
    }
}
