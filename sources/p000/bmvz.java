package p000;

/* renamed from: bmvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmvz extends bmxv {

    /* renamed from: a */
    public static final bmvz f131120a = new bmvz();
    private static final long serialVersionUID = 0;

    private bmvz() {
    }

    private Object readResolve() {
        return f131120a;
    }

    /* renamed from: a */
    public final bmxv mo66810a(bmxj bmxj) {
        bmxy.m108581a(bmxj);
        return f131120a;
    }

    /* renamed from: a */
    public final boolean mo66813a() {
        return false;
    }

    /* renamed from: b */
    public final Object mo66814b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    /* renamed from: c */
    public final Object mo66815c() {
        return null;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    /* renamed from: a */
    public final bmxv mo66811a(bmxv bmxv) {
        bmxy.m108581a(bmxv);
        return bmxv;
    }

    /* renamed from: a */
    public final Object mo66812a(Object obj) {
        bmxy.m108582a(obj, "use Optional.orNull() instead of Optional.or(null)");
        return obj;
    }
}
