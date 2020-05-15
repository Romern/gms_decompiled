package p000;

import android.app.usage.UsageEvents;
import java.util.Iterator;

/* renamed from: aeyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aeyu implements Iterator {

    /* renamed from: a */
    final /* synthetic */ UsageEvents f64011a;

    public aeyu(UsageEvents usageEvents) {
        this.f64011a = usageEvents;
    }

    public final boolean hasNext() {
        return this.f64011a.hasNextEvent();
    }

    public final void remove() {
    }

    public final /* bridge */ /* synthetic */ Object next() {
        UsageEvents.Event event = new UsageEvents.Event();
        this.f64011a.getNextEvent(event);
        return new aeyt(event);
    }
}
