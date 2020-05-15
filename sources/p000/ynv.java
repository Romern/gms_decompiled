package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: ynv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ynv {

    /* renamed from: a */
    private final ypj f54242a;

    /* renamed from: b */
    private final long f54243b;

    /* renamed from: c */
    private final long f54244c;

    public ynv(long j, long j2, ypj ypj) {
        this.f54243b = j;
        this.f54242a = ypj;
        this.f54244c = j2;
    }

    /* renamed from: a */
    private static void m44458a(ynu ynu, yhx yhx) {
        yht c = yhx.mo30521c();
        yfm.m43953a(c, ynu.f54238a, ynu.f54239b);
        c.mo30506a(ynu.f54241d);
        c.mo30503a().mo30432a((double) ynu.f54240c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30638a(List list, yhx yhx, yhg yhg) {
        long j;
        long j2;
        yhx yhx2 = yhx;
        yhg yhg2 = yhg;
        Iterable a = this.f54242a.mo30649a(list);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = a.iterator();
        ynu ynu = null;
        yhu yhu = null;
        while (true) {
            j = 0;
            if (!it.hasNext()) {
                break;
            }
            yhu yhu2 = (yhu) it.next();
            if (yhu != null && yfp.m43973b(yhu, yhg2) && yfp.m43973b(yhu2, yhg2)) {
                long b = yhf.m44095b(yhu2, TimeUnit.SECONDS) - yhf.m44095b(yhu, TimeUnit.SECONDS);
                if (b < 0) {
                    ypq.m44539a("Location data points out of order, prev: %s, next %s", yhu, yhu2);
                } else if (b <= this.f54244c) {
                    arrayList.add(new ynu(yhu.mo30387b(), yhu2.mo30387b(), ypk.m44526a(yhu, yhu2), yhu.mo30511d()));
                }
            }
            yhu = yhu2;
        }
        int size = arrayList.size();
        long j3 = 0;
        int i = 0;
        while (i < size) {
            ynu ynu2 = (ynu) arrayList.get(i);
            long j4 = this.f54243b;
            if (j4 != j) {
                j2 = TimeUnit.NANOSECONDS.toSeconds(ynu2.f54239b) / j4;
            } else {
                j2 = ynu2.f54239b;
            }
            if (ynu != null) {
                if (j2 == j3) {
                    if (ynu2.f54238a != ynu.f54239b) {
                        ypq.m44538a("Merging non-contiguous distance points: %s and %s", Level.WARNING, "Merging non-contiguous distance points: %s and %s", ynu, ynu2);
                    } else {
                        ynu.f54239b = ynu2.f54239b;
                        ynu.f54240c += ynu2.f54240c;
                        i++;
                        j = 0;
                    }
                }
                m44458a(ynu, yhx2);
            }
            j3 = j2;
            ynu = ynu2;
            i++;
            j = 0;
        }
        if (ynu != null) {
            m44458a(ynu, yhx2);
        }
    }
}
