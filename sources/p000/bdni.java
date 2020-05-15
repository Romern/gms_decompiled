package p000;

import java.util.List;

/* renamed from: bdni */
final /* synthetic */ class bdni implements Runnable {

    /* renamed from: a */
    private final bdnm f106062a;

    /* renamed from: b */
    private final bdnd f106063b;

    public bdni(bdnm bdnm, bdnd bdnd) {
        this.f106062a = bdnm;
        this.f106063b = bdnd;
    }

    public final void run() {
        bdnd[] bdndArr;
        bdnm bdnm = this.f106062a;
        bdnd bdnd = this.f106063b;
        try {
            bdnd.m91133a(bdnd, bdnm.f106070b);
            synchronized (bdnm.f106071c) {
                bdnm.f106074f.add(bdnd);
                if (bdnm.f106074f.size() >= bdnm.f106072d) {
                    List list = bdnm.f106074f;
                    bdndArr = (bdnd[]) list.toArray(new bdnd[list.size()]);
                    bdnm.f106074f.clear();
                } else {
                    bdndArr = null;
                }
            }
            if (bdndArr != null) {
                bdnm.f106069a.mo58102a(bdnm.f106073e.mo58205a(bdndArr));
            }
            bdnm.f106075g.decrementAndGet();
        } catch (Throwable th) {
            bdnm.f106075g.decrementAndGet();
            throw th;
        }
    }
}
