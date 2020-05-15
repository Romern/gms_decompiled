package p000;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: bobd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bobd extends FilterOutputStream {

    /* renamed from: a */
    public long f132491a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bobd(OutputStream outputStream) {
        super(outputStream);
        bmxy.m108581a(outputStream);
    }

    public final void close() {
        this.out.close();
    }

    public final void write(int i) {
        this.out.write(i);
        this.f132491a++;
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        this.f132491a += (long) i2;
    }
}
