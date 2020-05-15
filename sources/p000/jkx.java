package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: jkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jkx {
    /* renamed from: a */
    public static final byte[] m16858a(byte[] bArr, long j, byte[] bArr2) {
        byte[] bArr3;
        sdo.m34974b(true);
        if (bArr2 == null) {
            bArr3 = ByteBuffer.allocate(bArr.length + 8).put(bArr).putLong(j).array();
        } else {
            bArr3 = ByteBuffer.allocate(bArr.length + bArr2.length + 8).put(bArr).put(bArr2).putLong(j).array();
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr3);
            byte[] digest = instance.digest();
            return new byte[]{digest[0], digest[1]};
        } catch (NoSuchAlgorithmException e) {
            jla.f22734a.mo25418e("Failed to generate EID. eidSeed: %s, startOfPeriodMs: %s, extraEntropy: %s, exception: %s", bArr, Long.valueOf(j), bArr2, e);
            return null;
        }
    }
}
