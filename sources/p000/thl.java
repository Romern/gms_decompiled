package p000;

/* renamed from: thl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class thl extends ths {

    /* renamed from: a */
    private final String f46027a;

    /* renamed from: b */
    private final String f46028b;

    /* renamed from: c */
    private final String f46029c;

    public thl(String str, String str2, String str3) {
        this.f46027a = str;
        this.f46028b = str2;
        this.f46029c = str3;
    }

    /* renamed from: a */
    public final String mo26529a() {
        return this.f46027a;
    }

    /* renamed from: b */
    public final String mo26530b() {
        return this.f46028b;
    }

    /* renamed from: c */
    public final String mo26531c() {
        return this.f46029c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ths) {
            ths ths = (ths) obj;
            return this.f46027a.equals(ths.mo26529a()) && this.f46028b.equals(ths.mo26530b()) && this.f46029c.equals(ths.mo26531c());
        }
    }

    public final int hashCode() {
        return ((((this.f46027a.hashCode() ^ 1000003) * 1000003) ^ this.f46028b.hashCode()) * 1000003) ^ this.f46029c.hashCode();
    }

    public final String toString() {
        String str = this.f46027a;
        String str2 = this.f46028b;
        String str3 = this.f46029c;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 36 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("LinkData{linkTitle=");
        sb.append(str);
        sb.append(", url=");
        sb.append(str2);
        sb.append(", iconUrl=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}
