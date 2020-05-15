package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: acxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acxe extends bnch implements acwo {

    /* renamed from: a */
    final List f61004a;

    /* renamed from: b */
    final Iterator f61005b;

    public acxe(List list) {
        this.f61004a = list;
        this.f61005b = list.iterator();
    }

    /* renamed from: b */
    public static acwo m49929b() {
        return new acxe(new ArrayList());
    }

    /* renamed from: a */
    public final Object mo8969a() {
        return this.f61005b.hasNext() ? this.f61005b.next() : mo67118d();
    }

    public final void close() {
    }
}
