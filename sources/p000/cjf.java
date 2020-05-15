package p000;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cjf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cjf {

    /* renamed from: b */
    private static final String f6932b;

    /* renamed from: c */
    private static final Map f6933c;

    /* renamed from: a */
    public final Map f6934a = f6933c;

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            property = sb.toString();
        }
        f6932b = property;
        HashMap hashMap = new HashMap(2);
        if (!TextUtils.isEmpty(f6932b)) {
            hashMap.put("User-Agent", Collections.singletonList(new cjg(f6932b)));
        }
        f6933c = Collections.unmodifiableMap(hashMap);
    }
}
