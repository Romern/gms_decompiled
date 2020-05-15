package p000;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;

/* renamed from: sej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sej {

    /* renamed from: a */
    private static final sej f44090a = new sej();

    /* renamed from: b */
    private adyy f44091b = null;

    private sej() {
    }

    /* renamed from: a */
    public static adyy m35079a() {
        synchronized (f44090a) {
            if (f44090a.f44091b == null) {
                f44090a.f44091b = new adyy(m35080b());
                adyy adyy = f44090a.f44091b;
                return adyy;
            }
            adyy adyy2 = f44090a.f44091b;
            return adyy2;
        }
    }

    /* renamed from: b */
    private static Semaphore m35080b() {
        Semaphore semaphore;
        try {
            ConcurrentMap lockMap = rpr.m34216b().getLockMap("periodic-restart-lock");
            synchronized (lockMap) {
                if (!lockMap.containsKey("singleton_semaphore")) {
                    semaphore = new Semaphore(1073741823);
                    lockMap.put("singleton_semaphore", semaphore);
                } else {
                    semaphore = (Semaphore) lockMap.get("singleton_semaphore");
                }
            }
            return semaphore;
        } catch (NoSuchMethodError e) {
            return new Semaphore(1073741823);
        }
    }
}
