package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: abxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abxo extends srp {
    /* renamed from: c */
    private final void m48473c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS [errors]");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS [user_actions]");
        onCreate(sQLiteDatabase);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS [errors] ([id] INTEGER PRIMARY KEY AUTOINCREMENT, [package] TEXT, [data] BLOB, [timestamp] INTEGER DEFAULT (strftime('%s', 'now')))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS [user_actions] ([id] INTEGER PRIMARY KEY AUTOINCREMENT, [package] TEXT, [data] BLOB, [timestamp] INTEGER DEFAULT (strftime('%s', 'now')))");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m48473c(sQLiteDatabase);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m48473c(sQLiteDatabase);
    }

    public abxo(Context context) {
        super(context, "icing-indexapi-errors.db", "icing-indexapi-errors.db", 4);
    }
}
