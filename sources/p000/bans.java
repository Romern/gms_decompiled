package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

@Deprecated
/* renamed from: bans */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bans implements banu {

    /* renamed from: a */
    private static final String[] f101369a = {"name"};

    /* renamed from: b */
    private final cayo f101370b;

    public bans(cayo cayo) {
        this.f101370b = cayo;
    }

    /* renamed from: a */
    public final void mo55754a() {
        bang bang = (bang) this.f101370b.mo16713a();
        synchronized (bang.f101347a) {
            if (!bang.f101350d) {
                if (bang.f101351e) {
                    bang.f101352f.close();
                }
                bang.f101350d = true;
                try {
                    bang.f101352f.getWritableDatabase().close();
                    if (!bang.f101348b.deleteDatabase(bang.f101349c)) {
                        throw new banv("Database delete failed.");
                    }
                } catch (SQLiteException e) {
                    throw new banv("Database clear failed.", e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo55755a(SQLiteDatabase sQLiteDatabase) {
        Cursor query;
        sQLiteDatabase.beginTransaction();
        try {
            query = sQLiteDatabase.query("sqlite_master", f101369a, "type='table'", null, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    String a = banr.f101368a.mo55808a(query.getString(0));
                    StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2);
                    sb.append('\"');
                    sb.append(a);
                    sb.append('\"');
                    String valueOf = String.valueOf(sb.toString());
                    sQLiteDatabase.execSQL(valueOf.length() == 0 ? new String("DROP TABLE ") : "DROP TABLE ".concat(valueOf));
                }
                query.close();
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                return;
            }
            throw new banv("SQLite Cursor is null");
        } catch (SQLiteException | banv e) {
            try {
                throw new RuntimeException("Error clearing SQLite storage", e);
            } catch (Throwable th) {
                sQLiteDatabase.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
        throw th;
    }
}
