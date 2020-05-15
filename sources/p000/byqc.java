package p000;

import java.io.Closeable;
import java.io.Flushable;
import java.io.OutputStream;

/* renamed from: byqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byqc implements Closeable, Flushable {

    /* renamed from: a */
    public final byqb f167375a = new byqb(true);

    /* renamed from: b */
    private final OutputStream f167376b;

    public byqc(OutputStream outputStream) {
        this.f167376b = outputStream;
    }

    /* renamed from: a */
    private final void m125117a(byte b, byte b2) {
        this.f167375a.mo74463c();
        this.f167376b.write(b | b2);
    }

    public final void close() {
        this.f167376b.close();
        this.f167375a.mo74457a();
    }

    public final void flush() {
        this.f167376b.flush();
    }

    /* renamed from: a */
    public final void mo74465a(byte b, long j) {
        if (j < 24) {
            m125117a(b, (byte) ((int) j));
        } else if (j < 256) {
            m125117a(b, (byte) 24);
            this.f167376b.write((byte) ((int) j));
        } else if (j < 65536) {
            short s = (short) ((int) j);
            m125117a(b, (byte) 25);
            this.f167376b.write(s >> 8);
            this.f167376b.write(s);
        } else if (j >= 4294967296L) {
            m125117a(b, (byte) 27);
            this.f167376b.write((int) (j >> 56));
            this.f167376b.write((int) (j >> 48));
            this.f167376b.write((int) (j >> 40));
            this.f167376b.write((int) (j >> 32));
            this.f167376b.write((int) (j >> 24));
            this.f167376b.write((int) (j >> 16));
            this.f167376b.write((int) (j >> 8));
            this.f167376b.write(((int) j) & 255);
        } else {
            int i = (int) j;
            m125117a(b, (byte) 26);
            this.f167376b.write(i >> 24);
            this.f167376b.write(i >> 16);
            this.f167376b.write(i >> 8);
            this.f167376b.write(i);
        }
    }

    /* renamed from: a */
    public final void mo74466a(byte b, byte[] bArr) {
        mo74465a(b, (long) bArr.length);
        this.f167376b.write(bArr);
    }
}
