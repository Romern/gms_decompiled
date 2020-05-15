package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: axug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axug {

    /* renamed from: a */
    private static final bnhe f96385a = bnhe.m109411a("58e1c4133f7441ec3d2c270270a14802da47ba0e", "38918a453d07199354f8b19af05ec6562ced5788", "4ba713dfece93d47572dc5e845a7a82c4a891f2f", "24bb24c05e47e0aefa68a58a766179d9b613a600", "77f9bed9359a2a59a121fd52c7c46731049ac147", "a197f9212f2fed64f0ff9c2a4edf24b9c8801c8c", "b28c3edb665df32686224df800f603e9959bbe4e", "0980a12be993528c19107bc21ad811478c63cefc");

    /* renamed from: a */
    public static axue m83241a(Context context, String str) {
        String str2;
        if (!ayha.m83999e() || !str.equals("com.google.android.wearable.app")) {
            str2 = str;
        } else {
            str2 = "com.google.android.wearable.app.cn";
        }
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str2, 64);
        if (!(packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length == 0)) {
            int i = 0;
            if (packageInfo.signatures[0] != null) {
                String a = m83242a(packageInfo.signatures[0]);
                if (a == null) {
                    String valueOf = String.valueOf(str2);
                    throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unable to get signature digest for package:") : "Unable to get signature digest for package:".concat(valueOf));
                }
                if (!"user".equals(Build.TYPE) && chnj.f188812a.mo6606a().mo85415an()) {
                    if (chnj.f188812a.mo6606a().mo85413al()) {
                        String str3 = (String) f96385a.get(a);
                        if (str3 != null) {
                            return axue.m83239a(str, str3);
                        }
                    } else {
                        while (true) {
                            axuf[] axufArr = axuf.f96380a;
                            if (i < 7) {
                                if (axuf.f96380a[i].mo53576a(str, a)) {
                                    return axue.m83239a(str, axuf.f96380a[i].f96383d);
                                }
                                i++;
                            } else if (chnj.f188812a.mo6606a().mo85414am() && axuf.f96381b.mo53576a(str, a)) {
                                return axue.m83239a(str, axuf.f96381b.f96383d);
                            }
                        }
                    }
                }
                return axue.m83239a(str, a);
            }
        }
        String valueOf2 = String.valueOf(str2);
        throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Unable to get signature for package:") : "Unable to get signature for package:".concat(valueOf2));
    }

    /* renamed from: a */
    private static String m83242a(Signature signature) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(signature.toByteArray());
            if (digest != null) {
                return srv.m36160a(digest);
            }
            return null;
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("Proper crypto support not installed", e);
        }
    }
}
