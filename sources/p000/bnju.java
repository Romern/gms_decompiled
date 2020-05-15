package p000;

import java.util.Iterator;

/* renamed from: bnju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnju extends bnpc {

    /* renamed from: a */
    final /* synthetic */ bnkc f131723a;

    public bnju(bnkc bnkc) {
        this.f131723a = bnkc;
    }

    public final boolean contains(Object obj) {
        return this.f131723a.mo67271d(obj);
    }

    public final Iterator iterator() {
        return new bnjx(this.f131723a);
    }

    public final boolean remove(Object obj) {
        return !this.f131723a.mo67126b(obj).isEmpty();
    }

    public final int size() {
        return this.f131723a.f131754c.size();
    }
}
