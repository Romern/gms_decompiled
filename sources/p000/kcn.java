package p000;

/* renamed from: kcn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class kcn extends kcs {

    /* renamed from: a */
    public final String f23823a;

    /* renamed from: b */
    public final String f23824b;

    public kcn(String str, String str2) {
        this.f23823a = str;
        if (str2 != null) {
            this.f23824b = str2;
            return;
        }
        throw new NullPointerException("Null id");
    }

    /* renamed from: a */
    public final String mo14374a() {
        return this.f23823a;
    }

    /* renamed from: b */
    public final String mo14375b() {
        return this.f23824b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kcs) {
            kcs kcs = (kcs) obj;
            return this.f23823a.equals(kcs.mo14374a()) && this.f23824b.equals(kcs.mo14375b());
        }
    }

    public final int hashCode() {
        return ((this.f23823a.hashCode() ^ 1000003) * 1000003) ^ this.f23824b.hashCode();
    }

    public final String toString() {
        String str = this.f23823a;
        String str2 = this.f23824b;
        StringBuilder sb = new StringBuilder(str.length() + 22 + str2.length());
        sb.append("DataId{sourceId=");
        sb.append(str);
        sb.append(", id=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
