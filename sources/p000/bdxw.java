package p000;

import android.database.Cursor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bdxw */
final /* synthetic */ class bdxw implements bdyb {

    /* renamed from: a */
    private final bdxy f106610a;

    public bdxw(bdxy bdxy) {
        this.f106610a = bdxy;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final Object mo58431a() {
        Map map;
        bdxy bdxy = this.f106610a;
        Cursor query = bdxy.f106614a.query(bdxy.f106615b, bdxy.f106612c, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                Map emptyMap = Collections.emptyMap();
                query.close();
                return emptyMap;
            }
            if (count > 256) {
                map = new HashMap(count, 1.0f);
            } else {
                map = new C1223np(count);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }
}
