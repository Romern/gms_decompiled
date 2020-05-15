package p000;

import android.database.Cursor;

/* renamed from: adru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adru extends adrr {
    public adru(Cursor cursor) {
        this.f62587a = cursor;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ adsg mo33752c() {
        adsb adsb = new adsb();
        Cursor cursor = this.f62587a;
        adsb.f62600a = Long.valueOf(cursor.getLong(cursor.getColumnIndex("_id")));
        Cursor cursor2 = this.f62587a;
        adsb.f62601b = Long.valueOf(cursor2.getLong(cursor2.getColumnIndex("date_modified")));
        Cursor cursor3 = this.f62587a;
        adsb.f62602c = cursor3.getString(cursor3.getColumnIndex("title"));
        Cursor cursor4 = this.f62587a;
        adsb.f62603d = cursor4.getString(cursor4.getColumnIndex("album"));
        Cursor cursor5 = this.f62587a;
        adsb.f62604e = Long.valueOf(cursor5.getLong(cursor5.getColumnIndex("album_id")));
        Cursor cursor6 = this.f62587a;
        adsb.f62605f = cursor6.getString(cursor6.getColumnIndex("artist"));
        Cursor cursor7 = this.f62587a;
        adsb.f62606g = Long.valueOf(cursor7.getLong(cursor7.getColumnIndex("artist_id")));
        return new adsc(adsb);
    }
}
