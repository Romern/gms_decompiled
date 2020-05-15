package p000;

import java.util.Map;

/* renamed from: bnog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnog extends bnic {

    /* renamed from: a */
    public final transient Object[] f131903a;

    /* renamed from: b */
    public final transient int f131904b;

    /* renamed from: c */
    public final transient int f131905c;

    /* renamed from: d */
    private final transient bnhe f131906d;

    public bnog(bnhe bnhe, Object[] objArr, int i, int i2) {
        this.f131906d = bnhe;
        this.f131903a = objArr;
        this.f131904b = i;
        this.f131905c = i2;
    }

    /* renamed from: a */
    public final int mo67630a(Object[] objArr, int i) {
        return mo67639g().mo67630a(objArr, i);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f131906d.get(key));
        }
    }

    /* renamed from: h */
    public final boolean mo67640h() {
        return true;
    }

    /* renamed from: i */
    public final bngx mo67756i() {
        return new bnof(this);
    }

    public final int size() {
        return this.f131905c;
    }

    /* renamed from: a */
    public final bnrd iterator() {
        return mo67639g().listIterator();
    }
}
