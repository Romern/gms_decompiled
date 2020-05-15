package p000;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: azoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azoh {
    /* renamed from: a */
    public static byte[] m85915a(String str, int i) {
        try {
            byte[] a = m85916a(str.getBytes("UTF-8"));
            int length = a.length;
            if (i > length) {
                return a;
            }
            try {
                byte[] bArr = new byte[i];
                System.arraycopy(a, length - i, bArr, 0, i);
                return bArr;
            } catch (ArrayStoreException | IndexOutOfBoundsException | NullPointerException e) {
                Log.e("ImsiHashUtil", "Exception while copying the hash for truncation");
                throw new RuntimeException(e);
            }
        } catch (UnsupportedEncodingException e2) {
            Log.e("ImsiHashUtil", "Exception while converting the input string to byte array");
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    public static byte[] m85916a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr);
            return instance.digest();
        } catch (NoSuchAlgorithmException e) {
            Log.w("ImsiHashUtil", "SHA-256 not supported");
            throw new RuntimeException(e);
        }
    }
}
