package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: bwbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwbc {

    /* renamed from: a */
    public static final String[] f158691a;

    static {
        String[] strArr = {"com.google.android.geo.API_KEY", "com.google.android.maps.v2.API_KEY"};
        f158691a = strArr;
        String str = strArr[0];
    }

    /* renamed from: a */
    public static String m121683a(Context context, String str) {
        byte[] digest;
        try {
            PackageInfo b = svr.m36484b(context).mo26176b(str, 64);
            if (!(b == null || b.signatures == null || b.signatures.length == 0)) {
                if (b.signatures[0] != null) {
                    byte[] byteArray = b.signatures[0].toByteArray();
                    MessageDigest instance = MessageDigest.getInstance("SHA-1");
                    if (!(instance == null || (digest = instance.digest(byteArray)) == null)) {
                        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                        int length = digest.length;
                        StringBuilder sb = new StringBuilder(length + length);
                        for (byte b2 : digest) {
                            sb.append(cArr[(b2 >> 4) & 15]);
                            sb.append(cArr[b2 & 15]);
                        }
                        return sb.toString();
                    }
                }
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        } catch (NoSuchAlgorithmException e2) {
            return null;
        }
    }
}
