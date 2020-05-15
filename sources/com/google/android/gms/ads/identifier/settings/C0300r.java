package com.google.android.gms.ads.identifier.settings;

import android.util.Base64;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.ads.identifier.settings.r */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0300r {

    /* renamed from: a */
    private static final AtomicInteger f8043a = new AtomicInteger();

    /* renamed from: a */
    static int m5223a() {
        if (!cbvp.m128519f() || m5224b()) {
            f8043a.set(0);
            return 0;
        }
        return ((long) f8043a.incrementAndGet()) < cbvp.f178349a.mo6606a().mo75443o() ? 1 : 2;
    }

    /* renamed from: b */
    private static boolean m5224b() {
        rpr b = rpr.m34216b();
        C0305w a = C0305w.m5233a(b);
        try {
            byte[] c = a.mo6531c();
            long millis = TimeUnit.SECONDS.toMillis(cbvp.f178349a.mo6606a().mo75442n());
            C0299q qVar = new C0299q();
            try {
                return a.mo6529a((byte[]) bqdx.m112673a(bqdx.m112674a(bqdx.m112673a(bqdx.m112673a(bqfl.m112747c(qVar.f8042b.mo25819b(new C0298p(Base64.encodeToString(c, 2), b))), C0291i.f8031a, bqfb.INSTANCE), new C0292j(c), qVar.f8042b), new C0293k(qVar), qVar.f8042b), C0294l.f8034a, bqfb.INSTANCE).get(millis, TimeUnit.MILLISECONDS));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return false;
            } catch (ExecutionException e2) {
                int i = f8043a.get();
                StringBuilder sb = new StringBuilder(38);
                sb.append("deviceIntegrityTokenFetch #");
                sb.append(i);
                C0288f.m5215a(b, sb.toString(), e2.getCause());
                return false;
            } catch (TimeoutException e3) {
                int i2 = f8043a.get();
                StringBuilder sb2 = new StringBuilder(38);
                sb2.append("deviceIntegrityTokenFetch #");
                sb2.append(i2);
                C0288f.m5213a(b, sb2.toString(), "Time out");
                return false;
            }
        } catch (IOException | GeneralSecurityException e4) {
            int i3 = f8043a.get();
            StringBuilder sb3 = new StringBuilder(27);
            sb3.append("publicKeyError #");
            sb3.append(i3);
            C0288f.m5215a(b, sb3.toString(), e4);
            return false;
        }
    }
}
