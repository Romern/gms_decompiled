package p000;

import java.util.Iterator;

/* renamed from: bmxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmxc implements Iterable {

    /* renamed from: a */
    final /* synthetic */ Iterable f131163a;

    /* renamed from: b */
    final /* synthetic */ bmxe f131164b;

    public bmxc(bmxe bmxe, Iterable iterable) {
        this.f131164b = bmxe;
        this.f131163a = iterable;
    }

    public final Iterator iterator() {
        return new bmxb(this);
    }
}
