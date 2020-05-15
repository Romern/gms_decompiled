package p000;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: cazb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cazb extends cayu {

    /* renamed from: b */
    public static final cijl f176440b = cayz.m127582a(Collections.emptyMap());

    public cazb(Map map) {
        super(map);
    }

    /* renamed from: a */
    public static caza m127586a(int i) {
        return new caza(i);
    }

    /* renamed from: b */
    public final Map mo6445a() {
        LinkedHashMap b = cayv.m127575b(this.f176434a.size());
        for (Map.Entry entry : this.f176434a.entrySet()) {
            b.put(entry.getKey(), ((cijl) entry.getValue()).mo6445a());
        }
        return Collections.unmodifiableMap(b);
    }
}
