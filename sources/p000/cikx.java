package p000;

import com.felicanetworks.mfc.mfi.Card;
import com.felicanetworks.mfc.mfi.CardIssueEventCallback;
import java.util.concurrent.CountDownLatch;

/* renamed from: cikx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cikx implements CardIssueEventCallback {

    /* renamed from: a */
    final /* synthetic */ cikv f190572a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f190573b;

    public cikx(cikv cikv, CountDownLatch countDownLatch) {
        this.f190572a = cikv;
        this.f190573b = countDownLatch;
    }

    public final void onError(int i, String str) {
        this.f190572a.onError(i, str);
        this.f190573b.countDown();
    }

    public final void onSuccess(Card card) {
        this.f190572a.onSuccess(card);
        this.f190573b.countDown();
    }
}
