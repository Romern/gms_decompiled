package p000;

/* renamed from: bbhe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bbhe extends bbhf {

    /* renamed from: a */
    private final Object f102626a;

    /* renamed from: b */
    private final Object f102627b;

    public bbhe(Object obj, Object obj2) {
        if (obj != null) {
            this.f102626a = obj;
            if (obj2 != null) {
                this.f102627b = obj2;
                return;
            }
            throw new NullPointerException("Null value");
        }
        throw new NullPointerException("Null key");
    }

    /* renamed from: a */
    public final Object mo56138a() {
        return this.f102626a;
    }

    /* renamed from: b */
    public final Object mo56139b() {
        return this.f102627b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbhf) {
            bbhf bbhf = (bbhf) obj;
            return this.f102626a.equals(bbhf.mo56138a()) && this.f102627b.equals(bbhf.mo56139b());
        }
    }

    public final int hashCode() {
        return ((this.f102626a.hashCode() ^ 1000003) * 1000003) ^ this.f102627b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f102626a);
        String valueOf2 = String.valueOf(this.f102627b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22 + String.valueOf(valueOf2).length());
        sb.append("KeyValue{key=");
        sb.append(valueOf);
        sb.append(", value=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
