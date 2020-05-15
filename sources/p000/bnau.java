package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* renamed from: bnau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnau extends bnah {

    /* renamed from: b */
    final /* synthetic */ bncb f131319b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bnau(bncb bncb, ConcurrentMap concurrentMap) {
        super(concurrentMap);
        this.f131319b = bncb;
    }

    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        Object obj2;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = this.f131319b.get(key)) == null || !this.f131319b.f131421g.mo66864b(entry.getValue(), obj2)) {
            return false;
        }
        return true;
    }

    public final Iterator iterator() {
        return new bnat(this.f131319b);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || !this.f131319b.remove(key, entry.getValue())) {
            return false;
        }
        return true;
    }
}
