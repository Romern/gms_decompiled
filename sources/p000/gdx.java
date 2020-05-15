package p000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: gdx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gdx {

    /* renamed from: a */
    public final Map f17988a = new HashMap();

    /* renamed from: a */
    public final gdw mo11716a(Object obj, Set set) {
        gdw gdw = new gdw();
        if (!this.f17988a.containsKey(obj)) {
            if (set.isEmpty()) {
                return gdw;
            }
            this.f17988a.put(obj, new HashSet());
        }
        Set set2 = (Set) this.f17988a.get(obj);
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!set.contains(next)) {
                it.remove();
                gdw.f17987b.add(next);
            }
        }
        for (Object obj2 : set) {
            if (!set2.contains(obj2)) {
                ((Set) this.f17988a.get(obj)).add(obj2);
                gdw.f17986a.add(obj2);
            }
        }
        if (((Set) this.f17988a.get(obj)).isEmpty()) {
            this.f17988a.remove(obj);
        }
        return gdw;
    }
}
