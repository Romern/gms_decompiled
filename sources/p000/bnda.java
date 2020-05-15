package p000;

import java.util.Iterator;
import java.util.NavigableSet;

/* renamed from: bnda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnda extends bndc implements NavigableSet {

    /* renamed from: f */
    final /* synthetic */ bndd f131474f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bnda(bndd bndd, Object obj, NavigableSet navigableSet, bncx bncx) {
        super(bndd, obj, navigableSet, bncx);
        this.f131474f = bndd;
    }

    /* renamed from: a */
    private final NavigableSet m109022a(NavigableSet navigableSet) {
        bndd bndd = this.f131474f;
        Object obj = this.f131467a;
        bncx bncx = this.f131469c;
        if (bncx == null) {
            bncx = this;
        }
        return new bnda(bndd, obj, navigableSet, bncx);
    }

    public final Object ceiling(Object obj) {
        return mo67251e().ceiling(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final NavigableSet mo67251e() {
        return (NavigableSet) super.mo67251e();
    }

    public final Iterator descendingIterator() {
        return new bncw(this, mo67251e().descendingIterator());
    }

    public final NavigableSet descendingSet() {
        return m109022a(mo67251e().descendingSet());
    }

    public final Object floor(Object obj) {
        return mo67251e().floor(obj);
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return m109022a(mo67251e().headSet(obj, z));
    }

    public final Object higher(Object obj) {
        return mo67251e().higher(obj);
    }

    public final Object lower(Object obj) {
        return mo67251e().lower(obj);
    }

    public final Object pollFirst() {
        return bnjr.m109624f(iterator());
    }

    public final Object pollLast() {
        return bnjr.m109624f(descendingIterator());
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return m109022a(mo67251e().subSet(obj, z, obj2, z2));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return m109022a(mo67251e().tailSet(obj, z));
    }
}
