package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: ryq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ryq extends srp {

    /* renamed from: a */
    public static volatile ryq f43859a;

    /* renamed from: b */
    public static final Object f43860b = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE downloads (_id INTEGER PRIMARY KEY AUTOINCREMENT,filename TEXT NOT NULL UNIQUE,url TEXT NOT NULL,sizeBytes INTEGER NOT NULL,sha1 TEXT NOT NULL,destination TEXT,minVersion INTEGER,maxVersion INTEGER,notificationTitle TEXT,notificationDescription TEXT,enabled INTEGER DEFAULT 0,retries INTEGER DEFAULT 0,dm_id INTEGER);");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i <= 0) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS downloads");
            onCreate(sQLiteDatabase);
        }
    }

    public ryq(Context context, String str) {
        super(context, str, str, 1);
    }
}
