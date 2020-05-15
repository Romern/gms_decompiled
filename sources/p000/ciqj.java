package p000;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ciqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciqj extends OutputStream {

    /* renamed from: a */
    final /* synthetic */ ciqk f191242a;

    public ciqj(ciqk ciqk) {
        this.f191242a = ciqk;
    }

    public final void close() {
        this.f191242a.close();
    }

    public final void flush() {
        ciqk ciqk = this.f191242a;
        if (!ciqk.f191245c) {
            ciqk.flush();
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f191242a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append(valueOf);
        sb.append(".outputStream()");
        return sb.toString();
    }

    public final void write(int i) {
        ciqk ciqk = this.f191242a;
        if (!ciqk.f191245c) {
            ciqk.f191243a.mo86316h((int) ((byte) i));
            this.f191242a.mo86330p();
            return;
        }
        throw new IOException("closed");
    }

    public final void write(byte[] bArr, int i, int i2) {
        ciqk ciqk = this.f191242a;
        if (!ciqk.f191245c) {
            ciqk.f191243a.mo86294b(bArr, i, i2);
            this.f191242a.mo86330p();
            return;
        }
        throw new IOException("closed");
    }
}
