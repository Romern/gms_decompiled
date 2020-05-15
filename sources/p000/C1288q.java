package p000;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: q */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1288q {

    /* renamed from: a */
    final Map f26846a = new HashMap();

    /* renamed from: b */
    final Map f26847b;

    public C1288q(Map map) {
        this.f26847b = map;
        for (Map.Entry entry : map.entrySet()) {
            C0005ad adVar = (C0005ad) entry.getValue();
            List list = (List) this.f26846a.get(adVar);
            if (list == null) {
                list = new ArrayList();
                this.f26846a.put(adVar, list);
            }
            list.add(entry.getKey());
        }
    }

    /* renamed from: a */
    public static void m19971a(List list, C0013ak akVar, C0005ad adVar, Object obj) {
        if (list != null) {
            int size = list.size() - 1;
            while (size >= 0) {
                C1315r rVar = (C1315r) list.get(size);
                try {
                    int i = rVar.f26883a;
                    if (i == 0) {
                        rVar.f26884b.invoke(obj, new Object[0]);
                    } else if (i != 1) {
                        rVar.f26884b.invoke(obj, akVar, adVar);
                    } else {
                        rVar.f26884b.invoke(obj, akVar);
                    }
                    size--;
                } catch (InvocationTargetException e) {
                    throw new RuntimeException("Failed to call observer method", e.getCause());
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
    }
}
