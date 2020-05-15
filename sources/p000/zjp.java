package p000;

import android.os.RemoteException;

/* renamed from: zjp */
final /* synthetic */ class zjp implements Runnable {

    /* renamed from: a */
    private final zgg f55235a;

    /* renamed from: b */
    private final cadn f55236b;

    public zjp(zgg zgg, cadn cadn) {
        this.f55235a = zgg;
        this.f55236b = cadn;
    }

    public final void run() {
        zgg zgg = this.f55235a;
        cadn cadn = this.f55236b;
        srn srn = zjr.f55240b;
        try {
            zgg.mo30949a(bngx.m109356a(cadn));
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) zjr.f55240b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("zjr", "a", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Couldn't send event to listener %s", zgg);
        }
    }
}
