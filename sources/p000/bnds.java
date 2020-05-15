package p000;

import java.util.Iterator;
import java.util.Set;

/* renamed from: bnds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bnds implements bnqj {

    /* renamed from: a */
    private transient Set f131496a;

    /* renamed from: a */
    public Object mo67370a(Object obj, Object obj2, Object obj3) {
        throw null;
    }

    /* renamed from: a */
    public void mo67371a() {
        throw null;
    }

    /* renamed from: b */
    public final Set mo67372b() {
        Set set = this.f131496a;
        if (set != null) {
            return set;
        }
        bndr bndr = new bndr(this);
        this.f131496a = bndr;
        return bndr;
    }

    /* renamed from: c */
    public abstract Iterator mo67373c();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bnqj)) {
            return false;
        }
        return mo67372b().equals(((bnqj) obj).mo67372b());
    }

    public final int hashCode() {
        return mo67372b().hashCode();
    }

    public final String toString() {
        return mo68267e().toString();
    }
}
