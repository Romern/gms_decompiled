package p000;

import com.google.android.gms.common.api.Status;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: brpn */
public final /* synthetic */ class brpn {
    /* renamed from: a */
    public static String m114370a(String str) {
        try {
            return bmwb.m108442a(new String(MessageDigest.getInstance("SHA-256").digest(str.getBytes())));
        } catch (NoSuchAlgorithmException e) {
            brpo.f143138a.mo25418e("Failed to get SHA-256 MessageDigest", new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static void m114371a(brpo brpo, String str) {
        brpo.mo69772a(str, (Status) null);
    }
}
