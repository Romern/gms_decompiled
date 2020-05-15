package p000;

import java.io.Serializable;

/* renamed from: bqcy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqcy extends Number implements Comparable, Serializable {

    /* renamed from: a */
    public final long f140492a;

    static {
        new bqcy(0);
        new bqcy(1);
        new bqcy(-1);
    }

    private bqcy(long j) {
        this.f140492a = j;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bqcy bqcy = (bqcy) obj;
        bmxy.m108581a(bqcy);
        return bqda.m112612a(this.f140492a, bqcy.f140492a);
    }

    public final double doubleValue() {
        long j = this.f140492a;
        double d = (double) (Long.MAX_VALUE & j);
        if (j >= 0) {
            return d;
        }
        Double.isNaN(d);
        return d + 9.223372036854776E18d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bqcy) && this.f140492a == ((bqcy) obj).f140492a;
    }

    public final float floatValue() {
        long j = this.f140492a;
        float f = (float) (Long.MAX_VALUE & j);
        return j < 0 ? f + 9.223372E18f : f;
    }

    public final int hashCode() {
        return bqcr.m112590a(this.f140492a);
    }

    public final int intValue() {
        return (int) this.f140492a;
    }

    public final long longValue() {
        return this.f140492a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.String, int):void
     arg types: [int, java.lang.String, int]
     candidates:
      bmxy.a(int, int, java.lang.String):java.lang.String
      bmxy.a(int, int, int):void
      bmxy.a(java.lang.Object, java.lang.String, int):void
      bmxy.a(java.lang.Object, java.lang.String, java.lang.Object):void
      bmxy.a(boolean, java.lang.String, char):void
      bmxy.a(boolean, java.lang.String, long):void
      bmxy.a(boolean, java.lang.String, java.lang.Object):void
      bmxy.a(boolean, java.lang.String, int):void */
    public final String toString() {
        long j = this.f140492a;
        bmxy.m108591a(true, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", 10);
        if (j == 0) {
            return "0";
        }
        if (j > 0) {
            return Long.toString(j, 10);
        }
        char[] cArr = new char[64];
        long j2 = (j >>> 1) / 5;
        int i = 63;
        cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
        while (j2 > 0) {
            i--;
            cArr[i] = Character.forDigit((int) (j2 % 10), 10);
            j2 /= 10;
        }
        return new String(cArr, i, 64 - i);
    }

    /* renamed from: a */
    public static bqcy m112610a(String str) {
        bmxy.m108581a(str);
        if (str.length() != 0) {
            int i = bqcz.f140495c[16] - 1;
            long j = 0;
            int i2 = 0;
            while (i2 < str.length()) {
                int digit = Character.digit(str.charAt(i2), 16);
                if (digit == -1) {
                    throw new NumberFormatException(str);
                } else if (i2 > i && bqcz.m112611a(j, digit)) {
                    String valueOf = String.valueOf(str);
                    throw new NumberFormatException(valueOf.length() == 0 ? new String("Too large for unsigned long: ") : "Too large for unsigned long: ".concat(valueOf));
                } else {
                    j = (j * 16) + ((long) digit);
                    i2++;
                }
            }
            return new bqcy(j);
        }
        throw new NumberFormatException("empty string");
    }
}
