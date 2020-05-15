package p000;

import java.net.Socket;

/* renamed from: otm */
final /* synthetic */ class otm implements Runnable {

    /* renamed from: a */
    private final oto f38407a;

    /* renamed from: b */
    private final Socket f38408b;

    public otm(oto oto, Socket socket) {
        this.f38407a = oto;
        this.f38408b = socket;
    }

    public final void run() {
        oto oto = this.f38407a;
        Socket socket = this.f38408b;
        C1585otp otp = oto.f38419f;
        if (otp.f38428i) {
            otp.f38424e.mo17415a(socket);
        }
    }
}
