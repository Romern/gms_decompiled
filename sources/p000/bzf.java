package p000;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* renamed from: bzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzf extends byv {

    /* renamed from: a */
    public static final bze f6245a = new bze((byte) -1, (byte) -103);

    /* renamed from: b */
    public static final bzc f6246b = new bzc(3);

    static {
        bzx bzx = bzx.MSD;
    }

    @Deprecated
    public bzf(bze bze, byte[] bArr) {
        super(bze, bArr, f6246b);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public bzf(byte[] bArr, long j) {
        super(r0, r1.toByteArray(), f6246b);
        bze bze = f6245a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bArr == null) {
            throw new IllegalArgumentException("IV is null");
        } else if (bArr.length == 8) {
            byteArrayOutputStream.write(bArr, 0, 8);
            byteArrayOutputStream.write(ByteBuffer.allocate(8).putLong(j).array(), 0, 8);
        } else {
            throw new IllegalStateException("IV length is wrong");
        }
    }
}
