package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: bnps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnps extends bnqb {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    transient Set f131973a;

    /* renamed from: b */
    transient Collection f131974b;

    public bnps(Map map, Object obj) {
        super(map, obj);
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public final Set entrySet() {
        Set set;
        synchronized (this.f131984g) {
            if (this.f131973a == null) {
                this.f131973a = new bnpv(mo68302a().entrySet(), this.f131984g);
            }
            set = this.f131973a;
        }
        return set;
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection;
        synchronized (this.f131984g) {
            Collection collection2 = (Collection) super.get(obj);
            if (collection2 != null) {
                collection = bnqh.m110116b(collection2, this.f131984g);
            } else {
                collection = null;
            }
        }
        return collection;
    }

    public final Collection values() {
        Collection collection;
        synchronized (this.f131984g) {
            if (this.f131974b == null) {
                this.f131974b = new bnpx(mo68302a().values(), this.f131984g);
            }
            collection = this.f131974b;
        }
        return collection;
    }
}
