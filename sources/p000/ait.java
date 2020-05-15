package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: ait */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ait {

    /* renamed from: a */
    public final C1241og f614a = new C1242oh(10);

    /* renamed from: b */
    public final C1245ok f615b = new C1245ok();

    /* renamed from: c */
    public final ArrayList f616c = new ArrayList();

    /* renamed from: d */
    public final HashSet f617d = new HashSet();

    /* renamed from: a */
    public final void mo794a(Object obj) {
        if (!this.f615b.containsKey(obj)) {
            this.f615b.put(obj, null);
        }
    }

    /* renamed from: b */
    public final List mo796b(Object obj) {
        return (List) this.f615b.get(obj);
    }

    /* renamed from: a */
    public final void mo795a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) this.f615b.get(obj);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    mo795a(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }
}
