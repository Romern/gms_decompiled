package p000;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import java.util.Collection;

/* renamed from: bhbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhbj implements bfkr {

    /* renamed from: a */
    private final int f118242a;

    /* renamed from: b */
    private final boolean[] f118243b;

    /* renamed from: c */
    private final int[] f118244c;

    /* renamed from: d */
    private final float[] f118245d;

    /* renamed from: e */
    private final float[] f118246e;

    /* renamed from: f */
    private final float[] f118247f;

    /* renamed from: g */
    private final int[] f118248g;

    /* renamed from: h */
    private final float[] f118249h;

    public bhbj(GpsStatus gpsStatus) {
        Iterable<GpsSatellite> satellites = gpsStatus.getSatellites();
        int size = satellites instanceof Collection ? ((Collection) satellites).size() : bnjr.m109616b(satellites.iterator());
        this.f118242a = size;
        this.f118243b = new boolean[size];
        this.f118244c = new int[size];
        this.f118245d = new float[size];
        this.f118246e = new float[size];
        this.f118247f = new float[size];
        this.f118248g = new int[size];
        this.f118249h = new float[size];
        int i = 0;
        for (GpsSatellite gpsSatellite : gpsStatus.getSatellites()) {
            this.f118243b[i] = gpsSatellite.usedInFix();
            this.f118244c[i] = gpsSatellite.getPrn();
            this.f118245d[i] = gpsSatellite.getSnr();
            this.f118246e[i] = gpsSatellite.getElevation();
            this.f118247f[i] = gpsSatellite.getAzimuth();
            this.f118248g[i] = 1;
            this.f118249h[i] = 1.57542003E9f;
            i++;
        }
    }

    /* renamed from: a */
    public final int mo61839a() {
        return this.f118242a;
    }

    /* renamed from: b */
    public final int mo61841b(int i) {
        return this.f118244c[i];
    }

    /* renamed from: b */
    public final long mo61842b() {
        return 0;
    }

    /* renamed from: c */
    public final float mo61843c(int i) {
        return this.f118245d[i];
    }

    /* renamed from: d */
    public final float mo61844d(int i) {
        return this.f118246e[i];
    }

    /* renamed from: e */
    public final float mo61845e(int i) {
        return this.f118247f[i];
    }

    /* renamed from: f */
    public final boolean mo61846f(int i) {
        return this.f118243b[i];
    }

    /* renamed from: g */
    public final float mo61847g(int i) {
        return this.f118249h[i];
    }

    /* renamed from: a */
    public final int mo61840a(int i) {
        return this.f118248g[i];
    }
}
