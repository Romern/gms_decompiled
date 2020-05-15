package p000;

import android.util.EventLog;

/* renamed from: aujk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aujk {

    /* renamed from: a */
    final long f91945a;

    /* renamed from: b */
    final int f91946b;

    /* renamed from: c */
    final Object f91947c;

    public aujk(EventLog.Event event) {
        this.f91945a = event.getTimeNanos();
        this.f91946b = event.getTag();
        this.f91947c = event.getData();
    }
}
