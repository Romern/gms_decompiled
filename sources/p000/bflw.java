package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bflw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bflw {

    /* renamed from: a */
    public ArrayList f114378a;

    /* renamed from: b */
    public List f114379b;

    /* renamed from: c */
    public long f114380c;

    public bflw() {
    }

    /* renamed from: a */
    public static besz m97207a(beta beta, long j, beta beta2, long j2) {
        return new besz(beta.f112347b - j, j2 + beta2.f112347b, beta.f112346a);
    }

    /* renamed from: b */
    public final Boolean mo61905b(long j, long j2, long j3) {
        return m97208a(1, j, j2, j3);
    }

    /* renamed from: c */
    public final Boolean mo61906c(long j, long j2, long j3) {
        return m97208a(2, j, j2, j3);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    private final Boolean m97208a(int i, long j, long j2, long j3) {
        long j4;
        bflw bflw;
        long j5;
        if (j > j2) {
            j4 = j;
        } else {
            j4 = j2;
        }
        if (j > j2) {
            bflw = this;
            j5 = j2;
        } else {
            bflw = this;
            j5 = j;
        }
        List<besz> list = bflw.f114379b;
        if (list == null) {
            return null;
        }
        long j6 = 0;
        long j7 = 0;
        for (besz besz : list) {
            long max = Math.max(j5, besz.f112343a);
            long min = Math.min(j4, besz.f112344b);
            if (min > max) {
                long j8 = min - max;
                if (besz.f112345c == i) {
                    j7 += j8;
                }
                j6 += j8;
            }
        }
        long j9 = j4 - j5;
        long j10 = j9 - j6;
        if (j7 > Math.min(Math.max(j9 - 1, 0L), j3)) {
            return Boolean.TRUE;
        }
        if (j10 <= 30000) {
            return Boolean.FALSE;
        }
        return null;
    }

    public bflw(byte[] bArr) {
        this.f114378a = new ArrayList();
    }

    /* renamed from: a */
    public final Boolean mo61904a(long j, long j2, long j3) {
        return m97208a(0, j, j2, j3);
    }
}
