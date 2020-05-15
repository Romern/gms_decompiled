package p000;

/* renamed from: bkmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkmc {

    /* renamed from: a */
    public bkmi f124867a;

    /* renamed from: b */
    public bkmf f124868b;

    /* renamed from: c */
    public bkmt f124869c;

    /* renamed from: d */
    public final bkqk f124870d;

    /* renamed from: e */
    private final bknj f124871e;

    /* renamed from: f */
    private bknp f124872f;

    /* renamed from: g */
    private bkmz f124873g;

    /* renamed from: h */
    private final bkms f124874h;

    /* renamed from: i */
    private boolean f124875i;

    private bkmc(bknj bknj, bklw bklw, bkms bkms) {
        this.f124871e = bknj;
        this.f124874h = bkms;
        bkpw bkpw = bklw.f124858a;
        bksp bksp = new bksp(10485760, bklw.f124859b, 100);
        this.f124870d = bksp;
        bksp.f125230a = bkpw.f125100b == bkwz.READ_WRITE;
        this.f124870d.mo66104a(bkpw.f125101c, bkqw.f125129g);
        this.f124869c = new bkmp(bkpw.f125099a);
        this.f124867a = new bkmi(null, bkpw.f125102d);
        this.f124868b = new bkmf(null, bkpw.f125100b);
    }

    /* renamed from: a */
    public static final bkmc m106124a(bknj bknj, bklw bklw, bkms bkms) {
        return new bkmc(bknj, bklw, bkms);
    }

    /* renamed from: b */
    public final boolean mo66107b() {
        return this.f124872f == null;
    }

    /* renamed from: c */
    public final synchronized void mo66108c() {
        bknp bknp = this.f124872f;
        if (bknp != null) {
            bknp.mo66131b();
        }
        bkmz bkmz = this.f124873g;
        if (bkmz != null) {
            bkmz.mo66131b();
        }
    }

    /* renamed from: d */
    public final synchronized void mo66109d() {
        if (!this.f124875i) {
            bknp bknp = this.f124872f;
            if (bknp != null) {
                bknp.mo66132c();
            }
            bkmz bkmz = this.f124873g;
            if (bkmz != null) {
                bkmz.mo66132c();
            }
        } else {
            throw new IllegalStateException("Document is closed.");
        }
    }

    /* renamed from: a */
    public final void mo66105a() {
        mo66108c();
        this.f124875i = true;
    }

    /* renamed from: a */
    public final void mo66106a(String str) {
        boolean z;
        if (this.f124872f == null) {
            z = true;
        } else {
            z = false;
        }
        bkww.m106783b(z, "Document is already connected.");
        bkpx g = this.f124869c.mo66123g();
        String str2 = g.f125106c;
        this.f124872f = this.f124871e.mo66138b(str, str2);
        this.f124873g = new bkmx(this.f124871e, str, str2);
        this.f124867a = new bkmi(this.f124873g, this.f124867a.mo66112a());
        bkmf bkmf = new bkmf(this.f124873g, this.f124868b.f124878b);
        this.f124868b = bkmf;
        bkmf.mo66111a(new bkmb(this));
        this.f124869c = new bkmo(this.f124872f, this.f124873g, this.f124874h, this.f124870d, g);
    }
}
