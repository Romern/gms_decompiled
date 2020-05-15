package p000;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: aynf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aynf {
    /* renamed from: a */
    public static byte[] m84291a() {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init(128);
        return instance.generateKey().getEncoded();
    }

    /* renamed from: b */
    public static byte[] m84294b(byte[] bArr, byte[] bArr2) {
        return m84292a(2, bArr, bArr2);
    }

    /* renamed from: a */
    private static byte[] m84292a(int i, byte[] bArr, byte[] bArr2) {
        if (bArr2.length == 16) {
            Cipher instance = Cipher.getInstance("AES/ECB/NoPadding");
            instance.init(i, new SecretKeySpec(bArr, "AES"));
            return instance.doFinal(bArr2);
        }
        throw new IllegalArgumentException("This encrypter only supports 16-byte inputs.");
    }

    /* renamed from: a */
    public static byte[] m84293a(byte[] bArr, byte[] bArr2) {
        return m84292a(1, bArr, bArr2);
    }
}
