package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aqbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqbm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Map f85571a;

    /* renamed from: b */
    final /* synthetic */ aqcr f85572b;

    /* renamed from: c */
    final /* synthetic */ aqbo f85573c;

    public aqbm(aqbo aqbo, Map map, aqcr aqcr) {
        this.f85573c = aqbo;
        this.f85571a = map;
        this.f85572b = aqcr;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        aqbu aqbu;
        Map map;
        aqbv aqbv;
        aqbw aqbw = this.f85573c.f85583i;
        Map map2 = this.f85571a;
        Map a = aqde.m71375a(map2.keySet(), this.f85572b);
        HashMap hashMap = new HashMap();
        if (!aqbw.f85616a.isEmpty()) {
            aqbw.f85617b.readLock().lock();
            try {
                for (Map.Entry entry : aqbw.f85616a.entrySet()) {
                    aqbu aqbu2 = (aqbu) entry.getValue();
                    aqbu aqbu3 = new aqbu();
                    Map map3 = aqbu2.f85612a;
                    aqbu3.f85612a = new HashMap();
                    if (map3 != null) {
                        aqbu3.f85612a.putAll(map3);
                    }
                    Map map4 = aqbu2.f85613b;
                    aqbu3.f85613b = new HashMap();
                    if (map4 != null) {
                        aqbu3.f85613b.putAll(map4);
                    }
                    hashMap.put((apgr) entry.getKey(), aqbu3);
                }
            } finally {
                aqbw.f85617b.readLock().unlock();
            }
        }
        for (Map.Entry entry2 : a.entrySet()) {
            apgr apgr = (apgr) entry2.getKey();
            aqcr aqcr = (aqcr) entry2.getValue();
            if (aqcr != null) {
                aqbv aqbv2 = new aqbv();
                aqbv2.f85614a = aqcr;
                aqbv2.f85615b = System.currentTimeMillis();
                aqbw.mo47749a(hashMap, apgr, aqbv2);
            }
        }
        for (apgr apgr2 : map2.values()) {
            apgr b = apgr2.mo47194b();
            if (hashMap.containsKey(b) && (map = (aqbu = (aqbu) hashMap.get(b)).f85613b) != null && map.containsKey(apgr2) && (aqbv = (aqbv) aqbu.f85613b.get(apgr2)) != null && aqbw.m71327a(aqbv) == null) {
                aqbu.f85613b.remove(apgr2);
            }
        }
        aqbw.f85617b.writeLock().lock();
        try {
            aqbw.f85616a.clear();
            aqbw.f85616a = null;
            aqbw.f85616a = hashMap;
            aqbw.f85617b.writeLock().unlock();
            if (this.f85573c.f85589p + aqbo.f85578e <= System.currentTimeMillis() && this.f85573c.f85588o.compareAndSet(true, false)) {
                try {
                    aqbo aqbo = this.f85573c;
                    if (aqbo.f85582h.mo47740b(aqbo.f85583i)) {
                        apyk apyk = new apyk(this.f85573c.f85580f);
                        this.f85573c.f85589p = System.currentTimeMillis();
                        apyk.mo47701a("snet_safe_browsing_last_cache_write_ms", this.f85573c.f85589p);
                    }
                } finally {
                    this.f85573c.f85588o.set(true);
                }
            }
        } catch (Throwable th) {
            aqbw.f85617b.writeLock().unlock();
            throw th;
        }
    }
}
