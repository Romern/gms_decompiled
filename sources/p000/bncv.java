package p000;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: bncv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bncv extends bncq implements SortedSet {

    /* renamed from: c */
    final /* synthetic */ bndd f131463c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bncv(bndd bndd, SortedMap sortedMap) {
        super(bndd, sortedMap);
        this.f131463c = bndd;
    }

    /* renamed from: b */
    public SortedMap mo67189b() {
        return (SortedMap) this.f131848d;
    }

    public final Comparator comparator() {
        return mo67189b().comparator();
    }

    public final Object first() {
        return mo67189b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new bncv(this.f131463c, mo67189b().headMap(obj));
    }

    public final Object last() {
        return mo67189b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new bncv(this.f131463c, mo67189b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new bncv(this.f131463c, mo67189b().tailMap(obj));
    }
}
