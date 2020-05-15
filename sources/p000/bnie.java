package p000;

import java.util.Map;

/* renamed from: bnie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnie extends bnic {

    /* renamed from: a */
    private final transient bnig f131657a;

    public bnie(bnig bnig) {
        this.f131657a = bnig;
    }

    /* renamed from: a */
    public final bnrd iterator() {
        return this.f131657a.mo67278j();
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.f131657a.mo67309b(entry.getKey(), entry.getValue());
    }

    /* renamed from: h */
    public final boolean mo67640h() {
        return false;
    }

    public final int size() {
        return ((bnht) this.f131657a).f131643c;
    }
}
