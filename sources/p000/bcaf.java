package p000;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: bcaf */
final /* synthetic */ class bcaf implements Runnable {

    /* renamed from: a */
    private final SQLiteDatabase f103866a;

    public bcaf(SQLiteDatabase sQLiteDatabase) {
        this.f103866a = sQLiteDatabase;
    }

    public final void run() {
        SQLiteDatabase sQLiteDatabase = this.f103866a;
        int i = bcas.f103904h;
        bcbc.m88746a(sQLiteDatabase);
    }
}
