package p000;

import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: bfmr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfmr {
    @Deprecated
    /* renamed from: a */
    public static InputStream m97274a(InputStream inputStream, SecretKey secretKey) {
        if (secretKey != null) {
            byte[] bArr = new byte[16];
            inputStream.read(bArr);
            try {
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                instance.init(2, secretKey, ivParameterSpec);
                return new CipherInputStream(inputStream, instance);
            } catch (GeneralSecurityException e) {
                String valueOf = String.valueOf(e.getMessage());
                throw new IOException(valueOf.length() == 0 ? new String("failed to create decrypt cipher: ") : "failed to create decrypt cipher: ".concat(valueOf));
            }
        } else {
            throw new IOException("SecretKey not found.");
        }
    }
}
