package p000;

/* renamed from: qrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class qrj {

    /* renamed from: a */
    public final boolean f41995a;

    /* renamed from: b */
    public final int f41996b;

    /* renamed from: c */
    protected final bxxk f41997c;

    /* renamed from: d */
    protected final bxxk f41998d;

    protected qrj(boolean z, int i, bxxk bxxk, bxxk bxxk2) {
        this.f41995a = z;
        this.f41996b = i;
        this.f41997c = bxxk;
        this.f41998d = bxxk2;
    }

    /* renamed from: a */
    private final void m32707a(bmxv bmxv) {
        if (this.f41995a) {
            sdo.m34974b(bmxv.mo66813a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bxxc mo24219a(bxxc bxxc, bmxv bmxv);

    /* renamed from: a */
    public abstract String mo24220a(bxxc bxxc);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract bxxc mo24221b(bxxc bxxc, bmxv bmxv);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract qrf mo24222b(bxxc bxxc);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract bxxc mo24223c(bxxc bxxc);

    /* renamed from: c */
    public final bxxc mo24230c(bxxc bxxc, bmxv bmxv) {
        m32707a(bmxv);
        return mo24219a(bxxc, bmxv);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract bnic mo24224d(bxxc bxxc);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo24225e(bxxc bxxc);

    /* renamed from: f */
    public final qrf mo24231f(bxxc bxxc) {
        mo24225e(bxxc);
        return mo24222b(mo24223c(bxxc));
    }

    /* renamed from: a */
    public final bnic mo24226a(qrf qrf) {
        return mo24224d(qrf.f41994c);
    }

    /* renamed from: a */
    public final qrf mo24227a(qtq qtq, bmxv bmxv) {
        try {
            m32707a(bmxv);
            return mo24231f(mo24221b((bxxc) this.f41998d.mo73661b(qtq.f42115d, bxus.m123744c()), bmxv));
        } catch (bxwf e) {
            throw new qrp(769, "Unable to parse sync proto bytes.", e);
        }
    }

    /* renamed from: a */
    public final qrf mo24228a(byte[] bArr) {
        try {
            return mo24231f((bxxc) this.f41997c.mo73662b(bArr, bxus.m123744c()));
        } catch (bxwf e) {
            throw new qrp(769, "Unable to parse data proto bytes.", e);
        }
    }

    /* renamed from: a */
    public final qtp mo24229a(qtq qtq, qrf qrf, bmxv bmxv) {
        boolean z;
        if (this.f41996b == qrf.f41992a) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        bxxb aM = mo24227a(qtq, bmxv).f41994c.mo73645aM();
        aM.mo73628a(qrf.f41994c);
        bxxc i = aM.mo74062i();
        if (mo24220a(i).equals(qtq.f42114c)) {
            try {
                bxxb aM2 = ((bxxc) this.f41998d.mo73661b(qtq.f42115d, bxus.m123744c())).mo73645aM();
                aM2.mo73628a(mo24230c(i, bmxv));
                bxtx aL = aM2.mo74062i().mo73639aL();
                qtp qtp = new qtp(qtq);
                qtp.f42107b = aL;
                return qtp;
            } catch (bxwf e) {
                throw new qrp(769, "Unable to parse sync proto bytes.", e);
            }
        } else {
            throw new qrp(769, "The merged data has a different id.");
        }
    }
}
