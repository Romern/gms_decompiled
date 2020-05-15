package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: ypt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ypt {

    /* renamed from: a */
    public final long f54344a;

    /* renamed from: b */
    public int f54345b = 0;

    /* renamed from: c */
    public long f54346c;

    /* renamed from: d */
    public long f54347d;

    /* renamed from: e */
    protected final yhx f54348e;

    /* renamed from: f */
    private final float f54349f;

    /* renamed from: g */
    private final yfr f54350g;

    public ypt(yhx yhx, yfr yfr, float f, long j) {
        this.f54348e = yhx;
        this.f54350g = yfr;
        this.f54349f = f;
        this.f54344a = j;
    }

    /* renamed from: a */
    static float m44546a(float f, long j, long j2) {
        long j3 = j2 - j;
        if (j3 > 0) {
            return f / (((float) j3) / ((float) TimeUnit.MINUTES.toNanos(1)));
        }
        return -1.0f;
    }

    /* renamed from: a */
    public final void mo30652a() {
        if (this.f54346c != 0) {
            yht c = this.f54348e.mo30521c();
            c.mo30506a(this.f54350g);
            int i = this.f54345b;
            long j = this.f54346c;
            long j2 = this.f54347d;
            float f = (float) i;
            if (m44546a(f, j, j2) < this.f54349f && this.f54350g.mo30422b().mo30411c()) {
                j = j2 - Math.min(Math.max((long) ((f / this.f54349f) * ((float) TimeUnit.MINUTES.toNanos(1))), TimeUnit.MINUTES.toNanos(1)), j2 - j);
            }
            yfm.m43953a(c, j, j2);
            c.mo30503a().mo30433a(i);
            this.f54345b = 0;
        }
    }
}
