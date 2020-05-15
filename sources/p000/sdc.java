package p000;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: sdc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sdc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CountDownLatch f44053a;

    /* renamed from: b */
    final /* synthetic */ GetServiceRequest f44054b;

    /* renamed from: c */
    final /* synthetic */ sdd f44055c;

    public sdc(sdd sdd, CountDownLatch countDownLatch, GetServiceRequest getServiceRequest) {
        this.f44055c = sdd;
        this.f44053a = countDownLatch;
        this.f44054b = getServiceRequest;
    }

    public final void run() {
        try {
            if (!this.f44053a.await(((Long) rsv.f43634w.mo25081c()).longValue(), TimeUnit.MILLISECONDS)) {
                this.f44055c.mo25394b(this.f44054b, 99);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
