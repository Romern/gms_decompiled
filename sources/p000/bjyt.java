package p000;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;

/* renamed from: bjyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjyt {
    /* renamed from: a */
    public static String m104926a(Signature signature, String str) {
        if (!(signature == null || signature.toByteArray() == null || signature.toByteArray().length == 0)) {
            try {
                return srv.m36162b(MessageDigest.getInstance(str).digest(signature.toByteArray()));
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m104927a(PackageInfo packageInfo, String str) {
        HashSet hashSet = new HashSet(1);
        hashSet.add(str);
        if (packageInfo == null || packageInfo.signatures == null) {
            String valueOf = String.valueOf(packageInfo != null ? packageInfo.packageName : "unknown null package");
            Log.e("ApplicationSigningCerti", valueOf.length() == 0 ? new String("Failed to get package signatures from PackageManager for ") : "Failed to get package signatures from PackageManager for ".concat(valueOf));
            return false;
        }
        HashSet hashSet2 = new HashSet(packageInfo.signatures.length);
        int i = 0;
        while (i < packageInfo.signatures.length) {
            String a = m104926a(packageInfo.signatures[i], "SHA-256");
            if (a == null) {
                String str2 = packageInfo.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 84);
                sb.append("At least one of the package certificates obtained from PackageManagerfor ");
                sb.append(str2);
                sb.append(" is invalid");
                Log.e("ApplicationSigningCerti", sb.toString());
                return false;
            } else if (!hashSet2.contains(a)) {
                hashSet2.add(a);
                i++;
            } else {
                String str3 = packageInfo.packageName;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 72);
                sb2.append("Package certificates obtained from PackageManager for ");
                sb2.append(str3);
                sb2.append("contain duplicates");
                Log.e("ApplicationSigningCerti", sb2.toString());
                return false;
            }
        }
        if (hashSet2.equals(hashSet)) {
            return true;
        }
        Log.e("ApplicationSigningCerti", "Mismatched signing certificate fingerprints");
        return false;
    }
}
