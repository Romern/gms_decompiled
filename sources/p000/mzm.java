package p000;

import java.util.concurrent.Callable;

/* renamed from: mzm */
final /* synthetic */ class mzm implements Callable {

    /* renamed from: a */
    private final nab f35049a;

    /* renamed from: b */
    private final int f35050b;

    public mzm(nab nab, int i) {
        this.f35049a = nab;
        this.f35050b = i;
    }

    public final Object call() {
        nab nab = this.f35049a;
        int i = this.f35050b;
        mzb mzb = nab.f35103j;
        int i2 = -1005;
        if (mzb != null) {
            long j = mzb.f35015p + ((long) i);
            mzb.f35015p = j;
            if (j > mzb.f35014o) {
                mzb.f35000a.mo25414c("Package %s hit quota limit (%d bytes) during upload, aborting", mzb.f35013n, Long.valueOf(mzb.f35014o));
                mzb.f35010k.mo20340f();
                mzb.mo20344a();
            } else {
                int a = mzb.f35010k.mo20332a(i);
                if (a == -1005) {
                    mzb.f35000a.mo25414c("Package %s hit server quota limit during upload, aborting", mzb.f35013n);
                    mzb.f35010k.mo20340f();
                    mzb.mo20344a();
                } else {
                    i2 = a;
                }
            }
        } else {
            i2 = -1002;
        }
        return Integer.valueOf(i2);
    }
}
