package p000;

/* renamed from: qrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qrn extends qrj {

    /* renamed from: e */
    private static final quj f42000e;

    public qrn() {
        super(false, 1, (bxxk) quo.f42179d.mo74142c(7), (bxxk) bsud.f147106f.mo74142c(7));
    }

    /* renamed from: a */
    protected static final String m32731a(quo quo) {
        return qro.m32739a(f42000e, quo.f42182b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo24221b(bxxc bxxc, bmxv bmxv) {
        bsud bsud = (bsud) bxxc;
        bxvd da = quo.f42179d.mo74144da();
        String str = bsud.f147111d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        quo quo = (quo) da.f164949b;
        str.getClass();
        int i = quo.f42181a | 1;
        quo.f42181a = i;
        quo.f42182b = str;
        String str2 = bsud.f147112e;
        str2.getClass();
        quo.f42181a = i | 2;
        quo.f42183c = str2;
        return (quo) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ bxxc mo24223c(bxxc bxxc) {
        return (quo) bxxc;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ bnic mo24224d(bxxc bxxc) {
        return bnic.m109489a(m32731a((quo) bxxc));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo24225e(bxxc bxxc) {
        if (((quo) bxxc).f42182b.isEmpty()) {
            throw new qrl("name", "cannot be empty");
        }
    }

    static {
        bxvd da = quj.f42147e.mo74144da();
        qup qup = qup.f42184a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        quj quj = (quj) da.f164949b;
        qup.getClass();
        quj.f42151c = qup;
        quj.f42149a |= 4;
        f42000e = (quj) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo24219a(bxxc bxxc, bmxv bmxv) {
        quo quo = (quo) bxxc;
        bxvd da = bsud.f147106f.mo74144da();
        String a = m32731a(quo);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsud bsud = (bsud) da.f164949b;
        a.getClass();
        bsud.f147109b = a;
        String str = quo.f42182b;
        str.getClass();
        bsud.f147111d = str;
        String str2 = quo.f42183c;
        str2.getClass();
        bsud.f147112e = str2;
        return (bsud) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ qrf mo24222b(bxxc bxxc) {
        quo quo = (quo) bxxc;
        return new qrh(m32731a(quo), quo);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo24220a(bxxc bxxc) {
        return m32731a((quo) bxxc);
    }
}
