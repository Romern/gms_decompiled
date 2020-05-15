package p000;

import android.database.Cursor;

/* renamed from: adrw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adrw extends adrr {
    public adrw(Cursor cursor) {
        this.f62587a = cursor;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ adsg mo33752c() {
        Cursor cursor = this.f62587a;
        long j = cursor.getLong(cursor.getColumnIndex("_id"));
        Cursor cursor2 = this.f62587a;
        adsf adsf = new adsf(Long.valueOf(j), Long.valueOf(cursor2.getLong(cursor2.getColumnIndex("date_modified"))));
        int columnIndex = this.f62587a.getColumnIndex("media_type");
        if (columnIndex != -1) {
            adsf.f62617h = Integer.valueOf(this.f62587a.getInt(columnIndex));
        }
        return adsf;
    }
}
