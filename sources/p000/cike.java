package p000;

import com.felicanetworks.mfc.mfi.Card;
import com.felicanetworks.mfc.mfi.CardEnableEventCallback;
import java.util.concurrent.CountDownLatch;

/* renamed from: cike */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cike implements CardEnableEventCallback {

    /* renamed from: a */
    final /* synthetic */ CountDownLatch f190504a;

    /* renamed from: b */
    final /* synthetic */ cikf f190505b;

    public cike(cikf cikf, CountDownLatch countDownLatch) {
        this.f190505b = cikf;
        this.f190504a = countDownLatch;
    }

    public final void onError(int i, String str) {
        int i2 = cikh.f190511g;
        this.f190505b.f190508c.f190516e.f190485b = false;
        this.f190505b.f190508c.f190516e.f190484a = new bres(brez.m113953a(i, str));
        this.f190504a.countDown();
    }

    public final void onSuccess(Card card, Card card2) {
        int i = cikh.f190511g;
        this.f190505b.f190508c.f190516e.f190485b = true;
        this.f190504a.countDown();
    }
}
