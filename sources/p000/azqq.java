package p000;

/* renamed from: azqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azqq extends azwc {

    /* renamed from: a */
    private final int f99912a;

    /* renamed from: b */
    private final boolean f99913b;

    public azqq(int i, boolean z) {
        this.f99912a = i;
        this.f99913b = z;
    }

    /* renamed from: a */
    public final int mo55241a() {
        return this.f99912a;
    }

    /* renamed from: b */
    public final boolean mo55242b() {
        return this.f99913b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof azwc) {
            azwc azwc = (azwc) obj;
            return this.f99912a == azwc.mo55241a() && this.f99913b == azwc.mo55242b();
        }
    }

    public final int hashCode() {
        return ((this.f99912a ^ 1000003) * 1000003) ^ (!this.f99913b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f99912a;
        boolean z = this.f99913b;
        StringBuilder sb = new StringBuilder(76);
        sb.append("WebAppStartupContext{launchLoadSource=");
        sb.append(i);
        sb.append(", shouldShowKeyboard=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
