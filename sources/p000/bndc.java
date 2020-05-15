package p000;

import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: bndc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bndc extends bncx implements SortedSet {

    /* renamed from: g */
    final /* synthetic */ bndd f131476g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bndc(bndd bndd, Object obj, SortedSet sortedSet, bncx bncx) {
        super(bndd, obj, sortedSet, bncx);
        this.f131476g = bndd;
    }

    public final Comparator comparator() {
        return mo67251e().comparator();
    }

    /* renamed from: e */
    public SortedSet mo67251e() {
        return (SortedSet) this.f131468b;
    }

    public final Object first() {
        mo67214a();
        return mo67251e().first();
    }

    public final SortedSet headSet(Object obj) {
        mo67214a();
        bndd bndd = this.f131476g;
        Object obj2 = this.f131467a;
        SortedSet headSet = mo67251e().headSet(obj);
        bncx bncx = this.f131469c;
        if (bncx == null) {
            bncx = this;
        }
        return new bndc(bndd, obj2, headSet, bncx);
    }

    public final Object last() {
        mo67214a();
        return mo67251e().last();
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        mo67214a();
        bndd bndd = this.f131476g;
        Object obj3 = this.f131467a;
        SortedSet subSet = mo67251e().subSet(obj, obj2);
        bncx bncx = this.f131469c;
        if (bncx == null) {
            bncx = this;
        }
        return new bndc(bndd, obj3, subSet, bncx);
    }

    public final SortedSet tailSet(Object obj) {
        mo67214a();
        bndd bndd = this.f131476g;
        Object obj2 = this.f131467a;
        SortedSet tailSet = mo67251e().tailSet(obj);
        bncx bncx = this.f131469c;
        if (bncx == null) {
            bncx = this;
        }
        return new bndc(bndd, obj2, tailSet, bncx);
    }
}
