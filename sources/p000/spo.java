package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: spo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class spo {

    /* renamed from: a */
    private static volatile int f44941a = -1;

    /* renamed from: a */
    public static int m35902a(Context context) {
        if (f44941a == -1) {
            String packageName = context.getPackageName();
            try {
                f44941a = svr.m36484b(context).mo26176b(packageName, 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(packageName);
                Log.w("AndroidUtilsLight", valueOf.length() == 0 ? new String("Could not find package info for package: ") : "Could not find package info for package: ".concat(valueOf));
            }
        }
        return f44941a;
    }

    /* renamed from: a */
    public static MessageDigest m35903a(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static byte[] m35904a(Context context, String str, String str2) {
        return m35905a(svr.m36484b(context).mo26176b(str, 64), str2);
    }

    /* renamed from: a */
    static byte[] m35905a(PackageInfo packageInfo, String str) {
        MessageDigest a;
        if (packageInfo.signatures == null || packageInfo.signatures.length != 1 || (a = m35903a(str)) == null) {
            return null;
        }
        return a.digest(packageInfo.signatures[0].toByteArray());
    }
}
