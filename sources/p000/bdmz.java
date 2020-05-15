package p000;

/* renamed from: bdmz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdmz extends bdnc {

    /* renamed from: a */
    private final boolean f106020a;

    /* renamed from: b */
    private final int f106021b;

    /* renamed from: c */
    private final boolean f106022c;

    /* renamed from: d */
    private final bmxv f106023d;

    public bdmz(boolean z, int i, boolean z2, bmxv bmxv) {
        this.f106020a = z;
        this.f106021b = i;
        this.f106022c = z2;
        this.f106023d = bmxv;
    }

    /* renamed from: a */
    public final boolean mo58192a() {
        return this.f106020a;
    }

    /* renamed from: b */
    public final int mo58193b() {
        return this.f106021b;
    }

    /* renamed from: c */
    public final bdnq mo58194c() {
        return null;
    }

    /* renamed from: d */
    public final boolean mo58195d() {
        return this.f106022c;
    }

    /* renamed from: e */
    public final bmxv mo58196e() {
        return this.f106023d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdnc) {
            bdnc bdnc = (bdnc) obj;
            return this.f106020a == bdnc.mo58192a() && this.f106021b == bdnc.mo58193b() && bdnc.mo58194c() == null && this.f106022c == bdnc.mo58195d() && this.f106023d.equals(bdnc.mo58196e());
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((!this.f106020a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f106021b) * -721379959;
        if (this.f106022c) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        boolean z = this.f106020a;
        int i = this.f106021b;
        String valueOf = String.valueOf((Object) null);
        boolean z2 = this.f106022c;
        String valueOf2 = String.valueOf(this.f106023d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 133 + String.valueOf(valueOf2).length());
        sb.append("NetworkConfigurations{enabled=");
        sb.append(z);
        sb.append(", batchSize=");
        sb.append(i);
        sb.append(", urlSanitizer=");
        sb.append(valueOf);
        sb.append(", enableUrlAutoSanitization=");
        sb.append(z2);
        sb.append(", metricExtensionProvider=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
