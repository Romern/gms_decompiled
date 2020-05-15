package p000;

import android.net.Uri;
import android.provider.ContactsContract;

/* renamed from: ambh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface ambh {

    /* renamed from: a */
    public static final Uri f74630a;

    /* renamed from: b */
    public static final Uri f74631b;

    static {
        Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Data.CONTENT_URI, "contactables");
        f74630a = withAppendedPath;
        f74631b = Uri.withAppendedPath(withAppendedPath, "filter");
    }
}
