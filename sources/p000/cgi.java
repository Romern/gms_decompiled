package p000;

/* renamed from: cgi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cgi implements cgj, crj {

    /* renamed from: a */
    private static final C1241og f6790a = crl.m7409a(20, new cgh());

    /* renamed from: b */
    private final crm f6791b = crm.m7411a();

    /* renamed from: c */
    private cgj f6792c;

    /* renamed from: d */
    private boolean f6793d;

    /* renamed from: e */
    private boolean f6794e;

    /* renamed from: a */
    static cgi m4182a(cgj cgj) {
        cgi cgi = (cgi) f6790a.mo8188a();
        crb.m7382a(cgi);
        cgi.f6794e = false;
        cgi.f6793d = true;
        cgi.f6792c = cgj;
        return cgi;
    }

    /* renamed from: aQ */
    public final crm mo3811aQ() {
        return this.f6791b;
    }

    /* renamed from: b */
    public final Object mo3842b() {
        return this.f6792c.mo3842b();
    }

    /* renamed from: c */
    public final int mo3843c() {
        return this.f6792c.mo3843c();
    }

    /* renamed from: d */
    public final synchronized void mo3844d() {
        this.f6791b.mo8190b();
        this.f6794e = true;
        if (!this.f6793d) {
            this.f6792c.mo3844d();
            this.f6792c = null;
            f6790a.mo8189a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo3861e() {
        this.f6791b.mo8190b();
        if (this.f6793d) {
            this.f6793d = false;
            if (this.f6794e) {
                mo3844d();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    /* renamed from: a */
    public final Class mo3841a() {
        return this.f6792c.mo3841a();
    }
}
