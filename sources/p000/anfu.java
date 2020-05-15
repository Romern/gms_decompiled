package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: anfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anfu {

    /* renamed from: a */
    public static final bmzi f76778a = bmzn.m108681a(anft.f76777a);

    /* renamed from: a */
    public static Map m64169a(SQLiteDatabase sQLiteDatabase, Set set) {
        Cursor query;
        try {
            query = sQLiteDatabase.query("Packages", new String[]{"packageName", "androidPackageName"}, null, null, null, null, null, null);
            if (query.getCount() <= 0) {
                HashMap hashMap = new HashMap();
                if (query != null) {
                    query.close();
                }
                return hashMap;
            }
            HashMap hashMap2 = new HashMap();
            while (query.moveToNext()) {
                String string = query.getString(0);
                String string2 = query.getString(1);
                if (set.contains(string)) {
                    angv.m64356a(hashMap2, string2, string);
                }
            }
            if (query != null) {
                query.close();
            }
            return hashMap2;
        } catch (SQLiteException e) {
            bnsl bnsl = (bnsl) anfw.f76780a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("anfu", "a", 244, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to get android package mapping.");
            return new HashMap();
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public static String m64173b(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query("Packages", new String[]{"androidPackageName"}, "packageName = ?", new String[]{str}, null, null, null, "1");
        try {
            if (query.moveToFirst()) {
                String string = query.getString(0);
                if (query != null) {
                    query.close();
                }
                return string;
            } else if (query == null) {
                return null;
            } else {
                query.close();
                return null;
            }
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public static void m64170a(SQLiteDatabase sQLiteDatabase) {
        String str;
        String[] strArr = new String[8];
        strArr[0] = "packageName TEXT NOT NULL PRIMARY KEY";
        strArr[1] = "version INTEGER NOT NULL";
        strArr[2] = "params BLOB";
        strArr[3] = "dynamicParams BLOB";
        strArr[4] = "weak INTEGER NOT NULL";
        strArr[5] = "androidPackageName TEXT NOT NULL";
        strArr[6] = "isSynced INTEGER";
        if (((Integer) anfw.f76781b.mo6606a()).intValue() < 23) {
            str = "serializedDeclarativeRegInfo BLOB DEFAULT NULL";
        } else {
            str = "serializedDeclarativeRegInfo BLOB DEFAULT NULL, configTier INTEGER DEFAULT NULL";
        }
        strArr[7] = str;
        sQLiteDatabase.execSQL(anfw.m64178a("Packages", strArr));
        sQLiteDatabase.execSQL(anfw.m64177a("Packages", "androidPackageName", "androidPackageName"));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    public static void m64171a(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("isSynced", (Integer) 1);
        sQLiteDatabase.update("Packages", contentValues, "packageName = ?", new String[]{str});
    }

    /* renamed from: a */
    public static void m64172a(SQLiteDatabase sQLiteDatabase, String str, bqyx bqyx) {
        ContentValues contentValues = new ContentValues();
        int a = bqyw.m113780a(bqyx.f142004a);
        if (a == 0) {
            a = 1;
        }
        contentValues.put("configTier", Integer.valueOf(a - 1));
        sQLiteDatabase.update("Packages", contentValues, "packageName = ?", new String[]{str});
    }
}
