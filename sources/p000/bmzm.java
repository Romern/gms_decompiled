package p000;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: bmzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmzm implements Serializable, bmzi {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public final Object f131273a;

    public bmzm(Object obj) {
        this.f131273a = obj;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        return this.f131273a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bmzm) {
            return bmxi.m108538a(this.f131273a, ((bmzm) obj).f131273a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f131273a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f131273a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
