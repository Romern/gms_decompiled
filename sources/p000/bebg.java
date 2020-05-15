package p000;

import android.content.pm.Signature;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: bebg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bebg {
    /* renamed from: a */
    public static String m91713a(Signature signature) {
        try {
            return boan.f132472f.mo68794a(MessageDigest.getInstance("SHA-1").digest(signature.toByteArray()));
        } catch (NoSuchAlgorithmException e) {
            Log.e("CredentialsHelper", "Unable to get certificate fingerprint.", e);
            return null;
        }
    }
}
