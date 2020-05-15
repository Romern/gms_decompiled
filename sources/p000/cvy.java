package p000;

import java.util.Map;

/* renamed from: cvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cvy implements Map.Entry {

    /* renamed from: a */
    final /* synthetic */ Object f12214a;

    /* renamed from: b */
    final /* synthetic */ Object f12215b;

    public cvy(Object obj, Object obj2) {
        this.f12214a = obj;
        this.f12215b = obj2;
    }

    public final Object getKey() {
        return this.f12214a;
    }

    public final Object getValue() {
        return this.f12215b;
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Non-mutable entry");
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f12214a);
        String valueOf2 = String.valueOf(this.f12215b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(valueOf2).length());
        sb.append("[");
        sb.append(valueOf);
        sb.append("->");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
