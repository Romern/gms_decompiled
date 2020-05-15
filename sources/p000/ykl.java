package p000;

import java.util.List;

/* renamed from: ykl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ykl extends yjd {

    /* renamed from: h */
    protected final boolean f53976h;

    /* renamed from: i */
    private final boolean f53977i;

    /* renamed from: j */
    private final boolean f53978j;

    public ykl(ykk ykk) {
        super(ykk);
        this.f53977i = ykk.f53973n;
        this.f53978j = ykk.f53974o;
        this.f53976h = ykk.f53975p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final ygx mo30567c(List list, yhg yhg, yhy yhy) {
        yhg yhg2;
        Object obj;
        ygx ygx;
        yhx a = yhy.m44167a(this.f53921g);
        if (this.f53977i) {
            yhg2 = yfv.m44005a(((yfw) yhg).f53737a, Long.MAX_VALUE);
        } else {
            yhg2 = yhg;
        }
        boolean z = this.f53978j;
        if (!this.f53976h) {
            obj = null;
        } else if (list.isEmpty()) {
            obj = new yjr();
        } else if (((ygx) list.get(0)).mo30474b().mo30424d().f172337c.size() != 0) {
            int a2 = caak.m126415a(((caal) ((ygx) list.get(0)).mo30474b().mo30424d().f172337c.get(0)).f172343c);
            if (a2 == 0) {
                a2 = 1;
            }
            if (a2 == 1) {
                obj = yjq.m44240b(this.f53917c);
            } else if (a2 != 2) {
                obj = new yjr();
            } else {
                obj = yjq.m44239a(this.f53917c);
            }
        } else {
            obj = new yjr();
        }
        if (obj != null && !z) {
            ygx = ykm.m44281a(list, yhg2, a);
        } else {
            ygx = ykm.m44282a(list, yhg2, a, z);
        }
        bngs b = bngx.m109371b(ygx.mo30473a().size());
        bnre i = ygx.mo30473a().listIterator();
        while (i.hasNext()) {
            yhu yhu = (yhu) i.next();
            b.mo67668c(new yjc(yfv.m44005a(yhu.mo30385a(), yhu.mo30387b()), yhu));
        }
        return mo30563a(b.mo67664a(), yhg);
    }
}
