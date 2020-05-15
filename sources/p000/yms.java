package p000;

import java.util.List;

/* renamed from: yms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yms extends yll {

    /* renamed from: c */
    private final float f54111c;

    /* renamed from: d */
    private final ymt f54112d;

    /* renamed from: e */
    private final yfr f54113e;

    public yms(ymr ymr) {
        super(ymr);
        ymt ymt = ymr.f54109c;
        bmxy.m108581a(ymt);
        this.f54112d = ymt;
        this.f54111c = ymr.f54110d;
        yfq a = yfr.m43986a();
        a.mo30416a(1);
        a.mo30421b("com.google.calories.bmr");
        a.mo30420a(yfl.f53726a);
        a.mo30419a(ymr.f54040r.mo30613a("from_height&weight"));
        this.f54113e = a.mo30415a();
    }

    /* renamed from: a */
    private final float m44380a(float f, float f2) {
        return this.f54112d.mo30610a(f2, f * 100.0f, this.f54111c);
    }

    /* renamed from: b */
    private static float m44382b(yhu yhu) {
        bmxy.m108588a(yhu.mo30512e().equals("com.google.height"));
        return yhu.mo30510b(0);
    }

    /* renamed from: b */
    public final String mo30564b() {
        return "BmrTransformation";
    }

    /* renamed from: c */
    public final yfr mo30566c() {
        return this.f54113e;
    }

    /* renamed from: a */
    private static float m44381a(yhu yhu) {
        bmxy.m108588a(yhu.mo30512e().equals("com.google.weight"));
        return yhu.mo30510b(0);
    }

    /* renamed from: b */
    public final ygx mo30565b(List list, yhg yhg, yhy yhy) {
        float f;
        float f2;
        long j;
        ygx a = yjy.m44261a(list, "com.google.height");
        ygx a2 = yjy.m44261a(list, "com.google.weight");
        bngx a3 = yjy.m44257a(a);
        bngx a4 = yjy.m44257a(a2);
        yhx a5 = yhy.m44167a(this.f54113e);
        bnjq h = bnjr.m109626h(a3.listIterator());
        bnjq h2 = bnjr.m109626h(a4.listIterator());
        if (h.hasNext()) {
            f = m44382b((yhu) h.mo67862a());
        } else {
            f = 1.7f;
        }
        if (h2.hasNext()) {
            f2 = m44381a((yhu) h2.mo67862a());
        } else {
            f2 = 73.0f;
        }
        yhu yhu = null;
        yhu yhu2 = null;
        while (true) {
            if (!h2.hasNext() && !h.hasNext()) {
                j = ((yfw) yhg).f53737a;
            } else if (!h2.hasNext()) {
                yhu2 = (yhu) h.next();
                j = yhu2.mo30387b();
            } else if (!h.hasNext()) {
                yhu = (yhu) h2.next();
                j = yhu.mo30387b();
            } else {
                long b = ((yhu) h.mo67862a()).mo30387b();
                long b2 = ((yhu) h2.mo67862a()).mo30387b();
                if (b < b2) {
                    yhu2 = (yhu) h.next();
                    j = yhu2.mo30387b();
                } else if (b <= b2) {
                    yhu yhu3 = (yhu) h.next();
                    yhu yhu4 = (yhu) h2.next();
                    j = yhu3.mo30387b();
                    yhu2 = yhu3;
                    yhu = yhu4;
                } else {
                    yhu = (yhu) h2.next();
                    j = yhu.mo30387b();
                }
            }
            if (yhu != null) {
                f2 = m44381a(yhu);
            }
            if (yhu2 != null) {
                f = m44382b(yhu2);
            }
            float a6 = m44380a(f, f2);
            if (a6 <= 0.0f) {
                a6 = m44380a(1.7f, 73.0f);
            }
            yht c = a5.mo30521c();
            yfm.m43953a(c, j, j);
            c.mo30503a().mo30432a((double) a6);
            if (!h.hasNext() && !h2.hasNext()) {
                return a5.mo30520b();
            }
        }
    }
}
