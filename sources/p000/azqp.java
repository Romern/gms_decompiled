package p000;

/* renamed from: azqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azqp extends azub {

    /* renamed from: a */
    private final String f99908a;

    /* renamed from: b */
    private final boolean f99909b;

    /* renamed from: c */
    private final bmxv f99910c;

    /* renamed from: d */
    private final bmxv f99911d;

    public azqp(String str, boolean z, bmxv bmxv, bmxv bmxv2) {
        this.f99908a = str;
        this.f99909b = z;
        this.f99910c = bmxv;
        this.f99911d = bmxv2;
    }

    /* renamed from: a */
    public final String mo55234a() {
        return this.f99908a;
    }

    /* renamed from: b */
    public final boolean mo55235b() {
        return this.f99909b;
    }

    /* renamed from: c */
    public final bmxv mo55236c() {
        return this.f99910c;
    }

    /* renamed from: d */
    public final bmxv mo55237d() {
        return this.f99911d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof azub) {
            azub azub = (azub) obj;
            return this.f99908a.equals(azub.mo55234a()) && this.f99909b == azub.mo55235b() && this.f99910c.equals(azub.mo55236c()) && this.f99911d.equals(azub.mo55237d());
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f99908a.hashCode() ^ 1000003) * 1000003;
        if (!this.f99909b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((((hashCode ^ i) * 1000003) ^ this.f99910c.hashCode()) * 1000003) ^ this.f99911d.hashCode();
    }

    public final String toString() {
        String str = this.f99908a;
        boolean z = this.f99909b;
        String valueOf = String.valueOf(this.f99910c);
        String valueOf2 = String.valueOf(this.f99911d);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 72 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("NativeMethodResponse{callToken=");
        sb.append(str);
        sb.append(", isProcessingAsync=");
        sb.append(z);
        sb.append(", data=");
        sb.append(valueOf);
        sb.append(", error=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
