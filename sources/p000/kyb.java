package p000;

/* renamed from: kyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class kyb extends kyn {

    /* renamed from: a */
    private final bmxv f25389a;

    /* renamed from: b */
    private final bmxv f25390b;

    public kyb(bmxv bmxv, bmxv bmxv2) {
        if (bmxv != null) {
            this.f25389a = bmxv;
            if (bmxv2 != null) {
                this.f25390b = bmxv2;
                return;
            }
            throw new NullPointerException("Null neuralNetwork");
        }
        throw new NullPointerException("Null modelConfig");
    }

    /* renamed from: a */
    public final bmxv mo14933a() {
        return this.f25389a;
    }

    /* renamed from: b */
    public final bmxv mo14934b() {
        return this.f25390b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kyn) {
            kyn kyn = (kyn) obj;
            return this.f25389a.equals(kyn.mo14933a()) && this.f25390b.equals(kyn.mo14934b());
        }
    }

    public final int hashCode() {
        return ((this.f25389a.hashCode() ^ 1000003) * 1000003) ^ this.f25390b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f25389a);
        String valueOf2 = String.valueOf(this.f25390b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45 + String.valueOf(valueOf2).length());
        sb.append("ModelComponents{modelConfig=");
        sb.append(valueOf);
        sb.append(", neuralNetwork=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
