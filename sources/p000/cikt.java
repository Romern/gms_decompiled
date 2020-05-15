package p000;

import com.felicanetworks.mfc.mfi.Card;
import com.felicanetworks.mfc.mfi.MfiClient;
import com.felicanetworks.mfc.mfi.User;
import java.util.concurrent.CountDownLatch;

/* renamed from: cikt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cikt extends cikl {

    /* renamed from: a */
    private final brep f190555a;

    /* renamed from: b */
    private final Card f190556b;

    /* renamed from: c */
    private final brhc f190557c;

    /* renamed from: d */
    private final String f190558d;

    public cikt(Card card, brhc brhc, brep brep, String str) {
        super(brep);
        this.f190556b = card;
        this.f190557c = brhc;
        this.f190555a = brep;
        this.f190558d = str;
    }

    /* renamed from: a */
    public final void mo49937a(MfiClient mfiClient, User user) {
        cikq cikq = new cikq(this.f190556b, this.f190557c, this.f190555a, this.f190558d);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            user.getCardList(new ciks(cikq, countDownLatch));
            countDownLatch.await();
        } catch (IllegalArgumentException e) {
            this.f190557c.mo69532a("felica", "DeleteCardListEventCallback is null.", e);
            this.f190555a.mo49931a(new bres(bret.UNKNOWN_FELICA_ERROR));
        } catch (InterruptedException e2) {
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
