package p000;

import com.google.android.gms.gcm.GcmChimeraDiagnostics;

/* renamed from: aakg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aakg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ GcmChimeraDiagnostics f28356a;

    public aakg(GcmChimeraDiagnostics gcmChimeraDiagnostics) {
        this.f28356a = gcmChimeraDiagnostics;
    }

    public final void run() {
        this.f28356a.mo19553e();
        GcmChimeraDiagnostics.f32775d.postDelayed(this, 5000);
    }
}
