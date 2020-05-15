package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: cibm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cibm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ cibp f189734a;

    public cibm(cibp cibp) {
        this.f189734a = cibp;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cifq.a(boolean, int, int):void
     arg types: [int, int, int]
     candidates:
      cifq.a(boolean, int, java.util.List):void
      ciho.a(boolean, int, java.util.List):void
      cifq.a(boolean, int, int):void */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b8, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bb, code lost:
        if (r6.f189672d != false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bd, code lost:
        r6.f189671c.put(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c2, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c6, code lost:
        if (r6.f189673e != null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c8, code lost:
        r1 = p000.ciam.m149928a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cd, code lost:
        r1 = p000.ciam.m149929a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d1, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d2, code lost:
        p000.ciam.m149931a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d5, code lost:
        return;
     */
    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        synchronized (this.f189734a) {
            cibp cibp = this.f189734a;
            cibp.f189740d = null;
            int i = cibp.f189745i;
            z = true;
            if (i == 2) {
                cibp.f189745i = 4;
                cibp.f189739c = cibp.f189737a.schedule(cibp.f189741e, cibp.f189744h, TimeUnit.NANOSECONDS);
                z2 = true;
            } else {
                if (i == 3) {
                    cibp.f189740d = cibp.f189737a.schedule(cibp.f189742f, cibp.f189743g - cibp.f189738b.mo66928a(TimeUnit.NANOSECONDS), TimeUnit.NANOSECONDS);
                    this.f189734a.f189745i = 2;
                }
                z2 = false;
            }
        }
        if (z2) {
            cibo cibo = this.f189734a.f189746j;
            chyc chyc = cibo.f189736a;
            cibn cibn = new cibn(cibo);
            bqfb bqfb = bqfb.INSTANCE;
            synchronized (((cigh) chyc).f190115j) {
                if (((cigh) chyc).f190113h != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                bmxy.m108600b(z3);
                if (((cigh) chyc).f190123r) {
                    ciam.m149930a(cibn, bqfb, ((cigh) chyc).mo86065e());
                    return;
                }
                ciam ciam = ((cigh) chyc).f190122q;
                if (ciam != null) {
                    j = 0;
                    z = false;
                } else {
                    j = ((cigh) chyc).f190110e.nextLong();
                    bmza a = bmza.m108656a();
                    a.mo66930d();
                    ciam ciam2 = new ciam(j, a);
                    ((cigh) chyc).f190122q = ciam2;
                    ((cigh) chyc).f190097D.f190004f++;
                    ciam = ciam2;
                }
                if (z) {
                    ((cigh) chyc).f190113h.mo86037a(false, (int) (j >>> 32), (int) j);
                }
            }
        }
    }
}
