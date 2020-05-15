package p000;

import java.util.Comparator;
import java.util.concurrent.ExecutionException;

/* renamed from: knr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class knr implements klx {

    /* renamed from: a */
    private final bngx f24540a;

    /* renamed from: b */
    private final boolean f24541b;

    /* renamed from: c */
    private final kli f24542c;

    public knr(kkp kkp, Iterable iterable) {
        this.f24540a = bngx.m109355a(iterable);
        this.f24541b = kkp.mo14606x();
        this.f24542c = kkp.mo14608z().mo14627a(getClass());
    }

    /* renamed from: a */
    public final bqgg mo14691a(klu klu, bqgj bqgj) {
        if (this.f24541b) {
            return bqgj.mo25819b(new kno(this, klu, bqgj));
        }
        return bqga.m112775a(mo14692a(klu));
    }

    /* renamed from: b */
    public final void mo14694b(kjx kjx) {
        bnre i = this.f24540a.listIterator();
        while (i.hasNext()) {
            ((klx) i.next()).mo14694b(kjx);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bngx.a(java.util.Comparator, java.lang.Iterable):bngx
     arg types: [knp, bngx]
     candidates:
      bngx.a(java.lang.Object, java.lang.Object):bngx
      bngx.a(java.lang.Object[], int):int
      bngx.a(int, int):bngx
      bngm.a(java.lang.Object[], int):int
      bngx.a(java.util.Comparator, java.lang.Iterable):bngx */
    /* renamed from: a */
    public final klw mo14692a(klu klu) {
        if (this.f24541b) {
            return mo14727a(klu, bmvz.f131120a);
        }
        bnha h = bnhe.m109414h();
        bnre i = klu.f24439a.listIterator();
        int i2 = 0;
        while (i.hasNext()) {
            h.mo67695b((kom) i.next(), Integer.valueOf(i2));
            i2++;
        }
        bnhe b = h.mo67618b();
        bngx bngx = klu.f24439a;
        bngs j = bngx.m109377j();
        bmxv bmxv = bmvz.f131120a;
        bngs j2 = bngx.m109377j();
        bnre i3 = this.f24540a.listIterator();
        while (i3.hasNext()) {
            klx klx = (klx) i3.next();
            if (bngx.isEmpty()) {
                break;
            }
            klw a = klx.mo14692a(klu.mo14689a(bngx));
            if (!bmxv.mo66813a()) {
                bmxv = a.f24446d;
            }
            j.mo67666b((Iterable) a.f24443a);
            bngx bngx2 = a.f24444b;
            j2.mo67666b((Iterable) a.f24445c);
            bngx = bngx2;
        }
        return new klw(bngx.m109369a((Comparator) new knp(b), (Iterable) j.mo67664a()), bngx, bmxv, j2.mo67664a());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bngx.a(java.util.Comparator, java.lang.Iterable):bngx
     arg types: [knq, bngx]
     candidates:
      bngx.a(java.lang.Object, java.lang.Object):bngx
      bngx.a(java.lang.Object[], int):int
      bngx.a(int, int):bngx
      bngm.a(java.lang.Object[], int):int
      bngx.a(java.util.Comparator, java.lang.Iterable):bngx */
    /* renamed from: a */
    public final klw mo14727a(klu klu, bmxv bmxv) {
        int i;
        klw klw;
        bngx bngx = klu.f24439a;
        bngs j = bngx.m109377j();
        bmxv bmxv2 = bmvz.f131120a;
        bngs j2 = bngx.m109377j();
        bnre i2 = this.f24540a.listIterator();
        while (true) {
            if (!i2.hasNext()) {
                break;
            }
            klx klx = (klx) i2.next();
            if (bngx.isEmpty()) {
                break;
            }
            if (bmxv.mo66813a()) {
                try {
                    klw = (klw) klx.mo14691a(klu.mo14689a(bngx), (bqgj) bmxv.mo66814b()).get();
                } catch (InterruptedException | ExecutionException e) {
                    this.f24542c.mo14629a(e, "Failed to generate result from delegate processor.", new Object[0]);
                }
            } else {
                klw = klx.mo14692a(klu.mo14689a(bngx));
            }
            if (!bmxv2.mo66813a()) {
                bmxv2 = klw.f24446d;
            }
            j.mo67666b((Iterable) klw.f24443a);
            bngx = klw.f24444b;
            j2.mo67666b((Iterable) klw.f24445c);
        }
        bngx bngx2 = klu.f24439a;
        bnha h = bnhe.m109414h();
        for (i = 0; i < bngx2.size(); i++) {
            h.mo67695b((kom) bngx2.get(i), Integer.valueOf(i));
        }
        bnhe b = h.mo67618b();
        return new klw(bngx.m109369a((Comparator) new knq(b), (Iterable) j.mo67664a()), bngx, bmxv2, j2.mo67664a());
    }

    /* renamed from: a */
    public final void mo14693a(kjx kjx) {
        bnre i = this.f24540a.listIterator();
        while (i.hasNext()) {
            ((klx) i.next()).mo14693a(kjx);
        }
    }
}
