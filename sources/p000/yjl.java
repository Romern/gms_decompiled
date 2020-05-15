package p000;

import java.util.Iterator;
import java.util.logging.Level;

/* renamed from: yjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yjl extends bnch {

    /* renamed from: a */
    private final Iterator f53936a;

    /* renamed from: b */
    private yhu f53937b = null;

    public yjl(Iterator it) {
        this.f53936a = it;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8969a() {
        while (this.f53936a.hasNext()) {
            yhu yhu = (yhu) this.f53936a.next();
            yhu yhu2 = this.f53937b;
            if (yhu2 == null || yhu.mo30385a() >= yhu2.mo30387b()) {
                this.f53937b = yhu;
                return yhu;
            }
            ypq.m44538a("invalid order", Level.WARNING, "invalid order. current: %s next: %s", this.f53937b, yhu);
        }
        return (yhu) mo67118d();
    }
}
