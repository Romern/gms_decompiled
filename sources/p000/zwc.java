package p000;

import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

/* renamed from: zwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zwc {

    /* renamed from: c */
    private static final srn f56050c = zvt.m46581a();

    /* renamed from: a */
    public final ConcurrentMap f56051a = new ConcurrentHashMap();

    /* renamed from: b */
    public final sqv f56052b;

    public zwc(sqv sqv) {
        this.f56052b = sqv;
    }

    /* renamed from: a */
    public final void mo31543a(int i, Object obj) {
        ConcurrentMap concurrentMap = this.f56051a;
        Integer valueOf = Integer.valueOf(i);
        zwb zwb = (zwb) concurrentMap.remove(valueOf);
        if (zwb != null) {
            zwb.mo31542a(obj, this.f56052b.mo20505a());
        } else {
            bnsl bnsl = (bnsl) f56050c.mo68388c();
            bnsl.mo68432a("zwc", "a", 81, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68413a("Unknown request %d for response %s", i, obj);
            bqgy c = bqgy.m112818c();
            c.mo69138b(obj);
            ConcurrentMap concurrentMap2 = this.f56051a;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long a = this.f56052b.mo20505a();
            zwb zwb2 = (zwb) concurrentMap2.putIfAbsent(valueOf, new zwb(c, a, a + timeUnit.toMillis(30)));
            if (zwb2 != null) {
                zwb2.mo31542a(obj, this.f56052b.mo20505a());
                this.f56051a.remove(valueOf);
            }
        }
        long a2 = this.f56052b.mo20505a();
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : this.f56051a.entrySet()) {
            if (((zwb) entry.getValue()).f56049c <= a2) {
                zwb zwb3 = (zwb) entry.getValue();
                zwb3.f56047a.mo69136a((Throwable) new yqh("Expired waiting on Wearable callback"));
                zvj.m46565b(a2 - zwb3.f56048b);
                hashSet.add((Integer) entry.getKey());
            }
        }
        this.f56051a.keySet().removeAll(hashSet);
    }
}
