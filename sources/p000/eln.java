package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: eln */
final /* synthetic */ class eln implements elq {

    /* renamed from: a */
    private final long f15247a;

    /* renamed from: b */
    private final ejb f15248b;

    public eln(long j, ejb ejb) {
        this.f15247a = j;
        this.f15248b = ejb;
    }

    /* renamed from: a */
    public final Object mo10264a(Object obj) {
        long j = this.f15247a;
        ejb ejb = this.f15248b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        eit eit = (eit) ejb;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{eit.f15098a, String.valueOf(emj.m10666a(eit.f15100c))}) <= 0) {
            contentValues.put("backend_name", eit.f15098a);
            contentValues.put("priority", Integer.valueOf(emj.m10666a(eit.f15100c)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
