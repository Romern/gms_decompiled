package p000;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* renamed from: yqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yqt extends yqr {

    /* renamed from: b */
    private static final srn f54436b = zvt.m46581a();

    /* renamed from: c */
    private final caah f54437c;

    /* renamed from: d */
    private final caah f54438d;

    /* renamed from: e */
    private final caal f54439e;

    /* renamed from: f */
    private final caal f54440f;

    public yqt(caah caah, caah caah2, caal caal, caal caal2) {
        bmxy.m108581a(caah);
        this.f54437c = caah;
        bmxy.m108581a(caah2);
        this.f54438d = caah2;
        bmxy.m108581a(caal);
        this.f54439e = caal;
        bmxy.m108581a(caal2);
        this.f54440f = caal2;
        int a = caak.m126415a(this.f54439e.f172343c);
        boolean z = false;
        bmxy.m108589a(a == 0 ? true : a == 1, "Format must be FORMAT_INT32");
        int a2 = caak.m126415a(this.f54440f.f172343c);
        if (a2 == 0) {
            z = true;
        } else if (a2 == 1) {
            z = true;
        }
        bmxy.m108589a(z, "Format must be FORMAT_INT32");
        bmxy.m108597a(caah.f172337c.contains(this.f54439e), "%s not a field of %s", this.f54439e, caah);
        bmxy.m108597a(caah2.f172337c.contains(this.f54440f), "%s not a field of %s", this.f54440f, caah2);
    }

    /* renamed from: a */
    public final caah mo30661a() {
        return this.f54437c;
    }

    /* renamed from: b */
    public final caah mo30663b() {
        return this.f54438d;
    }

    /* renamed from: c */
    public final caae mo30664c() {
        yyc a = yyd.m44987a();
        a.mo30856a(caad.RAW);
        a.mo30857a(this.f54438d);
        a.mo30855a(yxy.f54800b);
        a.mo30858a(this.f54430a);
        return a.mo30854a();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo30665d() {
    }

    /* renamed from: a */
    public final Collection mo30662a(cadn cadn) {
        if (!bzzn.m126363a(this.f54437c, yyk.m45008a(cadn))) {
            ((bnsl) f54436b.mo68387b()).mo68424a("Require %s measurement instead of: %s", this.f54437c.f172336b, yyk.m45023b(cadn));
        } else if (yyk.m45020a(cadn, this.f54439e, this.f54437c)) {
            cadn a = yyk.m45010a(mo30664c());
            bxvd bxvd = (bxvd) a.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) a);
            cadm cadm = (cadm) bxvd;
            long a2 = bqcx.m112609a(yyk.m45024c(cadn, this.f54439e, this.f54437c));
            if (a2 > 2147483647L) {
                a2 -= 2147483648L;
            }
            yyk.m45018a(cadm, this.f54440f, this.f54438d, (int) a2);
            long j = cadn.f172703c;
            long j2 = cadn.f172702b;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            yyk.m45017a(cadm, timeUnit.toNanos(j), timeUnit.toNanos(j2));
            long j3 = cadn.f172707g;
            if (cadm.f164950c) {
                cadm.mo74035c();
                cadm.f164950c = false;
            }
            cadn cadn2 = (cadn) cadm.f164949b;
            cadn cadn3 = cadn.f172699j;
            cadn2.f172701a |= 16;
            cadn2.f172707g = j3;
            return bngx.m109356a((cadn) cadm.mo74062i());
        }
        return bngx.m109376e();
    }
}
