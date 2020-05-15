package p000;

import android.database.Cursor;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: eld */
final /* synthetic */ class eld implements elq {

    /* renamed from: a */
    private final Map f15236a;

    public eld(Map map) {
        this.f15236a = map;
    }

    /* renamed from: a */
    public final Object mo10264a(Object obj) {
        Map map = this.f15236a;
        Cursor cursor = (Cursor) obj;
        eid eid = elt.f15254a;
        while (cursor.moveToNext()) {
            Long valueOf = Long.valueOf(cursor.getLong(0));
            Set set = (Set) map.get(valueOf);
            if (set == null) {
                set = new HashSet();
                map.put(valueOf, set);
            }
            set.add(new elr(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }
}
