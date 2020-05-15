package p000;

/* renamed from: khw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class khw extends kjd {

    /* renamed from: a */
    private final String f24175a;

    /* renamed from: b */
    private final bqgg f24176b;

    public khw(String str, bqgg bqgg) {
        if (str != null) {
            this.f24175a = str;
            this.f24176b = bqgg;
            return;
        }
        throw new NullPointerException("Null alias");
    }

    /* renamed from: a */
    public final String mo14479a() {
        return this.f24175a;
    }

    /* renamed from: b */
    public final bqgg mo14480b() {
        return this.f24176b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kjd) {
            kjd kjd = (kjd) obj;
            return this.f24175a.equals(kjd.mo14479a()) && this.f24176b.equals(kjd.mo14480b());
        }
    }

    public final int hashCode() {
        return ((this.f24175a.hashCode() ^ 1000003) * 1000003) ^ this.f24176b.hashCode();
    }

    public final String toString() {
        String str = this.f24175a;
        String valueOf = String.valueOf(this.f24176b);
        StringBuilder sb = new StringBuilder(str.length() + 45 + String.valueOf(valueOf).length());
        sb.append("AliasAndAddressFuture{alias=");
        sb.append(str);
        sb.append(", addressFuture=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
