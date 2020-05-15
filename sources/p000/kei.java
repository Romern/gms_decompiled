package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: kei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kei extends keo {

    /* renamed from: a */
    public static final srn f23929a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: b */
    private final ScheduledExecutorService f23930b;

    /* renamed from: c */
    private final long f23931c;

    /* renamed from: d */
    private final bnht f23932d;

    /* renamed from: e */
    private final bnhe f23933e;

    public kei(ScheduledExecutorService scheduledExecutorService, long j, bnht bnht, bnhe bnhe) {
        this.f23930b = scheduledExecutorService;
        this.f23931c = j;
        this.f23932d = bnht;
        this.f23933e = bnhe;
    }

    /* renamed from: a */
    static final /* synthetic */ bqgg m17723a(Map map) {
        bnia j = bnic.m109500j();
        for (Map.Entry entry : map.entrySet()) {
            try {
                j.mo67752b((Iterable) ((kek) bqga.m112780a((Future) ((bqgg) entry.getValue()))).f23936a);
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof kep) {
                    return bqga.m112777a(cause);
                }
                bnsl bnsl = (bnsl) f23929a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("kei", "a", 78, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Exception happened in datasource: %s", entry.getKey());
            }
        }
        return bqga.m112775a(new kek(j.mo67751a()));
    }

    /* renamed from: a */
    public final bqgg mo14429a(kej kej) {
        bnic bnic = kej.f23935b;
        HashMap hashMap = new HashMap();
        bnrd a = bnic.iterator();
        while (a.hasNext()) {
            bnrd a2 = this.f23932d.mo67692g((Class) a.next()).iterator();
            while (a2.hasNext()) {
                keo keo = (keo) a2.next();
                if (!hashMap.containsKey(keo)) {
                    hashMap.put(keo, bqga.m112773a(keo.mo14429a(kej), this.f23931c, TimeUnit.MILLISECONDS, this.f23930b));
                }
            }
        }
        return bqga.m112782b(hashMap.values()).mo69214a(new keh(hashMap), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo14430a(kem kem) {
        Class<?> cls = kem.f23944b.getClass();
        keo keo = (keo) this.f23933e.get(cls);
        if (keo == null) {
            return bqga.m112777a((Throwable) new IllegalArgumentException(cls.toString()));
        }
        return keo.mo14430a(kem);
    }
}
