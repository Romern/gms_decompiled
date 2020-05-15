package p000;

import android.location.Location;
import android.os.Build;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: bfsj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfsj extends bfsf {

    /* renamed from: b */
    final /* synthetic */ bfsl f115121b;

    /* renamed from: c */
    private long f115122c;

    /* renamed from: d */
    private Location f115123d = null;

    /* renamed from: e */
    private int f115124e;

    /* renamed from: f */
    private boolean f115125f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfsj(bfsl bfsl) {
        super(bfsl);
        this.f115121b = bfsl;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62204a(bfsf bfsf) {
        if (bfsf == this.f115121b.f115131f || !cewd.f183471a.mo6606a().ignoreSmdForThrottling()) {
            super.mo62204a(bfsf);
        }
    }

    /* renamed from: b */
    public final void mo62207b() {
        this.f115122c = 0;
        this.f115124e = 0;
        this.f115123d = null;
        this.f115125f = false;
    }

    /* renamed from: c */
    public final void mo62208c() {
        this.f115123d = null;
    }

    /* renamed from: a */
    public final void mo62205a(ActivityRecognitionResult activityRecognitionResult) {
        this.f115125f = false;
        int a = activityRecognitionResult.mo43491a().mo43513a();
        if (a == 0 || a == 1) {
            mo62204a(this.f115121b.f115134i);
        } else if (a == 3) {
            this.f115125f = true;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* renamed from: a */
    public final void mo62206a(List list) {
        int i = Build.VERSION.SDK_INT;
        float sigmaScaleDistanceThreshold = (float) cewd.f183471a.mo6606a().sigmaScaleDistanceThreshold();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Location location = (Location) it.next();
            int j = aeim.m51906j(location);
            if (j != 2) {
                if (this.f115123d != null && bxbl.m122538a(Integer.valueOf(j), Integer.valueOf(aeim.m51906j(this.f115123d)))) {
                    float accuracy = this.f115123d.getAccuracy();
                    float accuracy2 = location.getAccuracy();
                    if (j == 3) {
                        accuracy2 = Math.max(30.0f, accuracy2);
                        accuracy = Math.max(30.0f, accuracy);
                    }
                    float distanceTo = this.f115123d.distanceTo(location);
                    if (location.getSpeed() < 1.0f && distanceTo <= (accuracy2 + accuracy) * sigmaScaleDistanceThreshold) {
                        this.f115124e++;
                    }
                }
                this.f115123d = location;
                int i2 = Build.VERSION.SDK_INT;
                this.f115122c = TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos());
                this.f115124e = 1;
            }
        }
        if (bfsl.m97720a((Location) list.get(list.size() - 1))) {
            mo62204a(this.f115121b.f115134i);
        } else if (((long) this.f115124e) >= cewd.f183471a.mo6606a().numStillLocationsThreshold()) {
            if (SystemClock.elapsedRealtime() - this.f115122c >= cewd.f183471a.mo6606a().minStillTimeMs()) {
                if (this.f115121b.f115138m >= 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    bfsl bfsl = this.f115121b;
                    if (elapsedRealtime - bfsl.f115138m <= bfsl.f115139n) {
                        return;
                    }
                }
                bfsl bfsl2 = this.f115121b;
                bfsl2.f115126a = 2;
                mo62204a(bfsl2.f115133h);
            }
        } else if (this.f115125f) {
            bfsl bfsl3 = this.f115121b;
            bfsl3.f115126a = 1;
            mo62204a(bfsl3.f115133h);
        }
    }
}
