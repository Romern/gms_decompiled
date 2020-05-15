package p000;

import android.database.Cursor;

/* renamed from: xdj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xdj {

    /* renamed from: a */
    final long f51997a;

    /* renamed from: b */
    final byte[] f51998b;

    public xdj(Cursor cursor) {
        xjz.m43073a(cursor.getString(cursor.getColumnIndex("id")));
        xcm.m42657a().parse(cursor.getString(cursor.getColumnIndex("registration_time")));
        this.f51997a = cursor.getLong(cursor.getColumnIndex("counter"));
        this.f51998b = cursor.getBlob(cursor.getColumnIndex("key_data"));
    }
}
