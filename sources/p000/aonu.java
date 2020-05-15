package p000;

/* renamed from: aonu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aonu extends aooe {

    /* renamed from: a */
    public final String f78594a;

    /* renamed from: b */
    public final String f78595b;

    public aonu(String str, String str2) {
        this.f78594a = str;
        this.f78595b = str2;
    }

    /* renamed from: a */
    public final String mo43113a() {
        return this.f78594a;
    }

    /* renamed from: b */
    public final String mo43114b() {
        return this.f78595b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aooe)) {
            return false;
        }
        aooe aooe = (aooe) obj;
        String str = this.f78594a;
        if (str == null ? aooe.mo43113a() == null : str.equals(aooe.mo43113a())) {
            String str2 = this.f78595b;
            if (str2 == null ? aooe.mo43114b() == null : str2.equals(aooe.mo43114b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.f78594a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (i ^ 1000003) * 1000003;
        String str2 = this.f78595b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        String str = this.f78594a;
        String str2 = this.f78595b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 49 + String.valueOf(str2).length());
        sb.append("PseudonymousIdTokenMutation{newToken=");
        sb.append(str);
        sb.append(", oldToken=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
