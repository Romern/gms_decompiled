package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* renamed from: aorf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aorf {

    /* renamed from: a */
    public static final String f78737a = "www.gstatic.com/recaptcha,www.google.com/recaptcha,www.google.com/js/bg";

    /* renamed from: b */
    private static final Object f78738b = new Object();

    static {
        aorf.class.getSimpleName();
    }

    /* renamed from: a */
    public final boolean mo43189a(Uri uri) {
        List asList;
        if (uri != null && !TextUtils.isEmpty(uri.toString()) && "https".equals(uri.getScheme()) && !TextUtils.isEmpty(uri.getHost())) {
            String uri2 = uri.toString();
            String str = f78737a;
            synchronized (f78738b) {
                asList = Arrays.asList(str.split(","));
                int size = asList.size();
                for (int i = 0; i < size; i++) {
                    String str2 = (String) asList.get(i);
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 9);
                    sb.append("https://");
                    sb.append(str2);
                    sb.append("/");
                    asList.set(i, sb.toString());
                }
            }
            int size2 = asList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (uri2.startsWith((String) asList.get(i2))) {
                    return true;
                }
            }
        }
        return false;
    }
}
