package p000;

import java.util.Iterator;

/* renamed from: bnff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnff extends bnfi {

    /* renamed from: a */
    final /* synthetic */ Iterable f131557a;

    public bnff(Iterable iterable) {
        this.f131557a = iterable;
    }

    public final Iterator iterator() {
        return bnjr.m109622d(bnjr.m109609a(this.f131557a.iterator(), bnjd.m109573a()));
    }
}
