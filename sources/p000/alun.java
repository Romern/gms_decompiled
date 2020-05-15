package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: alun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alun extends srp {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(alth.m61761a("logs", "timestamp INTEGER NOT NULL", "account_name TEXT", "page_id TEXT", "process_id INTEGER NOT NULL", "thread_id INTEGER NOT NULL", "log_tag TEXT NOT NULL", "message TEXT"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10021b(SQLiteDatabase sQLiteDatabase) {
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON;");
            Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory;", null);
            try {
                rawQuery.moveToFirst();
            } finally {
                rawQuery.close();
            }
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        amdk.m62655a("PeopleLog", "Downgrading from version %d to %d", i, i2);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        amdk.m62655a("PeopleLog", "Upgrading from version %d to %d", i, i2);
    }

    public alun(Context context, String str) {
        super(context, str, str, 1);
    }
}
