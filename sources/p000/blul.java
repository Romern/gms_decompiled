package p000;

import java.io.IOException;

/* renamed from: blul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class blul implements blux, blum {

    /* renamed from: a */
    protected final blun f127818a;

    /* renamed from: b */
    public final bluw f127819b;

    /* renamed from: c */
    public final blur f127820c = new blur();

    /* renamed from: d */
    public boolean f127821d = false;

    /* renamed from: e */
    public int f127822e;

    /* renamed from: f */
    private final bluk f127823f = new bluk(this);

    /* renamed from: g */
    private final blus f127824g = new blus();

    /* renamed from: h */
    private final blur f127825h = new blur();

    /* renamed from: i */
    private boolean f127826i = false;

    public blul(blun blun, bluw bluw) {
        this.f127818a = blun;
        this.f127819b = bluw;
        blun.mo66712a(this);
    }

    /* renamed from: a */
    public final synchronized void mo66698a() {
        if (!this.f127826i) {
            this.f127826i = true;
            mo66707c(bluq.m107608a(2, 0)).mo66727a(new bluj(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo66700a(bluq bluq);

    /* renamed from: b */
    public final synchronized bluv mo66704b(byte[] bArr) {
        return this.f127823f.mo66694a(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final synchronized bluv mo66707c(bluq bluq) {
        return this.f127823f.mo66693a(bluq);
    }

    /* renamed from: c */
    public final boolean mo66708c() {
        return this.f127821d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo66709d() {
        return this.f127821d;
    }

    /* renamed from: e */
    public final void mo66710e() {
        mo66705b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public synchronized void mo66705b() {
        boolean d = mo66709d();
        this.f127821d = false;
        if (d) {
            this.f127819b.mo13820b();
        }
        this.f127823f.mo66697b();
        this.f127824g.mo66723a();
        this.f127820c.mo66722b();
        this.f127825h.mo66722b();
    }

    /* renamed from: a */
    public final synchronized void mo66699a(int i) {
        this.f127822e = i;
        boolean z = this.f127821d;
        this.f127821d = true;
        this.f127826i = false;
        if (!z) {
            this.f127819b.mo13814a();
        }
        this.f127823f.mo66695a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final synchronized void mo66706b(bluq bluq) {
        try {
            byte[] a = this.f127824g.mo66724a(bluq);
            if (a != null) {
                this.f127819b.mo13818a(a);
            }
        } catch (blut e) {
            mo66702a(e);
        }
    }

    /* renamed from: a */
    public final synchronized void mo66701a(bluu bluu) {
        this.f127823f.mo66696a(bluu);
        if (!bluu.mo66725b()) {
            mo66702a(bluu.f127832a);
        }
    }

    /* renamed from: a */
    public final synchronized void mo66702a(IOException iOException) {
        mo66698a();
        this.f127819b.mo13815a(iOException);
    }

    /* renamed from: a */
    public final synchronized void mo66703a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length != 0) {
                bluq a = bluq.m107609a(bArr);
                int c = a.mo66718c();
                int a2 = this.f127825h.mo66720a();
                boolean z = true;
                if (c != a2) {
                    this.f127819b.mo13815a(new blut(String.format("expected remote packet counter %s but found %s for packet %s", Integer.valueOf(a2), Integer.valueOf(c), a)));
                    z = false;
                }
                if ((a.f127827a[0] & Byte.MIN_VALUE) != 0) {
                    if (!z) {
                        this.f127825h.mo66721a(a.mo66718c());
                    }
                    mo66700a(a);
                    return;
                } else if (!z) {
                    mo66698a();
                    return;
                } else {
                    mo66706b(a);
                    return;
                }
            }
        }
        mo66702a(new IOException("received empty packet"));
    }
}
