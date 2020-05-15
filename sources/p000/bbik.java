package p000;

/* renamed from: bbik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bbik extends bbij {

    /* renamed from: a */
    public final String f102732a;

    /* renamed from: b */
    public final String f102733b;

    /* renamed from: c */
    public final String f102734c;

    public bbik(String str, String str2, String str3) {
        if (str != null) {
            this.f102732a = str;
            this.f102733b = str2;
            this.f102734c = str3;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: a */
    public final String mo56144a() {
        return this.f102732a;
    }

    /* renamed from: b */
    public final String mo56145b() {
        return this.f102733b;
    }

    /* renamed from: c */
    public final String mo56146c() {
        return this.f102734c;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bbij)) {
            return false;
        }
        bbij bbij = (bbij) obj;
        return this.f102732a.equals(bbij.mo56144a()) && ((str = this.f102733b) == null ? bbij.mo56145b() == null : str.equals(bbij.mo56145b())) && ((str2 = this.f102734c) == null ? bbij.mo56146c() == null : str2.equals(bbij.mo56146c()));
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f102732a.hashCode() ^ 1000003) * 1000003;
        String str = this.f102733b;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode ^ i) * 1000003;
        String str2 = this.f102734c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        String str = this.f102732a;
        String str2 = this.f102733b;
        String str3 = this.f102734c;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ApplicationId{packageName=");
        sb.append(str);
        sb.append(", moduleName=");
        sb.append(str2);
        sb.append(", instanceId=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}
