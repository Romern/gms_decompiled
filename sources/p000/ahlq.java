package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: ahlq */
final /* synthetic */ class ahlq implements Runnable {

    /* renamed from: a */
    private final ahmn f67471a;

    /* renamed from: b */
    private final String f67472b;

    /* renamed from: c */
    private final ahkv f67473c;

    /* renamed from: d */
    private final CountDownLatch f67474d;

    public ahlq(ahmn ahmn, String str, ahkv ahkv, CountDownLatch countDownLatch) {
        this.f67471a = ahmn;
        this.f67472b = str;
        this.f67473c = ahkv;
        this.f67474d = countDownLatch;
    }

    public final void run() {
        ahmn ahmn = this.f67471a;
        String str = this.f67472b;
        ahkv ahkv = this.f67473c;
        CountDownLatch countDownLatch = this.f67474d;
        ahfi ahfi = (ahfi) ahmn.f67552i.remove(str);
        if (ahfi != null) {
            ahfi.mo36396b();
        }
        ahmn.mo36852b(ahkv, str);
        countDownLatch.countDown();
    }
}
