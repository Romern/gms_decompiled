package p000;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* renamed from: aivx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aivx extends ailj {

    /* renamed from: c */
    public final Socket f69913c;

    public aivx(Socket socket) {
        super(socket.toString());
        this.f69913c = socket;
    }

    /* renamed from: a */
    public final InputStream mo37636a() {
        throw null;
    }

    /* renamed from: b */
    public final OutputStream mo37638b() {
        throw null;
    }

    /* renamed from: c */
    public final void mo37639c() {
        this.f69913c.close();
    }
}
