package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: kob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kob implements klx {

    /* renamed from: a */
    private final bngx f24565a;

    /* renamed from: b */
    private final int f24566b;

    /* renamed from: c */
    private final kkp f24567c;

    public kob(Iterable iterable, int i, kkp kkp) {
        this.f24565a = bngx.m109355a(iterable);
        this.f24566b = i;
        this.f24567c = kkp;
    }

    /* renamed from: a */
    public final bqgg mo14691a(klu klu, bqgj bqgj) {
        return klr.m18129a(this, klu, bqgj);
    }

    /* renamed from: a */
    public final void mo14693a(kjx kjx) {
    }

    /* renamed from: b */
    public final void mo14694b(kjx kjx) {
    }

    /* renamed from: a */
    public final klw mo14692a(klu klu) {
        int i;
        bngx bngx;
        bmxv bmxv;
        bnre i2 = this.f24565a.listIterator();
        while (i2.hasNext()) {
            bnre i3 = ((koc) i2.next()).f24569b.listIterator();
            while (i3.hasNext()) {
                ((kny) i3.next()).mo14731a();
            }
        }
        bngs j = bngx.m109377j();
        bngs j2 = bngx.m109377j();
        bnre i4 = klu.f24439a.listIterator();
        while (true) {
            if (!i4.hasNext()) {
                break;
            }
            kom kom = (kom) i4.next();
            koa koa = new koa(this.f24566b);
            bnre i5 = this.f24565a.listIterator();
            while (i5.hasNext()) {
                koc koc = (koc) i5.next();
                kpb kpb = koc.f24568a;
                bnre i6 = koc.f24569b.listIterator();
                int i7 = 0;
                while (i6.hasNext()) {
                    kny kny = (kny) i6.next();
                    i7 += kny.mo14729b(kom) ? kny.f24550a : 0;
                }
                int i8 = koa.f24563b;
                if (i7 >= i8) {
                    if (i7 == i8) {
                        koa.f24564c.add(kpb);
                    } else if (i7 > i8) {
                        koa.f24563b = i7;
                        koa.f24564c.clear();
                        koa.f24564c.add(kpb);
                    }
                }
            }
            Set set = koa.f24564c;
            List arrayList = new ArrayList(set.size());
            bnre i9 = koa.f24562a.listIterator();
            while (i9.hasNext()) {
                kpb kpb2 = (kpb) i9.next();
                if (set.contains(kpb2)) {
                    arrayList.add(kpb2);
                }
            }
            if (arrayList.isEmpty()) {
                bmxv = bmvz.f131120a;
            } else {
                if (!this.f24567c.mo14588h()) {
                    arrayList = Arrays.asList((kpb) arrayList.get(0));
                }
                kjk a = kjl.m17933a(kom);
                a.mo14527b(arrayList);
                a.mo14526a(lbc.CLIENT_HEURISTICS);
                bmxv = bmxv.m108566b(a.mo14524a());
            }
            if (bmxv.mo66813a()) {
                j.mo67668c((kjl) bmxv.mo66814b());
            } else {
                j2.mo67668c(kom);
            }
        }
        bnre i10 = this.f24565a.listIterator();
        while (i10.hasNext()) {
            bnre i11 = ((koc) i10.next()).f24569b.listIterator();
            while (i11.hasNext()) {
                ((kny) i11.next()).mo14732b();
            }
        }
        bngx a2 = j.mo67664a();
        if (!this.f24567c.mo14600s()) {
            bngx = bngx.m109376e();
        } else {
            bngs j3 = bngx.m109377j();
            int size = a2.size();
            for (i = 0; i < size; i++) {
                kjl kjl = (kjl) a2.get(i);
                j3.mo67668c(klv.m18138a(kjl.mo14518c(), kjl.mo14516a(), kjl.mo14517b()));
            }
            bngx = j3.mo67664a();
        }
        return new klw(j.mo67664a(), j2.mo67664a(), bmvz.f131120a, bngx);
    }
}
