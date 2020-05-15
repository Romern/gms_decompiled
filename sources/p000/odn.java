package p000;

import java.nio.BufferOverflowException;

/* renamed from: odn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class odn {

    /* renamed from: a */
    public int f37282a;

    /* renamed from: b */
    public int f37283b;

    /* renamed from: c */
    private final byte[] f37284c;

    public odn(byte[] bArr, int i) {
        this.f37284c = bArr;
        this.f37283b = i;
    }

    /* renamed from: a */
    public final int mo22023a() {
        int i = 0;
        while (mo22024a(1) == 0) {
            i++;
        }
        if (i != 0) {
            return (mo22024a(i) | (1 << i)) - 1;
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo22024a(int i) {
        if (this.f37283b >= this.f37284c.length) {
            throw new BufferOverflowException();
        } else if (i <= 32) {
            int i2 = 0;
            while (i > 0) {
                int min = Math.min(i, 8 - this.f37282a);
                byte[] bArr = this.f37284c;
                int i3 = this.f37283b;
                byte b = bArr[i3];
                int i4 = this.f37282a + min;
                i2 = (i2 << min) | ((b >> (8 - i4)) & (-1 ^ (-1 << min)));
                i -= min;
                this.f37282a = i4;
                if (i4 == 8) {
                    this.f37282a = 0;
                    int i5 = i3 + 1;
                    this.f37283b = i5;
                    int length = bArr.length;
                    if (i5 != length) {
                        int i6 = i5 - 2;
                        if (i6 >= 0 && bArr[i5] == 3 && bArr[i5 - 1] == 0 && bArr[i6] == 0) {
                            int i7 = i5 + 1;
                            this.f37283b = i7;
                            if (i7 == length) {
                                throw new BufferOverflowException();
                            }
                        }
                    } else {
                        throw new BufferOverflowException();
                    }
                }
            }
            return i2;
        } else {
            StringBuilder sb = new StringBuilder(27);
            sb.append("Invalid request ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
