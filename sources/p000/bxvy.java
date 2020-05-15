package p000;

import java.util.Map;

/* renamed from: bxvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxvy implements Map.Entry {

    /* renamed from: a */
    final /* synthetic */ bxwb f164972a;

    /* renamed from: b */
    private final Map.Entry f164973b;

    public bxvy(bxwb bxwb, Map.Entry entry) {
        this.f164972a = bxwb;
        this.f164973b = entry;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Map.Entry) && getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue());
        }
        return true;
    }

    public final Object getKey() {
        return this.f164973b.getKey();
    }

    public final Object getValue() {
        return this.f164972a.f164978a.mo74163a(this.f164973b.getValue());
    }

    public final int hashCode() {
        return this.f164973b.hashCode();
    }

    public final Object setValue(Object obj) {
        Map.Entry entry = this.f164973b;
        bxvx bxvx = this.f164972a.f164978a;
        Object value = entry.setValue(Integer.valueOf(((bxvp) obj).mo3214a()));
        if (value != null) {
            return this.f164972a.f164978a.mo74163a(value);
        }
        return null;
    }
}
