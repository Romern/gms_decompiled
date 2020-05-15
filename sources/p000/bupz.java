package p000;

/* renamed from: bupz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bupz {
    /* renamed from: a */
    public static int m120218a(int i) {
        int i2;
        if (i >= 2412 && i <= 2472) {
            i2 = i - 2407;
        } else if (i == 2484) {
            return 14;
        } else {
            if (i >= 4915 && i <= 4980) {
                return 200 - ((5000 - i) / 5);
            }
            if (i > 5000 && i < 6000) {
                i2 = i - 5000;
            } else if (i > 0 && i < 200) {
                return i;
            } else {
                return 0;
            }
        }
        return i2 / 5;
    }

    /* renamed from: a */
    public static long m120219a(String str) {
        int length = str.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            int digit = Character.digit(charAt, 16);
            if (digit != -1) {
                j = (j * 16) + ((long) digit);
            } else if (!(charAt == ':' || charAt == '-')) {
                return -1;
            }
        }
        return j;
    }
}
