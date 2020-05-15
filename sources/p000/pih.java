package p000;

/* renamed from: pih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pih extends pje {

    /* renamed from: a */
    private final Enum f39221a;

    /* renamed from: b */
    private final blsw f39222b;

    public pih(Enum enumR, blsw blsw) {
        if (enumR != null) {
            this.f39221a = enumR;
            if (blsw != null) {
                this.f39222b = blsw;
                return;
            }
            throw new NullPointerException("Null protocolVersion");
        }
        throw new NullPointerException("Null resultCode");
    }

    /* renamed from: a */
    public final Enum mo23169a() {
        return this.f39221a;
    }

    /* renamed from: b */
    public final blsw mo23170b() {
        return this.f39222b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pje) {
            pje pje = (pje) obj;
            return this.f39221a.equals(pje.mo23169a()) && this.f39222b.equals(pje.mo23170b());
        }
    }

    public final int hashCode() {
        return ((this.f39221a.hashCode() ^ 1000003) * 1000003) ^ this.f39222b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f39221a);
        String valueOf2 = String.valueOf(this.f39222b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45 + String.valueOf(valueOf2).length());
        sb.append("StatsBucketKey{resultCode=");
        sb.append(valueOf);
        sb.append(", protocolVersion=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
