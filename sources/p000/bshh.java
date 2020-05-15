package p000;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: bshh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bshh extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ bshk f144554a;

    public bshh(bshk bshk) {
        this.f144554a = bshk;
    }

    public final void clear() {
        this.f144554a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f144554a.containsKey(obj);
    }

    public final Iterator iterator() {
        return new bshg(this);
    }

    public final boolean remove(Object obj) {
        return this.f144554a.mo70586b(obj) != null;
    }

    public final int size() {
        return this.f144554a.f144570c;
    }
}
