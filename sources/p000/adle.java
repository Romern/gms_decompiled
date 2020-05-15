package p000;

import android.net.Uri;
import com.google.android.gms.instantapps.shared.PatternMatcher;

/* renamed from: adle */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adle {
    /* renamed from: a */
    public static boolean m50789a(String str, int i, String str2, String str3, String str4, String str5, Uri uri) {
        String host = uri.getHost();
        if (host != null) {
            if (str.charAt(0) == '*') {
                str = str.substring(1);
                if (host.length() < str.length()) {
                    return false;
                }
                host = host.substring(host.length() - str.length());
            }
            if (host.equalsIgnoreCase(str)) {
                if (i > 0 && i != uri.getPort()) {
                    return false;
                }
                if (str2 != null) {
                    return new PatternMatcher(str2, 0).mo43456a(uri.getPath());
                }
                if (str3 != null) {
                    return new PatternMatcher(str3, 1).mo43456a(uri.getPath());
                }
                if (str4 != null) {
                    return new PatternMatcher(str4, 2).mo43456a(uri.getPath());
                }
                if (str5 != null) {
                    return new PatternMatcher(str5, 3).mo43456a(uri.getPath());
                }
                return true;
            }
        }
        return false;
    }
}
