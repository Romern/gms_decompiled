package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: aknu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aknu extends srp {

    /* renamed from: a */
    private static final srn f72319a = srn.m36127a(sgj.GUNS);

    /* renamed from: b */
    private static aknu f72320b = null;

    /* renamed from: a */
    public static synchronized SQLiteDatabase m60096a(Context context) {
        SQLiteDatabase readableDatabase;
        synchronized (aknu.class) {
            try {
                readableDatabase = m60099c(context).getReadableDatabase();
            } catch (Exception e) {
                bnsl bnsl = (bnsl) f72319a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Error getting readable DB.");
                return null;
            }
        }
        return readableDatabase;
    }

    /* renamed from: b */
    public static synchronized SQLiteDatabase m60098b(Context context) {
        SQLiteDatabase writableDatabase;
        synchronized (aknu.class) {
            try {
                writableDatabase = m60099c(context).getWritableDatabase();
            } catch (Exception e) {
                bnsl bnsl = (bnsl) f72319a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Error getting writable DB.");
                return null;
            }
        }
        return writableDatabase;
    }

    /* renamed from: c */
    private static synchronized aknu m60099c(Context context) {
        aknu aknu;
        synchronized (aknu.class) {
            if (f72320b == null) {
                f72320b = new aknu(context.getApplicationContext());
            }
            aknu = f72320b;
        }
        return aknu;
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m60100c(sQLiteDatabase);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m60100c(sQLiteDatabase);
    }

    private aknu(Context context) {
        super(context, "gms.notifications.db", "gms.notifications.db", 3);
    }

    /* renamed from: c */
    private final void m60100c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS notifications");
        } catch (Exception e) {
            bnsl bnsl = (bnsl) f72319a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Error dropping tables from DB.");
        }
        onCreate(sQLiteDatabase);
    }

    /* renamed from: a */
    public static synchronized void m60097a(SQLiteDatabase sQLiteDatabase, long j) {
        synchronized (aknu.class) {
            try {
                sQLiteDatabase.execSQL(String.format(null, "DELETE FROM %s WHERE %s <= %d;", "notifications", "creation_time_usec", Long.valueOf(j)));
            } catch (Exception e) {
                bnsl bnsl = (bnsl) f72319a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Failed to delete old notifications.");
            }
            try {
                sQLiteDatabase.execSQL(String.format(null, "DELETE FROM %s WHERE %s NOT IN (SELECT %s FROM %s ORDER BY %s DESC LIMIT %d);", "notifications", "_id", "_id", "notifications", "insertion_time_ms", Long.valueOf(cfqb.f185420a.mo6606a().mo82503p())));
            } catch (Exception e2) {
                bnsl bnsl2 = (bnsl) f72319a.mo68387b();
                bnsl2.mo68437a(e2);
                bnsl2.mo68405a("Failed to delete excess notifications.");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE notifications(_id INTEGER PRIMARY KEY, key TEXT UNIQUE NOT NULL, payload BLOB, insertion_time_ms INTEGER NOT NULL DEFAULT(0), creation_time_usec INTEGER NOT NULL DEFAULT(0) );");
        } catch (Exception e) {
            bnsl bnsl = (bnsl) f72319a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Error creating DB.");
        }
    }
}
