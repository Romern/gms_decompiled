package p000;

/* renamed from: koi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class koi extends kok {

    /* renamed from: a */
    private final String f24574a;

    /* renamed from: b */
    private final String f24575b;

    public koi(String str, String str2) {
        this.f24574a = str;
        this.f24575b = str2;
    }

    /* renamed from: a */
    public final String mo14744a() {
        return this.f24574a;
    }

    /* renamed from: b */
    public final String mo14745b() {
        return this.f24575b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kok) {
            kok kok = (kok) obj;
            return this.f24574a.equals(kok.mo14744a()) && this.f24575b.equals(kok.mo14745b());
        }
    }

    public final int hashCode() {
        return ((this.f24574a.hashCode() ^ 1000003) * 1000003) ^ this.f24575b.hashCode();
    }

    public final String toString() {
        String str = this.f24574a;
        String str2 = this.f24575b;
        StringBuilder sb = new StringBuilder(str.length() + 22 + str2.length());
        sb.append("KeyValue{key=");
        sb.append(str);
        sb.append(", value=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
