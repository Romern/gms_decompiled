package p000;

import android.location.GnssStatus;
import android.os.SystemClock;

/* renamed from: bfkl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfkl implements bfkr {

    /* renamed from: a */
    private final GnssStatus f114305a;

    /* renamed from: b */
    private final long f114306b;

    public bfkl(GnssStatus gnssStatus) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.f114305a = gnssStatus;
        this.f114306b = elapsedRealtimeNanos;
    }

    /* renamed from: a */
    public final int mo61839a() {
        return this.f114305a.getSatelliteCount();
    }

    /* renamed from: b */
    public final int mo61841b(int i) {
        return this.f114305a.getSvid(i);
    }

    /* renamed from: b */
    public final long mo61842b() {
        return this.f114306b;
    }

    /* renamed from: c */
    public final float mo61843c(int i) {
        return this.f114305a.getCn0DbHz(i);
    }

    /* renamed from: d */
    public final float mo61844d(int i) {
        return this.f114305a.getElevationDegrees(i);
    }

    /* renamed from: e */
    public final float mo61845e(int i) {
        return this.f114305a.getAzimuthDegrees(i);
    }

    /* renamed from: f */
    public final boolean mo61846f(int i) {
        return this.f114305a.usedInFix(i);
    }

    /* renamed from: g */
    public final float mo61847g(int i) {
        return this.f114305a.getCarrierFrequencyHz(i);
    }

    /* renamed from: a */
    public final int mo61840a(int i) {
        return this.f114305a.getConstellationType(i);
    }
}
