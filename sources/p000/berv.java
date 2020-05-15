package p000;

import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: berv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class berv {

    /* renamed from: a */
    public static final int[] f112248a = {9, 15};

    /* renamed from: b */
    public ActivityRecognitionResult f112249b = null;

    /* renamed from: c */
    public ActivityRecognitionResult f112250c = null;

    /* renamed from: d */
    public long f112251d = 0;

    /* renamed from: e */
    public int f112252e = 0;

    /* renamed from: f */
    private boolean f112253f;

    public berv(boolean z) {
        this.f112253f = z;
    }

    /* renamed from: a */
    public final boolean mo61072a() {
        ActivityRecognitionResult activityRecognitionResult;
        boolean z = true;
        if (!this.f112253f) {
            ActivityRecognitionResult activityRecognitionResult2 = this.f112249b;
            if (activityRecognitionResult2 == null || (activityRecognitionResult = this.f112250c) == null || activityRecognitionResult.f79302c - activityRecognitionResult2.f79302c < 480000 || this.f112252e < 3) {
                z = false;
            }
            StringBuilder sb = new StringBuilder(37);
            sb.append("isCurrentlyInDeepStill result = ");
            sb.append(z);
            sb.toString();
        }
        return z;
    }

    /* renamed from: b */
    public final void mo61073b() {
        this.f112249b = null;
        this.f112250c = null;
        this.f112252e = 0;
        this.f112253f = false;
        StringBuilder sb = new StringBuilder(63);
        sb.append("shouldSwitchToDeepStill: clear. consecutiveStills = 0");
        sb.toString();
    }
}
