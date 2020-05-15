package p000;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.images.WebImage;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ptk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ptk {

    /* renamed from: a */
    public static final Pattern f40212a = Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");

    /* renamed from: a */
    public static double m31227a(long j) {
        double d = (double) j;
        Double.isNaN(d);
        return d / 1000.0d;
    }

    /* renamed from: a */
    public static long m31228a(double d) {
        return (long) (d * 1000.0d);
    }

    /* renamed from: a */
    public static boolean m31233a(char c) {
        if (c >= 'A' && c <= 'Z') {
            return true;
        }
        if (c < 'a' || c > 'z') {
            return (c >= '0' && c <= '9') || c == '_' || c == '-';
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m31238b(String str) {
        try {
            m31232a(str);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    /* renamed from: c */
    public static String m31239c(String str) {
        return str.length() == 0 ? new String("urn:x-cast:") : "urn:x-cast:".concat(str);
    }

    /* renamed from: d */
    public static JSONObject m31240d(String str) {
        if (str != null) {
            try {
                return new JSONObject(str);
            } catch (JSONException e) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static WebImage m31229a(String str, InetAddress inetAddress) {
        String hostAddress = inetAddress.getHostAddress();
        if (inetAddress instanceof Inet6Address) {
            StringBuilder sb = new StringBuilder(String.valueOf(hostAddress).length() + 2);
            sb.append("[");
            sb.append(hostAddress);
            sb.append("]");
            hostAddress = sb.toString();
        }
        Uri parse = str.startsWith("/") ? Uri.parse(String.format(Locale.ROOT, "http://%s:8008%s", hostAddress, str)) : (str.startsWith("http://") || str.startsWith("https://")) ? Uri.parse(str) : null;
        if (parse != null) {
            return new WebImage(parse);
        }
        return null;
    }

    /* renamed from: a */
    public static String m31230a(Locale locale) {
        StringBuilder sb = new StringBuilder(20);
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb.append('-');
            sb.append(variant);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static List m31231a(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m31232a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Namespace cannot be null or empty");
        } else if (str.length() > 128) {
            throw new IllegalArgumentException("Invalid namespace length");
        } else if (!str.startsWith("urn:x-cast:")) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\"");
        } else if (str.length() == 11) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
        }
    }

    /* renamed from: a */
    public static boolean m31234a(double d, double d2) {
        return m31235a(d, d2, 1.0E-4d);
    }

    /* renamed from: a */
    public static boolean m31235a(double d, double d2, double d3) {
        return Math.abs(d - d2) < d3;
    }

    /* renamed from: a */
    public static boolean m31236a(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        return (obj == null || obj2 == null || !obj.equals(obj2)) ? false : true;
    }

    /* renamed from: a */
    public static int[] m31237a(Collection collection) {
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        return iArr;
    }
}
