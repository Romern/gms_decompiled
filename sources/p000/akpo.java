package p000;

/* renamed from: akpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akpo {

    /* renamed from: a */
    public final int f72392a;

    /* renamed from: b */
    public final int f72393b;

    /* renamed from: c */
    private final boolean f72394c;

    public akpo(int i, int i2, boolean z) {
        this.f72392a = i;
        this.f72393b = i2;
        this.f72394c = z;
    }

    /* renamed from: a */
    public static akpo m60217a(int i, int i2) {
        return new akpo(i, i2, true);
    }

    /* renamed from: b */
    public final akpo mo39671b() {
        return this.f72394c ? new akpo(this.f72393b, this.f72392a, false) : this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            akpo a = mo39670a();
            akpo a2 = ((akpo) obj).mo39670a();
            return a.f72392a == a2.f72392a && a.f72393b == a2.f72393b;
        }
    }

    public final int hashCode() {
        akpo a = mo39670a();
        return a.f72392a + (a.f72393b * 31);
    }

    public final String toString() {
        int i = this.f72392a;
        int i2 = this.f72393b;
        String str = !this.f72394c ? "portrait" : "landscape";
        StringBuilder sb = new StringBuilder(str.length() + 42);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append(" (for ");
        sb.append(str);
        sb.append(" orientation)");
        return sb.toString();
    }

    /* renamed from: a */
    public final akpo mo39670a() {
        return !this.f72394c ? new akpo(this.f72393b, this.f72392a, true) : this;
    }
}
