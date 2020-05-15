package p000;

import android.database.Cursor;

/* renamed from: adrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adrv extends adrr {
    public adrv(Cursor cursor) {
        this.f62587a = cursor;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ adsg mo33752c() {
        adsd adsd = new adsd();
        Cursor cursor = this.f62587a;
        adsd.f62613b = Long.valueOf(cursor.getLong(cursor.getColumnIndex("_id")));
        Cursor cursor2 = this.f62587a;
        adsd.f62612a = cursor2.getString(cursor2.getColumnIndex("name"));
        return new adse(adsd);
    }
}
