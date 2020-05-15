package p000;

/* renamed from: yrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yrh implements yri {
    /* renamed from: a */
    public static final yre m44659a(cace cace, zrd zrd, caae caae) {
        if (caae == null && (caae = cace.f172534f) == null) {
            caae = caae.f172323i;
        }
        yrd b = yre.m44651b();
        b.f54474a = yrm.m44667a(cace.f172530b, caae, zrd);
        b.f54475b = yrm.m44667a(cace.f172531c, caae, zrd);
        b.f54478e = cace.f172533e;
        b.f54479f = cace.f172532d;
        b.f54480g = cace.f172535g;
        return b.mo30685a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo30687a(yre yre) {
        bxvd da = cace.f172527h.mo74144da();
        bngx a = yrm.m44666a(yre.f54481a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cace cace = (cace) da.f164949b;
        if (!cace.f172530b.mo73666a()) {
            cace.f172530b = GeneratedMessageLite.m124021a(cace.f172530b);
        }
        bxsy.m123078a(a, cace.f172530b);
        bngx a2 = yrm.m44666a(yre.f54482b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cace cace2 = (cace) da.f164949b;
        if (!cace2.f172531c.mo73666a()) {
            cace2.f172531c = GeneratedMessageLite.m124021a(cace2.f172531c);
        }
        bxsy.m123078a(a2, cace2.f172531c);
        String str = yre.f54486f;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cace cace3 = (cace) da.f164949b;
        str.getClass();
        cace3.f172529a |= 1;
        cace3.f172532d = str;
        bngx bngx = yre.f54484d;
        if (bngx != null && !bngx.isEmpty()) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cace cace4 = (cace) da.f164949b;
            if (!cace4.f172533e.mo73666a()) {
                cace4.f172533e = GeneratedMessageLite.m124021a(cace4.f172533e);
            }
            bxsy.m123078a(bngx, cace4.f172533e);
        }
        if (!yre.f54481a.isEmpty()) {
            caae caae = ((cadn) yre.f54481a.get(0)).f172705e;
            if (caae == null) {
                caae = caae.f172323i;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cace cace5 = (cace) da.f164949b;
            caae.getClass();
            cace5.f172534f = caae;
            cace5.f172529a |= 2;
        } else if (!yre.f54482b.isEmpty()) {
            caae caae2 = ((cadn) yre.f54482b.get(0)).f172705e;
            if (caae2 == null) {
                caae2 = caae.f172323i;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cace cace6 = (cace) da.f164949b;
            caae2.getClass();
            cace6.f172534f = caae2;
            cace6.f172529a |= 2;
        }
        return (cace) da.mo74062i();
    }

    /* renamed from: a */
    public final yre mo30688a(byte[] bArr, zrd zrd) {
        return m44659a((cace) GeneratedMessageLite.m124016a(cace.f172527h, bArr, bxus.m123744c()), zrd, null);
    }
}
