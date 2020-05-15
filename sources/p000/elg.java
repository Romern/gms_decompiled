package p000;

import android.database.Cursor;
import android.util.Base64;
import java.util.ArrayList;

/* renamed from: elg */
final /* synthetic */ class elg implements elq {

    /* renamed from: a */
    static final elq f15239a = new elg();

    private elg() {
    }

    /* renamed from: a */
    public final Object mo10264a(Object obj) {
        byte[] bArr;
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            eja d = ejb.m10519d();
            d.mo10190a(cursor.getString(1));
            d.mo10189a(emj.m10667a(cursor.getInt(2)));
            String string = cursor.getString(3);
            if (string != null) {
                bArr = Base64.decode(string, 0);
            } else {
                bArr = null;
            }
            d.f15114a = bArr;
            arrayList.add(d.mo10188a());
        }
        return arrayList;
    }
}
