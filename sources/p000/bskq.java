package p000;

/* renamed from: bskq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bskq extends bslf {

    /* renamed from: a */
    private final bmxv f144886a;

    /* renamed from: b */
    private final String f144887b;

    /* renamed from: c */
    private final bmxv f144888c;

    /* renamed from: d */
    private final bskj f144889d;

    public bskq(bmxv bmxv, String str, bmxv bmxv2, bskj bskj) {
        if (bmxv != null) {
            this.f144886a = bmxv;
            if (str != null) {
                this.f144887b = str;
                if (bmxv2 != null) {
                    this.f144888c = bmxv2;
                    if (bskj != null) {
                        this.f144889d = bskj;
                        return;
                    }
                    throw new NullPointerException("Null credentialType");
                }
                throw new NullPointerException("Null passwordGroupingKey");
            }
            throw new NullPointerException("Null username");
        }
        throw new NullPointerException("Null federationUrl");
    }

    /* renamed from: a */
    public final bmxv mo70666a() {
        return this.f144886a;
    }

    /* renamed from: b */
    public final String mo70667b() {
        return this.f144887b;
    }

    /* renamed from: c */
    public final bmxv mo70668c() {
        return this.f144888c;
    }

    /* renamed from: d */
    public final bskj mo70669d() {
        return this.f144889d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bslf) {
            bslf bslf = (bslf) obj;
            return this.f144886a.equals(bslf.mo70666a()) && this.f144887b.equals(bslf.mo70667b()) && this.f144888c.equals(bslf.mo70668c()) && this.f144889d.equals(bslf.mo70669d());
        }
    }

    public final int hashCode() {
        return ((((((this.f144886a.hashCode() ^ 1000003) * 1000003) ^ this.f144887b.hashCode()) * 1000003) ^ this.f144888c.hashCode()) * 1000003) ^ this.f144889d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f144886a);
        String str = this.f144887b;
        String valueOf2 = String.valueOf(this.f144888c);
        String valueOf3 = String.valueOf(this.f144889d);
        int length = String.valueOf(valueOf).length();
        int length2 = str.length();
        StringBuilder sb = new StringBuilder(length + 72 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("MapKey{federationUrl=");
        sb.append(valueOf);
        sb.append(", username=");
        sb.append(str);
        sb.append(", passwordGroupingKey=");
        sb.append(valueOf2);
        sb.append(", credentialType=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
