package p000;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bjsu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjsu {

    /* renamed from: a */
    private static final AtomicInteger f123257a = new AtomicInteger(1);

    /* renamed from: a */
    public static String m104538a() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: b */
    public static int m104539b() {
        return f123257a.getAndIncrement();
    }
}
