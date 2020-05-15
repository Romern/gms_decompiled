package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: xlm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xlm implements xjb {

    /* renamed from: d */
    public static final Logger f52666d = new Logger(new String[]{"UsbChannel"}, (short[]) null);

    /* renamed from: a */
    public final xmh f52667a;

    /* renamed from: b */
    public final AtomicInteger f52668b = new AtomicInteger(-1);

    /* renamed from: c */
    public final AtomicBoolean f52669c = new AtomicBoolean(false);

    /* renamed from: e */
    private final bqgj f52670e;

    public xlm(bqgj bqgj, xmh xmh) {
        sdo.m34959a(bqgj);
        this.f52670e = bqgj;
        this.f52667a = xmh;
    }

    /* renamed from: a */
    private final bqgg m43140a(xmf xmf, byte[] bArr) {
        return this.f52670e.mo25819b(new xll(this, xmf, bArr));
    }

    /* renamed from: b */
    public final bqgg mo29908b() {
        sdo.m34970a(!mo29828a());
        return this.f52670e.mo25813a(new xlj(this), null);
    }

    /* renamed from: c */
    public final bqgg mo29909c() {
        return this.f52670e.mo25813a(new xlk(this), null);
    }

    /* renamed from: a */
    public final bqgg mo29826a(xkf xkf) {
        try {
            return bqdx.m112673a(m43140a(xmf.CMD_CBOR, xkf.mo29862c()), new xkw(xkf), this.f52670e);
        } catch (bypr e) {
            adbd a = adbe.m50105a();
            a.f61233b = e;
            a.f61234c = 8;
            return bqga.m112777a((Throwable) a.mo33301a());
        }
    }

    /* renamed from: a */
    public final bqgg mo29827a(xle xle) {
        return bqdx.m112673a(m43140a(xmf.CMD_MSG, xle.mo29896a()), new xlh(), this.f52670e);
    }

    /* renamed from: a */
    public final boolean mo29828a() {
        return this.f52669c.get();
    }
}
