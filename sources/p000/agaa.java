package p000;

import android.location.Location;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: agaa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agaa {

    /* renamed from: c */
    private static agaa f65050c;

    /* renamed from: a */
    public final ConcurrentHashMap f65051a = new ConcurrentHashMap();

    /* renamed from: b */
    public final AtomicReference f65052b = new AtomicReference();

    private agaa() {
    }

    /* renamed from: a */
    public static synchronized agaa m53787a() {
        agaa agaa;
        synchronized (agaa.class) {
            if (f65050c == null) {
                f65050c = new agaa();
            }
            agaa = f65050c;
        }
        return agaa;
    }

    /* renamed from: a */
    public final void mo35128a(Location location) {
        this.f65052b.set(location);
    }
}
