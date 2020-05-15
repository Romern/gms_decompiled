package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ypn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ypn implements ypj {

    /* renamed from: a */
    private final long f54337a;

    /* renamed from: c */
    private final float f54338c;

    public ypn(long j, float f) {
        this.f54337a = j;
        this.f54338c = f;
    }

    /* renamed from: a */
    public static boolean m44532a(yhu yhu) {
        return yhu.mo30515h() == 4 && yhu.mo30509a(3).mo30437d();
    }

    /* renamed from: a */
    private final boolean m44533a(yhu yhu, yhu yhu2) {
        return (yhu == null || yhu2 == null || yhf.m44096c(yhu2) - yhf.m44096c(yhu) >= this.f54337a) ? false : true;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Iterable mo30649a(Iterable iterable) {
        yhu yhu;
        yhu yhu2;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        bnrd b = bnjr.m109617b(iterable.iterator(), ypm.f54336a);
        if (b.hasNext()) {
            yhu = (yhu) b.next();
        } else {
            yhu = null;
        }
        yhu yhu3 = null;
        while (it.hasNext()) {
            yhu yhu4 = (yhu) it.next();
            if (m44532a(yhu4)) {
                if (b.hasNext()) {
                    yhu2 = (yhu) b.next();
                } else {
                    yhu2 = null;
                }
                arrayList.add(yhu4);
                yhu3 = yhu4;
            } else if (!m44533a(yhu3, yhu4) && !m44533a(yhu4, yhu)) {
                yfu a = yhu4.mo30509a(2);
                if (a.mo30437d() && a.mo30435b() < ((double) this.f54338c)) {
                    arrayList.add(yhu4);
                }
            }
        }
        return arrayList;
    }
}
