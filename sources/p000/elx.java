package p000;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: elx */
final /* synthetic */ class elx implements ely {

    /* renamed from: a */
    static final ely f15260a = new elx();

    private elx() {
    }

    /* renamed from: a */
    public final void mo10268a(SQLiteDatabase sQLiteDatabase) {
        int i = elz.f15262b;
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
