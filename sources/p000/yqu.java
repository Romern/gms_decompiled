package p000;

import java.util.Collection;

/* renamed from: yqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yqu extends yqr {

    /* renamed from: b */
    private static final srn f54441b = zvt.m46581a();

    /* renamed from: c */
    private final caah f54442c;

    /* renamed from: d */
    private final caal f54443d;

    /* renamed from: e */
    private final caah f54444e;

    public yqu(caah caah, caah caah2, caal caal) {
        bmxy.m108581a(caah);
        this.f54442c = caah;
        bmxy.m108581a(caal);
        this.f54443d = caal;
        bmxy.m108581a(caah2);
        this.f54444e = caah2;
        bmxy.m108597a(caah.f172337c.contains(caal), "%s not a field of %s", caal, caah);
        bmxy.m108597a(caah2.f172337c.contains(caal), "%s not a field of %s", caal, caah2);
    }

    /* renamed from: a */
    public final caah mo30661a() {
        return this.f54442c;
    }

    /* renamed from: b */
    public final caah mo30663b() {
        return this.f54444e;
    }

    /* renamed from: c */
    public final caae mo30664c() {
        yyc a = yyd.m44987a();
        a.mo30856a(caad.RAW);
        a.mo30857a(this.f54444e);
        a.mo30855a(yxy.f54800b);
        a.mo30858a(this.f54430a);
        return a.mo30854a();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo30665d() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    public final Collection mo30662a(cadn cadn) {
        String str;
        if (!bzzn.m126363a(this.f54442c, yyk.m45008a(cadn))) {
            ((bnsl) f54441b.mo68387b()).mo68424a("Require %s measurement instead of: %s", this.f54442c.f172336b, yyk.m45023b(cadn));
        } else if (yyk.m45020a(cadn, this.f54443d, this.f54442c)) {
            cadn a = yyk.m45010a(mo30664c());
            bxvd bxvd = (bxvd) a.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) a);
            cadm cadm = (cadm) bxvd;
            int a2 = caak.m126415a(this.f54443d.f172343c);
            int i = 1;
            boolean z = true;
            if (a2 != 0 && a2 == 2) {
                float d = yyk.m45025d(cadn, this.f54443d, this.f54442c);
                caal caal = this.f54443d;
                caah caah = this.f54444e;
                double d2 = (double) d;
                int a3 = caak.m126415a(caal.f172343c);
                if (a3 == 0) {
                    z = false;
                } else if (a3 != 2) {
                    z = false;
                }
                bmxy.m108588a(z);
                yyk.m45019a(cadm, caal, caah, yyp.m45046a(d2));
            } else {
                int a4 = caak.m126415a(this.f54443d.f172343c);
                if (a4 == 0 || a4 == 1) {
                    yyk.m45018a(cadm, this.f54443d, this.f54444e, yyk.m45024c(cadn, this.f54443d, this.f54442c));
                } else {
                    int a5 = caak.m126415a(this.f54443d.f172343c);
                    if (a5 != 0) {
                        i = a5;
                    }
                    switch (i) {
                        case 1:
                            str = "INTEGER";
                            break;
                        case 2:
                            str = "FLOAT_POINT";
                            break;
                        case 3:
                            str = "STRING";
                            break;
                        case 4:
                            str = "MAP";
                            break;
                        case 5:
                            str = "INTEGER_LIST";
                            break;
                        case 6:
                            str = "FLOAT_LIST";
                            break;
                        default:
                            str = "BLOB";
                            break;
                    }
                    throw new IllegalStateException(str.length() == 0 ? new String("Unsupported format: ") : "Unsupported format: ".concat(str));
                }
            }
            yyk.m45017a(cadm, cadn.f172703c, cadn.f172702b);
            long j = cadn.f172707g;
            if (j != 0) {
                if (cadm.f164950c) {
                    cadm.mo74035c();
                    cadm.f164950c = false;
                }
                cadn cadn2 = (cadn) cadm.f164949b;
                cadn cadn3 = cadn.f172699j;
                cadn2.f172701a |= 16;
                cadn2.f172707g = j;
            }
            return bnic.m109489a((cadn) cadm.mo74062i());
        }
        return bngx.m109376e();
    }
}
