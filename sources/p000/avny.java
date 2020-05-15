package p000;

import android.content.Context;
import android.os.SystemClock;

/* renamed from: avny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avny extends avnw {

    /* renamed from: h */
    public static final avtg f93573h = new avtg("retry_count", 0);

    /* renamed from: i */
    public static final avtk f93574i = new avtk("initial_delay", 0L);

    /* renamed from: j */
    public static final avtk f93575j = new avtk("maximum_delay", Long.MAX_VALUE);

    /* renamed from: k */
    public static final avtb f93576k = new avtb("multiply_factor", Double.valueOf(2.0d));

    public avny(Context context, avte avte) {
        super("exponential-backoff-delay-execution", context, avte);
    }

    /* renamed from: f */
    public static avnx m78899f() {
        return new avnx();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final long mo51448e() {
        return SystemClock.elapsedRealtime() + Math.min(((Long) mo51433a(f93574i)).longValue() * ((long) Math.pow(((Double) mo51433a(f93576k)).doubleValue(), (double) ((Integer) mo51433a(f93573h)).intValue())), ((Long) mo51433a(f93575j)).longValue());
    }
}
