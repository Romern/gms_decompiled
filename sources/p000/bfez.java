package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: bfez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfez {

    /* renamed from: a */
    private final List f113617a = new ArrayList();

    /* renamed from: a */
    public final synchronized void mo61569a() {
        this.f113617a.add(Long.valueOf(SystemClock.elapsedRealtime()));
    }

    /* renamed from: b */
    public final synchronized int mo61570b() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - 60000;
        Iterator it = this.f113617a.iterator();
        while (it.hasNext()) {
            if (((Long) it.next()).longValue() < elapsedRealtime) {
                it.remove();
            }
        }
        return this.f113617a.size();
    }
}
