package p000;

import java.time.Instant;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: asfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asfj {

    /* renamed from: a */
    static qws f88837a;

    /* renamed from: b */
    static qxq f88838b;

    /* renamed from: c */
    private static long f88839c = 0;

    /* renamed from: d */
    private static boolean f88840d;

    /* renamed from: a */
    private static qxq m73951a() {
        if (f88838b == null) {
            if (f88837a == null) {
                f88837a = new qws(rpr.m34216b(), "PLATFORM_STATS_COUNTERS", null);
            }
            f88838b = new qxq(f88837a, "PLATFORM_STATS_COUNTERS", 1024);
        }
        return f88838b;
    }

    /* renamed from: b */
    private static boolean m73954b() {
        if (Instant.now().toEpochMilli() <= f88839c + cgsi.f187650a.mo6606a().mo84411k()) {
            return f88840d;
        }
        boolean z = false;
        if (cgtv.m147055b()) {
            aucb k = avtz.m79336a(rpr.m34216b(), new avty()).mo24755k("PLATFORM_STATS_COUNTERS");
            try {
                aucu.m76783a(k, 10000, TimeUnit.MILLISECONDS);
            } catch (ExecutionException | TimeoutException e) {
                f88838b.mo24383c("ControlledEventsConsentApiCanLogFailure").mo24359a();
            } catch (InterruptedException e2) {
                f88838b.mo24383c("ControlledEventsConsentApiCanLogFailure").mo24359a();
                Thread.currentThread().interrupt();
            }
            if (k.mo50384b() && k.mo50386d() != null && ((Boolean) k.mo50386d()).booleanValue()) {
                z = true;
            }
            f88840d = z;
        } else {
            rpr b = rpr.m34216b();
            m73951a();
            boolean c = ashd.m74124c();
            new aseq();
            boolean z2 = !aseq.m73886a(b).isEmpty();
            boolean b2 = cgsu.m146907b();
            if (c || z2 || b2) {
                z = true;
            }
            f88840d = z;
        }
        f88839c = Instant.now().toEpochMilli();
        return f88840d;
    }

    /* renamed from: a */
    public static void m73952a(String str) {
        m73953a(str, 1);
    }

    /* renamed from: a */
    public static void m73953a(String str, int i) {
        if (m73954b()) {
            m73951a().mo24383c(str).mo24360a((long) i);
            m73951a().mo24388e();
        }
    }
}
