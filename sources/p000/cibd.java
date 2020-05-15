package p000;

/* renamed from: cibd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cibd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ cibg f189702a;

    public cibd(cibg cibg) {
        this.f189702a = cibg;
    }

    public final void run() {
        boolean z;
        cibg cibg = this.f189702a;
        cibi cibi = cibg.f189708c;
        cibi.f189725p = null;
        if (cibi.f189724o == null) {
            chyc chyc = cibi.f189721l;
            chyc chyc2 = cibg.f189706a;
            if (chyc == chyc2) {
                cibi.f189722m = chyc2;
                this.f189702a.f189708c.f189721l = null;
                this.f189702a.f189708c.mo85896a(chrg.READY);
                return;
            }
            return;
        }
        if (cibi.f189722m == null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Unexpected non-null activeTransport");
        cibg cibg2 = this.f189702a;
        cibg2.f189706a.mo85746a(cibg2.f189708c.f189724o);
    }
}
