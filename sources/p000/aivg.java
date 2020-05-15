package p000;

import java.io.Closeable;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/* renamed from: aivg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aivg implements Closeable {

    /* renamed from: a */
    public final aivw f69865a;

    /* renamed from: b */
    public volatile boolean f69866b = false;

    /* renamed from: c */
    public final PipedInputStream f69867c;

    /* renamed from: d */
    public final PipedOutputStream f69868d;

    /* renamed from: e */
    public final aive f69869e;

    /* renamed from: f */
    public final aivf f69870f;

    public aivg(aivw aivw, aivf aivf) {
        PipedOutputStream pipedOutputStream;
        PipedInputStream pipedInputStream = new PipedInputStream();
        this.f69867c = pipedInputStream;
        this.f69865a = aivw;
        this.f69870f = aivf;
        try {
            pipedOutputStream = new PipedOutputStream(pipedInputStream);
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aivg", "a", 54, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("WifiAwareL2Socket failed to create a PipedOutputStream. All reads will fail.");
            pipedOutputStream = null;
        }
        this.f69868d = pipedOutputStream;
        this.f69869e = new aive(this);
    }

    /* renamed from: a */
    private static PipedOutputStream m58015a(PipedInputStream pipedInputStream) {
        try {
            return new PipedOutputStream(pipedInputStream);
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aivg", "a", 54, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("WifiAwareL2Socket failed to create a PipedOutputStream. All reads will fail.");
            return null;
        }
    }

    public void close() {
        this.f69866b = true;
        srz.m36171a(this.f69868d);
        srz.m36171a((Closeable) this.f69867c);
        srz.m36171a(this.f69869e);
        srn srn = ailf.f69111a;
    }

    /* renamed from: a */
    public final void mo38113a(byte[] bArr) {
        PipedOutputStream pipedOutputStream = this.f69868d;
        if (pipedOutputStream != null) {
            try {
                pipedOutputStream.write(bArr);
                if (cfnv.m140741C()) {
                    this.f69868d.flush();
                }
            } catch (IOException e) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("aivg", "a", 97, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("WifiAwareL2Socket connected to %s encountered an error when receiving incoming data.", this.f69865a);
            }
        } else {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68432a("aivg", "a", 87, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("WifiAwareL2Socket failed to process incoming bytes.");
        }
    }
}
