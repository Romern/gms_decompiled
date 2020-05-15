package p000;

import java.util.Map;

/* renamed from: bxya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxya implements Map.Entry, Comparable {

    /* renamed from: a */
    public final Comparable f165073a;

    /* renamed from: b */
    public Object f165074b;

    /* renamed from: c */
    final /* synthetic */ bxyd f165075c;

    public bxya(bxyd bxyd, Comparable comparable, Object obj) {
        this.f165075c = bxyd;
        this.f165073a = comparable;
        this.f165074b = obj;
    }

    /* renamed from: a */
    private static final boolean m124393a(Object obj, Object obj2) {
        return obj != null ? obj.equals(obj2) : obj2 == null;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f165073a.compareTo(((bxya) obj).f165073a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return m124393a(this.f165073a, entry.getKey()) && m124393a(this.f165074b, entry.getValue());
        }
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f165073a;
    }

    public final Object getValue() {
        return this.f165074b;
    }

    public final int hashCode() {
        Comparable comparable = this.f165073a;
        int i = 0;
        int hashCode = comparable != null ? comparable.hashCode() : 0;
        Object obj = this.f165074b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f165075c.mo74270c();
        Object obj2 = this.f165074b;
        this.f165074b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f165073a);
        String valueOf2 = String.valueOf(this.f165074b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
