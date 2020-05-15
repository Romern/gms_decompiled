package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: acnt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acnt extends acnr {

    /* renamed from: c */
    private final int f60287c = this.f60277a.getColumnIndex("postal");

    public acnt(SQLiteDatabase sQLiteDatabase, String str) {
        super(sQLiteDatabase, str, "postals", acmm.f60159a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ContentValues mo32925a(long j, long j2, int i, String str, int i2) {
        return acms.m49472c(j, j2, this.f60277a.getString(this.f60287c), i, str, i2);
    }
}
