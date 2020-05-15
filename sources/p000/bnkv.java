package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: bnkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnkv extends bnlb {

    /* renamed from: a */
    final /* synthetic */ bnlw f131785a;

    public bnkv(bnlw bnlw) {
        this.f131785a = bnlw;
    }

    public final void clear() {
        this.f131785a.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        Object obj2;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = this.f131785a.get(key)) == null || !this.f131785a.mo68005a().mo66864b(entry.getValue(), obj2)) {
            return false;
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.f131785a.isEmpty();
    }

    public final Iterator iterator() {
        return new bnku(this.f131785a);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || !this.f131785a.remove(key, entry.getValue())) {
            return false;
        }
        return true;
    }

    public final int size() {
        return this.f131785a.size();
    }
}
