package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: ryx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ryx {

    /* renamed from: a */
    private static final bmyx f43866a = bmyx.m108643a("=").mo66917a();

    /* renamed from: b */
    private static final bmyx f43867b = bmyx.m108643a("/").mo66917a();

    /* renamed from: c */
    private static final Pattern f43868c = Pattern.compile("^((http(s)?):)?\\/\\/((((lh[3-6](-tt|-d[a-g,z])?\\.((ggpht)|(googleusercontent)|(google)))|(([1-4]\\.bp\\.blogspot)|(bp[0-3]\\.blogger))|((((cp|ci|gp)[3-6])|(ap[1-2]))\\.(ggpht|googleusercontent))|(gm[1-4]\\.ggpht)|(((yt[3-4])|(sp[1-3]))\\.(ggpht|googleusercontent)))\\.com)|(dp[3-6]\\.googleusercontent\\.cn)|(lh[3-6]\\.(googleadsserving\\.cn|xn--9kr7l\\.com))|((dev|dev2|dev3|qa|qa2|qa3|qa-red|qa-blue|canary)[-.]lighthouse\\.sandbox\\.google\\.com\\/image)|(image\\-dev\\-lighthouse\\.sandbox\\.google\\.com(\\/image)?))\\/");

    /* renamed from: a */
    public static Uri m34684a(String str, String str2) {
        Uri parse = Uri.parse(str2);
        ArrayList a = m34689a(f43867b.mo66918a((CharSequence) parse.getPath()));
        int size = a.size();
        boolean z = true;
        if (a.size() > 1 && ((String) a.get(0)).equals("image")) {
            size--;
        }
        if (size >= 4 && size <= 6) {
            String path = parse.getPath();
            ArrayList a2 = m34689a(f43867b.mo66918a((CharSequence) path));
            if (a2.size() <= 0 || !((String) a2.get(0)).equals("image")) {
                z = false;
            } else {
                a2.remove(0);
            }
            int size2 = a2.size();
            boolean endsWith = path.endsWith("/");
            if (!endsWith && size2 == 5) {
                a2.add((String) a2.get(4));
            }
            if (size2 != 4) {
                a2.set(4, str);
            } else {
                a2.add(str);
            }
            if (z) {
                a2.add(0, "image");
            }
            if (endsWith) {
                a2.add("");
            }
            Uri.Builder buildUpon = parse.buildUpon();
            String valueOf = String.valueOf(TextUtils.join("/", a2));
            return buildUpon.path(valueOf.length() == 0 ? new String("/") : "/".concat(valueOf)).build();
        } else if (size != 1) {
            return parse;
        } else {
            String str3 = (String) m34689a(f43866a.mo66918a((CharSequence) parse.getPath())).get(0);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str).length());
            sb.append(str3);
            sb.append("=");
            sb.append(str);
            return parse.buildUpon().path(sb.toString()).build();
        }
    }

    /* renamed from: b */
    public static boolean m34690b(String str) {
        if (str != null) {
            return f43868c.matcher(str).find();
        }
        return false;
    }

    /* renamed from: a */
    public static String m34685a(int i, int i2, String str) {
        if (str == null || !m34690b(str)) {
            return str;
        }
        return m34687a(m34684a("w" + i + "-h" + i2 + "-d-no", str));
    }

    /* renamed from: a */
    public static String m34686a(int i, String str) {
        if (str == null || !m34690b(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (i != -1) {
            sb.append("s");
            sb.append(i);
        }
        sb.append("-d-no-c-k");
        return m34687a(m34684a(sb.toString(), str));
    }

    /* renamed from: a */
    public static String m34687a(Uri uri) {
        StringBuilder sb = new StringBuilder();
        String scheme = uri.getScheme();
        if (scheme != null) {
            sb.append(scheme);
            sb.append(':');
        }
        String encodedAuthority = uri.getEncodedAuthority();
        if (encodedAuthority != null) {
            sb.append("//");
            sb.append(encodedAuthority);
        }
        String encode = Uri.encode(uri.getPath(), "/=");
        if (encode != null) {
            sb.append(encode);
        }
        String encodedQuery = uri.getEncodedQuery();
        if (!TextUtils.isEmpty(encodedQuery)) {
            sb.append('?');
            sb.append(encodedQuery);
        }
        String encodedFragment = uri.getEncodedFragment();
        if (!TextUtils.isEmpty(encodedFragment)) {
            sb.append('#');
            sb.append(encodedFragment);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m34688a(String str) {
        Uri parse = Uri.parse(str);
        ArrayList a = m34689a(f43867b.mo66918a((CharSequence) parse.getPath()));
        int size = a.size();
        if (a.size() > 1 && ((String) a.get(0)).equals("image")) {
            size--;
        }
        if (size >= 4 && size <= 6) {
            String path = parse.getPath();
            ArrayList a2 = m34689a(f43867b.mo66918a((CharSequence) path));
            if (a2.size() > 0 && ((String) a2.get(0)).equals("image")) {
                a2.remove(0);
            }
            int size2 = a2.size();
            if ((path.endsWith("/") || size2 != 5) && size2 != 4) {
                return (String) a2.get(4);
            }
            return "";
        } else if (size != 1) {
            return "";
        } else {
            ArrayList a3 = m34689a(f43866a.mo66918a((CharSequence) parse.getPath()));
            if (a3.size() > 1) {
                return (String) a3.get(1);
            }
            return "";
        }
    }

    /* renamed from: a */
    private static ArrayList m34689a(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            arrayList.add(obj);
        }
        return arrayList;
    }
}
