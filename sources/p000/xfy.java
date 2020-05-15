package p000;

import android.database.Cursor;
import com.google.android.gms.fido.common.Transport;

/* renamed from: xfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xfy {

    /* renamed from: a */
    public final Transport f52154a;

    public xfy(Cursor cursor) {
        xfz.m42843b().parse(cursor.getString(cursor.getColumnIndex("usage_timestamp")));
        cursor.getString(cursor.getColumnIndex("rp_id"));
        this.f52154a = Transport.m23428a(cursor.getString(cursor.getColumnIndex("transport")));
        boan.f132470d.mo68796b(cursor.getString(cursor.getColumnIndex("key_handle")));
    }
}
