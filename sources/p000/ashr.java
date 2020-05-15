package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.util.Log;
import java.util.Arrays;
import java.util.List;

/* renamed from: ashr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ashr {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static boolean m74143a(ContentResolver contentResolver, Account account, String str, String str2, String... strArr) {
        List<String> asList = Arrays.asList(strArr);
        C1223np npVar = new C1223np();
        Cursor query = contentResolver.query(ashq.f88987a, new String[]{"_id", "feed"}, "_sync_account=? AND _sync_account_type=? AND authority=?", new String[]{account.name, account.type, str}, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    long j = query.getLong(0);
                    String string = query.getString(1);
                    if (npVar.containsKey(string)) {
                        contentResolver.delete(ashq.f88987a, "_id=?", new String[]{Long.toString(j)});
                    } else {
                        npVar.put(string, Long.valueOf(j));
                    }
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
            for (String str3 : asList) {
                if (!npVar.containsKey(str3)) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_sync_account", account.name);
                    contentValues.put("_sync_account_type", account.type);
                    contentValues.put("feed", str3);
                    contentValues.put("service", str2);
                    contentValues.put("authority", str);
                    try {
                        contentResolver.insert(ashq.f88987a, contentValues);
                    } catch (IllegalArgumentException e) {
                        Log.e("GmsSubscribedFeeds", "Could not insert entries in the provider.");
                        return false;
                    }
                } else {
                    npVar.remove(str3);
                }
            }
            for (Long l : npVar.values()) {
                try {
                    contentResolver.delete(ContentUris.withAppendedId(ashq.f88987a, l.longValue()), null, null);
                } catch (IllegalArgumentException e2) {
                    Log.e("GmsSubscribedFeeds", "Could not delete entries in the provider.");
                    return false;
                }
            }
            return true;
        }
        Log.e("GmsSubscribedFeeds", "Could not query the provider.");
        return false;
    }
}
