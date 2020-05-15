package p000;

/* renamed from: bcyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcyv extends bczu {

    /* renamed from: a */
    private final String f105153a;

    /* renamed from: b */
    private final int f105154b;

    /* renamed from: c */
    private final int f105155c;

    public bcyv(String str, int i, int i2) {
        this.f105153a = str;
        this.f105154b = i;
        this.f105155c = i2;
    }

    /* renamed from: a */
    public final String mo57748a() {
        return this.f105153a;
    }

    /* renamed from: b */
    public final int mo57749b() {
        return this.f105154b;
    }

    /* renamed from: c */
    public final int mo57750c() {
        return this.f105155c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bczu) {
            bczu bczu = (bczu) obj;
            return this.f105153a.equals(bczu.mo57748a()) && this.f105154b == bczu.mo57749b() && this.f105155c == bczu.mo57750c();
        }
    }

    public final int hashCode() {
        return ((((this.f105153a.hashCode() ^ 1000003) * 1000003) ^ this.f105154b) * 1000003) ^ this.f105155c;
    }

    public final String toString() {
        String str = this.f105153a;
        int i = this.f105154b;
        int i2 = this.f105155c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 70);
        sb.append("StatusBadge{text=");
        sb.append(str);
        sb.append(", backgroundColor=");
        sb.append(i);
        sb.append(", textColor=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
