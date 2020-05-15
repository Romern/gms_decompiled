package p000;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: sqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sqg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ sqj f44959a;

    public sqg(sqj sqj) {
        this.f44959a = sqj;
    }

    public final void run() {
        synchronized (this.f44959a.f44963b) {
            sqj sqj = this.f44959a;
            int i = sqj.f44965d;
            if (i > 0) {
                i--;
                sqj.f44965d = i;
            }
            SQLiteDatabase sQLiteDatabase = sqj.f44964c;
            if (sQLiteDatabase != null) {
                if (i == 0) {
                    if (sQLiteDatabase.isOpen()) {
                        sqj.f44964c.close();
                    }
                    sqj.f44964c = null;
                }
            }
        }
    }
}
