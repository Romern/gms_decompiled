package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* renamed from: ymk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ymk {

    /* renamed from: a */
    private static final bnic f54092a = bnic.m109489a((Object) 3);

    /* renamed from: a */
    public static bngx m44367a(Iterable iterable, yhg yhg) {
        ylo ylo = new ylo(iterable);
        yfw yfw = (yfw) yhg;
        long j = yfw.f53737a;
        ylo.f54042b = j;
        ylo.mo30599a(0, j, yfw.f53738b);
        return ylo.f54041a.mo67664a();
    }

    /* renamed from: a */
    private static bngx m44368a(SortedSet sortedSet, bnoc bnoc, Iterable iterable, Set set) {
        bngx bngx;
        bnoc bnoc2;
        bnoc bnoc3 = bnoc;
        if (iterable == null) {
            return bngx.m109376e();
        }
        bngs j = bngx.m109377j();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            yhu yhu = (yhu) it.next();
            long a = yhu.mo30385a();
            long b = yhu.mo30387b();
            if (b < a) {
                ypq.m44539a("Data point has end before start: %s", yhu);
            } else if (set.contains(Integer.valueOf(yhu.mo30517j()))) {
                j.mo67668c(yhu);
            } else {
                bnoa a2 = bnoa.m109929a(Long.valueOf(a), Long.valueOf(b));
                if (bnoc3.mo68183c(a2)) {
                    bngx = bngx.m109376e();
                } else {
                    bngs j2 = bngx.m109377j();
                    if (!a2.equals(bnoa.f131890a)) {
                        bnoc2 = new bnrc(new bnrb(bnoa.f131890a, a2, ((bnrc) bnoc3).f132026a));
                    } else {
                        bnoc2 = bnoc3;
                    }
                    for (bnoa bnoa : bnoc2.mo68182b().mo68181a()) {
                        if (!bnoa.mo68169a() && !bnoa.mo68175d()) {
                            bnoa = a2;
                        } else if (!bnoa.mo68169a()) {
                            if (a < ((Long) bnoa.mo68176e()).longValue()) {
                                bnoa = bnoa.m109929a(Long.valueOf(a), (Long) bnoa.mo68176e());
                            }
                        } else if (!bnoa.mo68175d()) {
                            if (b > ((Long) bnoa.mo68172b()).longValue()) {
                                bnoa = bnoa.m109929a((Long) bnoa.mo68172b(), Long.valueOf(b));
                            }
                        }
                        j2.mo67668c(bnoa);
                    }
                    bngx = j2.mo67664a();
                }
                bnre i = bngx.listIterator();
                while (i.hasNext()) {
                    bnoa bnoa2 = (bnoa) i.next();
                    bnoc3.mo67354a(bnoa2);
                    sortedSet.add(new yjc(yfv.m44005a(((Long) bnoa2.mo68172b()).longValue(), ((Long) bnoa2.mo68176e()).longValue()), yhu));
                }
            }
        }
        return j.mo67664a();
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List, java.lang.Object, java.lang.Iterable], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static ygx m44369a(Iterable r7, yhg yhg, yhx yhx) {
        bmxy.m108581a((Object) r7);
        TreeSet<yjc> treeSet = new TreeSet(yjc.f53914a);
        bnrc c = bnrc.m110157c();
        yfw yfw = (yfw) yhg;
        c.mo67354a(bnoa.m109926a((Comparable) Long.valueOf(yfw.f53737a)));
        c.mo67354a(bnoa.m109930b(Long.valueOf(yfw.f53738b)));
        ArrayList arrayList = new ArrayList();
        int size = r7.size();
        for (int i = 0; i < size; i++) {
            arrayList.addAll(m44368a(treeSet, c, (Iterable) r7.get(i), f54092a));
        }
        m44368a(treeSet, c, arrayList, bnon.f131923a);
        for (yjc yjc : treeSet) {
            yhu yhu = yjc.f53916c;
            yfw yfw2 = (yfw) yjc.f53915b;
            long j = yfw2.f53737a;
            long j2 = yfw2.f53738b;
            if (j == 0) {
                j = yhu.mo30385a();
            }
            if (j2 == 0) {
                j2 = yhu.mo30387b();
            }
            yht c2 = yhx.mo30521c();
            yfm.m43953a(c2, j, j2);
            c2.mo30506a(yhu.mo30511d());
            c2.mo30503a().mo30433a(yhu.mo30517j());
        }
        return yhx.mo30520b();
    }
}
