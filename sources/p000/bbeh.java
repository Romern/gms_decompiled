package p000;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: bbeh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbeh {

    /* renamed from: a */
    public static final /* synthetic */ int f102478a = 0;

    /* renamed from: b */
    private static final char[] f102479b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m87879a(befa befa, Uri uri) {
        InputStream inputStream;
        String str;
        try {
            inputStream = (InputStream) befa.mo60643a(uri, behs.m95063a(), new beer[0]);
            MessageDigest a = m87881a("SHA1");
            if (a != null) {
                byte[] bArr = new byte[8192];
                for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                    a.update(bArr, 0, read);
                }
                str = m87880a(a.digest());
            } else {
                str = "";
            }
            if (inputStream != null) {
                inputStream.close();
            }
            return str;
        } catch (IOException e) {
            bbev.m87906a("%s: Failed to open file, uri = %s", "FileValidator", uri);
            return "";
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public static String m87880a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length + length)];
        int i = 0;
        for (byte b : bArr) {
            byte b2 = b & 255;
            int i2 = i + 1;
            char[] cArr2 = f102479b;
            cArr[i] = cArr2[b2 >>> 4];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static MessageDigest m87881a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            if (instance != null) {
                return instance;
            }
            return null;
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m87882a(befa befa, Uri uri, String str) {
        return m87879a(befa, uri).equals(str);
    }
}
