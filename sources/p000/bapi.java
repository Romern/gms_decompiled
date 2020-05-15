package p000;

import java.util.concurrent.CancellationException;

/* renamed from: bapi */
final /* synthetic */ class bapi implements bqeh {

    /* renamed from: a */
    private final bapk f101471a;

    /* renamed from: b */
    private final long f101472b;

    /* renamed from: c */
    private final boolean f101473c;

    /* renamed from: d */
    private final baqa f101474d;

    /* renamed from: e */
    private final Long f101475e;

    /* renamed from: f */
    private final boolean f101476f;

    /* renamed from: g */
    private final boolean f101477g;

    public bapi(bapk bapk, long j, boolean z, baqa baqa, Long l, boolean z2, boolean z3) {
        this.f101471a = bapk;
        this.f101472b = j;
        this.f101473c = z;
        this.f101474d = baqa;
        this.f101475e = l;
        this.f101476f = z2;
        this.f101477g = z3;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bqaq bqaq;
        bapk bapk = this.f101471a;
        long j = this.f101472b;
        boolean z = this.f101473c;
        baqa baqa = this.f101474d;
        Long l = this.f101475e;
        boolean z2 = this.f101476f;
        boolean z3 = this.f101477g;
        Exception exc = (Exception) obj;
        synchronized (bapk.f101495k.f101508j) {
            bxvd da = bpyi.f139852o.mo74144da();
            if (!(exc instanceof baqd)) {
                bqaq = !(exc instanceof CancellationException) ? !(exc instanceof InterruptedException) ? bqaq.EXECUTION_ERROR : bqaq.INTERRUPTED : bqaq.CANCELLED;
            } else {
                bqaq = bapk.m87323a((baqd) exc);
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpyi bpyi = (bpyi) da.f164949b;
            bpyi.f139856c = bqaq.mo3214a();
            bpyi.f139854a |= 2;
            bapk.mo55862a(j, z, baqa, l, z2, z3, da);
        }
        throw exc;
    }
}
