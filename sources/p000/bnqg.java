package p000;

import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: bnqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnqg extends bnqf implements SortedSet {
    private static final long serialVersionUID = 0;

    public bnqg(SortedSet sortedSet, Object obj) {
        super(sortedSet, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final SortedSet mo68314b() {
        return (SortedSet) super.mo68281a();
    }

    public final Comparator comparator() {
        Comparator comparator;
        synchronized (this.f131984g) {
            comparator = mo68314b().comparator();
        }
        return comparator;
    }

    public final Object first() {
        Object first;
        synchronized (this.f131984g) {
            first = mo68314b().first();
        }
        return first;
    }

    public final SortedSet headSet(Object obj) {
        SortedSet a;
        synchronized (this.f131984g) {
            a = bnqh.m110115a(mo68314b().headSet(obj), this.f131984g);
        }
        return a;
    }

    public final Object last() {
        Object last;
        synchronized (this.f131984g) {
            last = mo68314b().last();
        }
        return last;
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        SortedSet a;
        synchronized (this.f131984g) {
            a = bnqh.m110115a(mo68314b().subSet(obj, obj2), this.f131984g);
        }
        return a;
    }

    public final SortedSet tailSet(Object obj) {
        SortedSet a;
        synchronized (this.f131984g) {
            a = bnqh.m110115a(mo68314b().tailSet(obj), this.f131984g);
        }
        return a;
    }
}
