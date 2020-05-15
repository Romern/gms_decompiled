package p000;

import java.security.SecureRandom;

/* renamed from: ascn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ascn {
    /* renamed from: a */
    public static long m73780a() {
        long j = -1;
        while (!m73781a(j)) {
            j = new SecureRandom().nextLong();
        }
        return j;
    }

    /* renamed from: a */
    public static boolean m73781a(long j) {
        return (j == -1 || j == 0) ? false : true;
    }
}
