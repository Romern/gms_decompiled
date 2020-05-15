package p000;

import java.io.Serializable;

/* renamed from: bmxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmxk implements Serializable, bmxj {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Object f131169a;

    public bmxk(Object obj) {
        this.f131169a = obj;
    }

    public final Object apply(Object obj) {
        return this.f131169a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bmxk) {
            return bmxi.m108538a(this.f131169a, ((bmxk) obj).f131169a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f131169a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f131169a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Functions.constant(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
