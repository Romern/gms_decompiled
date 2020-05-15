package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: yma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yma extends yks {

    /* renamed from: a */
    private final ynn f54061a;

    /* renamed from: b */
    private final ypv f54062b;

    /* renamed from: c */
    private final ylu f54063c = new ylu(this.f54062b);

    /* renamed from: d */
    private final ylc f54064d;

    /* renamed from: e */
    private final bngx f54065e;

    public yma(ykr ykr) {
        super(null);
        ynn ynn = ykr.f53987a;
        bmxy.m108581a(ynn);
        this.f54061a = ynn;
        ypv ypv = ykr.f53988b;
        bmxy.m108581a(ypv);
        this.f54062b = ypv;
        this.f54064d = new ylc(ykr.f53989c);
        bngx bngx = yly.f54059a;
        ygy ygy = new ygy("com.google.activity.segment");
        ygy.mo30480c(10, TimeUnit.MINUTES);
        ygy.mo30478b(10, TimeUnit.MINUTES);
        ygy ygy2 = new ygy("com.google.step_count.delta");
        ygy2.mo30480c(10, TimeUnit.MINUTES);
        ygy2.mo30478b(10, TimeUnit.MINUTES);
        yha yha = new yha(bngx.m109357a(ygy, ygy2));
        yha.mo30483a("com.google.activity.segment", bngx.m109356a(yhc.m44077a(ygv.m44052a("from_activity_samples"), ykr.f53987a)));
        yha.mo30484a("com.google.step_count.delta", yhc.m44077a(ygv.m44052a("derive_step_deltas"), ykr.f53987a));
        this.f54065e = bngx.m109368a((Collection) yha.mo30482a());
    }

    /* renamed from: a */
    private final yfr m44344a(caaq caaq) {
        yfq a = yfr.m43986a();
        if (caaq != null) {
            a.mo30418a(caaq);
        }
        a.mo30416a(1);
        a.mo30421b("com.google.activity.segment");
        a.mo30420a(yfl.f53726a);
        a.mo30419a(this.f54061a.mo30613a("activity_from_steps"));
        return a.mo30415a();
    }

    /* renamed from: b */
    private final yhx m44345b(caaq caaq) {
        return yhy.m44167a(m44344a(caaq));
    }

    /* renamed from: c */
    public final bngx mo30606c() {
        return this.f54065e;
    }

    /* renamed from: d */
    public final String mo30607d() {
        return "ActivityFromStepsTransformation";
    }

    /* renamed from: b */
    public final yfr mo30605b() {
        return m44344a((caaq) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ yfr mo30603a(Object obj, Iterable iterable) {
        return m44344a((caaq) obj);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ygx mo30604a(Object obj, Iterable iterable, yhg yhg, yhy yhy) {
        ygx ygx;
        ygx ygx2;
        caaq caaq;
        yfr yfr;
        caaq caaq2;
        bnre bnre;
        long j;
        long j2;
        Iterable iterable2 = iterable;
        yhg yhg2 = yhg;
        yhy yhy2 = yhy;
        caaq caaq3 = (caaq) obj;
        List b = yjy.m44267b(iterable2, "com.google.activity.segment", "from_activity_samples");
        if (b.isEmpty()) {
            ypq.m44538a("Desired data source not found in input.", Level.FINE, "Data type: %s, stream name prefix: %s", "com.google.activity.segment", "from_activity_samples");
            ygx = yjy.m44263a("com.google.activity.segment", "from_activity_samples");
        } else {
            if (b.size() > 1) {
                ypq.m44538a("More than one data source found in input.", Level.WARNING, "Data type: %s, stream name prefix: %s.  Found: %s", "com.google.activity.segment", "from_activity_samples", yjy.m44258a(b));
            }
            ygx = (ygx) b.get(0);
        }
        List b2 = yjy.m44267b(iterable2, "com.google.step_count.delta", "derive_step_deltas");
        Collections.sort(b2, bnnt.f131877a.mo68159a(ylz.f54060a));
        int size = b2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                ygx2 = (ygx) bnjd.m109589b(b2, yjy.m44263a("com.google.step_count.delta", "derive_step_deltas"));
                bmzs.m108696a(ygx2);
                break;
            }
            ygx2 = (ygx) b2.get(i);
            i++;
            if (!ygx2.mo30473a().isEmpty()) {
                break;
            }
        }
        if (caaq3 == null) {
            caaq = caaq3;
        } else if (!ygx2.mo30473a().isEmpty()) {
            caap caap = caap.UNKNOWN;
            caap a = caap.m126421a(caaq3.f172360c);
            if (a == null) {
                a = caap.UNKNOWN;
            }
            int ordinal = a.ordinal();
            if (ordinal == 1 || ordinal == 2) {
                if (ygx.mo30473a().isEmpty()) {
                    return m44345b(caaq3).mo30520b();
                }
                bngx a2 = ygx.mo30473a();
                ylu ylu = this.f54063c;
                yhx b3 = m44345b(caaq3);
                bmxy.m108581a(ygx);
                bmxy.m108581a(ygx2);
                ypq.m44537a();
                bngx a3 = ygx.mo30473a();
                bngx a4 = ygx2.mo30473a();
                bnre i2 = a4.listIterator();
                ArrayList arrayList = new ArrayList();
                bnre i3 = a3.listIterator();
                while (i3.hasNext()) {
                    yhu yhu = (yhu) i3.next();
                    if (ylu.f54053a.contains(Integer.valueOf(yhu.mo30517j()))) {
                        long a5 = yhu.mo30385a();
                        yhx yhx = b3;
                        long b4 = yhu.mo30387b();
                        yhu a6 = yfp.m43961a(i2, a5);
                        if (a6 == null || a6.mo30385a() >= a5) {
                            caaq2 = caaq3;
                            bnre = i3;
                            j = 0;
                        } else if (a6.mo30387b() < a5) {
                            caaq2 = caaq3;
                            bnre = i3;
                            j = 0;
                        } else {
                            long j3 = 0;
                            while (a6 != null && ((ylu.m44340a(a6, a5, b4) || a6.mo30387b() == j3) && ylu.mo30602a(a6, yhu))) {
                                j3 = a6.mo30385a();
                                while (true) {
                                    if (!i2.hasPrevious()) {
                                        a6 = null;
                                        break;
                                    }
                                    yhu yhu2 = (yhu) i2.previous();
                                    if (yhu2 != a6) {
                                        a6 = yhu2;
                                        break;
                                    }
                                }
                            }
                            bnre = i3;
                            caaq2 = caaq3;
                            j = j3;
                        }
                        if (i2.hasPrevious()) {
                            i2.previous();
                        }
                        while (i2.hasNext()) {
                            a6 = (yhu) i2.next();
                            if (a6.mo30387b() >= b4) {
                                break;
                            }
                        }
                        if (a6 == null || a6.mo30385a() > b4 || a6.mo30387b() < b4) {
                            j2 = 0;
                        } else {
                            long j4 = 0;
                            while (true) {
                                if ((ylu.m44340a(a6, a5, b4) || a6.mo30385a() == j4) && ylu.mo30602a(a6, yhu)) {
                                    j4 = a6.mo30387b();
                                    if (!i2.hasNext()) {
                                        j2 = j4;
                                        break;
                                    }
                                    a6 = (yhu) i2.next();
                                }
                            }
                            j2 = j4;
                        }
                        if (i2.hasPrevious()) {
                            i2.previous();
                        }
                        arrayList.add(new yjc(yfv.m44005a(j, j2), yhu));
                        b3 = yhx;
                        i3 = bnre;
                        caaq3 = caaq2;
                    }
                }
                caaq caaq4 = caaq3;
                yhx yhx2 = b3;
                yhu yhu3 = (yhu) bnjd.m109589b(a4, (Object) null);
                if (yhu3 != null) {
                    yfr = yhu3.mo30511d();
                } else {
                    yfr = null;
                }
                int size2 = arrayList.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    yjc yjc = (yjc) arrayList.get(i4);
                    yhu yhu4 = yjc.f53916c;
                    yfr yfr2 = yhu4.f53838b;
                    yhg yhg3 = yjc.f53915b;
                    if (yfr != null) {
                        yfw yfw = (yfw) yhg3;
                        if (!(yfw.f53737a == 0 && yfw.f53738b == 0)) {
                            yfr2 = yfr;
                        }
                    }
                    yfw yfw2 = (yfw) yhg3;
                    long j5 = yfw2.f53737a;
                    if (j5 == 0) {
                        j5 = yhu4.mo30385a();
                    }
                    long j6 = yfw2.f53738b;
                    if (j6 == 0) {
                        j6 = yhu4.mo30387b();
                    }
                    yht c = yhx2.mo30521c();
                    yfm.m43953a(c, j5, j6);
                    c.mo30506a(yfr2);
                    c.mo30503a().mo30433a(yhu4.mo30517j());
                }
                return ymk.m44369a(bngx.m109357a(a2, ((yhz) yhx2.mo30520b()).f53845b), yhg2, m44345b(caaq4));
            } else if (ordinal != 3) {
                caaq = caaq3;
            } else {
                bngs j7 = bngx.m109377j();
                bmxy.m108581a(ygx);
                bngx a7 = ygx.mo30473a();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                bnre i5 = a7.listIterator();
                while (i5.hasNext()) {
                    yhu yhu5 = (yhu) i5.next();
                    if (yhu5 != null) {
                        if (!yly.f54059a.contains(Integer.valueOf(yhu5.mo30517j()))) {
                            arrayList3.add(yhu5);
                        } else {
                            arrayList2.add(yhu5);
                        }
                    }
                }
                ylx ylx = new ylx(yly.m44343a(arrayList2, yjy.m44266a(yhy2, ygx.mo30474b())), yly.m44343a(arrayList3, yjy.m44266a(yhy2, ygx.mo30474b())));
                j7.mo67668c(ylx.f54058b.mo30473a());
                ylt ylt = new ylt(this.f54062b, m44345b(caaq3), ygx2.mo30473a());
                bngx a8 = ylx.f54057a.mo30473a();
                yhx b5 = m44345b(caaq3);
                j7.mo67668c(new ykj(new ylv(b5), ylw.f54056a.mo30580a(ylt, a8, b5), a8));
                ygx a9 = ymk.m44369a(j7.mo67664a(), yhg2, m44345b(caaq3));
                ylc ylc = this.f54064d;
                yhx b6 = m44345b(caaq3);
                bmxy.m108581a(a9);
                ypq.m44537a();
                if (a9.mo30473a().isEmpty()) {
                    ypq.m44538a("No segments found in input", Level.FINE, "No segments found in input", new Object[0]);
                    return b6.mo30520b();
                }
                ListIterator listIterator = a9.mo30473a().listIterator();
                yhu a10 = ylc.m44315a(listIterator);
                yhu yhu6 = null;
                while (a10 != null) {
                    yhu a11 = ylc.m44315a(listIterator);
                    if (!ylc.f54018a.contains(Integer.valueOf(a10.mo30517j())) || yhf.m44092a(a10) > ylc.f54019b || ((yhu6 != null && ylc.m44316a(yhu6, a10)) || (a11 != null && ylc.m44316a(a10, a11)))) {
                        yht a12 = b6.mo30521c().mo30504a(a10);
                        a12.mo30506a(a10.mo30511d());
                        a12.mo30503a().mo30433a(a10.mo30517j());
                    }
                    yhu6 = a10;
                    a10 = a11;
                }
                return b6.mo30520b();
            }
        } else {
            caaq = caaq3;
        }
        if (ygx.mo30473a().isEmpty()) {
            return m44345b(caaq).mo30520b();
        }
        return ymk.m44369a(bngx.m109356a((Object) ygx.mo30473a()), yhg2, m44345b(caaq));
    }
}
