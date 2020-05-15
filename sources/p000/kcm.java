package p000;

/* renamed from: kcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class kcm extends kct {

    /* renamed from: a */
    private final Object f23820a;

    /* renamed from: b */
    private final kcs f23821b;

    /* renamed from: c */
    private final bmxv f23822c;

    public kcm(Object obj, kcs kcs, bmxv bmxv) {
        if (obj != null) {
            this.f23820a = obj;
            if (kcs != null) {
                this.f23821b = kcs;
                if (bmxv != null) {
                    this.f23822c = bmxv;
                    return;
                }
                throw new NullPointerException("Null account");
            }
            throw new NullPointerException("Null dataId");
        }
        throw new NullPointerException("Null data");
    }

    /* renamed from: a */
    public final Object mo14368a() {
        return this.f23820a;
    }

    /* renamed from: b */
    public final kcs mo14369b() {
        return this.f23821b;
    }

    /* renamed from: c */
    public final bmxv mo14370c() {
        return this.f23822c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kct) {
            kct kct = (kct) obj;
            return this.f23820a.equals(kct.mo14368a()) && this.f23821b.equals(kct.mo14369b()) && this.f23822c.equals(kct.mo14370c());
        }
    }

    public final int hashCode() {
        return ((((this.f23820a.hashCode() ^ 1000003) * 1000003) ^ this.f23821b.hashCode()) * 1000003) ^ this.f23822c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f23820a);
        String valueOf2 = String.valueOf(this.f23821b);
        String valueOf3 = String.valueOf(this.f23822c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 35 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("DataEntry{data=");
        sb.append(valueOf);
        sb.append(", dataId=");
        sb.append(valueOf2);
        sb.append(", account=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
