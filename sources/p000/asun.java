package p000;

import android.content.Context;

/* renamed from: asun */
final /* synthetic */ class asun implements Runnable {

    /* renamed from: a */
    private final Context f89758a;

    /* renamed from: b */
    private final asqw f89759b;

    /* renamed from: c */
    private final asqt f89760c;

    public asun(Context context, asqw asqw, asqt asqt) {
        this.f89758a = context;
        this.f89759b = asqw;
        this.f89760c = asqt;
    }

    public final void run() {
        Context context = this.f89758a;
        asqw asqw = this.f89759b;
        try {
            boxe a = asup.m74856a(asqw.f89437a, this.f89760c);
            atam b = asup.m74862b(context, asqw);
            bxvd b2 = b.mo49753b(3, asqw.f89457u);
            if (b2.f164950c) {
                b2.mo74035c();
                b2.f164950c = false;
            }
            bpbx bpbx = (bpbx) b2.f164949b;
            bpbx bpbx2 = bpbx.f135635S;
            a.getClass();
            bpbx.f135659e = a;
            bpbx.f135655a |= 4;
            b.mo49742a((bpbx) b2.mo74062i(), asqw.f89437a);
        } catch (RuntimeException e) {
            bnsl bnsl = (bnsl) asup.f89763a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("asup", "b", 126, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Logging APDU failed");
        }
    }
}
