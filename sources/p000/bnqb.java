package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: bnqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bnqb extends bnqd implements Map {
    private static final long serialVersionUID = 0;

    /* renamed from: c */
    transient Set f131979c;

    /* renamed from: d */
    transient Collection f131980d;

    /* renamed from: e */
    transient Set f131981e;

    public bnqb(Map map, Object obj) {
        super(map, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Map mo68302a() {
        return (Map) this.f131983f;
    }

    public final void clear() {
        synchronized (this.f131984g) {
            mo68302a().clear();
        }
    }

    public final boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.f131984g) {
            containsKey = mo68302a().containsKey(obj);
        }
        return containsKey;
    }

    public boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.f131984g) {
            containsValue = mo68302a().containsValue(obj);
        }
        return containsValue;
    }

    public Set entrySet() {
        Set set;
        synchronized (this.f131984g) {
            if (this.f131981e == null) {
                this.f131981e = bnqh.m110114a(mo68302a().entrySet(), this.f131984g);
            }
            set = this.f131981e;
        }
        return set;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f131984g) {
            equals = mo68302a().equals(obj);
        }
        return equals;
    }

    public Object get(Object obj) {
        Object obj2;
        synchronized (this.f131984g) {
            obj2 = mo68302a().get(obj);
        }
        return obj2;
    }

    public final int hashCode() {
        int hashCode;
        synchronized (this.f131984g) {
            hashCode = mo68302a().hashCode();
        }
        return hashCode;
    }

    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f131984g) {
            isEmpty = mo68302a().isEmpty();
        }
        return isEmpty;
    }

    public final Set keySet() {
        Set set;
        synchronized (this.f131984g) {
            if (this.f131979c == null) {
                this.f131979c = bnqh.m110114a(mo68302a().keySet(), this.f131984g);
            }
            set = this.f131979c;
        }
        return set;
    }

    public final Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this.f131984g) {
            put = mo68302a().put(obj, obj2);
        }
        return put;
    }

    public final void putAll(Map map) {
        synchronized (this.f131984g) {
            mo68302a().putAll(map);
        }
    }

    public final Object remove(Object obj) {
        Object remove;
        synchronized (this.f131984g) {
            remove = mo68302a().remove(obj);
        }
        return remove;
    }

    public final int size() {
        int size;
        synchronized (this.f131984g) {
            size = mo68302a().size();
        }
        return size;
    }

    public Collection values() {
        Collection collection;
        synchronized (this.f131984g) {
            if (this.f131980d == null) {
                this.f131980d = bnqh.m110112a(mo68302a().values(), this.f131984g);
            }
            collection = this.f131980d;
        }
        return collection;
    }
}
