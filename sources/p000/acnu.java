package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: acnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acnu implements acmp {

    /* renamed from: a */
    private final acnp f60288a;

    /* renamed from: b */
    private final acnr f60289b;

    /* renamed from: c */
    private final acnr f60290c;

    /* renamed from: d */
    private final acnr f60291d;

    public acnu(SQLiteDatabase sQLiteDatabase, String str) {
        this.f60288a = new acnp(sQLiteDatabase, str);
        this.f60289b = new acnq(sQLiteDatabase, str);
        this.f60290c = new acns(sQLiteDatabase, str);
        this.f60291d = new acnt(sQLiteDatabase, str);
    }

    /* renamed from: a */
    public final void mo32887a() {
        acnv.m49555d("Closing local iterator (read %s)", acov.m49641a(mo32888b()));
        acnp acnp = this.f60288a;
        acnv.m49555d("Closing contacts iterator (read %s)", acov.m49641a(acnp.f60262b));
        acnp.f60261a.close();
        this.f60289b.mo32927a();
        this.f60290c.mo32927a();
        this.f60291d.mo32927a();
    }

    /* renamed from: b */
    public final long mo32888b() {
        return this.f60288a.f60262b + this.f60289b.f60278b + this.f60290c.f60278b + this.f60291d.f60278b;
    }

    /* renamed from: c */
    public final boolean mo32889c() {
        return true;
    }

    /* renamed from: d */
    public final acmo next() {
        ContentValues contentValues = (ContentValues) this.f60288a.next();
        sdo.m34959a(contentValues);
        Long asLong = contentValues.getAsLong("contact_id");
        return new acmo(contentValues, null, this.f60289b.mo32926a(asLong), this.f60290c.mo32926a(asLong), this.f60291d.mo32926a(asLong));
    }

    public final boolean hasNext() {
        return this.f60288a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
