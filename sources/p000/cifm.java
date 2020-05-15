package p000;

import java.io.IOException;
import java.net.Socket;

/* renamed from: cifm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cifm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ cifo f190010a;

    public cifm(cifo cifo) {
        this.f190010a = cifo;
    }

    public final void run() {
        try {
            ciqq ciqq = this.f190010a.f190017f;
            if (ciqq != null) {
                ciqq.close();
            }
        } catch (IOException e) {
            this.f190010a.f190014c.mo86031a(e);
        }
        try {
            Socket socket = this.f190010a.f190018g;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e2) {
            this.f190010a.f190014c.mo86031a(e2);
        }
    }
}
