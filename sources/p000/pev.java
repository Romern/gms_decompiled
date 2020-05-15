package p000;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: pev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pev {
    /* renamed from: a */
    public static String m30272a(String str) {
        if (str != null) {
            return m30273a("com.google.android.gms.cast.CATEGORY_CAST", str, null);
        }
        throw new IllegalArgumentException("applicationId cannot be null");
    }

    /* renamed from: a */
    public static String m30273a(String str, String str2, Collection collection) {
        StringBuilder sb = new StringBuilder(str);
        if (str2 != null) {
            String upperCase = str2.toUpperCase();
            if (!upperCase.matches("[A-F0-9]+")) {
                throw new IllegalArgumentException(str2.length() == 0 ? new String("Invalid application ID: ") : "Invalid application ID: ".concat(str2));
            }
            sb.append("/");
            sb.append(upperCase);
        }
        if (collection != null) {
            if (!collection.isEmpty()) {
                if (str2 == null) {
                    sb.append("/");
                }
                sb.append("/");
                Iterator it = collection.iterator();
                boolean z = true;
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    ptk.m31232a(str3);
                    if (!z) {
                        sb.append(",");
                    }
                    if (!ptk.f40212a.matcher(str3).matches()) {
                        StringBuilder sb2 = new StringBuilder(str3.length());
                        for (int i = 0; i < str3.length(); i++) {
                            char charAt = str3.charAt(i);
                            if (ptk.m31233a(charAt) || charAt == '.' || charAt == ':') {
                                sb2.append(charAt);
                            } else {
                                sb2.append(String.format("%%%04x", Integer.valueOf(charAt)));
                            }
                        }
                        str3 = sb2.toString();
                    }
                    sb.append(str3);
                    z = false;
                }
            } else {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
        }
        if (str2 == null && collection == null) {
            sb.append("/");
        }
        if (collection == null) {
            sb.append("/");
        }
        sb.append("//ALLOW_IPV6");
        return sb.toString();
    }
}
