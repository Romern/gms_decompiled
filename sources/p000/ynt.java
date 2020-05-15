package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: ynt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ynt implements ynm {

    /* renamed from: a */
    private final String f54231a;

    /* renamed from: b */
    private final yfl f54232b = yfl.f53726a;

    /* renamed from: c */
    private final ynn f54233c;

    /* renamed from: d */
    private final String f54234d;

    /* renamed from: e */
    private final yka f54235e;

    /* renamed from: f */
    private final yjx f54236f;

    /* renamed from: g */
    private final bngx f54237g;

    public ynt(yns yns) {
        String str = yns.f54225a;
        bmxy.m108581a(str);
        this.f54231a = str;
        ynn ynn = yns.f54227c;
        bmxy.m108581a(ynn);
        this.f54233c = ynn;
        String str2 = yns.f54226b;
        bmxy.m108581a(str2);
        this.f54234d = str2;
        yka yka = yns.f54228d;
        bmxy.m108581a(yka);
        this.f54235e = yka;
        yjx yjx = yns.f54229e;
        bmxy.m108581a(yjx);
        this.f54236f = yjx;
        ygy ygy = new ygy("com.google.distance.delta");
        ygy.mo30480c(yns.f54230f, TimeUnit.SECONDS);
        ygy ygy2 = new ygy("com.google.activity.segment");
        ygy2.mo30477b();
        ygy2.mo30480c(1, TimeUnit.HOURS);
        ygy2.mo30478b(1, TimeUnit.HOURS);
        ygy ygy3 = new ygy("com.google.step_count.delta");
        ygy3.mo30477b();
        yha yha = new yha(bngx.m109358a(ygy, ygy2, ygy3));
        yha.mo30484a("com.google.distance.delta", yhc.m44077a(ygv.m44052a(yns.f54226b), yns.f54227c));
        yha.mo30484a("com.google.activity.segment", yhc.m44077a(ygv.m44052a("merge_activity_segments"), yns.f54227c));
        yha.mo30484a("com.google.step_count.delta", yhc.m44077a(ygv.m44052a("merge_step_deltas"), yns.f54227c));
        this.f54237g = yha.mo30482a();
    }

    /* renamed from: a */
    private final yfr m44449a(String str, caaq caaq) {
        String str2;
        String str3;
        yfq a = yfr.m43986a();
        String[] split = str.split("<-");
        if (split.length >= 2) {
            str2 = split[1];
        } else {
            str2 = null;
        }
        if (!str.startsWith("from_high_accuracy_location")) {
            str3 = "from_activity";
        } else {
            str3 = "high_fidelity_from_activity";
        }
        if (caaq != null) {
            a.mo30418a(caaq);
        }
        a.mo30416a(1);
        a.mo30421b("com.google.distance.delta");
        a.mo30420a(this.f54232b);
        a.mo30419a(bzzr.m126369a(this.f54233c.mo30613a(str3), str2));
        return a.mo30415a();
    }

    /* renamed from: e */
    public static yns m44450e() {
        return new yns();
    }

    /* renamed from: a */
    public final yfr mo30588a() {
        return ynl.m44410a(this);
    }

    /* renamed from: b */
    public final yfr mo30605b() {
        return m44449a(bzzr.m126369a(this.f54233c.mo30613a(this.f54234d), "{source_stream_id}"), (caaq) null);
    }

    /* renamed from: c */
    public final bngx mo30606c() {
        return this.f54237g;
    }

    /* renamed from: d */
    public final String mo30607d() {
        return this.f54231a;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo30587a(yfr yfr) {
        bmxy.m108588a("com.google.distance.delta".equals(yfr.mo30423c()));
        return yfr;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ yfr mo30603a(Object obj, Iterable iterable) {
        yfr yfr = (yfr) obj;
        return m44449a(yfr.mo30427f(), yfr.mo30428g());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ygx mo30604a(Object obj, Iterable iterable, yhg yhg, yhy yhy) {
        caaq caaq;
        String str;
        ygx ygx;
        Iterator it;
        yhu yhu;
        Iterable iterable2 = iterable;
        yhg yhg2 = yhg;
        yhy yhy2 = yhy;
        yfr yfr = (yfr) obj;
        ArrayList arrayList = new ArrayList();
        ygx a = yjy.m44261a(iterable2, "com.google.activity.segment");
        if (a != null) {
            yhx a2 = yjy.m44266a(yhy2, a.mo30474b());
            yfw yfw = (yfw) yhg2;
            long j = yfw.f53737a;
            Iterator it2 = new yjm(a.mo30473a()).iterator();
            long j2 = j;
            int i = 4;
            while (it2.hasNext()) {
                yhu yhu2 = (yhu) it2.next();
                long a3 = yhu2.mo30385a();
                int j3 = yhu2.mo30517j();
                if (a3 > j2) {
                    it = it2;
                    yhu = yhu2;
                    yje.m44224a(a2, j2, a3, i, j3);
                } else {
                    it = it2;
                    yhu = yhu2;
                }
                yht a4 = a2.mo30521c().mo30504a(yhu);
                a4.mo30506a(yhu.mo30511d());
                a4.mo30503a().mo30433a(yhu.mo30517j());
                j2 = yhu.mo30387b();
                it2 = it;
                i = j3;
            }
            long j4 = yfw.f53738b;
            if (j2 < j4) {
                yje.m44224a(a2, j2, j4, i, 4);
            }
            a = a2.mo30520b();
            arrayList.add(a);
        }
        ygx a5 = yjy.m44261a(iterable2, "com.google.step_count.delta");
        if (a5 != null) {
            arrayList.add(a5);
        }
        List b = yjy.m44267b(iterable2, "com.google.distance.delta", this.f54234d);
        if (b.isEmpty()) {
            ypq.m44538a("No distance stream for %s", Level.WARNING, "No distance stream for %s", yfr);
        }
        bmxv c = bmxv.m108567c((ygx) bnjd.m109589b(b, (Object) null));
        if (c.mo66813a()) {
            yfr b2 = ((ygx) c.mo66814b()).mo30474b();
            caaq = b2.mo30428g();
            str = b2.mo30427f();
        } else {
            caaq = null;
            str = "";
        }
        yhx a6 = yhy.m44167a(m44449a(str, caaq));
        if (a == null || !c.mo66813a() || ((ygx) c.mo66814b()).mo30473a().isEmpty()) {
            ygx = a6.mo30520b();
        } else {
            ygx = this.f54235e.mo30582a((ygx) c.mo66814b(), arrayList, yhg, a6, yhy);
        }
        return this.f54236f.mo30574a(ygx, yhg2, yhy2);
    }
}
