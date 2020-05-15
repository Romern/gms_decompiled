package p000;

import com.google.android.gms.tapandpay.security.CheckInTaskOperation;
import java.util.concurrent.CountDownLatch;

/* renamed from: athg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class athg implements Runnable {

    /* renamed from: a */
    private final athq f90363a;

    /* renamed from: b */
    private final CountDownLatch f90364b;

    /* renamed from: c */
    private final btiw f90365c;

    /* renamed from: d */
    private final askf f90366d;

    public athg(athq athq, CountDownLatch countDownLatch, btiw btiw, askf askf) {
        this.f90363a = athq;
        this.f90364b = countDownLatch;
        this.f90365c = btiw;
        this.f90366d = askf;
    }

    public final void run() {
        CountDownLatch countDownLatch;
        try {
            athq athq = this.f90363a;
            askf askf = this.f90366d;
            athq.mo50001a(askf, athq.mo50000a(askf, this.f90365c));
            asuc.getInstance().mo49500a(askf.f89126d, "storageKey");
            countDownLatch = this.f90364b;
        } catch (Exception e) {
            bnsl bnsl = (bnsl) CheckInTaskOperation.f108654a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("athg", "run", 431, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to check for key rotation, will try again at next check-in");
            countDownLatch = this.f90364b;
        } catch (Throwable th) {
            this.f90364b.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
