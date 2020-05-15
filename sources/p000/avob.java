package p000;

import android.content.Context;
import android.os.SystemClock;

/* renamed from: avob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avob extends avnw {

    /* renamed from: h */
    public static final avtk f93577h = new avtk("delay", 0L);

    public avob(Context context, avte avte) {
        super("fixed-delay-execution", context, avte);
    }

    /* renamed from: f */
    public static avoa m78904f() {
        return new avoa();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final long mo51448e() {
        return SystemClock.elapsedRealtime() + ((Long) mo51433a(f93577h)).longValue();
    }
}
