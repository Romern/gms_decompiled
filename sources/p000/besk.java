package p000;

import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: besk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class besk extends berw {

    /* renamed from: k */
    private boolean f112304k = true;

    public besk(berb berb) {
        super(berb, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: berb.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      berb.a(com.google.android.gms.location.ActivityRecognitionResult, int):com.google.android.gms.location.ActivityRecognitionResult
      berb.a(long, boolean):void
      berb.a(java.util.List, int[]):void
      bglw.a(long, boolean):void
      bgmq.a(java.util.List, int[]):void
      berb.a(boolean, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61078a(long j) {
        if (this.f112256b) {
            return;
        }
        if (!this.f112304k) {
            this.f112396d.mo60974a(false, true);
            mo61107a(new besf(this.f112396d));
            return;
        }
        mo61107a(new betd(this.f112396d));
    }

    /* renamed from: b */
    public final void mo60949b(ActivityRecognitionResult activityRecognitionResult) {
        boolean z;
        bxbm.m122539a(activityRecognitionResult);
        if (!this.f112256b) {
            mo61081e(activityRecognitionResult);
            boolean z2 = this.f112304k;
            if (activityRecognitionResult.mo43491a().mo43513a() == 3) {
                z = true;
            } else {
                z = false;
            }
            boolean z3 = z2 & z;
            this.f112304k = z3;
            if (z3) {
                String valueOf = String.valueOf(activityRecognitionResult);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                sb.append("Low power still detected. Reporting: ");
                sb.append(valueOf);
                sb.toString();
                this.f112396d.mo60967a(activityRecognitionResult);
            }
        }
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
            return this.f112396d.f112127O;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo61082f() {
        return "LowPowerDetector";
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final double mo61088l() {
        return 8.0d;
    }

    /* renamed from: p */
    public final String mo61093p() {
        return "LowPowerStationaryDetectingState";
    }

    /* renamed from: c */
    public final void mo60950c(ActivityRecognitionResult activityRecognitionResult) {
        super.mo60950c(activityRecognitionResult);
        if (!this.f112256b && activityRecognitionResult.mo43491a().mo43513a() == 5) {
            this.f112304k = false;
        }
    }
}
