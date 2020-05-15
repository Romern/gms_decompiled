package p000;

import java.util.Map;

/* renamed from: j */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1097j implements Map.Entry {

    /* renamed from: a */
    public final Object f22014a;

    /* renamed from: b */
    public final Object f22015b;

    /* renamed from: c */
    C1097j f22016c;

    /* renamed from: d */
    public C1097j f22017d;

    public C1097j(Object obj, Object obj2) {
        this.f22014a = obj;
        this.f22015b = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1097j) {
            C1097j jVar = (C1097j) obj;
            return this.f22014a.equals(jVar.f22014a) && this.f22015b.equals(jVar.f22015b);
        }
    }

    public final Object getKey() {
        return this.f22014a;
    }

    public final Object getValue() {
        return this.f22015b;
    }

    public final int hashCode() {
        return this.f22014a.hashCode() ^ this.f22015b.hashCode();
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f22014a + "=" + this.f22015b;
    }
}
