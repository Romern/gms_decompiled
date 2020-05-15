package p000;

import java.io.IOException;

/* renamed from: bllb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bllb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bllc f126785a;

    /* renamed from: b */
    final /* synthetic */ chvm f126786b;

    public bllb(bllc bllc, chvm chvm) {
        this.f126785a = bllc;
        this.f126786b = chvm;
    }

    public final void run() {
        bllc bllc = this.f126785a;
        chvm chvm = this.f126786b;
        try {
            chvm.mo85712a(bllc.mo66642a());
        } catch (Throwable th) {
            if (th instanceof IOException) {
                chvm.f189272a.mo85539a(chuv.f189229p.mo85687a("Credentials failed to obtain metadata").mo85692c(th));
            } else {
                chvm.f189272a.mo85539a(chuv.f189223j.mo85687a("Failed computing credential metadata").mo85692c(th));
            }
        }
    }
}
