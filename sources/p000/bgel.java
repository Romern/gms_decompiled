package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: bgel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgel {
    /* renamed from: a */
    public static int m98705a(bfmy bfmy) {
        bfmy bfmy2 = bfmy.OK;
        int ordinal = bfmy.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return 7;
        }
        if (ordinal == 2) {
            return 3;
        }
        if (ordinal != 3) {
            return ordinal != 4 ? 1 : 2;
        }
        return 5;
    }

    /* renamed from: a */
    public static long m98706a(long j, bgmk bgmk) {
        if (j != -1) {
            return System.currentTimeMillis() - TimeUnit.NANOSECONDS.toMillis(bgmk.mo62774a() - j);
        }
        return -1;
    }
}
