package p000;

/* renamed from: mie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mie extends mij {

    /* renamed from: a */
    private final String f33771a;

    /* renamed from: b */
    private final String f33772b;

    public mie(String str, String str2) {
        if (str != null) {
            this.f33771a = str;
            if (str2 != null) {
                this.f33772b = str2;
                return;
            }
            throw new NullPointerException("Null splitPath");
        }
        throw new NullPointerException("Null splitName");
    }

    /* renamed from: a */
    public final String mo20059a() {
        return this.f33771a;
    }

    /* renamed from: b */
    public final String mo20060b() {
        return this.f33772b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mij) {
            mij mij = (mij) obj;
            return this.f33771a.equals(mij.mo20059a()) && this.f33772b.equals(mij.mo20060b());
        }
    }

    public final int hashCode() {
        return ((this.f33771a.hashCode() ^ 1000003) * 1000003) ^ this.f33772b.hashCode();
    }

    public final String toString() {
        String str = this.f33771a;
        String str2 = this.f33772b;
        StringBuilder sb = new StringBuilder(str.length() + 31 + str2.length());
        sb.append("BaseApk{splitName=");
        sb.append(str);
        sb.append(", splitPath=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
