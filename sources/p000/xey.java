package p000;

import android.net.Uri;

/* renamed from: xey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xey {

    /* renamed from: a */
    private static final bnic f52103a = bnic.m109492a("about", "data", "https", "wss");

    /* renamed from: b */
    private static final bnic f52104b = bnic.m109489a("file");

    /* renamed from: c */
    private static final bnic f52105c = bnic.m109490a("::1", "127.0.0.1");

    /* renamed from: a */
    public static boolean m42799a(String str) {
        if (str == null) {
            return true;
        }
        Uri parse = Uri.parse(str);
        if ("about:blank".equals(str) || "about:srcdoc".equals(str) || "data".equals(parse.getScheme())) {
            return true;
        }
        String scheme = parse.getScheme();
        if (!parse.isOpaque()) {
            if (f52105c.contains(parse.toString())) {
                return true;
            }
            if (!bmxx.m108577a(scheme)) {
                String scheme2 = parse.getScheme();
                if (!bmxx.m108577a(scheme2) && f52104b.contains(scheme2)) {
                    return true;
                }
                String scheme3 = parse.getScheme();
                if (bmxx.m108577a(scheme3) || !f52103a.contains(scheme3)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
