package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: lwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lwx extends srp {
    /* renamed from: a */
    public final SQLiteDatabase mo19716a() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException e) {
            throw new lwy(e);
        }
    }

    /* renamed from: b */
    public final SQLiteDatabase mo19717b() {
        try {
            return super.getReadableDatabase();
        } catch (SQLiteException e) {
            throw new lwy(e);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS tertiary_keys");
        onCreate(sQLiteDatabase);
    }

    public lwx(Context context) {
        super(context, "backupencryption.db", "backupencryption.db", 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE tertiary_keys ( _id INTEGER PRIMARY KEY,secondary_key_alias TEXT,package_name TEXT,wrapped_key_bytes BLOB,UNIQUE(secondary_key_alias,package_name))");
    }
}
