package p000;

import java.util.Iterator;

/* renamed from: bnoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnoy extends bnch {

    /* renamed from: a */
    final Iterator f131943a = this.f131944b.f131945a.iterator();

    /* renamed from: b */
    final /* synthetic */ bnoz f131944b;

    public bnoy(bnoz bnoz) {
        this.f131944b = bnoz;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo8969a() {
        while (this.f131943a.hasNext()) {
            Object next = this.f131943a.next();
            if (!this.f131944b.f131946b.contains(next)) {
                return next;
            }
        }
        return mo67118d();
    }
}
