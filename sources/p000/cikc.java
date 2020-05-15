package p000;

import com.felicanetworks.mfc.mfi.Card;
import com.felicanetworks.mfc.mfi.CardIssueEventCallback;
import java.util.concurrent.CountDownLatch;

/* renamed from: cikc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cikc implements CardIssueEventCallback {

    /* renamed from: a */
    final /* synthetic */ CountDownLatch f190499a;

    /* renamed from: b */
    final /* synthetic */ cikd f190500b;

    public cikc(cikd cikd, CountDownLatch countDownLatch) {
        this.f190500b = cikd;
        this.f190499a = countDownLatch;
    }

    public final void onError(int i, String str) {
        int i2 = cikh.f190511g;
        this.f190500b.f190503c.f190515d.f190484a = new bres(brez.m113953a(i, str));
        this.f190499a.countDown();
    }

    public final void onSuccess(Card card) {
        int i = cikh.f190511g;
        this.f190500b.f190503c.f190515d.f190485b = card;
        this.f190499a.countDown();
    }
}
