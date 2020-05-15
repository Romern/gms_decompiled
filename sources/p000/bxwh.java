package p000;

import java.util.Map;

/* renamed from: bxwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxwh implements Map.Entry {

    /* renamed from: a */
    public final Map.Entry f164993a;

    public bxwh(Map.Entry entry) {
        this.f164993a = entry;
    }

    public final Object getKey() {
        return this.f164993a.getKey();
    }

    public final Object getValue() {
        if (((bxwj) this.f164993a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof bxxc) {
            bxwj bxwj = (bxwj) this.f164993a.getValue();
            bxxc bxxc = bxwj.f164995a;
            bxwj.f164996b = null;
            bxwj.f164995a = (bxxc) obj;
            return bxxc;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
