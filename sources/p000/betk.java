package p000;

import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: betk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class betk extends berw {
    public betk(berb berb) {
        super(berb, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61078a(long j) {
        if (!this.f112256b) {
            mo61107a(new betd(this.f112396d));
        }
    }

    /* renamed from: b */
    public final void mo60949b(ActivityRecognitionResult activityRecognitionResult) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo61077c() {
        return 5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final beqp mo61079d() {
        if (!this.f112396d.f112114B.mo62860d()) {
            return this.f112396d.f112128P;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo61082f() {
        return "TiltDetector";
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo61085i() {
        this.f112396d.f112162al = SystemClock.elapsedRealtime();
    }

    /* renamed from: p */
    public final String mo61093p() {
        return "TiltDetectingInFutureState";
    }
}
