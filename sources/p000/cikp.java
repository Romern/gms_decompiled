package p000;

import com.felicanetworks.mfc.mfi.CardDeleteEventCallback;
import java.util.concurrent.CountDownLatch;

/* renamed from: cikp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cikp implements CardDeleteEventCallback {

    /* renamed from: a */
    final /* synthetic */ cikm f190538a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f190539b;

    public cikp(cikm cikm, CountDownLatch countDownLatch) {
        this.f190538a = cikm;
        this.f190539b = countDownLatch;
    }

    public final void onError(int i, String str) {
        this.f190538a.onError(i, str);
        this.f190539b.countDown();
    }

    public final void onSuccess() {
        this.f190538a.onSuccess();
        this.f190539b.countDown();
    }
}
