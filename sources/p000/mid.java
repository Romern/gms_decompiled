package p000;

/* renamed from: mid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mid extends mii {

    /* renamed from: a */
    private final String f33769a;

    /* renamed from: b */
    private final String f33770b;

    public mid(String str, String str2) {
        if (str != null) {
            this.f33769a = str;
            if (str2 != null) {
                this.f33770b = str2;
                return;
            }
            throw new NullPointerException("Null splitPath");
        }
        throw new NullPointerException("Null splitName");
    }

    /* renamed from: a */
    public final String mo20054a() {
        return this.f33769a;
    }

    /* renamed from: b */
    public final String mo20055b() {
        return this.f33770b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mii) {
            mii mii = (mii) obj;
            return this.f33769a.equals(mii.mo20054a()) && this.f33770b.equals(mii.mo20055b());
        }
    }

    public final int hashCode() {
        return ((this.f33769a.hashCode() ^ 1000003) * 1000003) ^ this.f33770b.hashCode();
    }

    public final String toString() {
        String str = this.f33769a;
        String str2 = this.f33770b;
        StringBuilder sb = new StringBuilder(str.length() + 32 + str2.length());
        sb.append("ApkSplit{splitName=");
        sb.append(str);
        sb.append(", splitPath=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
