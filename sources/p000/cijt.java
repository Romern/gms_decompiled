package p000;

/* renamed from: cijt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class cijt implements brfb {

    /* renamed from: a */
    public final int f190459a;

    /* renamed from: b */
    public final boolean f190460b;

    /* renamed from: c */
    private final String f190461c;

    /* renamed from: d */
    private final int f190462d;

    /* renamed from: e */
    private final int f190463e;

    public cijt(String str, int i, int i2, int i3, boolean z) {
        this.f190461c = str;
        this.f190462d = i;
        this.f190463e = i2;
        this.f190459a = i3;
        this.f190460b = z;
    }

    /* renamed from: a */
    public final int mo60893a() {
        return this.f190459a;
    }

    /* renamed from: b */
    public final boolean mo60894b() {
        return this.f190460b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cijt) {
            cijt cijt = (cijt) obj;
            if (this.f190462d == cijt.f190462d && this.f190463e == cijt.f190463e && this.f190459a == cijt.f190459a && this.f190460b == cijt.f190460b) {
                String str = this.f190461c;
                if (str != null) {
                    return str.equals(cijt.f190461c);
                }
                return cijt.f190461c == null;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f190461c;
        return ((((((((str != null ? str.hashCode() : 0) * 31) + this.f190462d) * 31) + this.f190463e) * 31) + this.f190459a) * 31) + (this.f190460b ? 1 : 0);
    }

    public String toString() {
        String str = this.f190461c;
        int i = this.f190462d;
        int i2 = this.f190463e;
        int i3 = this.f190459a;
        boolean z = this.f190460b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 136);
        sb.append("QuicPayCard{displayCardNumber='");
        sb.append(str);
        sb.append("', expirationYear=");
        sb.append(i);
        sb.append(", expirationMonth=");
        sb.append(i2);
        sb.append(", felicaApiVersion=");
        sb.append(i3);
        sb.append(", override=");
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }
}
