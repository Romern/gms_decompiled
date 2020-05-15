package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;

/* renamed from: aama */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aama extends srp {

    /* renamed from: a */
    private final Context f28435a;

    /* renamed from: a */
    private final SQLiteDatabase m21481a(boolean z) {
        int an = (int) cecz.f182285a.mo6606a().mo78822an();
        int i = 0;
        while (i < an) {
            try {
                if (cecz.f182285a.mo6606a().mo78821am() && i == an - 1) {
                    this.f28435a.deleteDatabase(getDatabaseName());
                }
                if (!z) {
                    return getReadableDatabase();
                }
                return getWritableDatabase();
            } catch (SQLiteException e) {
                StringBuilder sb = new StringBuilder(49);
                sb.append("Failed to open RMQ database. attempt: ");
                sb.append(i);
                Log.e("GCM", sb.toString(), e);
                i++;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final SQLiteDatabase mo16995b() {
        return m21481a(true);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public aama(Context context, String str) {
        super(context, str, str, 1);
        this.f28435a = context;
    }

    /* renamed from: a */
    public final SQLiteDatabase mo16994a() {
        return m21481a(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create TABLE outgoingRmqMessages (_id INTEGER PRIMARY KEY,rmq_id INTEGER,type INTEGER,ts INTEGER,data BLOB);");
        sQLiteDatabase.execSQL("create TABLE lastrmqid (_id INTEGER PRIMARY KEY,rmq_id INTEGER);");
        sQLiteDatabase.execSQL("create TABLE s2dRmqIds (_id INTEGER PRIMARY KEY,rmq_id INTEGER);");
    }
}
