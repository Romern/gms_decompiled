package p000;

import java.util.Map;

/* renamed from: bnhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bnhg extends bnic {
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = mo67696e().get(entry.getKey());
            return obj2 != null && obj2.equals(entry.getValue());
        }
    }

    /* renamed from: d */
    public final boolean mo67658d() {
        return false;
    }

    /* renamed from: e */
    public abstract bnhe mo67696e();

    /* renamed from: h */
    public final boolean mo67640h() {
        return mo67696e().mo67651cT();
    }

    public final int hashCode() {
        return mo67696e().hashCode();
    }

    public final int size() {
        return mo67696e().size();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new bnhf(mo67696e());
    }
}
