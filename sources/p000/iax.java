package p000;

import android.content.pm.Signature;
import android.util.Base64;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: iax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iax {

    /* renamed from: a */
    public static final sek f20660a = new sek("AppCodesUtil");

    /* renamed from: b */
    private static final Charset f20661b = Charset.forName("UTF-8");

    /* renamed from: a */
    static final String m15146a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes(f20661b));
            return Base64.encodeToString(Arrays.copyOf(instance.digest(), 9), 3).substring(0, 11);
        } catch (NoSuchAlgorithmException e) {
            f20660a.mo25417e("NoSuchAlgorithmException", e, new Object[0]);
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final String mo12870a(svq svq, String str) {
        Signature[] signatureArr = svq.mo26176b(str, 64).signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            throw new iay("The number of certificates is incorrect");
        }
        String charsString = signatureArr[0].toCharsString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(charsString).length());
        sb.append(str);
        sb.append(" ");
        sb.append(charsString);
        return m15146a(sb.toString());
    }
}
