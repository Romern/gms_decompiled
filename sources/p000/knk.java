package p000;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: knk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class knk implements klx {

    /* renamed from: a */
    public final kli f24527a;

    /* renamed from: b */
    private final bngx f24528b;

    public knk(kkp kkp, Iterable iterable) {
        this.f24528b = bngx.m109355a(iterable);
        this.f24527a = kkp.mo14608z().mo14627a(getClass());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bngx.a(java.util.Comparator, java.lang.Iterable):bngx
     arg types: [knj, java.util.Collection]
     candidates:
      bngx.a(java.lang.Object, java.lang.Object):bngx
      bngx.a(java.lang.Object[], int):int
      bngx.a(int, int):bngx
      bngm.a(java.lang.Object[], int):int
      bngx.a(java.util.Comparator, java.lang.Iterable):bngx */
    /* renamed from: a */
    public static klw m18198a(klu klu, List list) {
        int i;
        bnha h = bnhe.m109414h();
        bnre i2 = klu.f24439a.listIterator();
        int i3 = 0;
        int i4 = 0;
        while (i2.hasNext()) {
            h.mo67695b((kom) i2.next(), Integer.valueOf(i4));
            i4++;
        }
        bnhe b = h.mo67618b();
        bngs j = bngx.m109377j();
        bmxv bmxv = bmvz.f131120a;
        HashSet hashSet = new HashSet(klu.f24439a);
        HashMap hashMap = new HashMap();
        int size = list.size();
        while (i3 < size) {
            klw klw = (klw) list.get(i3);
            j.mo67666b((Iterable) klw.f24445c);
            if (!bmxv.mo66813a()) {
                bmxv = klw.f24446d;
            }
            bnre i5 = klw.f24443a.listIterator();
            while (true) {
                i = i3 + 1;
                if (!i5.hasNext()) {
                    break;
                }
                kjl kjl = (kjl) i5.next();
                kom a = kjl.mo14516a();
                kjl kjl2 = (kjl) hashMap.get(a);
                if (kjl2 != null) {
                    kjk f = kjl2.mo14534f();
                    f.mo14525a(kjl.mo14517b());
                    kjl = f.mo14524a();
                }
                hashMap.put(a, kjl);
                hashSet.remove(a);
            }
            i3 = i;
        }
        return new klw(bngx.m109369a((Comparator) new knj(b), (Iterable) hashMap.values()), hashSet, bmxv, j.mo67664a());
    }

    /* renamed from: b */
    public final void mo14694b(kjx kjx) {
        bnre i = this.f24528b.listIterator();
        while (i.hasNext()) {
            ((klx) i.next()).mo14694b(kjx);
        }
    }

    /* renamed from: a */
    public final bqgg mo14691a(klu klu, bqgj bqgj) {
        ArrayList arrayList = new ArrayList();
        bnre i = this.f24528b.listIterator();
        while (i.hasNext()) {
            arrayList.add(((klx) i.next()).mo14691a(klu, bqgj));
        }
        return bqga.m112782b(arrayList).mo69214a(new kni(this, arrayList, klu), bqgj);
    }

    /* renamed from: a */
    public final klw mo14692a(klu klu) {
        bngs b = bngx.m109371b(this.f24528b.size());
        bnre i = this.f24528b.listIterator();
        while (i.hasNext()) {
            b.mo67668c(((klx) i.next()).mo14692a(klu));
        }
        return m18198a(klu, b.mo67664a());
    }

    /* renamed from: a */
    public final void mo14693a(kjx kjx) {
        bnre i = this.f24528b.listIterator();
        while (i.hasNext()) {
            ((klx) i.next()).mo14693a(kjx);
        }
    }
}
