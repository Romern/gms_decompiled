package p000;

import android.database.sqlite.SQLiteDatabase;
import java.util.List;

/* renamed from: elp */
final /* synthetic */ class elp implements elq {

    /* renamed from: a */
    static final elq f15251a = new elp();

    private elp() {
    }

    /* renamed from: a */
    public final Object mo10264a(Object obj) {
        eid eid = elt.f15254a;
        return (List) elt.m10633a(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), elg.f15239a);
    }
}
