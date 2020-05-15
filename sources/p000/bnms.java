package p000;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* renamed from: bnms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bnms extends AbstractMap {

    /* renamed from: a */
    private transient Set f131852a;

    /* renamed from: b */
    private transient Set f131853b;

    /* renamed from: c */
    private transient Collection f131854c;

    /* renamed from: a */
    public abstract Set mo67137a();

    public final Set entrySet() {
        Set set = this.f131852a;
        if (set != null) {
            return set;
        }
        Set a = mo67137a();
        this.f131852a = a;
        return a;
    }

    /* renamed from: h */
    public Set mo67173h() {
        return new bnmn(this);
    }

    public Set keySet() {
        Set set = this.f131853b;
        if (set != null) {
            return set;
        }
        Set h = mo67173h();
        this.f131853b = h;
        return h;
    }

    public final Collection values() {
        Collection collection = this.f131854c;
        if (collection != null) {
            return collection;
        }
        bnmr bnmr = new bnmr(this);
        this.f131854c = bnmr;
        return bnmr;
    }
}
