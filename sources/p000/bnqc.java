package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: bnqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bnqc extends bnqd implements bnmu {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    transient Map f131982a;

    public bnqc(bnmu bnmu) {
        super(bnmu, null);
    }

    /* renamed from: a */
    public final void mo67308a(Object obj, Iterable iterable) {
        throw null;
    }

    /* renamed from: b */
    public bnmu mo68301b() {
        return (bnmu) this.f131983f;
    }

    /* renamed from: b */
    public final boolean mo67309b(Object obj, Object obj2) {
        throw null;
    }

    /* renamed from: c */
    public final int mo67269c() {
        throw null;
    }

    /* renamed from: c */
    public Collection mo67127c(Object obj) {
        throw null;
    }

    /* renamed from: c */
    public final boolean mo67310c(Object obj, Object obj2) {
        throw null;
    }

    /* renamed from: d */
    public final void mo67270d() {
        throw null;
    }

    /* renamed from: d */
    public final boolean mo67271d(Object obj) {
        throw null;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f131984g) {
            equals = mo68301b().equals(obj);
        }
        return equals;
    }

    public final int hashCode() {
        int hashCode;
        synchronized (this.f131984g) {
            hashCode = mo68301b().hashCode();
        }
        return hashCode;
    }

    /* renamed from: m */
    public final boolean mo67314m() {
        throw null;
    }

    /* renamed from: n */
    public final Collection mo67315n() {
        throw null;
    }

    /* renamed from: o */
    public final Set mo67316o() {
        throw null;
    }

    /* renamed from: p */
    public final Collection mo67317p() {
        throw null;
    }

    /* renamed from: q */
    public final Map mo67318q() {
        Map map;
        synchronized (this.f131984g) {
            if (this.f131982a == null) {
                this.f131982a = new bnps(mo68301b().mo67318q(), this.f131984g);
            }
            map = this.f131982a;
        }
        return map;
    }

    /* renamed from: a */
    public final boolean mo67268a(Object obj, Object obj2) {
        boolean a;
        synchronized (this.f131984g) {
            a = mo68301b().mo67268a(obj, obj2);
        }
        return a;
    }
}
