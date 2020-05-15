package p000;

import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ugk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ugk {

    /* renamed from: a */
    static final Pattern f47542a = Pattern.compile("^bytes=(\\d+)-(\\d+)$");

    /* renamed from: b */
    static final Pattern f47543b = Pattern.compile("^\\s*bytes\\s+(\\d+)-(\\d+)/(\\d+)\\s*$");

    /* renamed from: c */
    public final long f47544c;

    /* renamed from: d */
    public final long f47545d;

    public ugk(long j, long j2) {
        boolean z = true;
        if ((j < 0 || j > j2) && j2 >= 0) {
            z = false;
        }
        sdo.m34974b(z);
        this.f47544c = j;
        this.f47545d = j2;
    }

    /* renamed from: a */
    public static ugk m38337a(String str) {
        Matcher matcher = f47542a.matcher(str);
        if (matcher.matches()) {
            return new ugk(Long.parseLong(matcher.group(1)), Long.parseLong(matcher.group(2)));
        }
        Matcher matcher2 = f47543b.matcher(str);
        if (matcher2.matches()) {
            return new ugk(Long.parseLong(matcher2.group(1)), Long.parseLong(matcher2.group(2)));
        }
        throw new ParseException(str.length() == 0 ? new String("Invalid content-range format: ") : "Invalid content-range format: ".concat(str), 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            ugk ugk = (ugk) obj;
            return ugk.f47544c == this.f47544c && ugk.f47545d == this.f47545d;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new long[]{this.f47544c, this.f47545d});
    }

    public final String toString() {
        return mo27330a();
    }

    /* renamed from: a */
    public final String mo27330a() {
        long j = this.f47545d;
        if (j >= 0) {
            long j2 = this.f47544c;
            StringBuilder sb = new StringBuilder(47);
            sb.append("bytes=");
            sb.append(j2);
            sb.append("-");
            sb.append(j);
            return sb.toString();
        }
        long j3 = this.f47544c;
        if (j3 >= 0) {
            StringBuilder sb2 = new StringBuilder(27);
            sb2.append("bytes=");
            sb2.append(j3);
            sb2.append("-");
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("bytes=");
        sb3.append(j3);
        return sb3.toString();
    }
}
