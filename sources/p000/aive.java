package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: aive */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aive extends OutputStream {

    /* renamed from: a */
    final /* synthetic */ aivg f69863a;

    /* renamed from: b */
    private volatile boolean f69864b = false;

    public aive(aivg aivg) {
        this.f69863a = aivg;
    }

    public final void close() {
        this.f69864b = true;
    }

    public final void write(int i) {
        write(new byte[]{(byte) i});
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        if (!this.f69864b) {
            aivg aivg = this.f69863a;
            aivg.f69870f.mo38112a(aivg.f69865a, Arrays.copyOfRange(bArr, i, i2 + i));
            return;
        }
        throw new IOException("Stream is closed");
    }
}
