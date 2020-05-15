package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: acnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acnq extends acnr {

    /* renamed from: c */
    private final int f60276c = this.f60277a.getColumnIndex("email");

    public acnq(SQLiteDatabase sQLiteDatabase, String str) {
        super(sQLiteDatabase, str, "emails", acmk.f60157a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ContentValues mo32925a(long j, long j2, int i, String str, int i2) {
        return acms.m49463a(j, j2, this.f60277a.getString(this.f60276c), i, str, i2);
    }
}
