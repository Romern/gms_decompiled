package p000;

/* renamed from: ciau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciau implements Runnable {

    /* renamed from: a */
    final /* synthetic */ chuv f189683a;

    /* renamed from: b */
    final /* synthetic */ cibi f189684b;

    public ciau(cibi cibi, chuv chuv) {
        this.f189684b = cibi;
        this.f189683a = chuv;
    }

    public final void run() {
        if (this.f189684b.f189723n.f189033a != chrg.SHUTDOWN) {
            cibi cibi = this.f189684b;
            cibi.f189724o = this.f189683a;
            cidb cidb = cibi.f189722m;
            cibi cibi2 = this.f189684b;
            chyc chyc = cibi2.f189721l;
            cibi2.f189722m = null;
            this.f189684b.f189721l = null;
            this.f189684b.mo85896a(chrg.SHUTDOWN);
            this.f189684b.f189715f.mo85886a();
            if (this.f189684b.f189719j.isEmpty()) {
                this.f189684b.mo85901d();
            }
            this.f189684b.mo85902e();
            if (cidb != null) {
                cidb.mo85746a(this.f189683a);
            }
            if (chyc != null) {
                chyc.mo85746a(this.f189683a);
            }
        }
    }
}
