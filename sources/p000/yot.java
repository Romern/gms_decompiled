package p000;

import java.util.List;
import java.util.logging.Level;

/* renamed from: yot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yot extends yll {

    /* renamed from: c */
    public final long f54296c;

    /* renamed from: d */
    private final int f54297d;

    /* renamed from: e */
    private final yfr f54298e;

    public yot(yos yos) {
        super(yos);
        this.f54297d = yos.f54291a;
        this.f54296c = yos.f54292b;
        String str = yos.f54294d;
        bmxy.m108581a(str);
        yfq a = yfr.m43986a();
        a.mo30416a(1);
        a.mo30421b("com.google.heart_minutes");
        a.mo30420a(yfl.f53726a);
        a.mo30419a(this.f53897b.mo30613a(bzzr.m126369a(yos.f54295e, str)));
        this.f54298e = a.mo30415a();
    }

    /* renamed from: b */
    public final String mo30564b() {
        return "HeartPointFromHeartRateSamplesTransformation";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final yfr mo30566c() {
        return this.f54298e;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [bngx, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final ygx mo30565b(List list, yhg yhg, yhy yhy) {
        float f;
        yhx a = yhy.m44167a(this.f54298e);
        ygx a2 = yjy.m44261a(list, "com.google.active_minutes");
        if (a2 == null) {
            ypq.m44538a("Desired data source not found", Level.FINE, "COM_GOOGLE_ACTIVE_MINUTES", new Object[0]);
            return a.mo30520b();
        }
        ygx a3 = yjy.m44261a(list, "com.google.heart_rate.bpm");
        if (a3 == null) {
            ypq.m44538a("Desired data source not found", Level.FINE, "COM_GOOGLE_HEART_RATE_BPM", new Object[0]);
            return a.mo30520b();
        }
        Iterable<bnoa> a4 = bnjd.m109575a((Iterable) a2.mo30473a(), yoq.f54287a);
        bnrc c = bnrc.m110157c();
        for (bnoa bnoa : a4) {
            c.mo67354a(bnoa);
        }
        for (yhu yhu : new yor(this, a3.mo30473a(), a)) {
            if (c.mo68183c(bnoa.m109932b(Long.valueOf(yhu.mo30385a()), Long.valueOf(yhu.mo30387b())))) {
                yht a5 = a.mo30521c().mo30504a(yhu);
                a5.mo30506a(a3.mo30474b());
                yft a6 = a5.mo30503a();
                int i = this.f54297d;
                float b = yhu.mo30510b(0);
                float f2 = 205.8f - (((float) i) * 0.685f);
                if (b < 0.7f * f2) {
                    f = b >= f2 * 0.5f ? 1.0f : 0.0f;
                } else {
                    f = 2.0f;
                }
                a6.mo30432a((double) f);
            }
        }
        return a.mo30520b();
    }
}
