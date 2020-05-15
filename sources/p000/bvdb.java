package p000;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: bvdb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvdb implements bvcw {

    /* renamed from: a */
    public volatile boolean f155629a;

    /* renamed from: b */
    private final boolean f155630b;

    /* renamed from: c */
    private final InputStream f155631c;

    /* renamed from: d */
    private final OutputStream f155632d;

    /* renamed from: e */
    private final bvbs f155633e = bvbs.f155560d;

    /* renamed from: f */
    private final byte[] f155634f;

    /* renamed from: g */
    private final byte[] f155635g;

    /* renamed from: h */
    private final ByteBuffer f155636h;

    /* renamed from: i */
    private final ByteBuffer f155637i;

    /* renamed from: j */
    private final Object f155638j;

    /* renamed from: k */
    private bvbs f155639k = bvbs.f155560d;

    public bvdb(boolean z, InputStream inputStream, OutputStream outputStream) {
        this.f155630b = z;
        sdo.m34959a(inputStream);
        this.f155631c = inputStream;
        sdo.m34959a(outputStream);
        this.f155632d = outputStream;
        byte[] bArr = new byte[4];
        this.f155634f = bArr;
        this.f155635g = new byte[4];
        this.f155636h = ByteBuffer.wrap(bArr);
        this.f155637i = ByteBuffer.wrap(this.f155635g);
        this.f155629a = false;
        this.f155638j = new Object();
    }

    /* renamed from: a */
    private static final void m120974a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
        }
    }

    /* renamed from: b */
    public final byte[] mo73143b() {
        byte[] bArr;
        byte[] k;
        if (this.f155629a) {
            srn srn = bvcm.f155598a;
            synchronized (this.f155631c) {
                int i = 0;
                this.f155631c.read(this.f155635g, 0, 4);
                this.f155637i.rewind();
                int i2 = this.f155637i.getInt();
                if (i2 <= 56320) {
                    bArr = new byte[i2];
                    while (i < i2) {
                        i += this.f155631c.read(bArr, i, i2 - i);
                    }
                } else {
                    throw new IOException("Packet is greater than max allowed data size: 51200");
                }
            }
            synchronized (this.f155638j) {
                bvbs bvbs = this.f155639k;
                bxvd bxvd = (bxvd) bvbs.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) bvbs);
                bxvd.f164949b = (GeneratedMessageLite) bxvd.f164949b.mo74142c(4);
                this.f155639k = (bvbs) bxvd.mo74062i();
                bvbs bvbs2 = (bvbs) GeneratedMessageLite.m124016a(bvbs.f155560d, bArr, bxus.m123744c());
                int i3 = bvbs2.f155563b;
                if ((bvbs2.f155562a & 2) != 0) {
                    if (bvbs2.f155564c.mo73744a() > 51200) {
                        int a = bvbs2.f155564c.mo73744a();
                        StringBuilder sb = new StringBuilder(54);
                        sb.append("Data packet greater than allowed max size: ");
                        sb.append(a);
                        throw new IOException(sb.toString());
                    }
                }
                k = bvbs2.f155564c.getKey();
            }
            return k;
        }
        throw new IOException("Not connected.");
    }

    /* renamed from: c */
    public final synchronized void mo73144c() {
        int i;
        if (!this.f155629a) {
            srn srn = bvcm.f155598a;
            if (this.f155630b) {
                this.f155632d.write(1);
                this.f155632d.flush();
                i = this.f155631c.read();
            } else {
                i = this.f155631c.read();
                this.f155632d.write(1);
                this.f155632d.flush();
            }
            int min = Math.min(i, 1);
            if (min > 0) {
                this.f155629a = true;
                return;
            }
            StringBuilder sb = new StringBuilder(53);
            sb.append("Cannot connect, version is not supported: ");
            sb.append(min);
            throw new IOException(sb.toString());
        }
        srn srn2 = bvcm.f155598a;
    }

    public final void close() {
        m120974a(this.f155631c);
        m120974a(this.f155632d);
        synchronized (this) {
            this.f155629a = false;
        }
    }

    /* renamed from: d */
    public final boolean mo73146d() {
        throw null;
    }

    /* renamed from: f */
    public final boolean mo73148f() {
        throw null;
    }

    /* renamed from: a */
    public final void mo73142a(byte[] bArr) {
        byte[] k;
        if (this.f155629a) {
            int length = bArr.length;
            if (length <= 51200) {
                srn srn = bvcm.f155598a;
                synchronized (this.f155633e) {
                    bvbs bvbs = this.f155633e;
                    bxvd bxvd = (bxvd) bvbs.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) bvbs);
                    bxvd.f164949b = (GeneratedMessageLite) bxvd.f164949b.mo74142c(4);
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bvbs bvbs2 = (bvbs) bxvd.f164949b;
                    bvbs bvbs3 = bvbs.f155560d;
                    bvbs2.f155563b = 0;
                    bvbs2.f155562a |= 1;
                    ByteString a = ByteString.m123261a(bArr);
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bvbs bvbs4 = (bvbs) bxvd.f164949b;
                    a.getClass();
                    bvbs4.f155562a |= 2;
                    bvbs4.f155564c = a;
                    k = ((bvbs) bxvd.mo74062i()).serializeToBytes();
                }
                if (k != null) {
                    synchronized (this.f155632d) {
                        this.f155636h.rewind();
                        this.f155636h.putInt(k.length);
                        this.f155632d.write(this.f155634f);
                        this.f155632d.write(k);
                        this.f155632d.flush();
                    }
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder(35);
            sb.append("Data size out of range: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IOException("Not connected.");
    }
}
