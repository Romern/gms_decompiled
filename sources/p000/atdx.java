package p000;

import android.database.Cursor;

/* renamed from: atdx */
final /* synthetic */ class atdx implements srl {

    /* renamed from: a */
    static final srl f90163a = new atdx();

    private atdx() {
    }

    /* renamed from: a */
    public final Object mo21850a(Object obj) {
        Cursor cursor = (Cursor) obj;
        return new atdy(cursor.getString(0), cursor.getLong(1));
    }
}
