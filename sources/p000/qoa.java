package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: qoa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qoa extends djj {

    /* renamed from: a */
    public djk f41823a;

    /* renamed from: b */
    public final CountDownLatch f41824b = new CountDownLatch(1);

    /* renamed from: c */
    public int f41825c = 1;

    public qoa(djk djk) {
        this.f41823a = djk;
    }

    /* renamed from: a */
    public final void mo8635a(int i) {
        this.f41825c = i;
        this.f41824b.countDown();
    }
}
