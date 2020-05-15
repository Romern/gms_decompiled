package p000;

import com.felicanetworks.mfc.mfi.Card;
import com.felicanetworks.mfc.mfi.CardListEventCallback;
import java.util.concurrent.CountDownLatch;

/* renamed from: ciks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciks implements CardListEventCallback {

    /* renamed from: a */
    final /* synthetic */ cikq f190553a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f190554b;

    public ciks(cikq cikq, CountDownLatch countDownLatch) {
        this.f190553a = cikq;
        this.f190554b = countDownLatch;
    }

    public final void onError(int i, String str) {
        this.f190553a.onError(i, str);
        this.f190554b.countDown();
    }

    public final void onSuccess(Card[] cardArr) {
        this.f190553a.onSuccess(cardArr);
        this.f190554b.countDown();
    }
}
