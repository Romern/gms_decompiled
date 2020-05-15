package p000;

import java.io.Serializable;

/* renamed from: bnzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnzw extends bnyp implements Serializable {

    /* renamed from: a */
    static final bnzc f132429a = new bnzw(0);
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    private final int f132430b;

    static {
        new bnzw(bnzi.f132400a);
    }

    public bnzw(int i) {
        this.f132430b = i;
    }

    /* renamed from: a */
    public final bnzd mo68732a() {
        return new bnzv(this.f132430b);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bnzw) && this.f132430b == ((bnzw) obj).f132430b;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ this.f132430b;
    }

    public final String toString() {
        int i = this.f132430b;
        StringBuilder sb = new StringBuilder(32);
        sb.append("Hashing.murmur3_128(");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
