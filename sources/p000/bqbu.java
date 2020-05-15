package p000;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: bqbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqbu implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public final String f140431a;

    /* renamed from: b */
    public final int f140432b;

    /* renamed from: c */
    private final boolean f140433c;

    private bqbu(String str, int i, boolean z) {
        this.f140431a = str;
        this.f140432b = i;
        this.f140433c = z;
    }

    /* renamed from: a */
    public static bqbu m112532a(String str) {
        String str2;
        String str3;
        boolean z;
        String[] strArr;
        boolean z2;
        bmxy.m108581a(str);
        int i = -1;
        boolean z3 = false;
        if (!str.startsWith("[")) {
            int indexOf = str.indexOf(58);
            if (indexOf >= 0) {
                int i2 = indexOf + 1;
                if (str.indexOf(58, i2) == -1) {
                    str3 = str.substring(0, indexOf);
                    str2 = str.substring(i2);
                }
            }
            if (indexOf >= 0) {
                z3 = true;
            }
            str2 = null;
            str3 = str;
        } else {
            if (str.charAt(0) == '[') {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108596a(z, "Bracketed host-port string must start with a bracket: %s", str);
            int indexOf2 = str.indexOf(58);
            int lastIndexOf = str.lastIndexOf(93);
            bmxy.m108596a(indexOf2 < 0 ? false : lastIndexOf > indexOf2, "Invalid bracketed host/port: %s", str);
            String substring = str.substring(1, lastIndexOf);
            int i3 = lastIndexOf + 1;
            if (i3 == str.length()) {
                strArr = new String[]{substring, ""};
            } else {
                if (str.charAt(i3) == ':') {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bmxy.m108596a(z2, "Only a colon may follow a close bracket: %s", str);
                int i4 = lastIndexOf + 2;
                for (int i5 = i4; i5 < str.length(); i5++) {
                    bmxy.m108596a(Character.isDigit(str.charAt(i5)), "Port must be numeric: %s", str);
                }
                strArr = new String[]{substring, str.substring(i4)};
            }
            str3 = strArr[0];
            str2 = strArr[1];
        }
        if (!bmxx.m108577a(str2)) {
            bmxy.m108596a(!str2.startsWith("+"), "Unparseable port number: %s", str);
            try {
                i = Integer.parseInt(str2);
                bmxy.m108596a(m112534a(i), "Port number out of range: %s", str);
            } catch (NumberFormatException e) {
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unparseable port number: ") : "Unparseable port number: ".concat(valueOf));
            }
        }
        return new bqbu(str3, i, z3);
    }

    /* renamed from: a */
    private static boolean m112534a(int i) {
        return i >= 0 && i <= 65535;
    }

    /* renamed from: a */
    public final boolean mo69009a() {
        return this.f140432b >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bqbu) {
            bqbu bqbu = (bqbu) obj;
            return bmxi.m108538a(this.f140431a, bqbu.f140431a) && this.f140432b == bqbu.f140432b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f140431a, Integer.valueOf(this.f140432b)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.f140431a.length() + 8);
        if (this.f140431a.indexOf(58) >= 0) {
            sb.append('[');
            sb.append(this.f140431a);
            sb.append(']');
        } else {
            sb.append(this.f140431a);
        }
        if (mo69009a()) {
            sb.append(':');
            sb.append(this.f140432b);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static bqbu m112533a(String str, int i) {
        bmxy.m108591a(m112534a(i), "Port out of range: %s", i);
        bqbu a = m112532a(str);
        bmxy.m108596a(!a.mo69009a(), "Host has a port: %s", str);
        return new bqbu(a.f140431a, i, a.f140433c);
    }
}
