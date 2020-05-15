package p000;

import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/* renamed from: vwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vwt {
    /* renamed from: a */
    private static String m41501a(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static String m41502a(List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) list.get(i);
            String a = m41501a((String) pair.first);
            String str = (String) pair.second;
            String a2 = str == null ? "" : m41501a(str);
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(a);
            sb.append("=");
            sb.append(a2);
        }
        return sb.toString();
    }
}
