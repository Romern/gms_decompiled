package p000;

import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: besd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class besd extends berw {

    /* renamed from: k */
    private boolean f112276k = false;

    public besd(berb berb) {
        super(berb, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo61092D() {
        mo61086j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61078a(long j) {
        if (this.f112256b) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            mo61089m();
        } else if (!this.f112402j) {
            this.f112396d.mo60979b(SystemClock.elapsedRealtime() + j);
        } else {
            mo61090n();
        }
    }

    /* renamed from: b */
    public final void mo60949b(ActivityRecognitionResult activityRecognitionResult) {
        bxbm.m122539a(activityRecognitionResult);
        if (!this.f112256b) {
            this.f112396d.mo60967a(activityRecognitionResult);
            mo61081e(activityRecognitionResult);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final beqp mo61079d() {
        return this.f112396d.f112123K;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo61082f() {
        return "FullAndOffBodyDetector";
    }

    /* renamed from: h */
    public final void mo61084h() {
        super.mo61084h();
        berb berb = this.f112396d;
        if (!berb.f112191r.f112367a) {
            berb.mo60997m();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo61085i() {
        super.mo61085i();
        this.f112396d.f112163am = SystemClock.elapsedRealtime();
    }

    /* renamed from: p */
    public final String mo61093p() {
        return "FullAndOffBodyDetectingInFutureState";
    }

    /* renamed from: d */
    public final void mo60951d(ActivityRecognitionResult activityRecognitionResult) {
        if (!this.f112256b && !this.f112276k) {
            this.f112396d.mo60967a(activityRecognitionResult);
            this.f112276k = true;
            mo61091o();
        }
    }
}
