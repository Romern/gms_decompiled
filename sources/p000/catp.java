package p000;

/* renamed from: catp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class catp {

    /* renamed from: a */
    public final String f175855a;

    /* renamed from: b */
    public final String f175856b;

    public catp(String str, String str2) {
        this.f175855a = str;
        this.f175856b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof catp)) {
            return false;
        }
        catp catp = (catp) obj;
        return cavk.m127316a(this.f175855a, catp.f175855a) && cavk.m127316a(this.f175856b, catp.f175856b);
    }

    public final int hashCode() {
        String str = this.f175856b;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 899) * 31;
        String str2 = this.f175855a;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        String str = this.f175855a;
        String str2 = this.f175856b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 9 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" realm=\"");
        sb.append(str2);
        sb.append("\"");
        return sb.toString();
    }
}
