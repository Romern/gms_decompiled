package p000;

import com.felicanetworks.mfc.mfi.CardDeleteEventCallback;
import java.util.concurrent.CountDownLatch;

/* renamed from: cikg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cikg implements CardDeleteEventCallback {

    /* renamed from: a */
    final /* synthetic */ CountDownLatch f190509a;

    /* renamed from: b */
    final /* synthetic */ cikh f190510b;

    public cikg(cikh cikh, CountDownLatch countDownLatch) {
        this.f190510b = cikh;
        this.f190509a = countDownLatch;
    }

    public final void onError(int i, String str) {
        int i2 = cikh.f190511g;
        this.f190510b.f190517f.f190484a = new bres(brez.m113953a(i, str));
        this.f190509a.countDown();
    }

    public final void onSuccess() {
        int i = cikh.f190511g;
        this.f190509a.countDown();
    }
}
