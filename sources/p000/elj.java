package p000;

import android.database.Cursor;

/* renamed from: elj */
final /* synthetic */ class elj implements elq {

    /* renamed from: a */
    static final elq f15242a = new elj();

    private elj() {
    }

    /* renamed from: a */
    public final Object mo10264a(Object obj) {
        Cursor cursor = (Cursor) obj;
        eid eid = elt.f15254a;
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }
}
