package p000;

import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: bese */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bese extends besg {

    /* renamed from: k */
    private boolean f112277k = false;

    public bese(berb berb) {
        super(berb, true);
    }

    /* renamed from: d */
    public final void mo60951d(ActivityRecognitionResult activityRecognitionResult) {
        if (!this.f112256b && !this.f112277k) {
            this.f112396d.mo60967a(activityRecognitionResult);
            this.f112277k = true;
            mo61091o();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo61082f() {
        return "FullAndOffBodyDetectorInPast";
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo61085i() {
        super.mo61085i();
        this.f112396d.f112163am = SystemClock.elapsedRealtime();
    }

    /* renamed from: p */
    public final String mo61093p() {
        return "FullAndOffBodyDetectingInPastState";
    }
}
