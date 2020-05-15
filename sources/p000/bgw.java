package p000;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: bgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgw {
    /* renamed from: a */
    public static String m2998a(String str, boolean z) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            if (z) {
                instance.update(str.getBytes("UTF-8"));
            } else {
                instance.update(bgx.m3011a(str));
            }
            return bhp.m3056a(instance.digest());
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("core-hceclient", valueOf.length() == 0 ? new String("") : "".concat(valueOf));
            throw new bfq(bha.SHA_MESSAGE_DIGEST_GENERATION_FAILED);
        }
    }

    /* renamed from: a */
    public static MessageDigest m2999a() {
        try {
            return MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("core-hceclient", valueOf.length() == 0 ? new String("") : "".concat(valueOf));
            throw new bfq(bha.SHA_MESSAGE_DIGEST_GENERATION_FAILED);
        }
    }
}
