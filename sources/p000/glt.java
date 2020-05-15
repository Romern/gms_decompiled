package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: glt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class glt extends srp {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        glu.f18585a.mo25414c("creating database.", new Object[0]);
        sQLiteDatabase.execSQL(glu.f18586b);
        sQLiteDatabase.execSQL(glu.f18587c);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        glu.f18585a.mo25414c("upgrading db from %s to %s", Integer.valueOf(i), Integer.valueOf(i2));
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS AccountHistory");
        onCreate(sQLiteDatabase);
    }

    public glt(Context context, String str) {
        super(context, str, str, 1);
    }
}
