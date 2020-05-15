package p000;

import android.database.Cursor;

/* renamed from: adrt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adrt extends adrr {
    public adrt(Cursor cursor) {
        this.f62587a = cursor;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ adsg mo33752c() {
        adrz adrz = new adrz();
        Cursor cursor = this.f62587a;
        adrz.f62598b = Long.valueOf(cursor.getLong(cursor.getColumnIndex("_id")));
        Cursor cursor2 = this.f62587a;
        adrz.f62597a = cursor2.getString(cursor2.getColumnIndex("artist"));
        return new adsa(adrz);
    }
}
