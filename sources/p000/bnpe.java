package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: bnpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnpe extends bnfr implements NavigableSet, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final NavigableSet f131952a;

    /* renamed from: b */
    private final SortedSet f131953b;

    /* renamed from: c */
    private transient bnpe f131954c;

    public bnpe(NavigableSet navigableSet) {
        bmxy.m108581a(navigableSet);
        this.f131952a = navigableSet;
        this.f131953b = Collections.unmodifiableSortedSet(navigableSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Set mo67560a() {
        return this.f131953b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Collection mo9243b() {
        return this.f131953b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo9244c() {
        return this.f131953b;
    }

    public final Object ceiling(Object obj) {
        return this.f131952a.ceiling(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final SortedSet mo67564d() {
        return this.f131953b;
    }

    public final Iterator descendingIterator() {
        return bnjr.m109608a(this.f131952a.descendingIterator());
    }

    public final NavigableSet descendingSet() {
        bnpe bnpe = this.f131954c;
        if (bnpe != null) {
            return bnpe;
        }
        bnpe bnpe2 = new bnpe(this.f131952a.descendingSet());
        this.f131954c = bnpe2;
        bnpe2.f131954c = this;
        return bnpe2;
    }

    public final Object floor(Object obj) {
        return this.f131952a.floor(obj);
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return bnpf.m110051a(this.f131952a.headSet(obj, z));
    }

    public final Object higher(Object obj) {
        return this.f131952a.higher(obj);
    }

    public final Object lower(Object obj) {
        return this.f131952a.lower(obj);
    }

    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return bnpf.m110051a(this.f131952a.subSet(obj, z, obj2, z2));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return bnpf.m110051a(this.f131952a.tailSet(obj, z));
    }
}
