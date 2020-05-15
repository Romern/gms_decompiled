package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Environment;
import java.io.File;
import java.util.HashSet;

/* renamed from: bepm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bepm extends SQLiteOpenHelper {

    /* renamed from: a */
    private static bepm f111992a;

    /* JADX WARNING: Illegal instructions before constructor call */
    private bepm(Context context) {
        super(context, r6.toString(), (SQLiteDatabase.CursorFactory) null, 2);
        String valueOf = String.valueOf(Environment.getExternalStorageDirectory());
        String str = File.separator;
        String str2 = File.separator;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 20 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append(valueOf);
        sb.append(str);
        sb.append("aptest");
        sb.append(str2);
        sb.append("fake_felica.db");
    }

    /* renamed from: a */
    public static final bepl m95390a(Cursor cursor) {
        bmvz bmvz;
        int columnIndex = cursor.getColumnIndex("defaultSlot");
        if (!cursor.isNull(columnIndex)) {
            bmvz = bmxv.m108566b(Integer.valueOf(cursor.getInt(columnIndex)));
        } else {
            bmvz = bmvz.f131120a;
        }
        return new bepl(cursor.getString(cursor.getColumnIndex("network")), cursor.getString(cursor.getColumnIndex("cardId")), cursor.getString(cursor.getColumnIndex("displayCardNumber")), cursor.getInt(cursor.getColumnIndex("expirationMonth")), cursor.getInt(cursor.getColumnIndex("expirationYear")), bmvz);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        m95392a(sQLiteDatabase);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m95393a(sQLiteDatabase, "table", "sqlite_sequence", "android_metadata");
        m95393a(sQLiteDatabase, "trigger", new String[0]);
        m95393a(sQLiteDatabase, "view", new String[0]);
        m95392a(sQLiteDatabase);
    }

    /* renamed from: a */
    public static synchronized bepm m95391a(Context context) {
        bepm bepm;
        synchronized (bepm.class) {
            if (f111992a == null) {
                f111992a = new bepm(context);
            }
            bepm = f111992a;
        }
        return bepm;
    }

    /* renamed from: a */
    private static void m95392a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS Cards (cardId TEXT PRIMARY KEY, network TEXT NOT NULL, displayCardNumber TEXT NOT NULL, expirationMonth INTEGER NOT NULL, expirationYear INTEGER NOT NULL, defaultSlot INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS Transactions (transactionId INTEGER PRIMARY KEY, cardId TEXT NOT NULL, amountMicros INTEGER, currencyCode TEXT, timeMillisSinceEpoch INTEGER, type INTEGER, FOREIGN KEY(cardId) REFERENCES Cards(cardId))");
    }

    /* renamed from: a */
    private static void m95393a(SQLiteDatabase sQLiteDatabase, String str, String... strArr) {
        boolean z;
        if ("table".equals(str) || "view".equals(str) || "trigger".equals(str)) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        Cursor query = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "type == ?", new String[]{str}, null, null, null);
        try {
            HashSet a = bnpf.m110050a(strArr);
            while (query.moveToNext()) {
                String string = query.getString(0);
                if (!a.contains(string)) {
                    StringBuilder sb = new StringBuilder(str.length() + 8 + String.valueOf(string).length());
                    sb.append("DROP ");
                    sb.append(str);
                    sb.append(" '");
                    sb.append(string);
                    sb.append("'");
                    sQLiteDatabase.execSQL(sb.toString());
                }
            }
            if (query != null) {
                query.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final bepl mo60898a() {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM Cards WHERE defaultSlot = ?", new String[]{Integer.toString(0)});
        try {
            if (rawQuery.moveToNext()) {
                bepl a = m95390a(rawQuery);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return a;
            } else if (rawQuery == null) {
                return null;
            } else {
                rawQuery.close();
                return null;
            }
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
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
    public final boolean mo60899a(String str) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        ContentValues contentValues = new ContentValues();
        contentValues.putNull("defaultSlot");
        writableDatabase.update("Cards", contentValues, "defaultSlot = ?", new String[]{Integer.toString(0)});
        contentValues.put("defaultSlot", (Integer) 0);
        int update = writableDatabase.update("Cards", contentValues, "cardId = ?", new String[]{str});
        if (update != 0) {
            writableDatabase.setTransactionSuccessful();
        }
        writableDatabase.endTransaction();
        if (update != 0) {
            return true;
        }
        return false;
    }
}
