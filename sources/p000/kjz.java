package p000;

/* renamed from: kjz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class kjz extends kka {

    /* renamed from: a */
    private final bnzb f24289a;

    /* renamed from: b */
    private final int f24290b;

    public kjz(bnzb bnzb, int i) {
        if (bnzb != null) {
            this.f24289a = bnzb;
            this.f24290b = i;
            return;
        }
        throw new NullPointerException("Null hashCode");
    }

    /* renamed from: a */
    public final bnzb mo14554a() {
        return this.f24289a;
    }

    /* renamed from: b */
    public final int mo14555b() {
        return this.f24290b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kka) {
            kka kka = (kka) obj;
            return this.f24289a.equals(kka.mo14554a()) && this.f24290b == kka.mo14555b();
        }
    }

    public final int hashCode() {
        return ((this.f24289a.hashCode() ^ 1000003) * 1000003) ^ this.f24290b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24289a);
        int i = this.f24290b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
        sb.append("Fingerprint{hashCode=");
        sb.append(valueOf);
        sb.append(", version=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
