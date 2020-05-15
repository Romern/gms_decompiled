package p000;

/* renamed from: xlc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xlc implements xjb {

    /* renamed from: b */
    public static final Logger f52643b = new Logger(new String[]{"NfcChannel"}, (short[]) null);

    /* renamed from: a */
    public final xkx f52644a;

    /* renamed from: c */
    private final bqgj f52645c;

    public xlc(bqgj bqgj, xkx xkx) {
        bmxy.m108581a(bqgj);
        this.f52645c = bqgj;
        this.f52644a = xkx;
    }

    /* renamed from: a */
    private final bqgg m43124a(byte[] bArr) {
        return this.f52645c.mo25819b(new xlb(this, bArr));
    }

    /* renamed from: b */
    public final bqgg mo29890b() {
        bmxy.m108600b(!mo29828a());
        return this.f52645c.mo25813a(new xkz(this), null);
    }

    /* renamed from: c */
    public final bqgg mo29891c() {
        return this.f52645c.mo25813a(new xla(this), null);
    }

    /* renamed from: a */
    public final bqgg mo29826a(xkf xkf) {
        try {
            return bqdx.m112673a(m43124a(xkf.mo29862c()), new xkw(xkf), this.f52645c);
        } catch (bypr e) {
            adbd a = adbe.m50105a();
            a.f61233b = e;
            a.f61234c = 8;
            return bqga.m112777a((Throwable) a.mo33301a());
        }
    }

    /* renamed from: a */
    public final bqgg mo29827a(xle xle) {
        return bqdx.m112673a(m43124a(xle.mo29896a()), new xlh(), this.f52645c);
    }

    /* renamed from: a */
    public final boolean mo29828a() {
        return this.f52644a.f52637a.isConnected();
    }
}
