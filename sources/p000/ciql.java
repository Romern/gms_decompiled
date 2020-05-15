package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: ciql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciql extends InputStream {

    /* renamed from: a */
    final /* synthetic */ ciqm f191246a;

    public ciql(ciqm ciqm) {
        this.f191246a = ciqm;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    public final int available() {
        ciqm ciqm = this.f191246a;
        if (!ciqm.f191249c) {
            return (int) Math.min(ciqm.f191247a.f191213b, 2147483647L);
        }
        throw new IOException("closed");
    }

    public final void close() {
        this.f191246a.close();
    }

    public final int read() {
        ciqm ciqm = this.f191246a;
        if (!ciqm.f191249c) {
            cipu cipu = ciqm.f191247a;
            if (cipu.f191213b == 0 && ciqm.f191248b.mo74995c(cipu, 8192) == -1) {
                return -1;
            }
            return this.f191246a.f191247a.mo86305e() & 255;
        }
        throw new IOException("closed");
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f191246a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append(valueOf);
        sb.append(".inputStream()");
        return sb.toString();
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (!this.f191246a.f191249c) {
            ciqu.m150905a((long) bArr.length, (long) i, (long) i2);
            ciqm ciqm = this.f191246a;
            cipu cipu = ciqm.f191247a;
            if (cipu.f191213b == 0 && ciqm.f191248b.mo74995c(cipu, 8192) == -1) {
                return -1;
            }
            return this.f191246a.f191247a.mo86280a(bArr, i, i2);
        }
        throw new IOException("closed");
    }
}
