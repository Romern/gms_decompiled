package p000;

import java.util.Map;

/* renamed from: bshj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bshj implements Map.Entry {

    /* renamed from: a */
    bshj f144559a;

    /* renamed from: b */
    bshj f144560b;

    /* renamed from: c */
    bshj f144561c;

    /* renamed from: d */
    bshj f144562d;

    /* renamed from: e */
    bshj f144563e;

    /* renamed from: f */
    final Object f144564f;

    /* renamed from: g */
    Object f144565g;

    /* renamed from: h */
    int f144566h;

    public bshj() {
        this.f144564f = null;
        this.f144563e = this;
        this.f144562d = this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f144564f;
        if (obj2 == null ? entry.getKey() == null : obj2.equals(entry.getKey())) {
            Object obj3 = this.f144565g;
            if (obj3 == null) {
                return entry.getValue() == null;
            }
            if (obj3.equals(entry.getValue())) {
                return true;
            }
        }
    }

    public final Object getKey() {
        return this.f144564f;
    }

    public final Object getValue() {
        return this.f144565g;
    }

    public final int hashCode() {
        Object obj = this.f144564f;
        int i = 0;
        int hashCode = obj != null ? obj.hashCode() : 0;
        Object obj2 = this.f144565g;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        Object obj2 = this.f144565g;
        this.f144565g = obj;
        return obj2;
    }

    public final String toString() {
        return this.f144564f + "=" + this.f144565g;
    }

    public bshj(bshj bshj, Object obj, bshj bshj2, bshj bshj3) {
        this.f144559a = bshj;
        this.f144564f = obj;
        this.f144566h = 1;
        this.f144562d = bshj2;
        this.f144563e = bshj3;
        bshj3.f144562d = this;
        bshj2.f144563e = this;
    }
}
