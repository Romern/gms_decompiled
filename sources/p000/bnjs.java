package p000;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* renamed from: bnjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnjs extends AbstractSequentialList {

    /* renamed from: a */
    final /* synthetic */ Object f131720a;

    /* renamed from: b */
    final /* synthetic */ bnkc f131721b;

    public bnjs(bnkc bnkc, Object obj) {
        this.f131721b = bnkc;
        this.f131720a = obj;
    }

    public final ListIterator listIterator(int i) {
        return new bnkb(this.f131721b, this.f131720a, i);
    }

    public final int size() {
        bnjy bnjy = (bnjy) this.f131721b.f131754c.get(this.f131720a);
        if (bnjy != null) {
            return bnjy.f131733c;
        }
        return 0;
    }
}
