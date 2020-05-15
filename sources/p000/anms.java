package p000;

import com.felicanetworks.mfc.Felica;
import java.io.Serializable;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* renamed from: anms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anms implements Serializable {

    /* renamed from: b */
    private static final TimeZone f77159b = TimeZone.getTimeZone("GMT");
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public final long f77160a;

    /* renamed from: c */
    private final boolean f77161c;

    /* renamed from: d */
    private final int f77162d;

    public anms(boolean z, long j, Integer num) {
        int i;
        this.f77161c = z;
        this.f77160a = j;
        if (z) {
            i = 0;
        } else {
            i = num == null ? TimeZone.getDefault().getOffset(j) / Felica.MAX_TIMEOUT : num.intValue();
        }
        this.f77162d = i;
    }

    /* renamed from: a */
    public static anms m64784a(String str) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Integer num;
        int i6 = 0;
        try {
            int parseInt = Integer.parseInt(str.substring(0, 4));
            int parseInt2 = Integer.parseInt(str.substring(5, 7)) - 1;
            int parseInt3 = Integer.parseInt(str.substring(8, 10));
            int length = str.length();
            if (length <= 10 || Character.toUpperCase(str.charAt(10)) != 'T') {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int parseInt4 = Integer.parseInt(str.substring(11, 13));
                int parseInt5 = Integer.parseInt(str.substring(14, 16));
                int parseInt6 = Integer.parseInt(str.substring(17, 19));
                if (str.charAt(19) != '.') {
                    i5 = parseInt4;
                    i4 = parseInt5;
                    i3 = parseInt6;
                    i2 = 19;
                    i = 0;
                } else {
                    i = Integer.parseInt(str.substring(20, 23));
                    i5 = parseInt4;
                    i4 = parseInt5;
                    i3 = parseInt6;
                    i2 = 23;
                }
            } else {
                i5 = 0;
                i4 = 0;
                i3 = 0;
                i2 = Integer.MAX_VALUE;
                i = 0;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(f77159b);
            gregorianCalendar.set(parseInt, parseInt2, parseInt3, i5, i4, i3);
            gregorianCalendar.set(14, i);
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (length > i2) {
                if (Character.toUpperCase(str.charAt(i2)) != 'Z') {
                    int parseInt7 = (Integer.parseInt(str.substring(i2 + 1, i2 + 3)) * 60) + Integer.parseInt(str.substring(i2 + 4, i2 + 6));
                    if (str.charAt(i2) == '-') {
                        i6 = -parseInt7;
                    } else {
                        i6 = parseInt7;
                    }
                    timeInMillis -= ((long) i6) * 60000;
                }
                num = Integer.valueOf(i6);
            } else {
                num = null;
            }
            return new anms(z, timeInMillis, num);
        } catch (StringIndexOutOfBoundsException e) {
            String valueOf = String.valueOf(str);
            throw new NumberFormatException(valueOf.length() == 0 ? new String("Invalid date/time format: ") : "Invalid date/time format: ".concat(valueOf));
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anms) {
            anms anms = (anms) obj;
            return this.f77161c == anms.f77161c && this.f77160a == anms.f77160a && this.f77162d == anms.f77162d;
        }
    }

    public final int hashCode() {
        long[] jArr = new long[3];
        jArr[0] = this.f77160a;
        jArr[1] = !this.f77161c ? 0 : serialVersionUID;
        jArr[2] = (long) this.f77162d;
        return Arrays.hashCode(jArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f77159b);
        gregorianCalendar.setTimeInMillis(this.f77160a + (((long) this.f77162d) * 60000));
        m64785a(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        m64785a(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        m64785a(sb, gregorianCalendar.get(5), 2);
        if (!this.f77161c) {
            sb.append('T');
            m64785a(sb, gregorianCalendar.get(11), 2);
            sb.append(':');
            m64785a(sb, gregorianCalendar.get(12), 2);
            sb.append(':');
            m64785a(sb, gregorianCalendar.get(13), 2);
            if (gregorianCalendar.isSet(14)) {
                sb.append('.');
                m64785a(sb, gregorianCalendar.get(14), 3);
            }
            int i = this.f77162d;
            if (i == 0) {
                sb.append('Z');
            } else {
                if (i <= 0) {
                    sb.append('-');
                    i = -i;
                } else {
                    sb.append('+');
                }
                m64785a(sb, i / 60, 2);
                sb.append(':');
                m64785a(sb, i % 60, 2);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static void m64785a(StringBuilder sb, int i, int i2) {
        if (i < 0) {
            sb.append('-');
            i = -i;
        }
        int i3 = i;
        while (i3 > 0) {
            i3 /= 10;
            i2--;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append('0');
        }
        if (i != 0) {
            sb.append(i);
        }
    }
}
