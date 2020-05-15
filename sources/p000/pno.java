package p000;

import java.util.Locale;

/* renamed from: pno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pno {

    /* renamed from: a */
    public final String f39857a;

    /* renamed from: b */
    public boolean f39858b;

    /* renamed from: c */
    public long f39859c;

    /* renamed from: d */
    public int f39860d;

    /* renamed from: e */
    public int f39861e;

    public pno(String str) {
        this.f39860d = 0;
        this.f39857a = str;
    }

    /* renamed from: a */
    public final void mo23503a() {
        this.f39861e = 0;
    }

    public final String toString() {
        return String.format(Locale.US, "CastProbedNetwork. Network ID: %s, isDeviceRespondingToProbe: %b, lastProbedTimestampMillis: %d, probingErrorCode: %d, numberOfProbedTimes: %d", this.f39857a, Boolean.valueOf(this.f39858b), Long.valueOf(this.f39859c), Integer.valueOf(this.f39860d), Integer.valueOf(this.f39861e));
    }

    public pno(String str, boolean z, long j, int i, int i2) {
        this.f39857a = str;
        this.f39858b = z;
        this.f39859c = j;
        this.f39860d = i;
        this.f39861e = i2;
    }
}
