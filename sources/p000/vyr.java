package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: vyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vyr extends srp {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE t (a BLOB NOT NULL);");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public vyr(Context context, String str) {
        super(context, str, str, 1);
    }
}
