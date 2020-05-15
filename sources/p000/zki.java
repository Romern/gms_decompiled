package p000;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: zki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zki {

    /* renamed from: a */
    public final ConcurrentMap f55305a = new ConcurrentHashMap();

    /* renamed from: a */
    public final zkh mo31204a(zgg zgg) {
        return (zkh) this.f55305a.remove(zgg);
    }

    public final String toString() {
        return String.format("SensorListenerManager{registrations=%s}", this.f55305a);
    }

    /* renamed from: a */
    public final void mo31205a(zkh zkh) {
        this.f55305a.put(zkh.f55298a, zkh);
    }
}
