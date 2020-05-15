package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bshf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bshf extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ bshk f144553a;

    public bshf(bshk bshk) {
        this.f144553a = bshk;
    }

    public final void clear() {
        this.f144553a.clear();
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Map.Entry) && this.f144553a.mo70584a((Map.Entry) obj) != null;
    }

    public final Iterator iterator() {
        return new bshe(this);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bshk.a(bshj, boolean):void
     arg types: [bshj, int]
     candidates:
      bshk.a(bshj, bshj):void
      bshk.a(java.lang.Object, boolean):bshj
      bshk.a(bshj, boolean):void */
    public final boolean remove(Object obj) {
        bshj a;
        if (!(obj instanceof Map.Entry) || (a = this.f144553a.mo70584a((Map.Entry) obj)) == null) {
            return false;
        }
        this.f144553a.mo70585a(a, true);
        return true;
    }

    public final int size() {
        return this.f144553a.f144570c;
    }
}
