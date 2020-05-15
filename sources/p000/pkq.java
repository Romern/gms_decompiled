package p000;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: pkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pkq extends OutputStream {

    /* renamed from: a */
    private final pko f39520a;

    public pkq(pko pko) {
        this.f39520a = pko;
    }

    public final void write(int i) {
        pko pko = this.f39520a;
        byte b = (byte) (i & 255);
        if (pko.mo23334d() > 0) {
            pko.mo23328a(b);
            return;
        }
        throw new IOException("Buffer overflow");
    }

    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        pko pko = this.f39520a;
        if (pko.mo23334d() >= i2) {
            if (!pko.f39515e) {
                int i4 = pko.f39513c;
                int i5 = pko.f39512b;
                if (i4 >= i5) {
                    i3 = pko.f39511a.length - i4;
                } else {
                    i3 = i5 - i4;
                }
            } else {
                i3 = pko.f39511a.length;
            }
            int min = Math.min(i2, i3);
            System.arraycopy(bArr, i, pko.f39511a, pko.f39513c, min);
            pko.mo23331b(min);
            int i6 = i + min;
            int i7 = i2 - min;
            if (i7 > 0) {
                System.arraycopy(bArr, i6, pko.f39511a, pko.f39513c, i7);
                pko.mo23331b(i7);
                return;
            }
            return;
        }
        throw new IOException("Buffer overflow");
    }
}
