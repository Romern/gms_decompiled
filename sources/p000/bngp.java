package p000;

import java.util.EnumMap;

/* renamed from: bngp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bngp extends bnhc {

    /* renamed from: b */
    private final transient EnumMap f131602b;

    public bngp(EnumMap enumMap) {
        this.f131602b = enumMap;
        bmxy.m108588a(!enumMap.isEmpty());
    }

    /* renamed from: b */
    public final bnrd mo67649b() {
        return new bnmf(this.f131602b.entrySet().iterator());
    }

    /* renamed from: cS */
    public final bnrd mo67650cS() {
        return bnjr.m109608a(this.f131602b.keySet().iterator());
    }

    /* renamed from: cT */
    public final boolean mo67651cT() {
        return false;
    }

    public final boolean containsKey(Object obj) {
        return this.f131602b.containsKey(obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bngp) {
            obj = ((bngp) obj).f131602b;
        }
        return this.f131602b.equals(obj);
    }

    public final Object get(Object obj) {
        return this.f131602b.get(obj);
    }

    public final int size() {
        return this.f131602b.size();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new bngo(this.f131602b);
    }
}
