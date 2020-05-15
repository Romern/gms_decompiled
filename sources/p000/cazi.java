package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: cazi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cazi implements cayy {

    /* renamed from: a */
    public static final cayy f176444a = cayz.m127582a(Collections.emptySet());

    /* renamed from: b */
    private final List f176445b;

    /* renamed from: c */
    private final List f176446c;

    public cazi(List list, List list2) {
        this.f176445b = list;
        this.f176446c = list2;
    }

    /* renamed from: a */
    public static cazh m127601a(int i, int i2) {
        return new cazh(i, i2);
    }

    /* renamed from: b */
    public final Set mo6445a() {
        int size = this.f176445b.size();
        ArrayList arrayList = new ArrayList(this.f176446c.size());
        int size2 = this.f176446c.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((cijl) this.f176446c.get(i)).mo6445a();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(cayv.m127576c(size));
        int size3 = this.f176445b.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object a = ((cijl) this.f176445b.get(i2)).mo6445a();
            cazf.m127594a(a);
            hashSet.add(a);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                cazf.m127594a(obj);
                hashSet.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
