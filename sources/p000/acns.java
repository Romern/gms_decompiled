package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: acns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acns extends acnr {

    /* renamed from: c */
    private final int f60286c = this.f60277a.getColumnIndex("phone");

    public acns(SQLiteDatabase sQLiteDatabase, String str) {
        super(sQLiteDatabase, str, "phones", acml.f60158a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ContentValues mo32925a(long j, long j2, int i, String str, int i2) {
        return acms.m49471b(j, j2, this.f60277a.getString(this.f60286c), i, str, i2);
    }
}
