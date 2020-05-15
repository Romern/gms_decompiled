package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Random;
import java.util.UUID;

/* renamed from: ayoc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayoc {
    @Deprecated

    /* renamed from: a */
    public static final UUID f98112a = aynt.m84375a((short) 4661);

    static {
        aynt.m84377b((short) 4661);
    }

    /* renamed from: a */
    public static int m84381a(ayob ayob, byte[] bArr, byte[] bArr2) {
        byte[] b = aynf.m84294b(bArr, bArr2);
        byte b2 = b[0];
        ayob ayob2 = ayob.SEEKER;
        byte b3 = ayob.f98111c;
        if (b2 == b3) {
            return ByteBuffer.allocate(4).put((byte) 0).put(b, 1, 3).getInt(0);
        }
        StringBuilder sb = new StringBuilder(50);
        sb.append("Wrong Passkey Block type (expected ");
        sb.append((int) b3);
        sb.append(", got ");
        sb.append((int) b2);
        sb.append(")");
        throw new GeneralSecurityException(sb.toString());
    }

    /* renamed from: a */
    public static byte[] m84382a(ayob ayob, byte[] bArr, int i) {
        boolean z;
        if (i <= 0 || i >= 16777216) {
            z = false;
        } else {
            z = true;
        }
        bmxy.m108591a(z, "Passkey %s must be positive and fit in 3 bytes", i);
        byte[] bArr2 = {(byte) (i >>> 16), (byte) (i >>> 8), (byte) i};
        byte[] bArr3 = new byte[12];
        new Random().nextBytes(bArr3);
        ayob ayob2 = ayob.SEEKER;
        return aynf.m84293a(bArr, bqce.m112562a(new byte[]{ayob.f98111c}, bArr2, bArr3));
    }
}
