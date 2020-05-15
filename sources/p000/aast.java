package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: aast */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aast extends LinkedHashMap {
    /* renamed from: a */
    public final void mo31751a(Object obj, Object obj2) {
        List list = (List) get(obj);
        if (list == null) {
            list = new ArrayList();
            put(obj, list);
        }
        list.add(obj2);
    }
}
