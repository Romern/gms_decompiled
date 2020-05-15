package p000;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.CountDownLatch;

/* renamed from: ucu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ucu extends ucj {
    public ucu(ubk ubk, uto uto) {
        super("CompletePendingActivityOperation", ubk, uto);
    }

    /* renamed from: c */
    public final void mo27235c() {
        try {
            ubd a = this.f47237a.f47146g.mo27000a();
            a.mo27049f();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            a.f47089b.execute(new uaz(countDownLatch));
            countDownLatch.await();
            synchronized (a) {
                while (a.mo27043b()) {
                    a.wait();
                }
            }
            this.f47238b.mo27971a();
        } catch (InterruptedException e) {
            this.f47238b.mo27107a(new Status(8, "There was an error completing pending operations. Please try again later.", null));
        }
    }
}
