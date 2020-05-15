package p000;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: aoan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoan {

    /* renamed from: a */
    private final PackageManager f78042a;

    public aoan(PackageManager packageManager) {
        this.f78042a = packageManager;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006e  */
    /* renamed from: a */
    public static String m65705a(PackageManager packageManager, String str) {
        String str2;
        aoan aoan = new aoan(packageManager);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("http");
        Object[] objArr = new Object[2];
        try {
            PackageInfo packageInfo = aoan.f78042a.getPackageInfo(str, 64);
            if (packageInfo.signatures != null && packageInfo.signatures.length > 0) {
                str2 = m65706a(packageInfo.signatures[0]);
                objArr[0] = str2;
                objArr[1] = "apps.googleusercontent.com";
                builder.authority(String.format("%s.%s", objArr));
                builder.path("/");
                builder.appendQueryParameter("pkg", str);
                if (!TextUtils.isEmpty((String) ansx.f77685g.mo25081c())) {
                    builder.appendQueryParameter("api_key", (String) ansx.f77685g.mo25081c());
                }
                return builder.toString();
            }
        } catch (PackageManager.NameNotFoundException e) {
            if (Log.isLoggable("ContainerParam", 5)) {
                Log.w("ContainerParam", String.format("Name not found while getting certificate for package: %s, returning zero", str));
            }
        }
        str2 = "0";
        objArr[0] = str2;
        objArr[1] = "apps.googleusercontent.com";
        builder.authority(String.format("%s.%s", objArr));
        builder.path("/");
        builder.appendQueryParameter("pkg", str);
        if (!TextUtils.isEmpty((String) ansx.f77685g.mo25081c())) {
        }
        return builder.toString();
    }

    /* renamed from: a */
    private static String m65706a(Signature signature) {
        MessageDigest messageDigest;
        byte[] digest;
        int i = 0;
        while (true) {
            if (i > 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA1");
                break;
            } catch (NoSuchAlgorithmException e) {
                if (i > 0 && Log.isLoggable("ContainerParam", 5)) {
                    Log.w("ContainerParam", String.format("Failed to get message digest for %s, returning zero", "SHA1"), e);
                }
                i++;
            }
        }
        if (messageDigest == null || (digest = messageDigest.digest(signature.toByteArray())) == null) {
            return "0";
        }
        return Base64.encodeToString(digest, 2);
    }
}
