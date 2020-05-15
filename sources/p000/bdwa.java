package p000;

import android.accounts.Account;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* renamed from: bdwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdwa {
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a0 A[Catch:{ all -> 0x0096, all -> 0x00a4 }] */
    /* renamed from: a */
    public static void m91503a(SQLiteDatabase sQLiteDatabase, Account account, Runnable runnable) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Account account2 = account;
        sQLiteDatabase.beginTransaction();
        try {
            String[] strArr = {"name", "type"};
            SQLiteDatabase sQLiteDatabase3 = sQLiteDatabase;
            ArrayList arrayList = new ArrayList();
            try {
                cursor = sQLiteDatabase3.query("account", strArr, null, null, null, null, null, null);
                while (cursor.moveToNext()) {
                    ArrayList arrayList2 = arrayList;
                    arrayList2.add(new Account(cursor.getString(0), cursor.getString(1)));
                    arrayList = arrayList2;
                }
                ArrayList arrayList3 = arrayList;
                if (cursor != null) {
                    cursor.close();
                }
                if (arrayList3.size() != 1 || !((Account) arrayList3.get(0)).equals(account2)) {
                    runnable.run();
                    sQLiteDatabase2.delete("account", null, null);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("name", account2.name);
                    contentValues.put("type", account2.type);
                    if (sQLiteDatabase2.insertOrThrow("account", null, contentValues) == -1) {
                        throw new SQLException("insertOrThrow returned -1");
                    }
                }
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
            } catch (Throwable th) {
                th = th;
                cursor = null;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            sQLiteDatabase.endTransaction();
            throw th2;
        }
    }
}
