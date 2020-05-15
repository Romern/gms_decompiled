package p000;

import java.io.InputStream;

/* renamed from: cipt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cipt extends InputStream {

    /* renamed from: a */
    final /* synthetic */ cipu f191210a;

    public cipt(cipu cipu) {
        this.f191210a = cipu;
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
        return (int) Math.min(this.f191210a.f191213b, 2147483647L);
    }

    public final void close() {
    }

    public final int read() {
        cipu cipu = this.f191210a;
        if (cipu.f191213b > 0) {
            return cipu.mo86305e() & 255;
        }
        return -1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f191210a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append(valueOf);
        sb.append(".inputStream()");
        return sb.toString();
    }

    public final int read(byte[] bArr, int i, int i2) {
        return this.f191210a.mo86280a(bArr, i, i2);
    }
}
