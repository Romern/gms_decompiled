package p000;

import android.os.Handler;
import java.util.concurrent.CountDownLatch;

/* renamed from: cilk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cilk implements Runnable {

    /* renamed from: a */
    public final brep f190634a;

    /* renamed from: b */
    public final Handler f190635b;

    /* renamed from: c */
    public final Runnable f190636c;

    /* renamed from: d */
    private final String f190637d;

    /* renamed from: e */
    private final brgl f190638e;

    public cilk(String str, brgl brgl, brep brep, Handler handler, Runnable runnable) {
        this.f190637d = str;
        this.f190638e = brgl;
        this.f190634a = brep;
        this.f190635b = handler;
        this.f190636c = runnable;
    }

    public final void run() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f190638e.mo69519a(this.f190637d, new cilj(this, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
        }
    }
}
