package p000;

import java.io.OutputStream;

/* renamed from: bsau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsau extends OutputStream {

    /* renamed from: a */
    public int[] f143903a = new int[1];

    /* renamed from: b */
    public int f143904b = 0;

    /* renamed from: c */
    public int f143905c = 0;

    /* renamed from: d */
    private byte[] f143906d = new byte[16];

    /* renamed from: e */
    private int f143907e = 0;

    /* renamed from: a */
    private static int m114962a(int i, int i2, int i3, int i4) {
        int i5 = i2 - i3;
        while (i5 < i) {
            int i6 = i2 >> i4;
            if (i6 > 0) {
                i2 += i6;
                i5 = i2 - i3;
            } else {
                StringBuilder sb = new StringBuilder(63);
                sb.append("Incorrect size [");
                sb.append(i2);
                sb.append("] and rightShiftAmount [");
                sb.append(i4);
                sb.append("]");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return i2;
    }

    /* renamed from: c */
    private final void m114963c(int i) {
        int length = this.f143906d.length;
        int i2 = this.f143904b;
        int i3 = 1;
        if (length - i < i2) {
            int i4 = this.f143907e;
            if (i4 < 64) {
                i3 = 0;
            } else if (i4 >= 128) {
                i3 = 2;
            }
            int a = m114962a(i, length, i2, i3);
            byte[] bArr = this.f143906d;
            if (a > bArr.length) {
                byte[] bArr2 = new byte[a];
                System.arraycopy(bArr, 0, bArr2, 0, this.f143904b);
                this.f143906d = bArr2;
                this.f143907e = 0;
                return;
            }
            return;
        }
        this.f143907e++;
    }

    /* renamed from: b */
    public final void mo70097b(int i) {
        int a = m114962a(1, this.f143903a.length, this.f143905c, 0);
        int[] iArr = this.f143903a;
        if (a > iArr.length) {
            int[] iArr2 = new int[a];
            System.arraycopy(iArr, 0, iArr2, 0, this.f143905c);
            this.f143903a = iArr2;
        }
        int[] iArr3 = this.f143903a;
        int i2 = this.f143905c;
        this.f143905c = i2 + 1;
        iArr3[i2] = i;
    }

    public final void write(int i) {
        m114963c(1);
        byte[] bArr = this.f143906d;
        int i2 = this.f143904b;
        this.f143904b = i2 + 1;
        bArr[i2] = (byte) (i & 255);
    }

    /* renamed from: a */
    public final int mo70095a(int i) {
        return this.f143903a[i];
    }

    public final void write(byte[] bArr) {
        int length = bArr.length;
        m114963c(length);
        System.arraycopy(bArr, 0, this.f143906d, this.f143904b, length);
        this.f143904b += length;
    }

    /* renamed from: a */
    public final void mo70096a(OutputStream outputStream, int i, int i2) {
        outputStream.write(this.f143906d, i, i2);
    }

    public final void write(byte[] bArr, int i, int i2) {
        m114963c(i2);
        System.arraycopy(bArr, i, this.f143906d, this.f143904b, i2);
        this.f143904b += i2;
    }
}
