package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: anfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anfh {

    /* renamed from: a */
    private static final srn f76766a = srn.m36127a(sgj.PHENOTYPE);

    /* renamed from: b */
    private static final Object f76767b = new Object();

    /* renamed from: c */
    private static long f76768c = 0;

    /* renamed from: a */
    public static long m64155a(anfw anfw) {
        Cursor query;
        Throwable th;
        synchronized (f76767b) {
            if (f76768c == 0) {
                SQLiteDatabase writableDatabase = anfw.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    query = writableDatabase.query("LastFetch", new String[]{"servertimestamp"}, "key = 1", null, null, null, null);
                    if (query.getCount() != 0) {
                        query.moveToFirst();
                        f76768c = query.getLong(0);
                    } else {
                        bnsl bnsl = (bnsl) f76766a.mo68390d();
                        bnsl.mo68432a("anfh", "a", 48, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("No Heterodyne serving version in database");
                        f76768c = -1;
                    }
                    writableDatabase.setTransactionSuccessful();
                    if (query != null) {
                        query.close();
                    }
                    writableDatabase.endTransaction();
                    long j = f76768c;
                    return j;
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            } else {
                long j2 = f76768c;
                return j2;
            }
        }
        throw th;
    }

    /* renamed from: a */
    public static void m64156a() {
        synchronized (f76767b) {
            f76768c = 0;
        }
    }
}
