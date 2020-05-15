package p000;

import java.util.concurrent.Callable;

/* renamed from: mzn */
final /* synthetic */ class mzn implements Callable {

    /* renamed from: a */
    private final nab f35051a;

    /* renamed from: b */
    private final long f35052b;

    public mzn(nab nab, long j) {
        this.f35051a = nab;
        this.f35052b = j;
    }

    public final Object call() {
        nab nab = this.f35051a;
        long j = this.f35052b;
        mzb mzb = nab.f35103j;
        int i = -1002;
        if (mzb != null) {
            if (j == 0) {
                mzb.f35000a.mo25414c("Package %s doesn't have any backup data.", mzb.f35013n);
                mzb.f35010k.mo20338d();
            } else if (j > mzb.f35014o) {
                mzb.f35000a.mo25414c("Package %s failed pre-flight size check at %d bytes", mzb.f35013n, Long.valueOf(j));
                mzb.f35010k.mo20339e();
                mzb.mo20344a();
                i = -1005;
            } else {
                i = 0;
            }
        }
        return Integer.valueOf(i);
    }
}
