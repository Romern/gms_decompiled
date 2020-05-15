package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: acno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acno extends acmq {

    /* renamed from: a */
    private final Cursor f60259a;

    /* renamed from: b */
    private final int f60260b;

    public acno(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query("contacts", new String[]{"contact_id"}, str, null, null, null, "contact_id");
        this.f60259a = query;
        this.f60260b = query.getColumnIndex("contact_id");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo32890d() {
        try {
            if (this.f60259a.moveToNext()) {
                return Long.valueOf(this.f60259a.getLong(this.f60260b));
            }
            return null;
        } catch (IllegalStateException e) {
            return null;
        }
    }
}
