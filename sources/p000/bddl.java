package p000;

/* renamed from: bddl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bddl extends bddo {

    /* renamed from: a */
    private final String f105370a;

    /* renamed from: b */
    private final String f105371b;

    /* renamed from: c */
    private final boolean f105372c;

    public bddl(String str, String str2, boolean z) {
        this.f105370a = str;
        this.f105371b = str2;
        this.f105372c = z;
    }

    /* renamed from: a */
    public final String mo57895a() {
        return this.f105370a;
    }

    /* renamed from: b */
    public final String mo57896b() {
        return this.f105371b;
    }

    /* renamed from: c */
    public final String mo57897c() {
        return null;
    }

    /* renamed from: d */
    public final String mo57898d() {
        return null;
    }

    /* renamed from: e */
    public final boolean mo57899e() {
        return this.f105372c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bddo)) {
            return false;
        }
        bddo bddo = (bddo) obj;
        String str = this.f105370a;
        if (str == null ? bddo.mo57895a() == null : str.equals(bddo.mo57895a())) {
            return this.f105371b.equals(bddo.mo57896b()) && bddo.mo57897c() == null && bddo.mo57898d() == null && this.f105372c == bddo.mo57899e() && bddo.mo57901f() == null;
        }
    }

    /* renamed from: f */
    public final String mo57901f() {
        return null;
    }

    public final int hashCode() {
        int i;
        String str = this.f105370a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (((((i ^ 1000003) * 1000003) ^ this.f105371b.hashCode()) * 583896283) ^ (!this.f105372c ? 1237 : 1231)) * 1000003;
    }

    public final String toString() {
        String str = this.f105370a;
        String str2 = this.f105371b;
        boolean z = this.f105372c;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf((Object) null).length();
        StringBuilder sb = new StringBuilder(length + 99 + length2 + length3 + String.valueOf((Object) null).length() + String.valueOf((Object) null).length());
        sb.append("DeviceOwner{displayName=");
        sb.append(str);
        sb.append(", accountName=");
        sb.append(str2);
        sb.append(", givenName=null, familyName=null, isG1User=");
        sb.append(z);
        sb.append(", obfuscatedGaiaId=null}");
        return sb.toString();
    }
}
