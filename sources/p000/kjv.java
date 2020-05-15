package p000;

/* renamed from: kjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kjv extends kjx {

    /* renamed from: a */
    public final String f24281a;

    /* renamed from: b */
    private final String f24282b;

    public kjv(String str, String str2) {
        this.f24281a = str;
        this.f24282b = str2;
    }

    /* renamed from: a */
    public final String mo14545a() {
        return this.f24281a;
    }

    /* renamed from: b */
    public final String mo14546b() {
        return this.f24282b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kjx) {
            kjx kjx = (kjx) obj;
            return this.f24281a.equals(kjx.mo14545a()) && this.f24282b.equals(kjx.mo14546b());
        }
    }

    public final int hashCode() {
        return ((this.f24281a.hashCode() ^ 1000003) * 1000003) ^ this.f24282b.hashCode();
    }

    public final String toString() {
        String str = this.f24281a;
        String str2 = this.f24282b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(str2).length());
        sb.append("ComponentName{packageName=");
        sb.append(str);
        sb.append(", className=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
