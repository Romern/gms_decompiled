package p000;

/* renamed from: afsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afsb implements afxu {

    /* renamed from: a */
    private final bbks f64653a;

    /* renamed from: b */
    private final bbmn f64654b;

    public afsb(bbks bbks, bbmn bbmn) {
        this.f64653a = bbks;
        this.f64654b = bbmn;
    }

    /* renamed from: a */
    public static bbjq m53492a(bbjq bbjq) {
        return bbjq.mo56174a(((bxxc) bbjq.f102773a).mo73642k()).mo56173a();
    }

    /* renamed from: b */
    public final bqgg mo35011b(afrg afrg, byte[] bArr) {
        afrg afrg2 = afrg.UNKNOWN;
        int ordinal = afrg.ordinal();
        if (ordinal == 1) {
            return bqdf.m112620a(bqdx.m112673a(this.f64654b.mo56207a(1), afry.f64651a, bqfb.INSTANCE), Exception.class, afrz.f64652a, bqfb.INSTANCE);
        }
        if (ordinal == 2) {
            return bqdf.m112620a(bqdx.m112673a(this.f64654b.mo56210a((btev) m53493a(afrl.f64638a, bArr)), afrm.f64639a, bqfb.INSTANCE), Exception.class, afrn.f64640a, bqfb.INSTANCE);
        }
        if (ordinal == 3) {
            return bqdf.m112620a(bqdx.m112673a(this.f64654b.mo56209a((btet) m53493a(afro.f64641a, bArr)), afrp.f64642a, bqfb.INSTANCE), Exception.class, afrq.f64643a, bqfb.INSTANCE);
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private static bxxc m53493a(afsa afsa, byte[] bArr) {
        try {
            return afsa.mo35008a(bArr);
        } catch (bxwf e) {
            throw new afxs(e);
        }
    }

    /* renamed from: a */
    public final afyd mo35009a() {
        return afyd.PROFILE_SYNC;
    }

    /* renamed from: a */
    public final bqgg mo35010a(afrg afrg, byte[] bArr) {
        afrg afrg2 = afrg.UNKNOWN;
        int ordinal = afrg.ordinal();
        if (ordinal == 1) {
            return bqdf.m112620a(bqdx.m112673a(this.f64653a.mo56194a(1), afrk.f64637a, bqfb.INSTANCE), Exception.class, afrr.f64644a, bqfb.INSTANCE);
        }
        if (ordinal == 2) {
            return bqdf.m112620a(bqdx.m112673a(this.f64653a.mo56196a((btev) m53493a(afrs.f64645a, bArr)), afrt.f64646a, bqfb.INSTANCE), Exception.class, afru.f64647a, bqfb.INSTANCE);
        }
        if (ordinal == 3) {
            return bqdf.m112620a(bqdx.m112673a(this.f64653a.mo56195a((btet) m53493a(afrv.f64648a, bArr)), afrw.f64649a, bqfb.INSTANCE), Exception.class, afrx.f64650a, bqfb.INSTANCE);
        }
        throw new UnsupportedOperationException();
    }
}
