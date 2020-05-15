package p000;

/* renamed from: bxzt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxzt {
    static {
        bxvd da = bxyk.f165095c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxyk bxyk = (bxyk) da.f164949b;
        bxyk.f165097a = -62135596800L;
        bxyk.f165098b = 0;
        bxyk bxyk2 = (bxyk) da.mo74062i();
        bxvd da2 = bxyk.f165095c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bxyk bxyk3 = (bxyk) da2.f164949b;
        bxyk3.f165097a = 253402300799L;
        bxyk3.f165098b = 999999999;
        bxyk bxyk4 = (bxyk) da2.mo74062i();
        bxvd da3 = bxyk.f165095c.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bxyk bxyk5 = (bxyk) da3.f164949b;
        bxyk5.f165097a = 0;
        bxyk5.f165098b = 0;
        bxyk bxyk6 = (bxyk) da3.mo74062i();
        new bxzs();
    }

    /* renamed from: a */
    public static long m124578a(bxyk bxyk) {
        m124583c(bxyk);
        return bqbs.m112525a(bqbs.m112527c(bxyk.f165097a, 1000), ((long) bxyk.f165098b) / 1000000);
    }

    /* renamed from: b */
    public static long m124582b(bxyk bxyk) {
        m124583c(bxyk);
        return bqbs.m112525a(bqbs.m112527c(bxyk.f165097a, 1000000000), (long) bxyk.f165098b);
    }

    /* renamed from: c */
    public static void m124583c(bxyk bxyk) {
        long j = bxyk.f165097a;
        int i = bxyk.f165098b;
        if (j < -62135596800L || j > 253402300799L || i < 0 || ((long) i) >= 1000000000) {
            throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(j), Integer.valueOf(i)));
        }
    }

    /* renamed from: a */
    public static bxun m124579a(bxyk bxyk, bxyk bxyk2) {
        boolean z;
        m124583c(bxyk);
        m124583c(bxyk2);
        long b = bqbs.m112526b(bxyk2.f165097a, bxyk.f165097a);
        int i = bxyk2.f165098b;
        int i2 = bxyk.f165098b;
        long j = ((long) i) - ((long) i2);
        int i3 = (int) j;
        if (j == ((long) i3)) {
            z = true;
        } else {
            z = false;
        }
        bqbt.m112530a(z, "checkedSubtract", i, i2);
        return bxzr.m124576a(b, i3);
    }

    /* renamed from: a */
    public static bxyk m124580a(long j) {
        return m124581a(j / 1000, (int) ((j % 1000) * 1000000));
    }

    /* renamed from: a */
    public static bxyk m124581a(long j, int i) {
        long j2 = (long) i;
        if (j2 <= -1000000000 || j2 >= 1000000000) {
            j = bqbs.m112525a(j, j2 / 1000000000);
            i = (int) (j2 % 1000000000);
        }
        if (i < 0) {
            i = (int) (((long) i) + 1000000000);
            j = bqbs.m112526b(j, 1);
        }
        bxvd da = bxyk.f165095c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxyk bxyk = (bxyk) da.f164949b;
        bxyk.f165097a = j;
        bxyk.f165098b = i;
        bxyk bxyk2 = (bxyk) da.mo74062i();
        m124583c(bxyk2);
        return bxyk2;
    }
}
