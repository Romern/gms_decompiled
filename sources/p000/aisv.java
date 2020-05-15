package p000;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.DataChannel;

/* renamed from: aisv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aisv extends ailj {

    /* renamed from: c */
    public final DataChannel f69655c;

    /* renamed from: d */
    public final Object f69656d = new Object();

    /* renamed from: e */
    public final PipedInputStream f69657e;

    /* renamed from: f */
    public final PipedOutputStream f69658f;

    /* renamed from: g */
    public final OutputStream f69659g = new aisu(this);

    /* renamed from: h */
    private final AtomicBoolean f69660h = new AtomicBoolean(false);

    public aisv(String str, DataChannel dataChannel) {
        super(str);
        this.f69655c = dataChannel;
        this.f69657e = new PipedInputStream();
        this.f69658f = new PipedOutputStream(this.f69657e);
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
        if (!mo37980e()) {
            this.f69660h.set(true);
            srz.m36171a(this.f69658f);
            srz.m36171a((Closeable) this.f69657e);
            DataChannel dataChannel = this.f69655c;
            dataChannel.mo86770b();
            dataChannel.nativeClose();
            mo37979d();
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aisv", "c", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Closed WebRTC socket.");
        }
    }

    /* renamed from: d */
    public final void mo37979d() {
        synchronized (this.f69656d) {
            this.f69656d.notifyAll();
        }
    }

    /* renamed from: e */
    public final boolean mo37980e() {
        return this.f69660h.get();
    }

    /* renamed from: a */
    public final void mo37978a(byte[] bArr) {
        try {
            this.f69658f.write(bArr);
            this.f69658f.flush();
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aisv", "a", 118, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to write to WebRtcSocket pipe.");
            mo37639c();
        }
    }
}
