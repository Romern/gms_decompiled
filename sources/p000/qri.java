package p000;

/* renamed from: qri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qri extends qrj {
    public qri() {
        super(false, 4, (bxxk) quh.f42136e.mo74142c(7), (bxxk) bsth.f147008d.mo74142c(7));
    }

    /* renamed from: a */
    protected static final String m32699a(quh quh) {
        int a = qug.m32916a(quh.f42139b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            qus qus = quh.f42140c;
            if (qus == null) {
                qus = qus.f42187j;
            }
            String valueOf = String.valueOf(qus.f42190b);
            return valueOf.length() == 0 ? new String("Card:") : "Card:".concat(valueOf);
        } else if (i == 2) {
            qut qut = quh.f42141d;
            if (qut == null) {
                qut = qut.f42198h;
            }
            String valueOf2 = String.valueOf(qut.f42201b);
            return valueOf2.length() == 0 ? new String("Address:") : "Address:".concat(valueOf2);
        } else {
            throw new qrp(769, "Unrecognizable autofill_wallet.type.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo24221b(bxxc bxxc, bmxv bmxv) {
        quj quj = ((bsth) bxxc).f147012c;
        if (quj == null) {
            quj = quj.f42147e;
        }
        quh quh = quj.f42152d;
        return quh == null ? quh.f42136e : quh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ bxxc mo24223c(bxxc bxxc) {
        return (quh) bxxc;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ bnic mo24224d(bxxc bxxc) {
        return bnic.m109489a(m32699a((quh) bxxc));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo24225e(bxxc bxxc) {
        quh quh = (quh) bxxc;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ qrf mo24222b(bxxc bxxc) {
        quh quh = (quh) bxxc;
        return new qre(m32699a(quh), quh);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo24219a(bxxc bxxc, bmxv bmxv) {
        quh quh = (quh) bxxc;
        bxvd da = bsth.f147008d.mo74144da();
        String a = m32699a(quh);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((bsth) da.f164949b).f147010a = a;
        bxvd da2 = quj.f42147e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        quj quj = (quj) da2.f164949b;
        quh.getClass();
        quj.f42152d = quh;
        quj.f42149a |= 8;
        quj quj2 = (quj) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        quj2.getClass();
        ((bsth) da.f164949b).f147012c = quj2;
        return (bsth) da.mo74062i();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo24220a(bxxc bxxc) {
        return m32699a((quh) bxxc);
    }
}
