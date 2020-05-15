package p000;

import android.database.Cursor;

/* renamed from: bbzw */
final /* synthetic */ class bbzw implements bmxj {

    /* renamed from: a */
    static final bmxj f103844a = new bbzw();

    private bbzw() {
    }

    public final Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor.getPosition() != -1 || cursor.moveToFirst()) {
            bcsg b = bcsh.m89789b();
            b.mo57435a(true);
            return b.mo57434a();
        }
        bcsg b2 = bcsh.m89789b();
        b2.mo57435a(false);
        return b2.mo57434a();
    }
}
