package p000;

/* renamed from: aagg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aagg extends aagd {

    /* renamed from: a */
    public final String f28060a;

    /* renamed from: b */
    public final boolean f28061b;

    /* renamed from: c */
    public final boolean f28062c;

    public aagg(String str, boolean z, boolean z2) {
        this.f28060a = str;
        this.f28061b = z;
        this.f28062c = z2;
    }

    /* renamed from: a */
    public final String mo16846a() {
        return this.f28060a;
    }

    /* renamed from: b */
    public final boolean mo16847b() {
        return this.f28061b;
    }

    /* renamed from: c */
    public final boolean mo16848c() {
        return this.f28062c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aagd) {
            aagd aagd = (aagd) obj;
            return this.f28060a.equals(aagd.mo16846a()) && this.f28061b == aagd.mo16847b() && this.f28062c == aagd.mo16848c();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.f28060a.hashCode() ^ 1000003) * 1000003) ^ (!this.f28061b ? 1237 : 1231)) * 1000003;
        if (this.f28062c) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f28060a;
        boolean z = this.f28061b;
        boolean z2 = this.f28062c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 99);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
