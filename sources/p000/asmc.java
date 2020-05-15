package p000;

import java.security.SecureRandom;

/* renamed from: asmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asmc {

    /* renamed from: a */
    private static SecureRandom f89219a;

    /* renamed from: a */
    public static SecureRandom m74369a() {
        SecureRandom secureRandom;
        synchronized (asmc.class) {
            if (f89219a == null) {
                f89219a = new SecureRandom();
            }
            secureRandom = f89219a;
        }
        return secureRandom;
    }
}
