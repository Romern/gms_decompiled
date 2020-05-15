package p000;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: aycu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aycu extends OutputStream {

    /* renamed from: a */
    final /* synthetic */ OutputStream f97183a;

    /* renamed from: b */
    final /* synthetic */ aycw f97184b;

    public aycu(aycw aycw, OutputStream outputStream) {
        this.f97184b = aycw;
        this.f97183a = outputStream;
    }

    public final void close() {
        this.f97183a.close();
    }

    public final void flush() {
        this.f97183a.flush();
    }

    public final void write(int i) {
        try {
            this.f97183a.write(i);
        } catch (IOException e) {
            this.f97184b.mo53935a(e.getMessage());
            throw new aycv(e);
        }
    }

    public final void write(byte[] bArr) {
        try {
            this.f97183a.write(bArr);
        } catch (IOException e) {
            this.f97184b.mo53935a(e.getMessage());
            throw new aycv(e);
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        try {
            this.f97183a.write(bArr, i, i2);
        } catch (IOException e) {
            this.f97184b.mo53935a(e.getMessage());
            throw new aycv(e);
        }
    }
}
