package p000;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ahzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahzk implements ahzj {

    /* renamed from: a */
    private final Map f68472a = new HashMap();

    /* renamed from: a */
    public final boolean mo37316a(String str) {
        return SystemClock.elapsedRealtime() > (this.f68472a.containsKey(str) ? ((Long) this.f68472a.get(str)).longValue() : 0);
    }

    /* renamed from: b */
    public final void mo37317b(String str) {
        this.f68472a.put(str, Long.valueOf(SystemClock.elapsedRealtime() + cfog.m141282j()));
    }
}
