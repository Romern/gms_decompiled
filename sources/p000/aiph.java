package p000;

import java.io.IOException;

/* renamed from: aiph */
final /* synthetic */ class aiph implements Runnable {

    /* renamed from: a */
    private final aipk f69430a;

    /* renamed from: b */
    private final bqgy f69431b;

    public aiph(aipk aipk, bqgy bqgy) {
        this.f69430a = aipk;
        this.f69431b = bqgy;
    }

    public final void run() {
        aipk aipk = this.f69430a;
        bqgy bqgy = this.f69431b;
        try {
            aipk.f69436c.connect();
            if (bqgy.isCancelled()) {
                bqgy.mo69136a((Throwable) new IOException());
            } else {
                bqgy.mo69138b((Object) true);
            }
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aipk", "f", 165, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("Failed to connect via insecure L2cap BluetoothSocket to %s", aipk.f69435b);
            bqgy.mo69136a((Throwable) new IOException());
        }
    }
}
