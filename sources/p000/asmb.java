package p000;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;

/* renamed from: asmb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asmb {

    /* renamed from: a */
    public final MessageDigest f89218a;

    public asmb(MessageDigest messageDigest) {
        this.f89218a = messageDigest;
    }

    /* renamed from: a */
    public static final byte[] m74367a(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >>> 16), (byte) (i >>> 8), (byte) i};
    }

    public asmb(MessageDigest messageDigest, byte[] bArr) {
        this(messageDigest);
        String algorithm = messageDigest.getAlgorithm();
        if (algorithm.compareTo("SHA-256") != 0 && algorithm.compareTo("SHA-384") != 0) {
            throw new GeneralSecurityException("Invalid digest, only accepts SHA-256 or SHA-384.");
        }
    }

    /* renamed from: a */
    public final byte[] mo49232a(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            byte[] bArr3 = new byte[16];
            int digestLength = this.f89218a.getDigestLength();
            long j = (long) digestLength;
            int i = (int) ((15 + j) / j);
            this.f89218a.reset();
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                byte[] a = m74367a(i3);
                this.f89218a.update(bArr);
                this.f89218a.update(a);
                if (bArr2 != null) {
                    this.f89218a.update(bArr2);
                }
                int i4 = i2 * digestLength;
                System.arraycopy(this.f89218a.digest(), 0, bArr3, i4, Math.min(digestLength, 16 - i4));
                i2 = i3;
            }
            return bArr3;
        }
        throw new GeneralSecurityException("Invalid secret.");
    }
}
