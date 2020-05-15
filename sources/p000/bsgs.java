package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: bsgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsgs extends bsgt implements Iterable {

    /* renamed from: a */
    public final List f144547a = new ArrayList();

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof bsgs) && ((bsgs) obj).f144547a.equals(this.f144547a));
    }

    public final int hashCode() {
        return this.f144547a.hashCode();
    }

    public final Iterator iterator() {
        return this.f144547a.iterator();
    }
}
