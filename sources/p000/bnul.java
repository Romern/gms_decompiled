package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: bnul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnul extends bnuf {

    /* renamed from: a */
    public static final bnul f132165a = new bnul();

    private bnul() {
    }

    /* renamed from: a */
    public final long mo68492a() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    public final String toString() {
        return "Default millisecond precision clock";
    }
}
