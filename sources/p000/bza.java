package p000;

import java.io.ByteArrayOutputStream;

/* renamed from: bza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bza extends bwy {

    /* renamed from: a */
    public static final bze f6237a = new bze(Byte.MIN_VALUE, (byte) 0);

    /* renamed from: b */
    public static final bzc f6238b = new bzc(3);

    static {
        bzx bzx = bzx.MSD;
    }

    @Deprecated
    public bza(bze bze, byte[] bArr) {
        super(bze, bArr, f6238b);
    }

    public bza(byte[] bArr) {
        super(f6237a, bArr, f6238b);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public bza(byte[]... bArr) {
        super(r0, r1.toByteArray(), f6238b);
        bze bze = f6237a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (byte[] bArr2 : bArr) {
            byteArrayOutputStream.write(bArr2, 0, bArr2.length);
        }
    }
}
