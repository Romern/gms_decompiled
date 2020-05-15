package p000;

import android.os.RemoteException;

/* renamed from: gct */
public final /* synthetic */ class gct implements Runnable {

    /* renamed from: a */
    private final gfg f17890a;

    public gct(gfg gfg) {
        this.f17890a = gfg;
    }

    public final void run() {
        try {
            this.f17890a.mo11764a();
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) gdv.f17985a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("gcy", "a", 251, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Couldn't close audio stream");
        }
    }
}
