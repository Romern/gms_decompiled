package p000;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: airy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class airy extends ailj {

    /* renamed from: c */
    public final aisb f69606c;

    /* renamed from: d */
    public final PipedInputStream f69607d;

    /* renamed from: e */
    public final PipedOutputStream f69608e;

    /* renamed from: f */
    public final PipedInputStream f69609f;

    /* renamed from: g */
    private final ahfi f69610g;

    /* renamed from: h */
    private final ScheduledExecutorService f69611h;

    /* renamed from: i */
    private final PipedOutputStream f69612i;

    public airy() {
        super("IncomingNfcSocket");
        this.f69611h = ahhr.m55804a();
        this.f69607d = new PipedInputStream(131070);
        this.f69609f = new PipedInputStream(131070);
        this.f69606c = null;
        this.f69610g = null;
        this.f69612i = m57834a(this.f69607d);
        this.f69608e = m57834a(this.f69609f);
    }

    /* renamed from: a */
    private static PipedOutputStream m57834a(PipedInputStream pipedInputStream) {
        try {
            return new PipedOutputStream(pipedInputStream);
        } catch (IOException e) {
            return null;
        }
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
        ahhr.m55805a(this.f69611h, "NearFieldCommunicationSocket.dataExecutor");
        ahfi ahfi = this.f69610g;
        if (ahfi != null) {
            ahfi.mo36396b();
        }
        aisb aisb = this.f69606c;
        if (aisb != null) {
            aisb.close();
        }
        srz.m36171a((Closeable) this.f69609f);
        srz.m36171a(this.f69612i);
        srz.m36171a((Closeable) this.f69607d);
        srz.m36171a(this.f69608e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo37918d() {
        try {
            byte[] a = mo37917a(this.f69606c.mo37929b());
            int b = this.f69606c.mo37929b();
            while (true) {
                airu a2 = this.f69606c.mo37927a(new airt(Byte.MIN_VALUE, (byte) 3, (byte) 0, (byte) 0, a, b));
                if (!a2.mo37911c()) {
                    mo37916a(a2.f69600a);
                    try {
                        if (this.f69609f.available() > 0) {
                            continue;
                        }
                    } catch (IOException e) {
                    }
                    if (a2.f69600a.length <= 0) {
                        return;
                    }
                } else {
                    srz.m36171a(this);
                    return;
                }
            }
        } catch (IOException e2) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68437a(e2);
            bnsl.mo68432a("airy", "d", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("NearFieldCommunicationSocket encountered an error when sending DATA command.");
            srz.m36171a(this);
        }
    }

    /* renamed from: a */
    public final void mo37916a(byte[] bArr) {
        PipedOutputStream pipedOutputStream = this.f69612i;
        if (pipedOutputStream != null) {
            try {
                pipedOutputStream.write(bArr);
                if (cfnv.m140741C()) {
                    this.f69612i.flush();
                }
            } catch (IOException e) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("airy", "a", 140, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("NearFieldCommunicationSocket encountered an error when receiving incoming data.");
            }
        } else {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68432a("airy", "a", 130, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("NearFieldCommunicationSocket failed to process incoming bytes.");
        }
    }

    public airy(aisb aisb) {
        super(aisb.toString());
        this.f69611h = ahhr.m55804a();
        this.f69607d = new PipedInputStream(131070);
        this.f69609f = new PipedInputStream(131070);
        this.f69606c = aisb;
        srn srn = ailf.f69111a;
        this.f69610g = ahfi.m55634a(new airx(this), cfnv.f184625a.mo6606a().mo81786as(), this.f69611h);
        this.f69612i = m57834a(this.f69607d);
        this.f69608e = m57834a(this.f69609f);
    }

    /* renamed from: a */
    public final byte[] mo37917a(int i) {
        try {
            if (this.f69609f.available() == 0) {
                return new byte[0];
            }
            byte[] bArr = new byte[i];
            int read = this.f69609f.read(bArr);
            if (read >= 0) {
                byte[] bArr2 = new byte[read];
                System.arraycopy(bArr, 0, bArr2, 0, read);
                return bArr2;
            }
            srz.m36171a(this);
            return new byte[0];
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("airy", "a", 170, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("NearFieldCommunicationSocket encountered an error when reading outgoing data.");
            srz.m36171a(this);
            return new byte[0];
        }
    }
}
