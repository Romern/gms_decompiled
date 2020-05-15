package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: yqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yqd extends yll {

    /* renamed from: c */
    private static final yjw f54377c = new yjw();

    /* renamed from: d */
    private final ypv f54378d;

    /* renamed from: e */
    private final yqb f54379e;

    public yqd(yqc yqc) {
        super(yqc);
        ypv ypv = yqc.f54376c;
        bmxy.m108581a(ypv);
        this.f54378d = ypv;
        this.f54379e = new yqb(yqc.f54376c);
    }

    /* renamed from: a */
    private static yhx m44573a(yhy yhy, String str) {
        return m44574a(yhy, "com.google.step_count.delta", str);
    }

    /* renamed from: b */
    public final String mo30564b() {
        return "StepsFromActivityTransformation";
    }

    /* renamed from: c */
    public final yfr mo30566c() {
        yfq a = yfr.m43986a();
        a.mo30416a(1);
        a.mo30421b("com.google.step_count.delta");
        a.mo30420a(yfl.f53726a);
        a.mo30419a("estimated_steps");
        return a.mo30415a();
    }

    /* renamed from: a */
    private static yhx m44574a(yhy yhy, String str, String str2) {
        return yjy.m44265a(str, str2, yfl.f53726a, (caaq) null);
    }

    /* renamed from: b */
    public final ygx mo30565b(List list, yhg yhg, yhy yhy) {
        ygx b;
        yhg yhg2 = yhg;
        yhy yhy2 = yhy;
        ypq.m44537a();
        ygx a = yjy.m44261a(list, "com.google.step_count.delta");
        ygx a2 = yjy.m44261a(list, "com.google.activity.segment");
        yqb yqb = this.f54379e;
        bngx a3 = yjy.m44257a(a);
        bngx a4 = yjy.m44257a(a2);
        yhx a5 = m44573a(yhy2, "pruned_steps");
        ypq.m44537a();
        Iterator it = yqb.f54372a.mo30580a(a3, a4, a5).iterator();
        Iterator it2 = a4.iterator();
        yhu a6 = yqb.mo30656a(it2);
        if (a6 == null) {
            yqb.m44566a(a5, it, yhg2);
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (it.hasNext()) {
                yhu yhu = (yhu) it.next();
                do {
                    if (a6 != null && a6.mo30387b() >= yhu.mo30387b()) {
                        break;
                    }
                    yqb.mo30657a(a5, a6, arrayList, yhg2);
                    a6 = yqb.mo30656a(it2);
                } while (a6 != null);
                if (a6 == null) {
                    yqb.m44568a(a5, yhu, yhg2);
                    yqb.m44566a(a5, it, yhg2);
                    b = a5.mo30520b();
                    break;
                }
                long b2 = yhu.mo30387b();
                if (b2 <= a6.mo30385a()) {
                    yqb.m44568a(a5, yhu, yhg2);
                } else if (b2 <= a6.mo30387b()) {
                    arrayList.add(yhu);
                }
            } else {
                while (a6 != null) {
                    yqb.mo30657a(a5, a6, arrayList, yhg2);
                    a6 = yqb.mo30656a(it2);
                }
                b = a5.mo30520b();
            }
        }
        yhz yhz = (yhz) b;
        Iterable<yhu> a7 = f54377c.mo30580a(yjy.m44257a(a2), yhz.f53845b, m44574a(yhy2, "com.google.activity.segment", "split_activities"));
        yhx a8 = yhy.m44167a(yhz.f53844a);
        ypq.m44537a();
        for (yhu yhu2 : a7) {
            int j = yhu2.mo30517j();
            if (this.f54378d.mo30653a(j) && ygv.f53773c.mo30462a(yhu2.mo30511d())) {
                ypv ypv = this.f54378d;
                long a9 = yhf.m44092a(yhu2);
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                ypu ypu = (ypu) ypv.f54357b.get(Integer.valueOf(j));
                if (ypu != null) {
                    int round = Math.round(((float) ypu.f54353c) * ypv.m44548a((float) a9, timeUnit));
                    yht a10 = a8.mo30521c().mo30504a(yhu2);
                    a10.mo30506a(yhu2.mo30511d());
                    a10.mo30503a().mo30433a(round);
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
        return ykm.m44281a(bngx.m109357a(b, a8.mo30520b()), yhg2, m44573a(yhy2, "estimated_steps"));
    }
}
