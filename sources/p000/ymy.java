package p000;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

/* renamed from: ymy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ymy extends ykp {

    /* renamed from: j */
    public static final /* synthetic */ int f54118j = 0;

    public ymy(ymx ymx) {
        super(ymx);
    }

    /* renamed from: a */
    private static float m44395a(yhu yhu) {
        return yhu.mo30510b(0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [bngx, bmxz]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* renamed from: b */
    public final ygx mo30565b(List list, yhg yhg, yhy yhy) {
        ygx b = super.mo30565b(list, yhg, yhy);
        ygx a = yjy.m44261a(list, "com.google.calories.bmr");
        if (a == null) {
            return b;
        }
        bnre i = bngx.m109355a(bnjd.m109586b((Iterable) a.mo30473a(), ymw.f54117a)).listIterator();
        if (!i.hasNext()) {
            return b;
        }
        float a2 = m44395a((yhu) i.next());
        yhx a3 = yhy.m44167a(b.mo30474b());
        TreeSet treeSet = new TreeSet(yfp.f53730a);
        treeSet.addAll(b.mo30473a());
        bnrc c = bnrc.m110157c();
        c.mo67354a(bnoa.f131890a);
        yfw yfw = (yfw) yhg;
        c.mo67355b(bnoa.m109932b(Long.valueOf(yfw.f53737a), Long.valueOf(yfw.f53738b)));
        bnre i2 = b.mo30473a().listIterator();
        while (i2.hasNext()) {
            yhu yhu = (yhu) i2.next();
            c.mo67354a(bnoa.m109932b(Long.valueOf(yhu.mo30385a()), Long.valueOf(yhu.mo30387b())));
        }
        for (bnoa bnoa : c.mo68182b().mo68181a()) {
            yhu b2 = yfp.m43971b(i, ((Long) bnoa.mo68172b()).longValue());
            if (b2 != null) {
                a2 = m44395a(b2);
            }
            yht a4 = a3.mo30519a();
            yfm.m43953a(a4, ((Long) bnoa.mo68172b()).longValue(), ((Long) bnoa.mo68176e()).longValue());
            a4.mo30503a().mo30432a((double) ((((float) (((Long) bnoa.mo68176e()).longValue() - ((Long) bnoa.mo68172b()).longValue())) * a2) / ((float) TimeUnit.DAYS.toNanos(1))));
            treeSet.add(a4.mo30508c());
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            yfp.m43965a(a3, (yhu) it.next());
        }
        return a3.mo30520b();
    }
}
