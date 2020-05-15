package p000;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: skx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class skx implements skz {

    /* renamed from: a */
    public static final long f44652a = TimeUnit.DAYS.toMillis(1);

    /* renamed from: b */
    public final Random f44653b;

    public skx(Random random) {
        this.f44653b = random;
    }

    /* renamed from: a */
    public static skx m35565a() {
        Random random = new Random();
        random.nextLong();
        random.nextLong();
        return new skx(random);
    }
}
