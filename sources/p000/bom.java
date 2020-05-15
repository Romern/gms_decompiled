package p000;

import java.io.Serializable;

/* renamed from: bom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bom implements Serializable {

    /* renamed from: a */
    public static final bom f5255a = new bom((byte) -112, (byte) 0);

    /* renamed from: b */
    public final byte[] f5256b;

    static {
        new bom((byte) 106, (byte) -120);
        new bom((byte) 106, (byte) -126);
        new bom((byte) 106, Byte.MIN_VALUE);
        new bom((byte) 98, (byte) -125);
        new bom((byte) 105, (byte) -123);
    }

    public bom(byte b, byte b2) {
        byte[] bArr = new byte[2];
        this.f5256b = bArr;
        bArr[0] = b;
        bArr[1] = b2;
    }

    public final boolean equals(Object obj) {
        bom bom;
        if ((obj instanceof bom) && (bom = (bom) obj) != null) {
            byte[] bArr = this.f5256b;
            byte b = bArr[0];
            byte[] bArr2 = bom.f5256b;
            if (b == bArr2[0] && bArr[1] == bArr2[1]) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String toString() {
        return cbm.m3895a(this.f5256b, false);
    }
}
