package p000;

/* renamed from: bdjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdjd extends bdjj {

    /* renamed from: a */
    private final boolean f105724a;

    /* renamed from: b */
    private final bdjh f105725b;

    public bdjd(boolean z, bdjh bdjh) {
        this.f105724a = z;
        this.f105725b = bdjh;
    }

    /* renamed from: a */
    public final boolean mo58078a() {
        return this.f105724a;
    }

    /* renamed from: b */
    public final bdjh mo58079b() {
        return this.f105725b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdjj) {
            bdjj bdjj = (bdjj) obj;
            return this.f105724a == bdjj.mo58078a() && this.f105725b.equals(bdjj.mo58079b());
        }
    }

    public final int hashCode() {
        return (((!this.f105724a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f105725b.hashCode();
    }

    public final String toString() {
        boolean z = this.f105724a;
        String valueOf = String.valueOf(this.f105725b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
        sb.append("BatteryConfigurations{enabled=");
        sb.append(z);
        sb.append(", metricExtensionProvider=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
