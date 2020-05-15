package p000;

import java.util.Iterator;

/* renamed from: bnou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnou extends bnch {

    /* renamed from: a */
    final Iterator f131934a = this.f131936c.f131937a.iterator();

    /* renamed from: b */
    final Iterator f131935b = this.f131936c.f131938b.iterator();

    /* renamed from: c */
    final /* synthetic */ bnov f131936c;

    public bnou(bnov bnov) {
        this.f131936c = bnov;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo8969a() {
        if (this.f131934a.hasNext()) {
            return this.f131934a.next();
        }
        while (this.f131935b.hasNext()) {
            Object next = this.f131935b.next();
            if (!this.f131936c.f131937a.contains(next)) {
                return next;
            }
        }
        return mo67118d();
    }
}
