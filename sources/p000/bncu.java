package p000;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: bncu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bncu extends bncn implements SortedMap {

    /* renamed from: d */
    SortedSet f131461d;

    /* renamed from: e */
    final /* synthetic */ bndd f131462e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bncu(bndd bndd, SortedMap sortedMap) {
        super(bndd, sortedMap);
        this.f131462e = bndd;
    }

    public final Comparator comparator() {
        return mo67172g().comparator();
    }

    /* renamed from: e */
    public SortedSet mo67173h() {
        return new bncv(this.f131462e, mo67172g());
    }

    /* renamed from: f */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f131461d;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet e = mo67173h();
        this.f131461d = e;
        return e;
    }

    public final Object firstKey() {
        return mo67172g().firstKey();
    }

    /* renamed from: g */
    public SortedMap mo67172g() {
        return (SortedMap) this.f131448a;
    }

    public SortedMap headMap(Object obj) {
        return new bncu(this.f131462e, mo67172g().headMap(obj));
    }

    public final Object lastKey() {
        return mo67172g().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new bncu(this.f131462e, mo67172g().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new bncu(this.f131462e, mo67172g().tailMap(obj));
    }
}
