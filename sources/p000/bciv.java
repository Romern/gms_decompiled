package p000;

import java.util.concurrent.Future;

/* renamed from: bciv */
final /* synthetic */ class bciv implements bqeg {

    /* renamed from: a */
    private final bcjm f104260a;

    /* renamed from: b */
    private final bqgg f104261b;

    /* renamed from: c */
    private final bceh f104262c;

    public bciv(bcjm bcjm, bqgg bqgg, bceh bceh) {
        this.f104260a = bcjm;
        this.f104261b = bqgg;
        this.f104262c = bceh;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        bcjm bcjm = this.f104260a;
        bqgg bqgg = this.f104261b;
        bceh bceh = this.f104262c;
        try {
            bqga.m112780a((Future) bqgg);
            return bqgg;
        } catch (Throwable th) {
            chuv a = chuv.m149608a(th);
            bceq bceq = bcjm.f104333b;
            if (bceq.m88888a(a)) {
                bqgy c = bqgy.m112818c();
                bqga.m112781a(bqgg, new bcep(bceq, bceh, c), bqfb.INSTANCE);
                return c;
            }
            String valueOf = String.valueOf(a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 63);
            sb.append("Non retryable error, Retry Category:CLIENT_BLOCKING_RPC Status:");
            sb.append(valueOf);
            bbos.m88289a("RetryManager", sb.toString());
            return bqgg;
        }
    }
}
