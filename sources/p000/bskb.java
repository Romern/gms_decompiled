package p000;

import java.util.Collection;

/* renamed from: bskb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bskb {

    /* renamed from: a */
    private static final String[] f144866a = {"ftp://", "https://", "http://", "www."};

    /* renamed from: a */
    public static String m115884a(String str) {
        if (!str.startsWith("android://")) {
            return str;
        }
        String substring = str.substring(10);
        if (substring.contains("@")) {
            substring = (String) bmyx.m108640a('@').mo66921b(2).mo66925c((CharSequence) substring).get(1);
        }
        return bmxr.m108543a('.').mo66874a((Iterable) bngx.m109368a((Collection) bmyx.m108640a('.').mo66925c((CharSequence) substring)).mo67670d());
    }

    /* renamed from: b */
    public static String m115885b(String str) {
        String a = m115884a(str);
        String[] strArr = f144866a;
        for (String str2 : strArr) {
            if (bmzg.m108672a(a, str2)) {
                a = a.substring(str2.length());
            }
        }
        return a;
    }
}
