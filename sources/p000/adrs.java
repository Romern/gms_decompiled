package p000;

import android.database.Cursor;

/* renamed from: adrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adrs extends adrr {
    public adrs(Cursor cursor) {
        this.f62587a = cursor;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ adsg mo33752c() {
        adrx adrx = new adrx();
        Cursor cursor = this.f62587a;
        adrx.f62588a = Long.valueOf(cursor.getLong(cursor.getColumnIndex("_id")));
        Cursor cursor2 = this.f62587a;
        adrx.f62589b = cursor2.getString(cursor2.getColumnIndex("album"));
        Cursor cursor3 = this.f62587a;
        adrx.f62590c = cursor3.getString(cursor3.getColumnIndex("album_art"));
        Cursor cursor4 = this.f62587a;
        adrx.f62591d = cursor4.getString(cursor4.getColumnIndex("artist"));
        Cursor cursor5 = this.f62587a;
        adrx.f62592e = Integer.valueOf(cursor5.getInt(cursor5.getColumnIndex("numsongs")));
        return new adry(adrx);
    }
}
