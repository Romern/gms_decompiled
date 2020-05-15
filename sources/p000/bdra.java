package p000;

/* renamed from: bdra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdra extends bdqu {

    /* renamed from: a */
    private final String f106294a;

    /* renamed from: b */
    private final String f106295b;

    public bdra(String str, String str2) {
        if (str != null) {
            this.f106294a = str;
            this.f106295b = str2;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: a */
    public final String mo58303a() {
        return this.f106294a;
    }

    /* renamed from: b */
    public final String mo58304b() {
        return null;
    }

    /* renamed from: c */
    public final String mo58305c() {
        return this.f106295b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdqu) {
            bdqu bdqu = (bdqu) obj;
            return this.f106294a.equals(bdqu.mo58303a()) && bdqu.mo58304b() == null && ((str = this.f106295b) == null ? bdqu.mo58305c() == null : str.equals(bdqu.mo58305c()));
        }
    }

    public final int hashCode() {
        int hashCode = (this.f106294a.hashCode() ^ 1000003) * -721379959;
        String str = this.f106295b;
        return hashCode ^ (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f106294a;
        String str2 = this.f106295b;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf((Object) null).length() + String.valueOf(str2).length());
        sb.append("ApplicationId{packageName=");
        sb.append(str);
        sb.append(", moduleName=null, instanceId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
