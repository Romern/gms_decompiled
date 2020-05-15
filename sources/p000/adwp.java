package p000;

/* renamed from: adwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adwp extends adxs {

    /* renamed from: a */
    private final String f62843a;

    /* renamed from: b */
    private final bsjk f62844b;

    public adwp(String str, bsjk bsjk) {
        this.f62843a = str;
        if (bsjk != null) {
            this.f62844b = bsjk;
            return;
        }
        throw new NullPointerException("Null languageProfile");
    }

    /* renamed from: a */
    public final String mo33871a() {
        return this.f62843a;
    }

    /* renamed from: b */
    public final bsjk mo33872b() {
        return this.f62844b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof adxs)) {
            return false;
        }
        adxs adxs = (adxs) obj;
        String str = this.f62843a;
        if (str == null ? adxs.mo33871a() == null : str.equals(adxs.mo33871a())) {
            if (this.f62844b.equals(adxs.mo33872b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.f62843a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i2 = (i ^ 1000003) * 1000003;
        bsjk bsjk = this.f62844b;
        int i3 = bsjk.f164758ag;
        if (i3 == 0) {
            i3 = bxxm.f165037a.mo74228a(bsjk).mo74216a(bsjk);
            bsjk.f164758ag = i3;
        }
        return i2 ^ i3;
    }

    public final String toString() {
        String str = this.f62843a;
        String valueOf = String.valueOf(this.f62844b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42 + String.valueOf(valueOf).length());
        sb.append("AccountUlp{accountName=");
        sb.append(str);
        sb.append(", languageProfile=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
