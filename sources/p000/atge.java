package p000;

import com.felicanetworks.mfc.mfi.MfiClient;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.mfc.mfi.User;
import java.util.concurrent.CountDownLatch;

/* renamed from: atge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class atge implements brfa {

    /* renamed from: a */
    private final CountDownLatch f90276a = new CountDownLatch(1);

    /* renamed from: b */
    public Object f90277b;

    /* renamed from: c */
    public bres f90278c;

    /* renamed from: a */
    public final Object mo49935a() {
        atgf.m75809a(this.f90276a);
        bres bres = this.f90278c;
        if (bres == null) {
            return this.f90277b;
        }
        throw bres;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo49929a(bngx bngx);

    /* renamed from: a */
    public final void mo49936a(bret bret) {
        this.f90278c = new bres(bret);
        bnsl bnsl = (bnsl) atgf.f90279a.mo68387b();
        bnsl.mo68437a(this.f90278c);
        bnsl.mo68405a("Error executing user operation for getting list of card");
        this.f90276a.countDown();
    }

    /* renamed from: a */
    public final void mo49937a(MfiClient mfiClient, User user) {
        CountDownLatch countDownLatch;
        CountDownLatch countDownLatch2 = new CountDownLatch(1);
        try {
            user.getCardList(new atgd(this, countDownLatch2));
            countDownLatch2.await();
            countDownLatch = this.f90276a;
        } catch (MfiClientException e) {
            this.f90278c = new bres(brez.m113953a(e.getType(), e.getMessage()));
            countDownLatch = this.f90276a;
        } catch (InterruptedException e2) {
            this.f90278c = new bres(atgf.f90280b);
            countDownLatch = this.f90276a;
        } catch (Throwable th) {
            this.f90276a.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
