package p000;

import android.app.usage.UsageEvents;

/* renamed from: aeyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aeyt {

    /* renamed from: a */
    public final UsageEvents.Event f64010a;

    public aeyt(UsageEvents.Event event) {
        this.f64010a = event;
    }

    /* renamed from: a */
    public final long mo34662a() {
        return this.f64010a.getTimeStamp();
    }

    /* renamed from: b */
    public final int mo34663b() {
        return this.f64010a.getEventType();
    }
}
