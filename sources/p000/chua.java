package p000;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: chua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chua {

    /* renamed from: a */
    public final cick f189171a;

    /* renamed from: b */
    public final chue f189172b;

    /* renamed from: c */
    public final /* synthetic */ cicv f189173c;

    public chua() {
    }

    /* renamed from: a */
    public final void mo85667a() {
        chvb chvb = this.f189173c.f189813K;
        if (chvb == null || !chvb.mo85701b()) {
            cicv cicv = this.f189173c;
            if (cicv.f189815M == null) {
                cicv.f189815M = chzp.m149850a();
            }
            long a = this.f189173c.f189815M.mo85845a();
            this.f189173c.f189807E.mo85553a(1, "Scheduling DNS resolution backoff for {0} ns", Long.valueOf(a));
            cicv cicv2 = this.f189173c;
            cicv2.f189813K = cicv2.f189837l.mo85702a(new cice(cicv2), a, TimeUnit.NANOSECONDS, this.f189173c.f189833h.mo85714a());
        }
    }

    /* renamed from: b */
    public final void mo85670b(chuv chuv) {
        cicv.f189797a.logp(Level.WARNING, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[]{this.f189173c.f189832g, chuv});
        cicv cicv = this.f189173c;
        if (cicv.f189814L != 3) {
            cicv.f189807E.mo85553a(3, "Failed to resolve name: {0}", chuv);
            this.f189173c.f189814L = 3;
        }
        cick cick = this.f189171a;
        if (cick == this.f189173c.f189843r) {
            cick.f189770a.f189431b.mo85612a(chuv);
            mo85667a();
        }
    }

    public chua(cicv cicv, cick cick, chue chue) {
        this.f189173c = cicv;
        bmxy.m108582a(cick, "helperImpl");
        this.f189171a = cick;
        bmxy.m108582a(chue, "resolver");
        this.f189172b = chue;
    }

    /* renamed from: a */
    public final void mo85668a(chuc chuc) {
        this.f189173c.f189837l.execute(new cicm(this, chuc));
    }

    /* renamed from: a */
    public final void mo85669a(chuv chuv) {
        bmxy.m108589a(!chuv.mo85689a(), "the error status must not be OK");
        this.f189173c.f189837l.execute(new cicl(this, chuv));
    }
}
