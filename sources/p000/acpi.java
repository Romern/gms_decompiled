package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: acpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acpi extends srp {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE EventFingerprints(event_id INTEGER PRIMARY KEY, fingerprint INTEGER NOT NULL)");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, i, i2);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS EventFingerprints");
        onCreate(sQLiteDatabase);
    }

    public acpi(Context context) {
        super(context, "icing-proxy-calendar.db", "icing-proxy-calendar.db", 1);
    }
}
