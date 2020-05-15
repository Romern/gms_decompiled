package p000;

import java.security.InvalidParameterException;
import java.util.Arrays;

/* renamed from: xmg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xmg extends xmk {

    /* renamed from: a */
    private final byte f52734a;

    public xmg(int i, byte b, byte[] bArr) {
        super(bArr);
        bmxy.m108581a(bArr);
        this.f52750d = i;
        if (b >= 0) {
            int length = bArr.length;
            if (length > 59) {
                throw new InvalidParameterException("Data size is greater than maximum of 59");
            } else if (length != 0) {
                this.f52734a = b;
            } else {
                throw new InvalidParameterException("Data size must be greater than 0");
            }
        } else {
            throw new InvalidParameterException("Provided sequence invalid");
        }
    }

    /* renamed from: a */
    public final byte[] mo29940a() {
        byte[] bArr = new byte[5];
        int i = 3;
        int i2 = 0;
        while (i >= 0) {
            bArr[i2] = (byte) (this.f52750d >>> (i * 8));
            i--;
            i2++;
        }
        bArr[i2] = this.f52734a;
        byte[] bArr2 = this.f52749c;
        return bqce.m112562a(bArr, bArr2, new byte[((64 - bArr2.length) - 5)]);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xmg) {
            xmg xmg = (xmg) obj;
            if (!super.equals(obj) || this.f52734a != xmg.f52734a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Byte.valueOf(this.f52734a), Integer.valueOf(Arrays.hashCode(this.f52749c)), Integer.valueOf(this.f52750d)});
    }
}
