package p000;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* renamed from: srw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class srw {
    /* renamed from: a */
    private static String m36165a(String str, String str2) {
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static Map m36166a(URI uri, String str) {
        String str2;
        Map emptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            emptyMap = new HashMap();
            Scanner scanner = new Scanner(rawQuery);
            scanner.useDelimiter("&");
            while (scanner.hasNext()) {
                String[] split = scanner.next().split("=");
                int length = split.length;
                if (length == 0 || length > 2) {
                    throw new IllegalArgumentException("bad parameter");
                }
                String a = m36165a(split[0], str);
                if (length == 2) {
                    str2 = m36165a(split[1], str);
                } else {
                    str2 = null;
                }
                emptyMap.put(a, str2);
            }
        }
        return emptyMap;
    }
}
