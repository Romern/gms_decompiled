package p000;

import java.util.Random;
import java.util.concurrent.Callable;

/* renamed from: mzk */
final /* synthetic */ class mzk implements Callable {

    /* renamed from: a */
    private final nab f35044a;

    public mzk(nab nab) {
        this.f35044a = nab;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    public final Object call() {
        long j;
        nab nab = this.f35044a;
        if (nab.mo20386g()) {
            j = cclp.m130472b();
        } else {
            myz myz = nab.f35118y;
            long c = ccnf.m130734c();
            long G = ccnf.f179489a.mo6606a().mo76413G() * 1000;
            myz.f34996a.mo3199a(0);
            long a = myz.mo20341a(myz.f34996a.mo3197a(myz.f34997b) - System.currentTimeMillis(), Long.MAX_VALUE);
            j = Math.min(Math.max(G, a) + ((long) new Random(System.currentTimeMillis()).nextInt((int) Math.min(myz.mo20341a((a + a) - G, a) + 1, 2147483647L))), c * 1000);
        }
        return Long.valueOf(j);
    }
}
