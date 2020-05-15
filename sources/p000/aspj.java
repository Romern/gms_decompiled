package p000;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: aspj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aspj {

    /* renamed from: a */
    private static final long f89356a = TimeUnit.DAYS.toSeconds(1);

    /* renamed from: b */
    private static final long f89357b = TimeUnit.HOURS.toSeconds(6);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aebi.a(long, long):void
     arg types: [int, int]
     candidates:
      aebz.a(int, int):void
      aebi.a(long, long):void */
    /* renamed from: a */
    public static void m74419a(Context context) {
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
        aebi.f63099k = "immediate";
        aebi.mo34023a(0);
        aebi.mo34027b(1);
        aebi.mo34004a(0L, 1L);
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
    }

    /* renamed from: b */
    public static void m74420b(Context context) {
        aebl aebl = new aebl();
        aebl.f63097i = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
        aebl.f63099k = "periodic";
        aebl.f63070a = f89356a;
        int i = 0;
        aebl.mo34028b(0, cdny.m134341f() ? 1 : 0);
        aebl.mo34024a(0, cdny.m134340e() ? 1 : 0);
        aebl.f63071b = f89357b;
        if (cdny.m134337b()) {
            i = 2;
        }
        aebl.mo34027b(i);
        aeat.m51532a(context).mo33984a(aebl.mo33974b());
    }
}
