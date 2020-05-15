package p000;

import java.security.SecureRandom;
import java.util.Random;

/* renamed from: bmyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmyk {

    /* renamed from: a */
    public static final Random f131201a = new bmyi();

    /* renamed from: b */
    public static final SecureRandom f131202b = m108624a();

    /* renamed from: c */
    public static final ThreadLocal f131203c = new bmyh();

    static {
        new bmyj();
    }

    /* renamed from: a */
    public static SecureRandom m108624a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
