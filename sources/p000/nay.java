package p000;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: nay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nay {

    /* renamed from: a */
    private final SecretKey f35161a;

    /* renamed from: b */
    private final SecureRandom f35162b;

    public nay(SecretKey secretKey, SecureRandom secureRandom) {
        this.f35161a = secretKey;
        this.f35162b = secureRandom;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.a(java.lang.Object, java.lang.Object):java.lang.Object
      bmxy.a(int, int):void
      bmxy.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final nbc mo20424a(nbw nbw, byte[] bArr) {
        byte[] bArr2 = new byte[12];
        this.f35162b.nextBytes(bArr2);
        try {
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(1, this.f35161a, new GCMParameterSpec(128, bArr2));
            try {
                byte[] doFinal = instance.doFinal(bArr);
                bmxy.m108589a(true, (Object) "Nonce was not correct length");
                return new nav(doFinal, nbw, bArr2);
            } catch (BadPaddingException e) {
                throw new RuntimeException("Impossible: threw BadPaddingException in encrypt mode.");
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new lwh("Impossible condition: JCE thinks it does not support AES/GCM/NoPadding, but this has existed since Android API level 10.", e2);
        } catch (InvalidAlgorithmParameterException e3) {
            throw new lwh("Impossible condition: JCE thinks it does not support GCMParameterSpec, but this has been supported since API level 19.", e3);
        }
    }
}
