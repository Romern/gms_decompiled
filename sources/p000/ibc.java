package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;

/* renamed from: ibc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ibc {

    /* renamed from: a */
    private static final sek f20669a = new sek("ContactsUtil");

    /* renamed from: a */
    public static boolean m15159a(Context context, String str) {
        if (!TextUtils.isEmpty(str) && C1133kh.m17835a(context, "android.permission.READ_CONTACTS") == 0) {
            Cursor query = context.getContentResolver().query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str)), new String[]{"display_name"}, null, null, null);
            if (query != null) {
                try {
                    if (query.getCount() > 0) {
                        f20669a.mo25414c("Sender is in contact list, so we treat this message as non-otp case", new Object[0]);
                        query.close();
                        return true;
                    }
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
            }
            if (query != null) {
                query.close();
            }
        }
        return false;
        throw th;
    }
}
