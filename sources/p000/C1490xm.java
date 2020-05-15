package p000;

/* renamed from: xm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1490xm {

    /* renamed from: a */
    public int f27587a;

    /* renamed from: b */
    public int f27588b;

    /* renamed from: c */
    Object f27589c;

    /* renamed from: d */
    public int f27590d;

    public C1490xm(int i, int i2, int i3, Object obj) {
        this.f27587a = i;
        this.f27588b = i2;
        this.f27590d = i3;
        this.f27589c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1490xm) {
            C1490xm xmVar = (C1490xm) obj;
            int i = this.f27587a;
            if (i == xmVar.f27587a) {
                if (i == 8 && Math.abs(this.f27590d - this.f27588b) == 1 && this.f27590d == xmVar.f27588b && this.f27588b == xmVar.f27590d) {
                    return true;
                }
                if (this.f27590d == xmVar.f27590d && this.f27588b == xmVar.f27588b) {
                    Object obj2 = this.f27589c;
                    if (obj2 != null) {
                        if (!obj2.equals(xmVar.f27589c)) {
                            return false;
                        }
                    } else if (xmVar.f27589c != null) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f27587a * 31) + this.f27588b) * 31) + this.f27590d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f27587a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f27588b);
        sb.append("c:");
        sb.append(this.f27590d);
        sb.append(",p:");
        sb.append(this.f27589c);
        sb.append("]");
        return sb.toString();
    }
}
