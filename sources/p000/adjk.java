package p000;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: adjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adjk {

    /* renamed from: a */
    private static final bnic f61916a = bnic.m109494a("com", "co", "org", "net", "int", "edu", "gov", "mil");

    /* renamed from: a */
    public static List m50641a(String str) {
        ArrayList arrayList = new ArrayList();
        String c = m50644c(str);
        if (!TextUtils.isEmpty(c)) {
            String[] d = m50645d(c);
            StringBuilder sb = new StringBuilder(c.length());
            int length = d.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                }
                sb.append(d[length]);
                if (length == 0) {
                    arrayList.add(sb.toString());
                    break;
                }
                sb.append('.');
                int length2 = d.length;
                if (length != length2 - 1 && (length != length2 - 2 || !f61916a.contains(d[length]))) {
                    String valueOf = String.valueOf(sb);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 1);
                    sb2.append(valueOf);
                    sb2.append("*");
                    arrayList.add(sb2.toString());
                }
                length--;
            }
            Collections.reverse(arrayList);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static String m50643b(String str) {
        String c = m50644c(str);
        String[] d = m50645d(c);
        StringBuilder sb = new StringBuilder(c.length());
        for (int length = d.length - 1; length >= 0; length--) {
            sb.append(d[length]);
            if (length != 0) {
                sb.append('.');
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    private static String m50644c(String str) {
        sdo.m34959a((Object) str);
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String lowerCase = str.toLowerCase();
        int length = lowerCase.charAt(lowerCase.length() + -1) == '.' ? lowerCase.length() - 1 : lowerCase.length();
        if (length > 0) {
            return lowerCase.substring(0, length);
        }
        return "";
    }

    /* renamed from: d */
    private static String[] m50645d(String str) {
        return str.split("\\.");
    }

    /* renamed from: a */
    public static boolean m50642a(PackageManager packageManager, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                if (packageInfo != null) {
                    int i = Build.VERSION.SDK_INT;
                    if (!packageInfo.applicationInfo.isInstantApp()) {
                        return true;
                    }
                }
                return false;
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return false;
    }
}
