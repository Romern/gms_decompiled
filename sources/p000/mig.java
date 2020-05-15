package p000;

/* renamed from: mig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mig extends mir {

    /* renamed from: a */
    private final String f33775a;

    /* renamed from: b */
    private final String f33776b;

    public mig(String str, String str2) {
        if (str != null) {
            this.f33775a = str;
            if (str2 != null) {
                this.f33776b = str2;
                return;
            }
            throw new NullPointerException("Null splitName");
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: a */
    public final String mo20069a() {
        return this.f33775a;
    }

    /* renamed from: b */
    public final String mo20070b() {
        return this.f33776b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mir) {
            mir mir = (mir) obj;
            return this.f33775a.equals(mir.mo20069a()) && this.f33776b.equals(mir.mo20070b());
        }
    }

    public final int hashCode() {
        return ((this.f33775a.hashCode() ^ 1000003) * 1000003) ^ this.f33776b.hashCode();
    }

    public final String toString() {
        String str = this.f33775a;
        String str2 = this.f33776b;
        StringBuilder sb = new StringBuilder(str.length() + 45 + str2.length());
        sb.append("TransferredApkSplit{packageName=");
        sb.append(str);
        sb.append(", splitName=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
