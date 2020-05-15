package p000;

import android.net.Uri;
import java.util.Arrays;

@Deprecated
/* renamed from: fuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fuc {

    /* renamed from: a */
    private final Uri f17253a;

    private fuc(Uri uri) {
        this.f17253a = uri;
    }

    /* renamed from: a */
    public static fuc m12407a(String str, Uri uri) {
        Uri.Builder authority = new Uri.Builder().scheme("android-app").authority(str);
        if (uri != null) {
            authority.appendPath(uri.getScheme());
            if (uri.getAuthority() != null) {
                authority.appendPath(uri.getAuthority());
            }
            for (String str2 : uri.getPathSegments()) {
                authority.appendPath(str2);
            }
            authority.encodedQuery(uri.getEncodedQuery()).encodedFragment(uri.getEncodedFragment());
        }
        return new fuc(authority.build());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fuc) {
            return this.f17253a.equals(((fuc) obj).f17253a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17253a});
    }

    public final String toString() {
        return this.f17253a.toString();
    }
}
