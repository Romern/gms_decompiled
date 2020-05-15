package p000;

/* renamed from: bmyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmyg extends bmxv {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public final Object f131198a;

    public bmyg(Object obj) {
        this.f131198a = obj;
    }

    /* renamed from: a */
    public final bmxv mo66810a(bmxj bmxj) {
        Object apply = bmxj.apply(this.f131198a);
        bmxy.m108582a(apply, "the Function passed to Optional.transform() must not return null.");
        return new bmyg(apply);
    }

    /* renamed from: a */
    public final boolean mo66813a() {
        return true;
    }

    /* renamed from: b */
    public final Object mo66814b() {
        return this.f131198a;
    }

    /* renamed from: c */
    public final Object mo66815c() {
        return this.f131198a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bmyg) {
            return this.f131198a.equals(((bmyg) obj).f131198a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f131198a.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f131198a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final bmxv mo66811a(bmxv bmxv) {
        bmxy.m108581a(bmxv);
        return this;
    }

    /* renamed from: a */
    public final Object mo66812a(Object obj) {
        bmxy.m108582a(obj, "use Optional.orNull() instead of Optional.or(null)");
        return this.f131198a;
    }
}
