package p000;

import android.os.SystemClock;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionResult;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: bfci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfci {

    /* renamed from: a */
    public static final short[] f113380a = {7, 8};

    /* renamed from: b */
    public final boolean f113381b;

    /* renamed from: c */
    public long f113382c = -86400000000000L;

    /* renamed from: d */
    public int f113383d = 4;

    /* renamed from: e */
    private final int f113384e;

    /* renamed from: f */
    private final int f113385f;

    /* renamed from: g */
    private long f113386g = -86400000000000L;

    public bfci(boolean z, int i, int i2) {
        this.f113381b = z;
        this.f113384e = i;
        this.f113385f = i2;
    }

    /* renamed from: a */
    public static void m96339a(int i, List list) {
        aegc aegc = new aegc();
        aegc.f63352a = i;
        aegc.mo34122a(0);
        list.add(aegc.mo34121a());
        aegc aegc2 = new aegc();
        aegc2.f63352a = i;
        aegc2.mo34122a(1);
        list.add(aegc2.mo34121a());
    }

    /* renamed from: a */
    private static boolean m96340a(int i) {
        for (short s : f113380a) {
            if (s == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized void mo61383a(ActivityTransitionResult activityTransitionResult) {
        this.f113383d = 4;
        for (ActivityTransitionEvent activityTransitionEvent : activityTransitionResult.f79314a) {
            if (activityTransitionEvent.f79308b == 0) {
                this.f113383d = activityTransitionEvent.f79307a;
            }
            if (m96340a(activityTransitionEvent.f79307a)) {
                this.f113382c = Math.max(activityTransitionEvent.f79309c, this.f113382c);
            } else if (activityTransitionEvent.f79307a == 0) {
                this.f113386g = Math.max(activityTransitionEvent.f79309c, this.f113386g);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        return false;
     */
    /* renamed from: a */
    public final synchronized boolean mo61384a() {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (this.f113383d != 0 && this.f113386g <= this.f113382c && TimeUnit.NANOSECONDS.toSeconds(elapsedRealtimeNanos - this.f113386g) > ((long) this.f113385f)) {
            if (!m96340a(this.f113383d)) {
                if (TimeUnit.NANOSECONDS.toSeconds(elapsedRealtimeNanos - this.f113382c) >= ((long) this.f113384e)) {
                    return false;
                }
            }
            return true;
        }
    }
}
