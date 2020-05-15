package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: ahnj */
final /* synthetic */ class ahnj implements Runnable {

    /* renamed from: a */
    private final ahnp f67622a;

    /* renamed from: b */
    private final ahkv f67623b;

    /* renamed from: c */
    private final String f67624c;

    /* renamed from: d */
    private final CountDownLatch f67625d;

    public ahnj(ahnp ahnp, ahkv ahkv, String str, CountDownLatch countDownLatch) {
        this.f67622a = ahnp;
        this.f67623b = ahkv;
        this.f67624c = str;
        this.f67625d = countDownLatch;
    }

    public final void run() {
        ahnp ahnp = this.f67622a;
        ahkv ahkv = this.f67623b;
        String str = this.f67624c;
        CountDownLatch countDownLatch = this.f67625d;
        ahnp.mo36893a(ahkv, str, false);
        countDownLatch.countDown();
    }
}
