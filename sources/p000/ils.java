package p000;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* renamed from: ils */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ils {
    /* renamed from: a */
    private static int m15670a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        android.util.Log.e("GoogleLoginService.Pass", "received bad google_login_public_key: ", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0070, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0071, code lost:
        android.util.Log.e("GoogleLoginService.Pass", "error encrypting password: ", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0077, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007d, code lost:
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0084, code lost:
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0085, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009a, code lost:
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069 A[ExcHandler: InvalidKeyException (r0v10 'e' java.security.InvalidKeyException A[CUSTOM_DECLARE]), Splitter:B:7:0x0023] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070 A[ExcHandler: IllegalBlockSizeException (r0v9 'e' javax.crypto.IllegalBlockSizeException A[CUSTOM_DECLARE]), Splitter:B:7:0x0023] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0077 A[ExcHandler: UnsupportedEncodingException (r0v8 'e' java.io.UnsupportedEncodingException A[CUSTOM_DECLARE]), Splitter:B:7:0x0023] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007e A[ExcHandler: BadPaddingException (r0v7 'e' javax.crypto.BadPaddingException A[CUSTOM_DECLARE]), Splitter:B:7:0x0023] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085 A[ExcHandler: NoSuchPaddingException (r0v6 'e' javax.crypto.NoSuchPaddingException A[CUSTOM_DECLARE]), Splitter:B:7:0x0023] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0091 A[LOOP:0: B:6:0x0021->B:40:0x0091, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0095 A[SYNTHETIC] */
    /* renamed from: a */
    public static String m15671a(String str, Context context) {
        int i;
        String a = ryv.m34680a(context, "google_login_public_key");
        if (a == null) {
            Log.i("GoogleLoginService.Pass", "no public key available, using default");
            a = "AAAAgMom/1a/v0lblO2Ubrt60J2gcuXSljGFQXgcyZWveWLEwo6prwgi3iJIZdodyhKZQrNWp5nKJ3srRXcUW+F1BD3baEVGcmEgqaLZUNBjm057pKRI16kB0YppeGx5qIQ5QjKzsR8ETQbKLNWgRY0QRNVz34kMJR3P/LgHax/6rmf5AAAAAwEAAQ==";
        }
        int i2 = 5;
        byte[] bArr = new byte[5];
        PublicKey a2 = m15672a(a, bArr);
        if (a2 == null) {
            return null;
        }
        int i3 = 1;
        char c = 0;
        while (true) {
            try {
                Cipher instance = Cipher.getInstance("RSA/ECB/OAEPWITHSHA1ANDMGF1PADDING");
                byte[] bytes = str.getBytes("UTF-8");
                int length = ((bytes.length - 1) / 86) + i3;
                byte[] bArr2 = new byte[(length * 133)];
                int i4 = 0;
                while (i4 < length) {
                    instance.init(i3, a2);
                    int i5 = i4 * 86;
                    if (i4 == length - 1) {
                        i = bytes.length - i5;
                    } else {
                        i = 86;
                    }
                    byte[] doFinal = instance.doFinal(bytes, i5, i);
                    int i6 = i4 * 133;
                    System.arraycopy(bArr, 0, bArr2, i6, i2);
                    System.arraycopy(doFinal, 0, bArr2, i6 + 5, doFinal.length);
                    i4++;
                    i2 = 5;
                    i3 = 1;
                }
                return Base64.encodeToString(bArr2, 10);
            } catch (NoSuchAlgorithmException e) {
                e = e;
                if (c > 0) {
                }
            } catch (NoSuchPaddingException e2) {
            } catch (BadPaddingException e3) {
            } catch (UnsupportedEncodingException e4) {
            } catch (IllegalBlockSizeException e5) {
            } catch (InvalidKeyException e6) {
            }
            i2 = 5;
            i3 = 1;
            c = 1;
        }
    }

    /* renamed from: a */
    public static PublicKey m15672a(String str, byte[] bArr) {
        byte[] decode = Base64.decode(str, 0);
        int length = decode.length;
        if (length >= 8) {
            int a = m15670a(decode, 0);
            int a2 = m15670a(decode, a + 4);
            if (length == a + a2 + 8) {
                byte[] bArr2 = new byte[a];
                System.arraycopy(decode, 4, bArr2, 0, a);
                BigInteger bigInteger = new BigInteger(1, bArr2);
                byte[] bArr3 = new byte[a2];
                System.arraycopy(decode, a + 8, bArr3, 0, a2);
                ilr ilr = new ilr(bigInteger, new BigInteger(1, bArr3));
                char c = 0;
                while (true) {
                    try {
                        byte[] digest = MessageDigest.getInstance("SHA-1").digest(decode);
                        bArr[0] = 0;
                        System.arraycopy(digest, 0, bArr, 1, 4);
                        return KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(ilr.f21312a, ilr.f21313b));
                    } catch (NoSuchAlgorithmException e) {
                        if (c <= 0) {
                            c = 1;
                        } else {
                            throw new RuntimeException(e);
                        }
                    } catch (InvalidKeySpecException e2) {
                        Log.e("GoogleLoginService.Pass", "received bad google_login_public_key: ", e2);
                        return null;
                    }
                }
            } else {
                throw new IllegalStateException("Illegally formatted Key, expected length does not match actual length");
            }
        } else {
            throw new IllegalStateException("Illegally formated key: key is too short");
        }
    }
}
