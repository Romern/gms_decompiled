package p000;

import android.content.Context;
import android.net.Uri;

/* renamed from: abxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abxn {

    /* renamed from: a */
    public static final Uri f58689a = Uri.parse("content://com.google.android.gms.icing.indexapi");

    /* renamed from: a */
    public static abww m48472a(Context context, Uri uri) {
        String queryParameter = uri.getQueryParameter("type");
        if (queryParameter == null) {
            String queryParameter2 = uri.getQueryParameter("extended_type");
            if (queryParameter2 != null) {
                queryParameter = queryParameter2;
            } else {
                absg.m48193b("Missing query parameter: %s or %s", "type", "extended_type");
                return null;
            }
        }
        String queryParameter3 = uri.getQueryParameter("client");
        if (queryParameter3 != null) {
            return abww.m48414b(queryParameter, queryParameter3, abxt.m48504a(context));
        }
        absg.m48192b("Missing query parameter: %s", "client");
        return null;
    }
}
