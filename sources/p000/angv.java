package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: angv */
public final /* synthetic */ class angv {
    /* renamed from: a */
    public static void m64356a(Map map, Object obj, Object obj2) {
        List list = (List) map.get(obj);
        if (list == null) {
            list = new ArrayList();
            map.put(obj, list);
        }
        list.add(obj2);
    }
}
