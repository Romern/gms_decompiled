package p000;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: ayao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayao {

    /* renamed from: a */
    public static final Uri f96960a = Uri.parse("wear:///");

    /* renamed from: a */
    public static int m83708a(Uri uri) {
        if (!"wear".equals(uri.getScheme())) {
            String valueOf = String.valueOf(uri.getScheme());
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Illegal scheme for URI, provided scheme: ") : "Illegal scheme for URI, provided scheme: ".concat(valueOf));
        } else if (TextUtils.isEmpty(uri.getHost()) || "*".equals(uri.getHost())) {
            return 0;
        } else {
            return !"local".equals(uri.getHost()) ? 2 : 1;
        }
    }

    /* renamed from: a */
    public static Uri m83709a(String str, String str2) {
        Uri.Builder scheme = new Uri.Builder().scheme("wear");
        sdo.m34959a((Object) str);
        scheme.authority(str);
        if (str2 != null) {
            scheme.path(str2);
        }
        return scheme.build();
    }
}
