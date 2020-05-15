package p000;

import java.util.Map;

/* renamed from: bnfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnfy extends bngc {
    public bnfy(bngd bngd) {
        super(bngd);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo67571a(int i) {
        return new bnfv(this.f131577b, i);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int b = this.f131577b.mo67601b(key);
            return b != -1 && bmxi.m108538a(this.f131577b.f131578a[b], value);
        }
    }

    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int a = bngg.m109305a(key);
        int b = this.f131577b.mo67602b(key, a);
        if (b == -1 || !bmxi.m108538a(this.f131577b.f131578a[b], value)) {
            return false;
        }
        this.f131577b.mo67604b(b, a);
        return true;
    }
}
