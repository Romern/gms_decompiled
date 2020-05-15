package p000;

import java.io.InputStream;

/* renamed from: cidz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cidz extends InputStream implements chsj {

    /* renamed from: a */
    final cidy f189939a;

    public cidz(cidy cidy) {
        bmxy.m108582a(cidy, "buffer");
        this.f189939a = cidy;
    }

    public final int available() {
        return ((chyb) this.f189939a).f189507a;
    }

    public final void close() {
        this.f189939a.close();
    }

    public final int read() {
        cidy cidy = this.f189939a;
        if (((chyb) cidy).f189507a == 0) {
            return -1;
        }
        return cidy.mo85810b();
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = ((chyb) this.f189939a).f189507a;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i3, i2);
        this.f189939a.mo85809a(bArr, i, min);
        return min;
    }
}
