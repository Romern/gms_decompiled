package p000;

import java.io.Serializable;

/* renamed from: bmxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmxw implements Serializable {
    private static final long serialVersionUID = 747826592375603043L;

    /* renamed from: a */
    public final Object f131187a;

    /* renamed from: b */
    public final Object f131188b;

    protected bmxw(Object obj, Object obj2) {
        this.f131187a = obj;
        this.f131188b = obj2;
    }

    /* renamed from: a */
    public static bmxw m108574a(Object obj, Object obj2) {
        return new bmxw(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bmxw) {
            bmxw bmxw = (bmxw) obj;
            return bmxi.m108538a(this.f131187a, bmxw.f131187a) && bmxi.m108538a(this.f131188b, bmxw.f131188b);
        }
    }

    public final int hashCode() {
        Object obj = this.f131187a;
        int i = 0;
        int hashCode = obj != null ? obj.hashCode() : 0;
        Object obj2 = this.f131188b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f131187a);
        String valueOf2 = String.valueOf(this.f131188b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(valueOf2).length());
        sb.append("(");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
