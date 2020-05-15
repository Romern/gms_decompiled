package p000;

import java.util.Map;

/* renamed from: bnhq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnhq extends bngm {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final bnht f131638a;

    public bnhq(bnht bnht) {
        this.f131638a = bnht;
    }

    /* renamed from: a */
    public final bnrd iterator() {
        return this.f131638a.mo67278j();
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.f131638a.mo67309b(entry.getKey(), entry.getValue());
    }

    /* renamed from: h */
    public final boolean mo67640h() {
        throw null;
    }

    public final int size() {
        return this.f131638a.f131643c;
    }
}
