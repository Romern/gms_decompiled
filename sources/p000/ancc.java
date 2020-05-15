package p000;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.C0126R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ancc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ancc {

    /* renamed from: a */
    public static final String[] f76613a = {"^~([3-6])", "^", "/$"};

    /* renamed from: b */
    public static final String[] f76614b = {"lh$1.googleusercontent.com", "https://", "/photo.jpg"};

    /* renamed from: c */
    private static final bnhe f76615c;

    /* renamed from: d */
    private static final bnhe f76616d;

    /* renamed from: e */
    private static final Pattern f76617e = Pattern.compile("\\/photo\\.jpg\\?sz\\=\\d*$");

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b("lh3.googleusercontent.com", "~3");
        h.mo67695b("lh4.googleusercontent.com", "~4");
        h.mo67695b("lh5.googleusercontent.com", "~5");
        h.mo67695b("lh6.googleusercontent.com", "~6");
        f76615c = h.mo67618b();
        bnha h2 = bnhe.m109414h();
        h2.mo67695b("~3", "lh3.googleusercontent.com");
        h2.mo67695b("~4", "lh4.googleusercontent.com");
        h2.mo67695b("~5", "lh5.googleusercontent.com");
        h2.mo67695b("~6", "lh6.googleusercontent.com");
        f76616d = h2.mo67618b();
    }

    /* renamed from: a */
    public static int m63967a(Context context, int i) {
        int i2;
        if (i == 0) {
            i2 = C0126R.dimen.people_avatar_size_tiny;
        } else if (i == 1) {
            i2 = C0126R.dimen.people_avatar_size_small;
        } else if (i == 2) {
            i2 = C0126R.dimen.people_avatar_size_medium;
        } else if (i == 3) {
            i2 = C0126R.dimen.people_avatar_size_large;
        } else if (i == 4) {
            return 96;
        } else {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid avatar size: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return (int) context.getResources().getDimension(i2);
    }

    /* renamed from: b */
    public static String m63973b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (m63975c(str) > 0) {
            amdk.m62659b("FifeImageUtils", "Uncompressing url that isn't compressed. url=%s", str);
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("https://");
        if (str.charAt(0) == '~') {
            int indexOf = str.indexOf(47);
            sb.append((String) f76616d.get(str.substring(0, indexOf)));
            sb.append(str.substring(indexOf));
        } else {
            sb.append(str);
        }
        if (str.endsWith("/")) {
            sb.append("photo.jpg");
        }
        return sb.toString();
    }

    /* renamed from: c */
    private static int m63975c(String str) {
        if (str.startsWith("https://")) {
            return 8;
        }
        if (!str.startsWith("http://")) {
            return str.startsWith("//") ? 2 : 0;
        }
        return 7;
    }

    /* renamed from: a */
    public static String m63968a(Context context, String str, int i, int i2) {
        boolean z;
        if (!ryx.m34690b(str)) {
            return str;
        }
        rzg rzg = new rzg();
        rzg.mo25264a(m63967a(context, i));
        rzg.mo25263a();
        if (((i2 & 1) ^ 1) == 0) {
            z = false;
        } else {
            z = true;
        }
        rzg.f43886a = z;
        rzg.f43887b = true;
        rzg.f43888c = 1;
        return rzg.mo25262a(str);
    }

    /* renamed from: a */
    public static String m63969a(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int c = m63975c(str);
        int length = str.length();
        if (str.endsWith("/photo.jpg")) {
            length -= 9;
        } else if (!str.endsWith("/photo.jpg?sz=50")) {
            Matcher matcher = f76617e.matcher(str);
            if (matcher.find()) {
                length -= (matcher.end() - matcher.start()) - 1;
            }
        } else {
            length -= 15;
        }
        int indexOf = str.indexOf(47, c);
        if (indexOf != -1) {
            str2 = (String) f76615c.get(str.substring(c, indexOf));
        }
        if (str2 == null) {
            return str.substring(c, length);
        }
        String valueOf = String.valueOf(str2);
        String valueOf2 = String.valueOf(str.substring(indexOf, length));
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* renamed from: b */
    public static boolean m63974b(Throwable th) {
        NetworkResponse networkResponse;
        if (!(th instanceof VolleyError) || (networkResponse = ((VolleyError) th).networkResponse) == null) {
            Throwable cause = th.getCause();
            return (cause == null || cause == th || !m63974b(cause)) ? false : true;
        }
        int i = networkResponse.statusCode;
        return i == 403 || i == 429 || (i >= 500 && i < 600);
    }

    /* renamed from: a */
    public static String m63970a(String str, int i) {
        String valueOf = String.valueOf(String.valueOf(i));
        return m63971a(str, valueOf.length() == 0 ? new String("w") : "w".concat(valueOf));
    }

    /* renamed from: a */
    public static String m63971a(String str, String str2) {
        if (!ryx.m34690b(str)) {
            return str;
        }
        String[] split = ryx.m34688a(str).split("-");
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        for (String str3 : split) {
            if (!str3.startsWith("w") && !str3.startsWith("s") && !str3.startsWith("h") && !str3.isEmpty()) {
                if (sb.length() == 0) {
                    sb.append(str3);
                } else {
                    sb.append("-");
                    sb.append(str3);
                }
            }
        }
        return Uri.decode(ryx.m34684a(sb.toString(), str).toString());
    }

    /* renamed from: a */
    public static boolean m63972a(Throwable th) {
        NetworkResponse networkResponse;
        if ((th instanceof VolleyError) && (networkResponse = ((VolleyError) th).networkResponse) != null) {
            return networkResponse.statusCode == 404;
        }
        Throwable cause = th.getCause();
        return (cause == null || cause == th || !m63972a(cause)) ? false : true;
    }
}
