package p000;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* renamed from: yqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yqb {

    /* renamed from: a */
    public static final yjw f54372a = new yjw(1);

    /* renamed from: b */
    private final ypv f54373b;

    public yqb(ypv ypv) {
        this.f54373b = ypv;
    }

    /* renamed from: a */
    private static int m44564a(caaq caaq) {
        if (caaq == null) {
            return caap.UNKNOWN.f172355h;
        }
        caap a = caap.m126421a(caaq.f172360c);
        if (a == null) {
            a = caap.UNKNOWN;
        }
        return a.f172355h;
    }

    /* renamed from: b */
    private static yfr m44569b(yhu yhu) {
        return yhu.mo30511d() == null ? yhu.f53838b : yhu.mo30511d();
    }

    /* renamed from: a */
    private static caaq m44565a(yhu yhu) {
        return m44569b(yhu).mo30428g();
    }

    /* renamed from: a */
    public static void m44566a(yhx yhx, Iterator it, yhg yhg) {
        while (it.hasNext()) {
            m44568a(yhx, (yhu) it.next(), yhg);
        }
    }

    /* renamed from: a */
    private static void m44567a(yhx yhx, List list, yhg yhg) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m44568a(yhx, (yhu) list.get(i), yhg);
        }
    }

    /* renamed from: a */
    public static void m44568a(yhx yhx, yhu yhu, yhg yhg) {
        yfw yfw = (yfw) yhg;
        if (yhu.mo30385a() >= yfw.f53737a && yhu.mo30387b() <= yfw.f53738b) {
            yfp.m43965a(yhx, yhu);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    /* renamed from: a */
    public final yhu mo30656a(Iterator it) {
        while (it.hasNext()) {
            yhu yhu = (yhu) it.next();
            int j = yhu.mo30517j();
            if (this.f54373b.mo30653a(j) || this.f54373b.mo30655b(j)) {
                return yhu;
            }
            while (it.hasNext()) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo30657a(yhx yhx, yhu yhu, List list, yhg yhg) {
        if (yhu != null) {
            int j = yhu.mo30517j();
            caaq a = m44565a(yhu);
            TreeSet treeSet = new TreeSet(yfp.f53730a);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                yhu yhu2 = (yhu) list.get(i);
                if (yfs.m43996c(yhu2.mo30511d())) {
                    treeSet.add(yhu2);
                }
            }
            if (m44564a(a) == caap.WATCH.f172355h) {
                m44567a(yhx, list, yhg);
            } else if (!this.f54373b.mo30655b(j)) {
                m44567a(yhx, list, yhg);
            } else {
                if (j == 0 && m44569b(yhu).mo30422b().mo30411c() && a != null) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        yhu yhu3 = (yhu) list.get(i2);
                        caaq a2 = m44565a(yhu3);
                        if (!(a.equals(a2) || caap.TABLET.f172355h == m44564a(a2) || caap.PHONE.f172355h == m44564a(a2))) {
                            treeSet.add(yhu3);
                        }
                    }
                }
                m44566a(yhx, treeSet.iterator(), yhg);
            }
        } else {
            m44567a(yhx, list, yhg);
        }
        list.clear();
    }
}
