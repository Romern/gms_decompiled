package p000;

import android.database.Cursor;
import java.util.HashMap;
import java.util.List;

/* renamed from: elc */
final /* synthetic */ class elc implements elq {

    /* renamed from: a */
    private final List f15234a;

    /* renamed from: b */
    private final ejb f15235b;

    public elc(List list, ejb ejb) {
        this.f15234a = list;
        this.f15235b = ejb;
    }

    /* renamed from: a */
    public final Object mo10264a(Object obj) {
        eid eid;
        List list = this.f15234a;
        ejb ejb = this.f15235b;
        Cursor cursor = (Cursor) obj;
        eid eid2 = elt.f15254a;
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            eiw eiw = new eiw();
            eiw.f15105b = new HashMap();
            eiw.mo10182a(cursor.getString(1));
            eiw.mo10180a(cursor.getLong(2));
            eiw.mo10183b(cursor.getLong(3));
            String string = cursor.getString(4);
            if (string != null) {
                eid = eid.m10480a(string);
            } else {
                eid = elt.f15254a;
            }
            eiw.mo10181a(new eiv(eid, cursor.getBlob(5)));
            if (!cursor.isNull(6)) {
                eiw.f15104a = Integer.valueOf(cursor.getInt(6));
            }
            list.add(ekz.m10609a(j, ejb, eiw.mo10179a()));
        }
        return null;
    }
}
