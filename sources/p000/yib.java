package p000;

/* renamed from: yib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yib extends yit {

    /* renamed from: a */
    private final yln f53849a;

    /* renamed from: b */
    private final yhe f53850b;

    public yib(yln yln, yhe yhe) {
        if (yln != null) {
            this.f53849a = yln;
            if (yhe != null) {
                this.f53850b = yhe;
                return;
            }
            throw new NullPointerException("Null queryParam");
        }
        throw new NullPointerException("Null transformation");
    }

    /* renamed from: a */
    public final yln mo30529a() {
        return this.f53849a;
    }

    /* renamed from: b */
    public final yhe mo30530b() {
        return this.f53850b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yit) {
            yit yit = (yit) obj;
            return this.f53849a.equals(yit.mo30529a()) && this.f53850b.equals(yit.mo30530b());
        }
    }

    public final int hashCode() {
        return ((this.f53849a.hashCode() ^ 1000003) * 1000003) ^ this.f53850b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f53849a);
        String valueOf2 = String.valueOf(this.f53850b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38 + String.valueOf(valueOf2).length());
        sb.append("CacheKey{transformation=");
        sb.append(valueOf);
        sb.append(", queryParam=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
