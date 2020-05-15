package p000;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: agvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agvk {

    /* renamed from: a */
    public final String f66658a;

    /* renamed from: b */
    public final agvj f66659b;

    /* renamed from: c */
    private final long f66660c;

    public agvk(String str, agvj agvj, long j) {
        this.f66658a = str;
        this.f66659b = agvj;
        this.f66660c = j;
    }

    /* renamed from: a */
    public static agvk m55174a(long j, int i, Locale locale) {
        int i2;
        float f;
        long j2;
        long j3 = j;
        if ((i & 8) != 0) {
            i2 = 1024;
        } else {
            i2 = 1000;
        }
        long j4 = 0;
        if (j3 < 0) {
            f = (float) (-j3);
        } else {
            f = (float) j3;
        }
        agvj agvj = agvj.B;
        if (f > 900.0f) {
            j2 = (long) i2;
            f /= (float) i2;
            agvj = agvj.KB;
        } else {
            j2 = 1;
        }
        if (f > 900.0f) {
            j2 *= (long) i2;
            f /= (float) i2;
            agvj = agvj.MB;
        }
        if (f > 900.0f) {
            j2 *= (long) i2;
            f /= (float) i2;
            agvj = agvj.GB;
        }
        if (f > 900.0f) {
            j2 *= (long) i2;
            f /= (float) i2;
            agvj = agvj.TB;
        }
        if (f > 900.0f) {
            j2 *= (long) i2;
            f /= (float) i2;
            agvj = agvj.PB;
        }
        String str = "%.0f";
        int i3 = 100;
        if (j2 != 1 && f < 100.0f) {
            if (f >= 1.0f) {
                if (f >= 10.0f) {
                    if ((i & 1) != 0) {
                        i3 = 1;
                    }
                } else if ((i & 1) != 0) {
                    i3 = 10;
                    str = "%.1f";
                }
            }
            str = "%.2f";
        } else {
            i3 = 1;
        }
        if (j3 < 0) {
            f = -f;
        }
        String format = String.format(str, Float.valueOf(f));
        if ((i & 16) != 0) {
            DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(locale);
            decimalFormat.applyPattern("###.##");
            try {
                format = decimalFormat.format(decimalFormat.parse(format));
            } catch (ParseException e) {
            }
        }
        if ((i & 2) != 0) {
            j4 = (((long) Math.round(f * ((float) i3))) * j2) / ((long) i3);
        }
        return new agvk(format, agvj, j4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof agvk) {
            agvk agvk = (agvk) obj;
            return bmxi.m108538a(this.f66658a, agvk.f66658a) && this.f66659b == agvk.f66659b && this.f66660c == agvk.f66660c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f66658a, this.f66659b, Long.valueOf(this.f66660c)});
    }

    public final String toString() {
        return String.format(Locale.US, "%s %s", this.f66658a, this.f66659b);
    }
}
