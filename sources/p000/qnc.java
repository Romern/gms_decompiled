package p000;

import java.util.Arrays;

/* renamed from: qnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qnc {

    /* renamed from: a */
    public final String f41759a;

    /* renamed from: b */
    public final String f41760b;

    /* renamed from: c */
    public final boolean f41761c;

    /* renamed from: d */
    public String f41762d = null;

    /* renamed from: e */
    public String f41763e = null;

    public qnc(String str, String str2, boolean z) {
        this.f41759a = str;
        this.f41760b = str2;
        this.f41761c = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qnc) {
            qnc qnc = (qnc) obj;
            if (!bmxi.m108538a(this.f41759a, qnc.f41759a) || !bmxi.m108538a(this.f41760b, qnc.f41760b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41759a, this.f41760b});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f41759a);
        sb.append(':');
        sb.append(this.f41760b);
        if (this.f41762d != null) {
            sb.append('[');
            sb.append(this.f41762d);
            sb.append(']');
        }
        if (this.f41763e != null) {
            sb.append('@');
            sb.append(this.f41763e);
        }
        sb.append(" permitMetered=");
        sb.append(this.f41761c);
        return sb.toString();
    }
}
