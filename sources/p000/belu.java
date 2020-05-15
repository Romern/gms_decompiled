package p000;

/* renamed from: belu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class belu extends belv {

    /* renamed from: a */
    public final bxxc f111803a;

    /* renamed from: b */
    private final bxus f111804b;

    public belu(bxxc bxxc, bxus bxus) {
        if (bxxc != null) {
            this.f111803a = bxxc;
            if (bxus != null) {
                this.f111804b = bxus;
                return;
            }
            throw new NullPointerException("Null extensionRegistryLite");
        }
        throw new NullPointerException("Null defaultValue");
    }

    /* renamed from: a */
    public final bxxc mo60786a() {
        return this.f111803a;
    }

    /* renamed from: b */
    public final bxus mo60787b() {
        return this.f111804b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof belv) {
            belv belv = (belv) obj;
            return this.f111803a.equals(belv.mo60786a()) && this.f111804b.equals(belv.mo60787b());
        }
    }

    public final int hashCode() {
        return ((this.f111803a.hashCode() ^ 1000003) * 1000003) ^ this.f111804b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f111803a);
        String valueOf2 = String.valueOf(this.f111804b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54 + String.valueOf(valueOf2).length());
        sb.append("ProtoSerializer{defaultValue=");
        sb.append(valueOf);
        sb.append(", extensionRegistryLite=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
