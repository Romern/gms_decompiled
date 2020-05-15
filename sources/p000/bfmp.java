package p000;

/* renamed from: bfmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfmp {

    /* renamed from: a */
    final /* synthetic */ long f114422a;

    /* renamed from: b */
    final /* synthetic */ bgdx f114423b;

    /* renamed from: c */
    final /* synthetic */ bgdw f114424c;

    public bfmp() {
    }

    /* renamed from: a */
    public final void mo61954a(bfmn bfmn) {
        bfni a = this.f114424c.mo62692a(bfmn, this.f114422a);
        if (a != null && a.mo61980a()) {
            bgdx bgdx = this.f114423b;
            double b = ayuo.m84847b(a.f114480b);
            double b2 = ayuo.m84847b(a.f114481c);
            int a2 = bfmw.m97287a(a.f114482d);
            int i = bgdx.f116194c;
            int[] iArr = bgdx.f116197f;
            if (i < iArr.length && a2 <= 5000) {
                bgdx.f116192a += b;
                bgdx.f116193b += b2;
                bgdx.f116195d[i] = b;
                bgdx.f116196e[i] = b2;
                iArr[i] = a2;
                bgdx.f116194c = i + 1;
            }
        }
    }

    public bfmp(bgdw bgdw, long j, bgdx bgdx) {
        this.f114424c = bgdw;
        this.f114422a = j;
        this.f114423b = bgdx;
    }
}
