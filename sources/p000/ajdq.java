package p000;

import com.google.android.gms.nearby.messages.Strategy;

/* renamed from: ajdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajdq {
    /* renamed from: a */
    public static long m58558a(Strategy strategy) {
        return m58561b(strategy.f80692e);
    }

    /* renamed from: a */
    public static boolean m58559a(int i) {
        return i == Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public static boolean m58560a(long j) {
        return j == Long.MAX_VALUE;
    }

    /* renamed from: b */
    public static long m58561b(int i) {
        if (!m58559a(i)) {
            return ((long) i) * 1000;
        }
        return Long.MAX_VALUE;
    }
}
