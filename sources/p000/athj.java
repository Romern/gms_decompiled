package p000;

import com.google.android.gms.tapandpay.security.StorageKey;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: athj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class athj {

    /* renamed from: a */
    private static final byte[] f90371a = "TapAndPayDEKInfo".getBytes(StandardCharsets.UTF_8);

    /* renamed from: b */
    private static final byte[] f90372b = m75892a("TapAndPaySaltySalt");

    /* renamed from: c */
    private final SecretKeySpec f90373c;

    /* renamed from: d */
    private final SecretKeySpec f90374d;

    public athj(StorageKey storageKey) {
        sdo.m34959a(storageKey);
        try {
            byte[] a = addf.m50204a(new SecretKeySpec(storageKey.f108659b, "AES"), f90372b, f90371a);
            this.f90373c = new SecretKeySpec(a, 0, 16, "AES");
            this.f90374d = new SecretKeySpec(a, 16, 16, "AES");
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new IllegalArgumentException("Invalid storage key", e);
        }
    }

    /* renamed from: a */
    private static byte[] m75892a(String str) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("No security provider initialized yet?", e);
        }
    }

    /* renamed from: b */
    public final byte[] mo49991b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            boolean z = true;
            instance.init(1, this.f90373c);
            byte[] doFinal = instance.doFinal(bArr);
            byte[] iv = instance.getIV();
            byte[] a = m75893a(this.f90374d, doFinal);
            if (a.length != 32) {
                z = false;
            }
            sdo.m34974b(z);
            int length = iv.length;
            int length2 = doFinal.length;
            int i = length + length2;
            byte[] bArr2 = new byte[(i + 32)];
            System.arraycopy(iv, 0, bArr2, 0, length);
            System.arraycopy(doFinal, 0, bArr2, length, length2);
            System.arraycopy(a, 0, bArr2, i, 32);
            return bArr2;
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new IllegalArgumentException("Unable to encrypt payment bundles", e);
        }
    }

    /* renamed from: a */
    private static byte[] m75893a(SecretKeySpec secretKeySpec, byte[] bArr) {
        Mac instance = Mac.getInstance("HmacSHA256");
        instance.init(secretKeySpec);
        return instance.doFinal(bArr);
    }

    /* renamed from: a */
    public final byte[] mo49990a(byte[] bArr) {
        boolean z;
        if (bArr == null) {
            return null;
        }
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            int blockSize = instance.getBlockSize();
            int length = bArr.length;
            if (length >= blockSize) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34974b(z);
            SecretKeySpec secretKeySpec = this.f90374d;
            int i = length - 32;
            int i2 = i - blockSize;
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, blockSize, bArr2, 0, i2);
            byte[] bArr3 = new byte[32];
            System.arraycopy(bArr, i, bArr3, 0, 32);
            byte[] a = m75893a(secretKeySpec, bArr2);
            if (Arrays.equals(a, bArr3)) {
                instance.init(2, this.f90373c, new IvParameterSpec(bArr, 0, blockSize));
                return instance.doFinal(bArr, blockSize, (length - blockSize) - 32);
            }
            String d = srv.m36164d(a);
            String d2 = srv.m36164d(bArr3);
            StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 52 + String.valueOf(d2).length());
            sb.append("hmac did not verify. derivedSignature: ");
            sb.append(d);
            sb.append(" hmacDigest: ");
            sb.append(d2);
            throw new InvalidKeyException(sb.toString());
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new IllegalArgumentException("Unable to decrypt payload", e);
        }
    }
}
