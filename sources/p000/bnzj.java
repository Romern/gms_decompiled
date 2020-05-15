package p000;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: bnzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnzj extends FilterOutputStream {

    /* renamed from: a */
    public final bnzd f132401a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bnzj(bnzc bnzc, OutputStream outputStream) {
        super(outputStream);
        bmxy.m108581a(outputStream);
        bnzd a = bnzc.mo68732a();
        bmxy.m108581a(a);
        this.f132401a = a;
    }

    public final void close() {
        this.out.close();
    }

    public final void write(int i) {
        this.f132401a.mo68716b((byte) i);
        this.out.write(i);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.f132401a.mo68718b(bArr, i, i2);
        this.out.write(bArr, i, i2);
    }
}
