package p000;

import java.util.LinkedHashMap;

/* renamed from: beaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class beaw {

    /* renamed from: a */
    public final int f106854a = 100;

    /* renamed from: b */
    private final LinkedHashMap f106855b = new beav(this);

    /* renamed from: a */
    public final synchronized Object mo58512a(Object obj) {
        return this.f106855b.get(obj);
    }

    /* renamed from: a */
    public final synchronized void mo58513a(Object obj, Object obj2) {
        this.f106855b.put(obj, obj2);
    }
}
