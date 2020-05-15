package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: ylb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ylb implements yln {

    /* renamed from: a */
    private final ynm f54017a;

    public ylb(ynm ynm) {
        this.f54017a = ynm;
    }

    /* renamed from: b */
    public final String mo30564b() {
        return this.f54017a.mo30607d();
    }

    /* renamed from: e */
    public final List mo30571e(List list, yhg yhg, yhy yhy) {
        ynm ynm = this.f54017a;
        bnmu a = m44310a(ynm, list, yla.f54016a);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : a.mo67318q().entrySet()) {
            ygx a2 = ynm.mo30604a(entry.getKey(), (Iterable) entry.getValue(), yhg, yhy);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List, java.lang.Iterable], assign insn: null */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnmu.a(java.lang.Object, java.lang.Iterable):void
     arg types: [java.lang.Object, java.util.HashSet]
     candidates:
      bndq.a(java.lang.Object, java.util.Collection):java.util.Collection
      bndd.a(bndd, int):void
      bndd.a(java.lang.Object, java.util.Collection):java.util.Collection
      bndd.a(java.lang.Object, java.lang.Object):boolean
      bndl.a(java.lang.Object, java.lang.Object):boolean
      bnmu.a(java.lang.Object, java.lang.Object):boolean
      bnmu.a(java.lang.Object, java.lang.Object):boolean
      bnmu.a(java.lang.Object, java.lang.Iterable):void */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    private static bnmu m44310a(ynm ynm, Iterable r9, bmxj bmxj) {
        bndu r = bndu.m109109r();
        int size = r9.size();
        for (int i = 0; i < size; i++) {
            Object obj = r9.get(i);
            r.mo67268a(((yfr) bmxj.apply(obj)).mo30423c(), obj);
        }
        bnge s = bnge.m109299s();
        HashSet hashSet = new HashSet();
        bnre i2 = ynm.mo30606c().listIterator();
        while (i2.hasNext()) {
            ygz ygz = (ygz) i2.next();
            for (Object obj2 : r.mo67127c(ygz.f53800e)) {
                yfr yfr = (yfr) bmxj.apply(obj2);
                if (ygz.f53805j) {
                    hashSet.add(obj2);
                } else {
                    s.mo67268a(ynm.mo30587a(yfr), obj2);
                }
            }
        }
        for (Object obj3 : s.mo67316o()) {
            s.mo67308a(obj3, (Iterable) hashSet);
        }
        return s;
    }

    /* renamed from: a */
    public final bngx mo30552a() {
        bngx c = this.f54017a.mo30606c();
        bnre i = c.listIterator();
        while (i.hasNext()) {
            ygz ygz = (ygz) i.next();
            boolean z = ygz.f53804i;
            String b = mo30564b();
            if (!(!z)) {
                throw new bmzt(bmzh.m108675a("isOneOutputPerInputDataSource is not used in evaluating ShardableTransformation: %s %s", b, ygz));
            }
        }
        return c;
    }

    /* renamed from: a */
    public final bngx mo30570a(List list) {
        ynm ynm = this.f54017a;
        if (list == null || list.isEmpty()) {
            return bngx.m109356a(ynm.mo30588a());
        }
        bnmu a = m44310a(ynm, list, bmxl.INSTANCE);
        bngs b = bngx.m109371b(((bndd) a).f131478b);
        for (Map.Entry entry : a.mo67318q().entrySet()) {
            yfr a2 = ynm.mo30603a(entry.getKey(), (Iterable) entry.getValue());
            if (a2 != null) {
                b.mo67668c(a2);
            }
        }
        return b.mo67664a();
    }
}
