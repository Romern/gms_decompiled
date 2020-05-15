package p000;

import java.util.Arrays;

/* renamed from: bsy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsy extends byv {

    /* renamed from: a */
    public static final bze f5555a = new bze((byte) -126, (byte) 7);

    /* renamed from: f */
    private static final bzc f5556f = new bzc(2);

    /* renamed from: b */
    public final int f5557b;

    static {
        bzx bzx = bzx.MSD;
    }

    public bsy(bze bze, byte[] bArr) {
        super(bze, bArr, f5556f);
        boolean z;
        int length = bArr.length;
        if (length < 5) {
            z = false;
        } else {
            z = length <= 14;
        }
        cbb.m3881a(z, "data with length from %s to %s bytes is expected", 5, 14);
        this.f5557b = this.f6229e.length - 4;
    }

    /* renamed from: a */
    public final byte[] mo3474a(int i, int i2) {
        int i3 = i2 + i;
        byte[] bArr = this.f6229e;
        if (i3 <= bArr.length) {
            return Arrays.copyOfRange(bArr, i, i3);
        }
        return null;
    }

    public bsy(byte[] bArr) {
        this(f5555a, bArr);
    }
}
