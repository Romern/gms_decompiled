package p000;

import android.net.Uri;

/* renamed from: bdyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdyj {

    /* renamed from: a */
    private static final C1223np f106628a = new C1223np();

    /* renamed from: a */
    public static synchronized Uri m91581a(String str) {
        Uri uri;
        synchronized (bdyj.class) {
            uri = (Uri) f106628a.get(str);
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode(str));
                uri = Uri.parse(valueOf.length() == 0 ? new String("content://com.google.android.gms.phenotype/") : "content://com.google.android.gms.phenotype/".concat(valueOf));
                f106628a.put(str, uri);
            }
        }
        return uri;
    }

    /* renamed from: b */
    public static boolean m91582b(String str) {
        int i;
        int indexOf = str.indexOf("#");
        return indexOf >= 0 && (i = indexOf + 1) < str.length() && str.charAt(i) == '@';
    }
}
