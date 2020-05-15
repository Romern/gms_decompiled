package p000;

import android.os.SystemClock;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: aabx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aabx implements aabt {

    /* renamed from: a */
    public final int f27904a;

    /* renamed from: b */
    public final int f27905b;

    /* renamed from: c */
    public final int f27906c;

    /* renamed from: d */
    public final AtomicInteger f27907d = new AtomicInteger();

    /* renamed from: e */
    private final Executor f27908e;

    /* renamed from: f */
    private final Random f27909f;

    /* renamed from: g */
    private final sgf f27910g;

    /* renamed from: h */
    private volatile long f27911h;

    public aabx(Executor executor, Random random, int i, int i2, sgf sgf) {
        this.f27908e = executor;
        this.f27909f = random;
        this.f27904a = i;
        this.f27905b = i2;
        this.f27906c = (i2 / i) + 1;
        this.f27910g = sgf;
    }

    /* renamed from: a */
    public final blji mo16701a(bljb bljb) {
        return new aabu(this, SystemClock.uptimeMillis(), bljb);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        if (r0 <= ((r5 + r5) + 100)) goto L_0x0045;
     */
    /* renamed from: a */
    public final void mo16705a(long j) {
        long uptimeMillis = SystemClock.uptimeMillis() - j;
        if (uptimeMillis < ((long) this.f27906c) ? this.f27909f.nextInt(this.f27904a) == 0 : ((long) this.f27909f.nextInt(this.f27905b)) < uptimeMillis) {
            if (!this.f27910g.mo25492a()) {
                long j2 = this.f27911h;
            }
            this.f27911h = uptimeMillis;
            this.f27908e.execute(new aabw(this, uptimeMillis));
            return;
        }
        this.f27907d.incrementAndGet();
    }

    /* renamed from: a */
    public final void mo16702a(bljb bljb, bqgg bqgg) {
        bqgg.mo741a(bljx.m107269a(new aabv(this, SystemClock.uptimeMillis())), bqfb.INSTANCE);
        bljb.mo66586a(bqgg);
    }
}
