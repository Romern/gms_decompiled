package p000;

import android.database.Cursor;

/* renamed from: ell */
final /* synthetic */ class ell implements elq {

    /* renamed from: a */
    static final elq f15244a = new ell();

    private ell() {
    }

    /* renamed from: a */
    public final Object mo10264a(Object obj) {
        Cursor cursor = (Cursor) obj;
        eid eid = elt.f15254a;
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }
}
