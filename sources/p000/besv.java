package p000;

import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: besv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class besv extends berw {
    public besv(berb berb) {
        super(berb, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61078a(long j) {
        if (!this.f112256b) {
            mo61089m();
        }
    }

    /* renamed from: b */
    public final void mo60949b(ActivityRecognitionResult activityRecognitionResult) {
        bxbm.m122539a(activityRecognitionResult);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final beqp mo61079d() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo61082f() {
        return "PhonePositionDetector";
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
        this.f112396d.f112162al = SystemClock.elapsedRealtime();
        this.f112396d.f112164an = SystemClock.elapsedRealtime();
    }

    /* renamed from: p */
    public final String mo61093p() {
        return "PhonePositionDetectingInFutureState";
    }
}
