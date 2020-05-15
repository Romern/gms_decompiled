package p000;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: bdtl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdtl extends bdwc {
    public bdtl() {
        super(2);
    }

    /* renamed from: a */
    public final void mo58352a(SQLiteDatabase sQLiteDatabase) {
        for (String str : bdtn.f106422a) {
            sQLiteDatabase.execSQL(str);
        }
        bdvz.m91502a(sQLiteDatabase);
    }
}
