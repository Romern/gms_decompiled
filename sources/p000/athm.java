package p000;

import android.database.Cursor;

/* renamed from: athm */
final /* synthetic */ class athm implements srl {

    /* renamed from: a */
    static final srl f90379a = new athm();

    private athm() {
    }

    /* renamed from: a */
    public final Object mo21850a(Object obj) {
        Cursor cursor = (Cursor) obj;
        return new athn(cursor.getString(0), cursor.getBlob(1), cursor.getBlob(2));
    }
}
