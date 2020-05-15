package p000;

import android.content.Intent;
import android.net.Uri;

/* renamed from: fts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fts {

    /* renamed from: a */
    public static final String f17224a = fts.class.getSimpleName();

    /* renamed from: a */
    public static Uri m12362a(Intent intent) {
        Uri uri;
        if (intent.getData() == null || intent.getComponent() != null || intent.getExtras() != null || !"android.intent.action.VIEW".equals(intent.getAction())) {
            uri = Uri.parse(intent.toUri(1));
        } else {
            uri = intent.getData();
        }
        Uri.Builder appendPath = new Uri.Builder().scheme("android-app").authority(intent.getPackage()).appendPath(uri.getScheme());
        if (uri.getAuthority() != null) {
            appendPath.appendPath(uri.getAuthority());
        }
        for (String str : uri.getPathSegments()) {
            appendPath.appendPath(str);
        }
        appendPath.encodedQuery(uri.getEncodedQuery()).encodedFragment(uri.getEncodedFragment());
        return appendPath.build();
    }

    /* renamed from: b */
    public static boolean m12364b(Uri uri) {
        return "android-app".equals(uri.getScheme());
    }

    /* renamed from: a */
    public static boolean m12363a(Uri uri) {
        String scheme = uri.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }
}
