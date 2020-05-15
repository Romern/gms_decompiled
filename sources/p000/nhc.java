package p000;

import com.google.android.gms.beacon.BleFilter;
import com.google.android.gms.beacon.BleSighting;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: nhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nhc {

    /* renamed from: a */
    public static final ReadWriteLock f35561a = new ReentrantReadWriteLock(true);

    /* renamed from: b */
    public final Map f35562b = new HashMap();

    /* renamed from: a */
    public final double mo20638a(BleSighting bleSighting) {
        f35561a.readLock().lock();
        double d = 0.0d;
        for (Map.Entry entry : this.f35562b.entrySet()) {
            if (((BleFilter) entry.getKey()).mo17292a(bleSighting)) {
                nhb nhb = (nhb) entry.getValue();
                nhb.mo20636a();
                d = Math.max(d, nhb.f35558a);
            }
        }
        f35561a.readLock().unlock();
        return d;
    }

    /* renamed from: a */
    public final void mo20639a(Set set, long j) {
        f35561a.writeLock().lock();
        for (nhb nhb : this.f35562b.values()) {
            nhb.mo20637a(0);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            BleFilter bleFilter = (BleFilter) it.next();
            nhb nhb2 = (nhb) this.f35562b.get(bleFilter);
            if (nhb2 == null) {
                nhb2 = new nhb();
                this.f35562b.put(bleFilter, nhb2);
            }
            nhb2.mo20637a(j);
        }
        f35561a.writeLock().unlock();
    }
}
