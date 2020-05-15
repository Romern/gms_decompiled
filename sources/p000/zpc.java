package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: zpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zpc {

    /* renamed from: a */
    private static final srn f55647a = zvt.m46581a();

    /* renamed from: a */
    public static cadp m45932a(cadz cadz, caaq caaq) {
        caae caae;
        cado b = yyl.m45033b(yyg.f54822b);
        if (cadz.f172782h == 4) {
            return (cadp) b.mo74062i();
        }
        caae caae2 = ((cadp) b.f164949b).f172713b;
        if (caae2 != null) {
            caae = caae2;
        } else {
            caae = caae.f172323i;
        }
        cadn a = yyk.m45011a(caae, cadz.f172779e, cadz.f172780f, TimeUnit.MILLISECONDS, yyp.m45047a(cadz.f172782h));
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        cadm cadm = (cadm) bxvd;
        yyc c = yyd.m44993c(yyg.f54822b);
        bzzz bzzz = cadz.f172781g;
        if (bzzz == null) {
            bzzz = bzzz.f172298f;
        }
        c.mo30855a(bzzz);
        c.mo30858a(caaq);
        caae a2 = c.mo30854a();
        if (cadm.f164950c) {
            cadm.mo74035c();
            cadm.f164950c = false;
        }
        cadn cadn = (cadn) cadm.f164949b;
        cadn cadn2 = cadn.f172699j;
        a2.getClass();
        cadn.f172706f = a2;
        cadn.f172701a |= 8;
        yyl.m45031a(b, (cadn) cadm.mo74062i());
        return (cadp) b.mo74062i();
    }

    /* renamed from: a */
    public static cadz m45933a(cadz cadz, cadz cadz2) {
        return yym.m45035a(cadz2, cadz);
    }

    /* renamed from: a */
    public static cadz m45934a(cadz cadz, zrj zrj, String str) {
        bngx bngx;
        boolean z;
        String str2;
        long j;
        int i = cadz.f172775a;
        if ((i & 1) != 0) {
            cadz a = m45935a(cadz.f172776b, zrj, str);
            bngx = a != null ? bngx.m109356a(a) : bngx.m109376e();
        } else {
            if ((i & 2) != 0) {
                str2 = cadz.f172777c;
            } else {
                str2 = null;
            }
            long j2 = cadz.f172779e;
            if (!yym.m45037b(cadz)) {
                j = cadz.f172780f;
            } else {
                j = -1;
            }
            bngx = zrj.mo31392a(str, str2, null, j2, j);
        }
        int size = bngx.size();
        int i2 = 0;
        while (i2 < size) {
            cadz cadz2 = (cadz) bngx.get(i2);
            if (!cdyu.f181962a.mo6606a().mo78499c()) {
                bzzz bzzz = cadz.f172781g;
                if (bzzz == null) {
                    bzzz = bzzz.f172298f;
                }
                bzzz bzzz2 = cadz2.f172781g;
                if (bzzz2 == null) {
                    bzzz2 = bzzz.f172298f;
                }
                z = bzzz.equals(bzzz2);
            } else {
                bzzz bzzz3 = cadz.f172781g;
                if (bzzz3 == null) {
                    bzzz3 = bzzz.f172298f;
                }
                String str3 = bzzz3.f172301b;
                bzzz bzzz4 = cadz2.f172781g;
                if (bzzz4 == null) {
                    bzzz4 = bzzz.f172298f;
                }
                z = str3.equals(bzzz4.f172301b);
            }
            boolean z2 = true;
            if (!z || (!yym.m45038b(cadz, cadz2) && (cadz.f172779e != cadz2.f172779e || !cadz.f172777c.equals(cadz2.f172777c)))) {
                z2 = false;
            }
            i2++;
            if (z2) {
                return cadz2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static cadz m45935a(String str, zrj zrj, String str2) {
        bmxy.m108581a(str);
        bngx a = zrj.mo31392a(str2, null, str, -1, -1);
        if (a.size() > 1) {
            bnsl bnsl = (bnsl) f55647a.mo68387b();
            bnsl.mo68432a("zpc", "a", 197, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("There must be at most one session with identifier %s, but found %s", str, a);
            bngx a2 = a.subList(1, a.size());
            int size = a2.size();
            for (int i = 0; i < size; i++) {
                zrj.mo31393a((cadz) a2.get(i), 0);
            }
        }
        return (cadz) bnjd.m109589b(a, (Object) null);
    }

    /* renamed from: a */
    public static List m45936a(zrj zrj, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        bnre i = zrj.mo31392a(str, str2, str3, -1, 0).listIterator();
        while (i.hasNext()) {
            cadz cadz = (cadz) i.next();
            bmxy.m108596a(yym.m45037b(cadz), "Should return only active sessions: %s", cadz);
            arrayList.add(cadz);
        }
        return arrayList;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zrc.a(caae, java.util.List, boolean):void
     arg types: [caae, bxwc, int]
     candidates:
      zrc.a(caae, long, int):cadp
      zrc.a(caae, long, long):cadp
      zrc.a(caae, java.util.List, boolean):void */
    /* renamed from: a */
    public static void m45937a(zrc zrc, cadz cadz) {
        yym.m45040d(cadz);
        if (cadz.f172782h != 4) {
            cadp a = m45932a(cadz, (caaq) null);
            bxwc bxwc = a.f172714c;
            if (bxwc.size() == 1) {
                caae caae = a.f172713b;
                if (caae == null) {
                    caae = caae.f172323i;
                }
                zrc.mo31369a(caae, (List) bxwc, true);
                return;
            }
            bnsl bnsl = (bnsl) f55647a.mo68387b();
            bnsl.mo68432a("zpc", "a", 111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("Expected 1 session activity segment data point for %s: : %s", yyl.m45030a(a), yyk.m45016a(bxwc));
        }
    }

    /* renamed from: a */
    public static void m45938a(zre zre, cadz cadz) {
        m45939a(zre, cadz, (caaq) null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zrc.a(cadp, boolean):cadp
     arg types: [cadp, int]
     candidates:
      zrc.a(caae, long):int
      zrc.a(caae, int):long
      zrc.a(java.util.List, boolean):bngx
      zrj.a(cadz, int):boolean
      zra.a(int, long):bngx
      zrc.a(cadp, boolean):cadp */
    /* renamed from: a */
    public static void m45939a(zre zre, cadz cadz, caaq caaq) {
        yym.m45040d(cadz);
        zre.mo31366a(m45932a(cadz, caaq), true);
    }
}
