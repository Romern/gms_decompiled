package p000;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: mhn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mhn {
    /* renamed from: a */
    static final byte[] m25123a(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        byte[] copyOf = Arrays.copyOf(bArr2, 12);
        try {
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(2, secretKeySpec, new GCMParameterSpec(128, copyOf));
            return instance.doFinal(bArr2, 12, bArr2.length - 12);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new mhm("Unexpected error when creating cipher: JCE thinks it does not support AES/GCM/NoPadding, but this has existed since Android API level 10.", e);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException e2) {
            throw new mhm("Unable to initialise cipher.", e2);
        } catch (BadPaddingException | IllegalBlockSizeException e3) {
            throw new mhm("Unable to decrypt.", e3);
        }
    }
}
