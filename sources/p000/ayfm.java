package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: ayfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayfm extends srp {
    private ayfm(Context context) {
        super(context.getApplicationContext(), "connectionconfig.db", "connectionconfig.db", 3);
    }

    /* renamed from: a */
    public static ayfm m83927a(Context context) {
        return new ayfm(context);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i == 1) {
            sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT;", "connectionConfigurations", "nodeId"));
        } else if (i != 2) {
            return;
        }
        sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT;", "connectionConfigurations", "crypto"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE connectionConfigurations (_id INTEGER PRIMARY KEY AUTOINCREMENT,androidId TEXT,name TEXT NOT NULL,pairedBtAddress TEXT NOT NULL,connectionType INTEGER NOT NULL,role INTEGER NOT NULL,connectionEnabled INTEGER NOT NULL,nodeId TEXT,crypto TEXT, UNIQUE(name) ON CONFLICT REPLACE);");
    }
}
