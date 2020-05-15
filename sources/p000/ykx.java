package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

/* renamed from: ykx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ykx extends yjd {

    /* renamed from: h */
    private final long f53998h;

    protected ykx(ykv ykv) {
        super(ykv);
        this.f53998h = ykv.f53992l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Iterable mo30591a(Iterable iterable) {
        return iterable;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ykw.a(int, long):void
     arg types: [int, int]
     candidates:
      ykw.a(long, long):void
      ykw.a(int, long):void */
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final ygx mo30567c(List list, yhg yhg, yhy yhy) {
        List arrayList;
        TreeSet treeSet = new TreeSet(yjc.f53914a);
        ypq.m44537a();
        List d = mo30592d(list, yhg, yhy);
        while (true) {
            arrayList = new ArrayList();
            for (List list2 : bnkn.m109667a(bngx.m109368a((Collection) bnkn.m109668a(d, ykt.f53990a)), 100)) {
                ykw ykw = new ykw(list2, this.f53998h);
                ykw.mo30590a(0, Long.MAX_VALUE);
                arrayList.add(ykw.f53993a);
            }
            if (arrayList.size() <= 1) {
                break;
            }
            d = arrayList;
        }
        for (yhu yhu : mo30591a((Iterable) bnjd.m109587b(arrayList))) {
            long b = yhu.mo30387b();
            yfw yfw = (yfw) yhg;
            if (yfw.f53737a <= b && b <= yfw.f53738b) {
                treeSet.add(new yjc(yfv.m44005a(yhu.mo30387b(), yhu.mo30387b()), yhu));
            }
        }
        return mo30563a(treeSet, yhg);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.List, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* access modifiers changed from: protected */
    /* renamed from: d */
    public bngx mo30592d(List list, yhg yhg, yhy yhy) {
        return bngx.m109355a(bnjd.m109575a((Iterable) list, yku.f53991a));
    }
}
