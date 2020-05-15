package p000;

/* renamed from: yfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yfx extends yhc {

    /* renamed from: a */
    private final ygd f53739a;

    /* renamed from: b */
    private final ynn f53740b;

    /* renamed from: c */
    private final boolean f53741c;

    /* renamed from: d */
    private final bmxv f53742d;

    public yfx(ygd ygd, ynn ynn, boolean z, bmxv bmxv) {
        this.f53739a = ygd;
        this.f53740b = ynn;
        this.f53741c = z;
        this.f53742d = bmxv;
    }

    /* renamed from: a */
    public final ygd mo30445a() {
        return this.f53739a;
    }

    /* renamed from: b */
    public final ynn mo30446b() {
        return this.f53740b;
    }

    /* renamed from: c */
    public final boolean mo30447c() {
        return this.f53741c;
    }

    /* renamed from: d */
    public final bmxv mo30448d() {
        return this.f53742d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yhc) {
            yhc yhc = (yhc) obj;
            return this.f53739a.equals(yhc.mo30445a()) && this.f53740b.equals(yhc.mo30446b()) && this.f53741c == yhc.mo30447c() && this.f53742d.equals(yhc.mo30448d());
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f53739a.hashCode() ^ 1000003) * 1000003) ^ this.f53740b.hashCode()) * 1000003;
        if (!this.f53741c) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f53742d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f53739a);
        String valueOf2 = String.valueOf(this.f53740b);
        boolean z = this.f53741c;
        String valueOf3 = String.valueOf(this.f53742d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 101 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("DataStreamSource{dataSourcePredicate=");
        sb.append(valueOf);
        sb.append(", dataStreamOrigin=");
        sb.append(valueOf2);
        sb.append(", supplemental=");
        sb.append(z);
        sb.append(", overlapWindowProvider=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
