package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/* renamed from: aoal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoal extends srp {

    /* renamed from: a */
    private static final String f78037a = String.format("CREATE TABLE %s (%s, %s, %s, %s, %s);", "offline_frames", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "packageName STRING", "accountName STRING", "payload STRING", "url STRING");

    /* renamed from: b */
    private static final String f78038b = String.format("CREATE TABLE %s (%s, %s, %s, %s, %s, %s);", "offline_logs", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "accountName TEXT NOT NULL", "type TEXT NOT NULL", "payload TEXT NOT NULL", "timestamp INTEGER NOT NULL", "onBehalfOf TEXT");

    /* renamed from: c */
    private static final String f78039c = String.format("CREATE TABLE %s (%s, %s, %s, %s, %s, %s);", "plus_accounts", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "updated INTEGER NOT NULL", "display_name STRING", "account_name STRING", "profile_image_url STRING", "signedUp BOOLEAN");

    /* renamed from: d */
    private static final String f78040d = String.format("CREATE TABLE %s (%s, %s, %s, %s, %s);", "plus_profiles", "_id INTEGER PRIMARY KEY AUTOINCREMENT", "updated INTEGER NOT NULL", "accountName STRING", "packageName STRING", "profileJson STRING");

    /* renamed from: e */
    private final Context f78041e;

    public aoal(Context context, String str) {
        super(context, str, str, 9, cdnd.m134166b());
        this.f78041e = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f78037a);
        sQLiteDatabase.execSQL(f78038b);
        sQLiteDatabase.execSQL(f78039c);
        sQLiteDatabase.execSQL(f78040d);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder(91);
        sb.append("Resetting the database due to downgrade. Old version: ");
        sb.append(i);
        sb.append(", new version: ");
        sb.append(i2);
        Log.e("PlusOpenHelper", sb.toString());
        sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", "offline_frames"));
        sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", "offline_logs"));
        sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", "plus_accounts"));
        sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", "plus_profiles"));
        onCreate(sQLiteDatabase);
    }

    /* JADX INFO: finally extract failed */
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i <= 5) {
            Cursor query = sQLiteDatabase.query("default_account", new String[]{"packageName", "accountName"}, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    soz.m35789a(this.f78041e, query.getString(0), query.getString(1));
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS default_account");
        }
        if (i <= 6) {
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS plus_profiles", new Object[0]));
            sQLiteDatabase.execSQL(f78040d);
        }
        if (i == 7) {
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS plus_profiles", new Object[0]));
            sQLiteDatabase.execSQL(f78040d);
        }
        if (i < 9) {
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", "offline_logs"));
            sQLiteDatabase.execSQL(f78038b);
        }
    }
}
