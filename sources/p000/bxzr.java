package p000;

import java.util.Comparator;

/* renamed from: bxzr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxzr {

    /* renamed from: a */
    private static final Comparator f165165a = new bxzq();

    static {
        bxvd da = bxun.f164861c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxun bxun = (bxun) da.f164949b;
        bxun.f164863a = -315576000000L;
        bxun.f164864b = -999999999;
        bxun bxun2 = (bxun) da.mo74062i();
        bxvd da2 = bxun.f164861c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bxun bxun3 = (bxun) da2.f164949b;
        bxun3.f164863a = 315576000000L;
        bxun3.f164864b = 999999999;
        bxun bxun4 = (bxun) da2.mo74062i();
        bxvd da3 = bxun.f164861c.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bxun bxun5 = (bxun) da3.f164949b;
        bxun5.f164863a = 0;
        bxun5.f164864b = 0;
        bxun bxun6 = (bxun) da3.mo74062i();
    }

    /* renamed from: a */
    public static int m124573a(bxun bxun, bxun bxun2) {
        return f165165a.compare(bxun, bxun2);
    }

    /* renamed from: b */
    public static void m124577b(bxun bxun) {
        long j = bxun.f164863a;
        int i = bxun.f164864b;
        if (j >= -315576000000L && j <= 315576000000L) {
            long j2 = (long) i;
            if (j2 >= -999999999 && j2 < 1000000000) {
                if (j < 0 || i < 0) {
                    if (j <= 0 && i <= 0) {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j), Integer.valueOf(i)));
    }

    /* renamed from: a */
    public static long m124574a(bxun bxun) {
        m124577b(bxun);
        return bxun.f164863a;
    }

    /* renamed from: a */
    public static bxun m124575a(long j) {
        return m124576a(j / 1000, (int) ((j % 1000) * 1000000));
    }

    /* renamed from: a */
    public static bxun m124576a(long j, int i) {
        long j2 = (long) i;
        if (j2 <= -1000000000 || j2 >= 1000000000) {
            j = bqbs.m112525a(j, j2 / 1000000000);
            i = (int) (j2 % 1000000000);
        }
        if (j > 0 && i < 0) {
            i = (int) (((long) i) + 1000000000);
            j--;
        }
        if (j < 0 && i > 0) {
            i = (int) (((long) i) - 1000000000);
            j++;
        }
        bxvd da = bxun.f164861c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxun bxun = (bxun) da.f164949b;
        bxun.f164863a = j;
        bxun.f164864b = i;
        bxun bxun2 = (bxun) da.mo74062i();
        m124577b(bxun2);
        return bxun2;
    }
}
