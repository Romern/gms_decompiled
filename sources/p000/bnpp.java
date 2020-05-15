package p000;

import java.util.Map;
import java.util.Set;

/* renamed from: bnpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnpp extends bnms {

    /* renamed from: a */
    final /* synthetic */ bnpr f131969a;

    public bnpp(bnpr bnpr) {
        this.f131969a = bnpr;
    }

    /* renamed from: a */
    public final Set mo67137a() {
        return new bnpo(this);
    }

    public final boolean containsKey(Object obj) {
        return this.f131969a.mo68264a(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (this.f131969a.mo68264a(obj)) {
            return this.f131969a.mo68265b(obj);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj != null) {
            return (Map) this.f131969a.f131971a.remove(obj);
        }
        return null;
    }
}
