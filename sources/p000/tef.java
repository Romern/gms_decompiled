package p000;

import android.telephony.NumberVerificationCallback;
import java.util.concurrent.CountDownLatch;

/* renamed from: tef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tef implements NumberVerificationCallback {

    /* renamed from: a */
    final /* synthetic */ teg f45737a;

    public tef(teg teg) {
        this.f45737a = teg;
    }

    public final void onCallReceived(String str) {
        this.f45737a.f45740b.set(false);
        this.f45737a.f45743e = str;
        teg.f45738a.mo25412b("Call received phoneNumber: %s.", str);
        tei a = this.f45737a.mo26433a();
        if (a != null) {
            a.mo26439a(str);
        } else {
            teg.f45738a.mo25414c("No listener to notify phone call.", new Object[0]);
        }
    }

    public final void onVerificationFailed(int i) {
        this.f45737a.f45740b.set(false);
        this.f45737a.f45743e = Integer.valueOf(i);
        CountDownLatch countDownLatch = this.f45737a.f45742d;
        bmxy.m108581a(countDownLatch);
        countDownLatch.countDown();
        teg.f45738a.mo25412b(teg.m36823a(i), new Object[0]);
        tei a = this.f45737a.mo26433a();
        if (a != null) {
            a.mo26438a(i);
        } else {
            teg.f45738a.mo25414c("No listener to notify fail.", new Object[0]);
        }
    }
}
