package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: aynu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aynu {

    /* renamed from: c */
    private static final char[] f98091c = "0123456789abcdef".toCharArray();

    /* renamed from: a */
    public final byte[] f98092a;

    /* renamed from: b */
    public final ByteOrder f98093b;

    /* renamed from: a */
    public static byte[] m84379a(ByteOrder byteOrder, short... sArr) {
        int length = sArr.length;
        ByteBuffer order = ByteBuffer.allocate(length + length).order(byteOrder);
        for (short s : sArr) {
            order.putShort(s);
        }
        return order.array();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aynu) {
            return Arrays.equals(this.f98092a, ((aynu) obj).f98092a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f98092a);
    }

    public final String toString() {
        byte[] bArr = this.f98092a;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArr) {
            sb.append(f98091c[(b >> 4) & 15]);
            sb.append(f98091c[b & 15]);
        }
        return sb.toString();
    }

    public aynu(byte[] bArr, ByteOrder byteOrder) {
        this.f98092a = bArr;
        this.f98093b = byteOrder;
    }

    /* renamed from: a */
    static short[] m84380a(ByteOrder byteOrder, byte[] bArr) {
        ShortBuffer asShortBuffer = ByteBuffer.wrap(bArr).order(byteOrder).asShortBuffer();
        short[] sArr = new short[asShortBuffer.remaining()];
        asShortBuffer.get(sArr);
        return sArr;
    }
}
