package p000;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: yjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class yjd extends yll {

    /* renamed from: c */
    public final String f53917c;

    /* renamed from: d */
    protected final yjf f53918d;

    /* renamed from: e */
    public final String f53919e;

    /* renamed from: f */
    protected final yjx f53920f;

    /* renamed from: g */
    protected final yfr f53921g;

    /* renamed from: h */
    private final bmxz f53922h;

    protected yjd(yja yja) {
        super(yja);
        String str = yja.f53900a;
        bmxy.m108581a(str);
        this.f53917c = str;
        String str2 = yja.f53907h;
        bmxy.m108581a(str2);
        this.f53919e = str2;
        yjf yjf = yja.f53901b;
        bmxy.m108581a(yjf);
        this.f53918d = yjf;
        bmxz bmxz = yja.f53903d;
        bmxy.m108581a(bmxz);
        this.f53922h = bmxz;
        yjx yjx = yja.f53904e;
        bmxy.m108581a(yjx);
        this.f53920f = yjx;
        yfq a = yfr.m43986a();
        a.mo30416a(1);
        a.mo30421b(this.f53919e);
        a.mo30420a(yfl.f53726a);
        a.mo30419a(this.f53897b.mo30613a(yja.f53909j));
        this.f53921g = a.mo30415a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List mo30562a(List list, yhg yhg, yhy yhy) {
        return list;
    }

    /* renamed from: b */
    public final String mo30564b() {
        return this.f53917c;
    }

    /* renamed from: c */
    public final yfr mo30566c() {
        return this.f53921g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract ygx mo30567c(List list, yhg yhg, yhy yhy);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ygx mo30563a(Iterable iterable, yhg yhg) {
        yhx a = yhy.m44167a(this.f53921g);
        ypq.m44537a();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            yjc yjc = (yjc) it.next();
            yhu yhu = yjc.f53916c;
            int i = 0;
            while (true) {
                if (i < yhu.mo30515h()) {
                    if (!this.f53922h.mo6527a(yhu.mo30509a(i))) {
                        break;
                    }
                    i++;
                } else if (this.f53920f.mo30576a(yhg, yjc.f53915b)) {
                    yfw yfw = (yfw) yhg;
                    ypq.m44538a("Empty trimmed output data point", Level.WARNING, "Skipping empty trimmed data point [%tT-%tT] for %s, window [%tT-%tT]%nPoint: %s", Long.valueOf(yhf.m44094b(yjc.f53915b)), Long.valueOf(yhf.m44096c(yjc.f53915b)), getClass().getSimpleName(), Long.valueOf(TimeUnit.NANOSECONDS.toMillis(yfw.f53737a)), Long.valueOf(TimeUnit.NANOSECONDS.toMillis(yfw.f53738b)), yjc);
                } else {
                    yfw yfw2 = (yfw) yhg;
                    this.f53920f.mo30575a(a.mo30521c(), yjc.f53916c, yfv.m44005a(Math.max(((yfw) yjc.f53915b).f53737a, yfw2.f53737a), Math.min(((yfw) yjc.f53915b).f53738b, yfw2.f53738b)));
                }
            }
        }
        return a.mo30520b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bngx.a(java.util.Comparator, java.lang.Iterable):bngx
     arg types: [bnny, java.util.List]
     candidates:
      bngx.a(java.lang.Object, java.lang.Object):bngx
      bngx.a(java.lang.Object[], int):int
      bngx.a(int, int):bngx
      bngm.a(java.lang.Object[], int):int
      bngx.a(java.util.Comparator, java.lang.Iterable):bngx */
    /* renamed from: b */
    public ygx mo30565b(List list, yhg yhg, yhy yhy) {
        return mo30567c(bngx.m109369a((Comparator) bnny.m109908a(this.f53918d).mo68159a(yiz.f53898a), (Iterable) mo30562a(list, yhg, yhy)), yhg, yhy);
    }
}
