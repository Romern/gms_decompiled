package p000;

import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.internal.OnEventResponse;
import java.util.concurrent.CountDownLatch;

/* renamed from: udr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class udr extends utq {

    /* renamed from: a */
    final /* synthetic */ CountDownLatch f47308a;

    /* renamed from: b */
    final /* synthetic */ uds f47309b;

    public udr(uds uds, CountDownLatch countDownLatch) {
        this.f47309b = uds;
        this.f47308a = countDownLatch;
    }

    /* renamed from: a */
    public final void mo27248a(OnEventResponse onEventResponse) {
        if (((ChangeEvent) onEventResponse.mo18206a()).f30770a.f30728a != null) {
            uds uds = this.f47309b;
            uoz uoz = uds.f47237a.f47151l;
            sbw sbw = uds.f47310f;
            uoz.mo27810a(uds.f47312h.f30863a, this);
            this.f47308a.countDown();
        }
    }
}
