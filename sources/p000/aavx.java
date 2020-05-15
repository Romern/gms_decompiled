package p000;

import android.os.SystemClock;

/* renamed from: aavx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aavx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aawe f56677a;

    public aavx(aawe aawe) {
        this.f56677a = aawe;
    }

    public final void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long f = ceeg.m136401f();
        aawe aawe = this.f56677a;
        long j = ((long) ((int) f)) - (uptimeMillis - aawe.f56702o);
        if (j > 0) {
            aawe.f56703p.postDelayed(aawe.f56704q, j);
        } else {
            aawe.mo31845a(abdx.NO_TEXT_ENTERED);
        }
    }
}
