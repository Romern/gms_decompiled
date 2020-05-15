package p000;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: elw */
final /* synthetic */ class elw implements ely {

    /* renamed from: a */
    static final ely f15259a = new elw();

    private elw() {
    }

    /* renamed from: a */
    public final void mo10268a(SQLiteDatabase sQLiteDatabase) {
        int i = elz.f15262b;
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }
}
