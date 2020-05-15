package p000;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* renamed from: bnfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnfx extends AbstractMap implements Serializable, bndw {

    /* renamed from: a */
    private final bngd f131568a;

    /* renamed from: b */
    private transient Set f131569b;

    public bnfx(bngd bngd) {
        this.f131568a = bngd;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f131568a.f131584g = this;
    }

    /* renamed from: a */
    public final bndw mo67382a() {
        throw null;
    }

    public final void clear() {
        this.f131568a.clear();
    }

    public final boolean containsKey(Object obj) {
        return this.f131568a.containsValue(obj);
    }

    public final boolean containsValue(Object obj) {
        return this.f131568a.containsKey(obj);
    }

    public final Set entrySet() {
        Set set = this.f131569b;
        if (set != null) {
            return set;
        }
        bnfy bnfy = new bnfy(this.f131568a);
        this.f131569b = bnfy;
        return bnfy;
    }

    public final Object get(Object obj) {
        bngd bngd = this.f131568a;
        int b = bngd.mo67601b(obj);
        if (b != -1) {
            return bngd.f131578a[b];
        }
        return null;
    }

    public final Set keySet() {
        return this.f131568a.values();
    }

    public final Object put(Object obj, Object obj2) {
        return this.f131568a.mo67598a(obj, obj2);
    }

    public final Object remove(Object obj) {
        bngd bngd = this.f131568a;
        int a = bngg.m109305a(obj);
        int b = bngd.mo67602b(obj, a);
        if (b == -1) {
            return null;
        }
        Object obj2 = bngd.f131578a[b];
        bngd.mo67604b(b, a);
        return obj2;
    }

    public final int size() {
        return this.f131568a.f131580c;
    }

    public final /* bridge */ /* synthetic */ Collection values() {
        return this.f131568a.keySet();
    }
}
