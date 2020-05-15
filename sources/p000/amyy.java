package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: amyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amyy {

    /* renamed from: a */
    public final List f76421a = new ArrayList();

    /* renamed from: b */
    private final Map f76422b = new HashMap();

    /* renamed from: a */
    private final List m63744a(Integer num) {
        List list = (List) this.f76422b.get(num);
        if (list != null) {
            return list;
        }
        Map map = this.f76422b;
        ArrayList arrayList = new ArrayList();
        map.put(num, arrayList);
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final List mo41576b() {
        return m63744a(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final List mo41577c() {
        return m63744a(2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final List mo41578d() {
        return m63744a(3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo41575a() {
        return m63744a(0);
    }
}
