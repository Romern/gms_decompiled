package p000;

import java.util.Map;

/* renamed from: bnca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnca implements Map.Entry {

    /* renamed from: a */
    final Object f131410a;

    /* renamed from: b */
    Object f131411b;

    /* renamed from: c */
    final /* synthetic */ bncb f131412c;

    public bnca(bncb bncb, Object obj, Object obj2) {
        this.f131412c = bncb;
        this.f131410a = obj;
        this.f131411b = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return this.f131410a.equals(entry.getKey()) && this.f131411b.equals(entry.getValue());
        }
    }

    public final Object getKey() {
        return this.f131410a;
    }

    public final Object getValue() {
        return this.f131411b;
    }

    public final int hashCode() {
        return this.f131410a.hashCode() ^ this.f131411b.hashCode();
    }

    public final Object setValue(Object obj) {
        Object put = this.f131412c.put(this.f131410a, obj);
        this.f131411b = obj;
        return put;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f131410a);
        String valueOf2 = String.valueOf(this.f131411b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
