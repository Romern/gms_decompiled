package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: qrc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qrc {

    /* renamed from: a */
    public final SecretKey f41990a;

    /* renamed from: b */
    public final SecretKey f41991b;

    public qrc(SecretKey secretKey, SecretKey secretKey2) {
        sdo.m34966a(secretKey, "encryptionKey cannot be null");
        this.f41990a = secretKey;
        sdo.m34966a(secretKey2, "macKey cannot be null");
        this.f41991b = secretKey2;
    }

    /* renamed from: a */
    public static SecretKey m32683a(String str, byte[] bArr, int i) {
        try {
            byte[] array = bmwy.f131156a.newEncoder().encode(CharBuffer.wrap(str)).array();
            char[] cArr = new char[array.length];
            for (int i2 = 0; i2 < array.length; i2++) {
                cArr[i2] = (char) array[i2];
            }
            try {
                return SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(cArr, bArr, i, 128));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                throw new qqw("Failed to generate the secret key.", e);
            }
        } catch (CharacterCodingException e2) {
            throw new qra("Unable to encode the password.", e2);
        }
    }

    /* renamed from: b */
    public final byte[] mo24217b(byte[] bArr) {
        sdo.m34966a(bArr, "encrypted cannot be null");
        int length = bArr.length;
        if (length >= 64) {
            try {
                Mac instance = Mac.getInstance("HmacSHA256");
                instance.init(this.f41991b);
                int i = length - 48;
                instance.update(bArr, 16, i);
                if (Arrays.equals(instance.doFinal(), Arrays.copyOfRange(bArr, length - 32, length))) {
                    try {
                        Cipher instance2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
                        instance2.init(2, this.f41990a, new IvParameterSpec(bArr, 0, 16));
                        try {
                            return instance2.doFinal(bArr, 16, i);
                        } catch (BadPaddingException | IllegalBlockSizeException e) {
                            throw new qra("Unable to decrypt the data.", e);
                        }
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e2) {
                        throw new qqw("Unable to create the decryptor.", e2);
                    }
                } else {
                    throw new qra("Invalid signature.");
                }
            } catch (InvalidKeyException | NoSuchAlgorithmException e3) {
                throw new qqw("Unable to create the hasher.", e3);
            }
        } else {
            throw new qra("Input too short for a valid encrypted blob.");
        }
    }

    /* renamed from: a */
    public static qrc m32684a(byte[] bArr, String str) {
        try {
            byte[] bytes = str.getBytes(bmwy.f131158c);
            sdo.m34975b(true, "cpuMemCost must be a power of 2 greater than 1");
            sdo.m34975b(true, "Memory consumption is too large");
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(bytes, "HmacSHA256"));
            byte[] a = qrd.m32693a(instance, bArr, 11264);
            for (int i = 0; i < 11; i++) {
                int i2 = i * 1024;
                int[] iArr = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
                int[] iArr2 = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
                int[] iArr3 = new int[2097152];
                for (int i3 = 0; i3 < 256; i3++) {
                    int i4 = (i3 * 4) + i2;
                    iArr[i3] = ((a[i4 + 3] << 24) & -16777216) | (a[i4] & 255) | ((a[i4 + 1] << 8) & 65280) | ((a[i4 + 2] << 16) & 16711680);
                }
                for (int i5 = 0; ((long) i5) < 8192; i5 += 2) {
                    System.arraycopy(iArr, 0, iArr3, i5 * PSKKeyManager.MAX_KEY_LENGTH_BYTES, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                    qrd.m32691a(iArr, iArr2);
                    System.arraycopy(iArr2, 0, iArr3, (i5 + 1) * PSKKeyManager.MAX_KEY_LENGTH_BYTES, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                    qrd.m32691a(iArr2, iArr);
                }
                for (int i6 = 0; ((long) i6) < 8192; i6 += 2) {
                    qrd.m32692a(iArr, iArr3, (int) ((qrd.m32690a(iArr) & 8191) * 256), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                    qrd.m32691a(iArr, iArr2);
                    qrd.m32692a(iArr2, iArr3, (int) ((qrd.m32690a(iArr2) & 8191) * 256), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                    qrd.m32691a(iArr2, iArr);
                }
                for (int i7 = 0; i7 < 256; i7++) {
                    int i8 = (i7 * 4) + i2;
                    int i9 = iArr[i7];
                    a[i8] = (byte) i9;
                    a[i8 + 1] = (byte) (i9 >> 8);
                    a[i8 + 2] = (byte) (i9 >> 16);
                    a[i8 + 3] = (byte) (i9 >> 24);
                }
            }
            byte[] a2 = qrd.m32693a(instance, a, 32);
            return new qrc(new SecretKeySpec(a2, 0, 16, "AES"), new SecretKeySpec(a2, 16, 16, "AES"));
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new qqw("Failed to generate the secret key.", e);
        }
    }

    /* renamed from: a */
    public static byte[] m32685a(String str, String str2) {
        return ByteBuffer.allocate(str.length() + str2.length() + 8).putInt(str.length()).put(str.getBytes(bmwy.f131158c)).putInt(str2.length()).put(str2.getBytes(bmwy.f131158c)).array();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final byte[] mo24215a(qrb qrb, String str) {
        sdo.m34966a(qrb, "type cannot be null");
        sdo.m34969a(str, (Object) "name cannot be empty");
        ByteBuffer allocate = ByteBuffer.allocate(4);
        qrb qrb2 = qrb.PASSWORD;
        byte[] a = m32685a(new String(allocate.putInt(qrb.f41989b).array()), str);
        int length = a.length;
        int i = (length + 16) - (length & 15);
        byte[] bArr = new byte[(i + 32)];
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, this.f41990a, new IvParameterSpec(new byte[16]));
            instance.doFinal(a, 0, length, bArr, 0);
            try {
                Mac instance2 = Mac.getInstance("HmacSHA256");
                instance2.init(this.f41991b);
                instance2.update(bArr, 0, i);
                instance2.doFinal(bArr, i);
                return bArr;
            } catch (InvalidKeyException | NoSuchAlgorithmException | ShortBufferException e) {
                throw new qqw("Unable to sign the data.", e);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException | ShortBufferException e2) {
            throw new qqw("Unable to encrypt the data.", e2);
        }
    }

    /* renamed from: a */
    public final byte[] mo24216a(byte[] bArr) {
        sdo.m34966a(bArr, "value cannot be null");
        int length = bArr.length;
        int i = (length + 16) - (length & 15);
        byte[] bArr2 = new byte[(i + 48)];
        byte[] bArr3 = new byte[16];
        new SecureRandom().nextBytes(bArr3);
        System.arraycopy(bArr3, 0, bArr2, 0, 16);
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, this.f41990a, new IvParameterSpec(bArr3));
            instance.doFinal(bArr, 0, length, bArr2, 16);
            try {
                Mac instance2 = Mac.getInstance("HmacSHA256");
                instance2.init(this.f41991b);
                instance2.update(bArr2, 16, i);
                instance2.doFinal(bArr2, i + 16);
                return bArr2;
            } catch (InvalidKeyException | NoSuchAlgorithmException | ShortBufferException e) {
                throw new qqw("Unable to sign the data.", e);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException | ShortBufferException e2) {
            throw new qqw("Unable to encrypt the data.", e2);
        }
    }
}
