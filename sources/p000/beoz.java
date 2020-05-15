package p000;

import java.util.List;

/* renamed from: beoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class beoz extends bepk {

    /* renamed from: a */
    public final int f111968a;

    /* renamed from: b */
    private final List f111969b;

    public beoz(int i, List list) {
        this.f111968a = i;
        this.f111969b = list;
    }

    /* renamed from: a */
    public final int mo60883a() {
        return this.f111968a;
    }

    /* renamed from: b */
    public final List mo60884b() {
        return this.f111969b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bepk) {
            bepk bepk = (bepk) obj;
            return this.f111968a == bepk.mo60883a() && this.f111969b.equals(bepk.mo60884b());
        }
    }

    public final int hashCode() {
        return ((this.f111968a ^ 1000003) * 1000003) ^ this.f111969b.hashCode();
    }

    public final String toString() {
        int i = this.f111968a;
        String valueOf = String.valueOf(this.f111969b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb.append("Violation{violationType=");
        sb.append(i);
        sb.append(", stackTrace=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
