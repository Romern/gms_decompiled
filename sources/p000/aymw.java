package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: aymw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aymw {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m84285a(ContentResolver contentResolver, Account account, String str, String str2, Collection collection) {
        HashMap hashMap = new HashMap();
        Cursor query = contentResolver.query(aymv.f97996a, new String[]{"_id", "feed"}, "_sync_account=? AND _sync_account_type=? AND authority=?", new String[]{account.name, account.type, str}, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    long j = query.getLong(0);
                    String string = query.getString(1);
                    if (hashMap.containsKey(string)) {
                        contentResolver.delete(aymv.f97996a, "_id=?", new String[]{Long.toString(j)});
                    } else {
                        hashMap.put(string, Long.valueOf(j));
                    }
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (!hashMap.containsKey(str3)) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_sync_account", account.name);
                    contentValues.put("_sync_account_type", account.type);
                    contentValues.put("feed", str3);
                    contentValues.put("service", str2);
                    contentValues.put("authority", str);
                    try {
                        contentResolver.insert(aymv.f97996a, contentValues);
                    } catch (IllegalArgumentException e) {
                        return;
                    }
                } else {
                    hashMap.remove(str3);
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                try {
                    contentResolver.delete(ContentUris.withAppendedId(aymv.f97996a, ((Long) entry.getValue()).longValue()), null, null);
                } catch (IllegalArgumentException e2) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m84286a(ContentResolver contentResolver, Account account, String str, String str2, String... strArr) {
        int length = strArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (String str3 : strArr) {
            arrayList.add(str3);
        }
        m84285a(contentResolver, account, str, str2, arrayList);
    }
}
