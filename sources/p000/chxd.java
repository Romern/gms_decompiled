package p000;

import java.util.concurrent.Executor;

/* renamed from: chxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chxd extends chzw {

    /* renamed from: a */
    public final chyc f189437a;

    /* renamed from: b */
    public final String f189438b;

    /* renamed from: c */
    final /* synthetic */ chxe f189439c;

    public chxd(chxe chxe, chyc chyc, String str) {
        this.f189439c = chxe;
        bmxy.m108582a(chyc, "delegate");
        this.f189437a = chyc;
        bmxy.m108582a(str, "authority");
        this.f189438b = str;
    }

    /* renamed from: a */
    public final chxs mo85744a(chtv chtv, chtr chtr, chqo chqo) {
        chxs chxs;
        chqm chqm = chqo.f189009d;
        if (chqm == null) {
            return this.f189437a.mo85744a(chtv, chtr, chqo);
        }
        cidk cidk = new cidk(this.f189437a, chtv, chtr, chqo);
        try {
            chqm.mo85541a(new chqj(this, chtv), (Executor) bmxu.m108565a(chqo.f189008c, this.f189439c.f189440a), cidk);
        } catch (Throwable th) {
            cidk.mo85539a(chuv.f189223j.mo85687a("Credentials should use fail() instead of throwing exceptions").mo85692c(th));
        }
        synchronized (cidk.f189918f) {
            chxs = cidk.f189919g;
            if (chxs == null) {
                cidk.f189921i = new chzf();
                chxs = cidk.f189921i;
                cidk.f189919g = chxs;
            }
        }
        return chxs;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final chyc mo85785c() {
        return this.f189437a;
    }
}
