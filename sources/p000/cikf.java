package p000;

import com.felicanetworks.mfc.mfi.Card;
import com.felicanetworks.mfc.mfi.MfiClient;
import com.felicanetworks.mfc.mfi.User;
import java.util.concurrent.CountDownLatch;

/* renamed from: cikf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cikf implements brfa {

    /* renamed from: a */
    final /* synthetic */ Card f190506a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f190507b;

    /* renamed from: c */
    final /* synthetic */ cikh f190508c;

    public cikf(cikh cikh, Card card, CountDownLatch countDownLatch) {
        this.f190508c = cikh;
        this.f190506a = card;
        this.f190507b = countDownLatch;
    }

    /* renamed from: a */
    public final void mo49936a(bret bret) {
        int i = cikh.f190511g;
        this.f190508c.f190516e.f190484a = new bres(bret);
        this.f190507b.countDown();
    }

    /* renamed from: a */
    public final void mo49937a(MfiClient mfiClient, User user) {
        int i = cikh.f190511g;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f190506a.enable(new cike(this, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            this.f190508c.f190516e.f190484a = new bres(cijw.QUICPAY_UNKNOWN_ERROR);
        }
        this.f190507b.countDown();
    }
}
