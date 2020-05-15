package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: alwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alwo {
    /* renamed from: a */
    public static Set m61996a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            Cursor query = context.getContentResolver().query(Uri.withAppendedPath(ContactsContract.CommonDataKinds.Email.CONTENT_LOOKUP_URI, Uri.encode(str)), alwj.f74464a, null, null, null);
            if (query != null) {
                try {
                    HashSet hashSet = new HashSet();
                    while (query.moveToNext()) {
                        hashSet.add(query.getString(0));
                    }
                    return hashSet;
                } finally {
                    query.close();
                }
            } else {
                Log.w("ContactsDataLoader", "null retrieveContactsFromEmailId cursor");
                return Collections.emptySet();
            }
        } else {
            Log.w("ContactsDataLoader", "empty email address");
            return Collections.emptySet();
        }
    }

    /* renamed from: b */
    public static Set m61998b(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            Cursor query = context.getContentResolver().query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str)), alwn.f74475a, null, null, null);
            if (query != null) {
                try {
                    HashSet hashSet = new HashSet();
                    while (query.moveToNext()) {
                        hashSet.add(query.getString(0));
                    }
                    return hashSet;
                } finally {
                    query.close();
                }
            } else {
                Log.w("ContactsDataLoader", "null retrieveContactsFromPhoneNumberId cursor");
                return Collections.emptySet();
            }
        } else {
            Log.w("ContactsDataLoader", "empty phone number");
            return Collections.emptySet();
        }
    }

    /* renamed from: a */
    public static Set m61997a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            long b = altf.m61753b(context, str, str2);
            return b >= 0 ? Collections.singleton(String.valueOf(b)) : Collections.emptySet();
        }
        Log.w("ContactsDataLoader", "empty focus ID");
        return Collections.emptySet();
    }
}
