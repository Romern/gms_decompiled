package p000;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: elk */
final /* synthetic */ class elk implements elq {

    /* renamed from: a */
    private final String f15243a;

    public elk(String str) {
        this.f15243a = str;
    }

    /* renamed from: a */
    public final Object mo10264a(Object obj) {
        String str = this.f15243a;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        eid eid = elt.f15254a;
        sQLiteDatabase.compileStatement(str).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 10").execute();
        return null;
    }
}
