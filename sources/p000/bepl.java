package p000;

/* renamed from: bepl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bepl implements brfb {

    /* renamed from: a */
    public final String f111986a;

    /* renamed from: b */
    public final String f111987b;

    /* renamed from: c */
    public final String f111988c;

    /* renamed from: d */
    public final int f111989d;

    /* renamed from: e */
    public final int f111990e;

    /* renamed from: f */
    private final bmxv f111991f;

    public bepl(String str, String str2, String str3, int i, int i2, bmxv bmxv) {
        this.f111986a = str;
        this.f111987b = str2;
        this.f111988c = str3;
        this.f111989d = i;
        this.f111990e = i2;
        this.f111991f = bmxv;
    }

    /* renamed from: a */
    public final int mo60893a() {
        return 1;
    }

    /* renamed from: b */
    public final boolean mo60894b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bepl bepl = (bepl) obj;
            if (this.f111989d == bepl.f111989d && this.f111990e == bepl.f111990e && this.f111991f.equals(bepl.f111991f)) {
                String str = this.f111986a;
                if (str == null ? bepl.f111986a != null : !str.equals(bepl.f111986a)) {
                    return false;
                }
                String str2 = this.f111987b;
                if (str2 == null ? bepl.f111987b != null : !str2.equals(bepl.f111987b)) {
                    return false;
                }
                String str3 = this.f111988c;
                if (str3 != null) {
                    return str3.equals(bepl.f111988c);
                }
                return bepl.f111988c == null;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.f111986a;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        String str2 = this.f111987b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f111988c;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return ((((((i5 + i3) * 31) + this.f111989d) * 31) + this.f111990e) * 31) + this.f111991f.hashCode();
    }

    public final String toString() {
        String str = this.f111986a;
        String str2 = this.f111987b;
        String str3 = this.f111988c;
        int i = this.f111989d;
        int i2 = this.f111990e;
        String valueOf = String.valueOf(this.f111991f);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 128 + length2 + String.valueOf(str3).length() + String.valueOf(valueOf).length());
        sb.append("ApTestCard{network='");
        sb.append(str);
        sb.append("', cardId='");
        sb.append(str2);
        sb.append("', displayCardNumber='");
        sb.append(str3);
        sb.append("', expirationMonth=");
        sb.append(i);
        sb.append(", expirationYear=");
        sb.append(i2);
        sb.append(", defaultSlot='");
        sb.append(valueOf);
        sb.append("'}");
        return sb.toString();
    }
}
