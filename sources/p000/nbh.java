package p000;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: nbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nbh {

    /* renamed from: a */
    public final long f35180a;

    /* renamed from: b */
    public final long f35181b;

    public nbh(SecretKey secretKey, byte[] bArr) {
        boolean z;
        int length = bArr.length;
        if (length == 32) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder(42);
        sb.append("Requires a 256-bit salt (Got ");
        sb.append(length);
        sb.append(").");
        sdo.m34975b(z, sb.toString());
        byte[] encoded = secretKey.getEncoded();
        if (encoded != null) {
            byte[] bytes = "RabinFingerprint64Mixer".getBytes(StandardCharsets.UTF_8);
            sdo.m34959a(encoded);
            sdo.m34959a(bArr);
            sdo.m34959a(bytes);
            bnzd a = bnzi.m110897a(new SecretKeySpec(bnzi.m110897a(new SecretKeySpec(bArr, "AES")).mo68722a(encoded).mo68740b(), "AES")).mo68732a();
            a.mo68717b(bytes);
            a.mo68717b(nbi.f35182a);
            ByteBuffer wrap = ByteBuffer.wrap(a.mo68729a().mo68740b());
            this.f35180a = wrap.getLong();
            this.f35181b = wrap.getLong() | 1;
            return;
        }
        throw new InvalidKeyException("SecretKey must support encoding for FingerprintMixer.");
    }
}
