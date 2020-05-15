package p000;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: bdtk */
final /* synthetic */ class bdtk implements Runnable {

    /* renamed from: a */
    private final SQLiteDatabase f106417a;

    public bdtk(SQLiteDatabase sQLiteDatabase) {
        this.f106417a = sQLiteDatabase;
    }

    public final void run() {
        SQLiteDatabase sQLiteDatabase = this.f106417a;
        for (String str : bdtn.f106423b) {
            sQLiteDatabase.delete(str, null, null);
        }
    }
}
