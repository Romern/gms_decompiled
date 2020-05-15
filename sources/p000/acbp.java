package p000;

import java.util.concurrent.ExecutorService;

/* renamed from: acbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acbp {
    /* renamed from: a */
    public static void m48832a() {
        achs.f59871a.mo25414c("Scheduling periodic tasks", new Object[0]);
        if (!((Boolean) acaw.f59299ac.mo58455c()).booleanValue()) {
            acbt.m48836a().mo32624A().mo32826a();
            return;
        }
        ExecutorService executorService = acbq.f59447a;
        ackp A = acbt.m48836a().mo32624A();
        A.getClass();
        executorService.execute(new acbn(A));
    }
}
