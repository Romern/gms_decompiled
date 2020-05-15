package p000;

/* renamed from: mjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class mjk implements mjo {

    /* renamed from: d */
    private static final lvn f33840d = new lvn("AbstractTransport");

    /* renamed from: a */
    public final mjn f33841a;

    /* renamed from: b */
    public final bqgj f33842b;

    /* renamed from: c */
    protected final met f33843c;

    /* renamed from: e */
    private boolean f33844e = false;

    protected mjk(mjn mjn, bqgj bqgj, met met) {
        bmxy.m108581a(mjn);
        this.f33841a = mjn;
        bmxy.m108581a(bqgj);
        this.f33842b = bqgj;
        bmxy.m108581a(met);
        this.f33843c = met;
    }

    /* renamed from: a */
    public final void mo20095a() {
        f33840d.mo25414c("shutdown", new Object[0]);
        if (this.f33844e) {
            f33840d.mo25412b("Already shut down. Ignoring.", new Object[0]);
            return;
        }
        this.f33844e = true;
        mo20098b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo20098b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo20099b(byte[] bArr);

    /* renamed from: c */
    public final void mo20100c() {
        f33840d.mo25412b("onDisconnected", new Object[0]);
        this.f33841a.mo20037b();
        this.f33843c.mo19755a(mo20101d(), 3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract mtf mo20101d();

    /* renamed from: a */
    public final void mo20096a(int i) {
        f33840d.mo25412b("onConnectionResult(%d)", Integer.valueOf(i));
        mjn mjn = this.f33841a;
        if (i == 0) {
            mhv mhv = ((mib) mjn).f33756g;
            mgj.f33623a.logVerbose("Device connected.", new Object[0]);
            mgj mgj = (mgj) mhv;
            mgj.f33638p.mo19910a(mfk.f33578a);
            mgj.f33627e.mo19999a();
            mgj.f33629g.mo19770a();
            this.f33843c.mo19755a(mo20101d(), 2);
            return;
        }
        mhv mhv2 = ((mib) mjn).f33756g;
        mgj.f33623a.logVerbose("Connection failed.", new Object[0]);
        mgj mgj2 = (mgj) mhv2;
        mgj2.f33638p.mo19910a(mfj.f33577a);
        mgj2.mo19989f();
    }

    /* renamed from: a */
    public final void mo20097a(byte[] bArr) {
        f33840d.mo25414c("shutdownWithLastPacket", new Object[0]);
        if (this.f33844e) {
            f33840d.mo25412b("Already shut down. Ignoring.", new Object[0]);
            return;
        }
        this.f33844e = true;
        mo20099b(bArr);
    }
}
