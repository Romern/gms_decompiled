package p000;

import java.util.Iterator;

/* renamed from: ciby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciby implements Runnable {

    /* renamed from: a */
    final /* synthetic */ cicv f189755a;

    public ciby(cicv cicv) {
        this.f189755a = cicv;
    }

    public final void run() {
        if (!this.f189755a.f189850y.get()) {
            chvb chvb = this.f189755a.f189813K;
            if (chvb != null && chvb.mo85701b()) {
                bmxy.m108601b(this.f189755a.f189842q, "name resolver must be started");
                this.f189755a.mo85961l();
            }
            for (cibi cibi : this.f189755a.f189846u) {
                cibi.f189714e.execute(new cias(cibi));
            }
            Iterator it = this.f189755a.f189847v.iterator();
            if (it.hasNext()) {
                cidn cidn = (cidn) it.next();
                throw null;
            }
        }
    }
}
