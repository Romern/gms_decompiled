package p000;

/* renamed from: yym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yym {
    /* renamed from: b */
    public static boolean m45037b(cadz cadz) {
        return cadz.f172780f <= 0;
    }

    /* renamed from: c */
    public static String m45039c(cadz cadz) {
        return bzzh.m126348a(cadz.f172782h);
    }

    /* renamed from: d */
    public static String m45040d(cadz cadz) {
        bzzz bzzz = cadz.f172781g;
        if (bzzz == null) {
            bzzz = bzzz.f172298f;
        }
        return String.format("%s{app=%s id=%s activity=%s [%s-%s, active=%s] name=%s desc=%s", cadz.getClass().getSimpleName(), bzzz.f172301b, cadz.f172776b, Integer.valueOf(cadz.f172782h), Long.valueOf(cadz.f172779e), Long.valueOf(cadz.f172780f), Long.valueOf(cadz.f172783i), cadz.f172777c, cadz.f172778d);
    }

    /* renamed from: a */
    public static cadz m45034a(cadz cadz, bzzz bzzz) {
        bxvd bxvd = (bxvd) cadz.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) cadz);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        cadz cadz2 = (cadz) bxvd.f164949b;
        cadz cadz3 = cadz.f172773j;
        bzzz.getClass();
        cadz2.f172781g = bzzz;
        cadz2.f172775a |= 64;
        return (cadz) bxvd.mo74062i();
    }

    /* renamed from: b */
    public static boolean m45038b(cadz cadz, cadz cadz2) {
        return !cadz.f172776b.isEmpty() && cadz.f172776b.equals(cadz2.f172776b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        if (r1.equals(r2) == false) goto L_0x0052;
     */
    /* renamed from: a */
    public static cadz m45035a(cadz cadz, cadz cadz2) {
        boolean z;
        boolean z2;
        boolean b = m45038b(cadz, cadz2);
        long j = cadz.f172779e;
        boolean z3 = false;
        if (j == 0) {
            z = true;
        } else {
            z = b || j == cadz2.f172779e;
        }
        bmxy.m108594a(z, "Session start times differ: %s vs %s", j, cadz2.f172779e);
        if ((cadz.f172775a & 1) == 0) {
            z2 = true;
        } else {
            z2 = b;
        }
        bmxy.m108597a(z2, "Identifiers differ: %s vs %s", cadz.f172776b, cadz2.f172776b);
        if ((cadz.f172775a & 64) != 0) {
            bzzz bzzz = cadz.f172781g;
            if (bzzz == null) {
                bzzz = bzzz.f172298f;
            }
            bzzz bzzz2 = cadz2.f172781g;
            if (bzzz2 == null) {
                bzzz2 = bzzz.f172298f;
            }
        }
        z3 = true;
        bzzz bzzz3 = cadz.f172781g;
        if (bzzz3 == null) {
            bzzz3 = bzzz.f172298f;
        }
        bzzz bzzz4 = cadz2.f172781g;
        if (bzzz4 == null) {
            bzzz4 = bzzz.f172298f;
        }
        bmxy.m108597a(z3, "Applications differ: %s vs %s", bzzz3, bzzz4);
        if (b) {
            return cadz2;
        }
        bxvd bxvd = (bxvd) cadz.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) cadz);
        bxvd.mo73625a((GeneratedMessageLite) cadz2);
        return (cadz) bxvd.mo74062i();
    }

    /* renamed from: a */
    public static String m45036a(cadz cadz) {
        if ((cadz.f172775a & 64) == 0) {
            return null;
        }
        bzzz bzzz = cadz.f172781g;
        if (bzzz == null) {
            bzzz = bzzz.f172298f;
        }
        return bzzz.f172301b;
    }
}
