package p000;

import com.felicanetworks.mfc.mfi.Card;
import com.felicanetworks.mfc.mfi.CardListEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import java.util.concurrent.CountDownLatch;

/* renamed from: cikq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cikq implements CardListEventCallback {

    /* renamed from: a */
    private final Card f190540a;

    /* renamed from: b */
    private final brhc f190541b;

    /* renamed from: c */
    private final brep f190542c;

    /* renamed from: d */
    private final String f190543d;

    public cikq(Card card, brhc brhc, brep brep, String str) {
        this.f190540a = card;
        this.f190541b = brhc;
        this.f190542c = brep;
        this.f190543d = str;
    }

    public final void onError(int i, String str) {
        this.f190542c.mo49931a(new bres(brez.m113953a(i, str)));
    }

    public final void onSuccess(Card[] cardArr) {
        int length = cardArr.length;
        int i = 0;
        while (i < length) {
            Card card = cardArr[i];
            if (card.getCardInfo().getCid().equals(this.f190540a.getCardInfo().getCid())) {
                cikm cikm = new cikm(this.f190542c);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    card.delete(this.f190543d, new cikp(cikm, countDownLatch));
                    try {
                        countDownLatch.await();
                        return;
                    } catch (InterruptedException e) {
                        return;
                    }
                } catch (MfiClientException e2) {
                    this.f190542c.mo49931a(new bres(bret.m113949a(e2)));
                    countDownLatch.countDown();
                    return;
                } catch (IllegalArgumentException e3) {
                    this.f190541b.mo69532a("felica", "mLinkageData or CardDeleteEventCallback is null.", e3);
                    this.f190542c.mo49931a(new bres(bret.UNKNOWN_FELICA_ERROR));
                    countDownLatch.countDown();
                    return;
                }
            } else {
                i++;
            }
        }
        brep brep = this.f190542c;
        ciki ciki = ciki.CARD_NOT_EXIST;
        ciki.m150513a(ciki);
        brep.mo49931a(new bres(ciki));
    }
}
