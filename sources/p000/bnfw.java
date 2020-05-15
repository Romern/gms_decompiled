package p000;

import java.util.Map;

/* renamed from: bnfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnfw extends bngc {

    /* renamed from: a */
    final /* synthetic */ bngd f131567a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bnfw(bngd bngd) {
        super(bngd);
        this.f131567a = bngd;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo67571a(int i) {
        return new bnfu(this.f131567a, i);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int a = this.f131567a.mo67595a(key);
            return a != -1 && bmxi.m108538a(value, this.f131567a.f131579b[a]);
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
        int a2 = this.f131567a.mo67596a(key, a);
        if (a2 == -1 || !bmxi.m108538a(value, this.f131567a.f131579b[a2])) {
            return false;
        }
        this.f131567a.mo67599a(a2, a);
        return true;
    }
}
