package p000;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: bnfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bnfr extends bnfq implements SortedSet {
    protected bnfr() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Set mo67560a() {
        throw null;
    }

    public final Comparator comparator() {
        return mo67564d().comparator();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract SortedSet mo67564d();

    public final Object first() {
        return mo67564d().first();
    }

    public final SortedSet headSet(Object obj) {
        return mo67564d().headSet(obj);
    }

    public final Object last() {
        return mo67564d().last();
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        return mo67564d().subSet(obj, obj2);
    }

    public final SortedSet tailSet(Object obj) {
        return mo67564d().tailSet(obj);
    }
}
