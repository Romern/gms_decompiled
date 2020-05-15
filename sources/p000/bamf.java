package p000;

/* renamed from: bamf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bamf implements banj {

    /* renamed from: a */
    public final Object f101252a = new Object();

    /* renamed from: b */
    private final banj f101253b;

    /* renamed from: c */
    private byjj f101254c;

    /* renamed from: d */
    private byjn f101255d;

    /* renamed from: e */
    private Long f101256e;

    /* renamed from: f */
    private Long f101257f;

    /* renamed from: g */
    private Integer f101258g;

    public bamf(banj banj) {
        this.f101253b = banj;
    }

    /* renamed from: a */
    public final byjj mo55740a(banx banx) {
        byjj byjj;
        byjj byjj2;
        synchronized (this.f101252a) {
            if (this.f101254c == null) {
                try {
                    ByteString a = ((bamo) this.f101253b).f101286g.mo55767a(banx, bamo.f101280a);
                    if (a != null) {
                        byjj2 = (byjj) GeneratedMessageLite.m124007a(byjj.f166658c, a);
                    } else {
                        byjj2 = byjj.f166658c;
                    }
                    this.f101254c = byjj2;
                } catch (bxwf e) {
                    throw new banv("Unable to parse sync token", e);
                }
            }
            byjj = this.f101254c;
        }
        return byjj;
    }

    /* renamed from: a */
    public final void mo55741a() {
        this.f101254c = null;
        this.f101255d = null;
        this.f101256e = null;
        this.f101257f = null;
        this.f101258g = null;
    }

    /* renamed from: b */
    public final byjn mo55747b(banx banx) {
        byjn byjn;
        byjn byjn2;
        synchronized (this.f101252a) {
            if (this.f101255d == null) {
                try {
                    ByteString a = ((bamo) this.f101253b).f101286g.mo55767a(banx, bamo.f101281b);
                    if (a != null) {
                        byjn2 = (byjn) GeneratedMessageLite.m124007a(byjn.f166675c, a);
                    } else {
                        byjn2 = byjn.f166675c;
                    }
                    this.f101255d = byjn2;
                } catch (bxwf e) {
                    throw new banv("Unable to parse channel filter", e);
                }
            }
            byjn = this.f101255d;
        }
        return byjn;
    }

    /* renamed from: c */
    public final long mo55749c(banx banx) {
        long longValue;
        synchronized (this.f101252a) {
            if (this.f101256e == null) {
                this.f101256e = Long.valueOf(baqr.m87410a(((bamo) this.f101253b).f101286g.mo55767a(banx, bamo.f101282c), 0));
            }
            longValue = this.f101256e.longValue();
        }
        return longValue;
    }

    public final void close() {
        synchronized (this.f101252a) {
            this.f101253b.close();
            mo55741a();
        }
    }

    /* renamed from: d */
    public final long mo55752d(banx banx) {
        long longValue;
        synchronized (this.f101252a) {
            if (this.f101257f == null) {
                this.f101257f = Long.valueOf(baqr.m87410a(((bamo) this.f101253b).f101286g.mo55767a(banx, bamo.f101283d), 0));
            }
            longValue = this.f101257f.longValue();
        }
        return longValue;
    }

    /* renamed from: e */
    public final int mo55753e(banx banx) {
        int intValue;
        synchronized (this.f101252a) {
            if (this.f101258g == null) {
                this.f101258g = Integer.valueOf((int) baqr.m87410a(((bamo) this.f101253b).f101286g.mo55767a(banx, bamo.f101284e), -1));
            }
            intValue = this.f101258g.intValue();
        }
        return intValue;
    }

    /* renamed from: c */
    public final void mo55750c(bany bany, long j) {
        bany.mo55792a(this);
        synchronized (this.f101252a) {
            ((bamo) this.f101253b).f101286g.mo55771a(bany, bamo.f101285f, baqr.m87411a(j));
        }
    }

    /* renamed from: b */
    public final void mo55748b(bany bany, long j) {
        bany.mo55792a(this);
        synchronized (this.f101252a) {
            ((bamo) this.f101253b).f101286g.mo55771a(bany, bamo.f101283d, baqr.m87411a(j));
            this.f101257f = Long.valueOf(j);
        }
    }

    /* renamed from: a */
    public final void mo55742a(bany bany) {
        synchronized (this.f101252a) {
            ((bamo) this.f101253b).f101286g.mo55776b(bany, ByteString.f164797b, (ByteString) null);
            mo55741a();
        }
    }

    /* renamed from: a */
    public final void mo55743a(bany bany, int i) {
        bany.mo55792a(this);
        synchronized (this.f101252a) {
            ((bamo) this.f101253b).f101286g.mo55771a(bany, bamo.f101284e, baqr.m87411a((long) i));
            this.f101258g = Integer.valueOf(i);
        }
    }

    /* renamed from: a */
    public final void mo55744a(bany bany, long j) {
        bany.mo55792a(this);
        synchronized (this.f101252a) {
            ((bamo) this.f101253b).f101286g.mo55771a(bany, bamo.f101282c, baqr.m87411a(j));
            this.f101256e = Long.valueOf(j);
        }
    }

    /* renamed from: a */
    public final void mo55745a(bany bany, byjj byjj) {
        bany.mo55792a(this);
        synchronized (this.f101252a) {
            ((bamo) this.f101253b).f101286g.mo55771a(bany, bamo.f101280a, byjj.mo73639aL());
            this.f101254c = byjj;
        }
    }

    /* renamed from: a */
    public final void mo55746a(bany bany, byjn byjn) {
        bany.mo55792a(this);
        synchronized (this.f101252a) {
            ((bamo) this.f101253b).f101286g.mo55771a(bany, bamo.f101281b, byjn.mo73639aL());
            this.f101255d = byjn;
        }
    }
}
