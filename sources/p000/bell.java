package p000;

import android.net.Uri;

/* renamed from: bell */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bell {
    /* renamed from: a */
    public static Uri m95260a(Uri uri, String str) {
        Uri.Builder buildUpon = uri.buildUpon();
        String valueOf = String.valueOf(uri.getPath());
        return buildUpon.path(str.length() == 0 ? new String(valueOf) : valueOf.concat(str)).build();
    }
}
