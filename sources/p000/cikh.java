package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: cikh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cikh {

    /* renamed from: g */
    public static final /* synthetic */ int f190511g = 0;

    /* renamed from: a */
    public cijx f190512a;

    /* renamed from: b */
    public cijx f190513b;

    /* renamed from: c */
    public cijx f190514c;

    /* renamed from: d */
    public cijx f190515d;

    /* renamed from: e */
    public cijx f190516e;

    /* renamed from: f */
    public cijx f190517f;

    static {
        cikh.class.getSimpleName();
    }

    /* renamed from: a */
    public final cijx mo86213a(cijs cijs) {
        this.f190512a = new cijx();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        cijs.mo49979a(new cijz(this, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            this.f190512a.f190484a = new bres(cijw.QUICPAY_UNKNOWN_ERROR);
        }
        return this.f190512a;
    }
}
