package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: qlo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qlo {
    /* renamed from: a */
    private static final Bundle m32385a(int i, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("reason", i - 1);
        bundle.putBoolean("allowRetry", z);
        return bundle;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: qlo.a(android.content.Context, long, long, boolean, int):void
     arg types: [android.content.Context, int, long, int, int]
     candidates:
      qlo.a(android.content.Context, qli, int, int, int):void
      qlo.a(android.content.Context, long, long, boolean, int):void */
    /* renamed from: b */
    public static final synchronized void m32389b(Context context) {
        boolean z;
        synchronized (qlo.class) {
            qli a = qli.m32351a(context);
            int a2 = a.mo24074a();
            StringBuilder sb = new StringBuilder(46);
            sb.append("Checking retry on unmetered count: ");
            sb.append(a2);
            sb.toString();
            if (a2 == 0) {
                if (a.mo24074a() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                bmzs.m108698a(z);
                if (a.mo24076a((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES)) {
                    m32386a(context, 0L, (long) ((int) cdji.m133561b()), false, 1);
                } else {
                    Log.w("ChimeraConfigService", "Could not write retry on unmetered network state. Canceling retry.");
                }
            } else {
                Log.w("ChimeraConfigService", "Retry attempt on unmetered network was throttled.");
            }
        }
    }

    /* renamed from: c */
    public static final synchronized void m32391c(Context context) {
        synchronized (qlo.class) {
            int max = Math.max((int) cdji.f180981a.mo6606a().mo77675d(), 60);
            m32388a(context, qli.m32351a(context), max, max - 60, 2);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: qlo.a(int, boolean):android.os.Bundle
     arg types: [int, int]
     candidates:
      qlo.a(android.content.Context, qli):void
      qlo.a(int, boolean):android.os.Bundle */
    /* renamed from: a */
    private static final void m32386a(Context context, long j, long j2, boolean z, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(132);
        sb.append("Scheduling checkin for one-off execution between [");
        sb.append(j);
        sb.append(",");
        sb.append(j2);
        sb.append("] seconds from now (");
        sb.append(currentTimeMillis);
        sb.append(")");
        Log.i("ChimeraConfigService", sb.toString());
        aeat a = aeat.m51532a(context);
        aebi aebi = new aebi();
        aebi.mo34004a(j, j2);
        aebi.f63097i = "com.google.android.gms.chimera.container.ConfigService";
        aebi.f63102n = true;
        aebi.mo34029b(z);
        aebi.f63099k = "ChimeraConfigService_OneOffRetry";
        aebi.f63107s = m32385a(4, false);
        aebi.mo34028b(i, i);
        aebi.mo34024a(0, 0);
        aebi.mo34026a(cdjh.m133553c());
        a.mo33984a(aebi.mo33974b());
    }

    /* renamed from: a */
    public static final synchronized void m32387a(Context context, qli qli) {
        synchronized (qlo.class) {
            int i = qli.f41640a.getInt("ChimeraConfigService.scheduledPeriodSec", -1);
            int b = (int) cdji.m133561b();
            if (i != b) {
                m32388a(context, qli, b, (int) cdji.f180981a.mo6606a().mo77673b(), 3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006b, code lost:
        return;
     */
    /* renamed from: b */
    public static final synchronized void m32390b(Context context, qli qli) {
        synchronized (qlo.class) {
            int c = (int) cdji.f180981a.mo6606a().mo77674c();
            if (c > 0) {
                int a = qli.mo24074a();
                StringBuilder sb = new StringBuilder(33);
                sb.append("Checking retry count: ");
                sb.append(a);
                sb.toString();
                if ((a & 255) == 0) {
                    boolean z = (qli.mo24074a() >> 8) != 0;
                    if (!qli.mo24076a(1)) {
                        Log.w("ChimeraConfigService", "Could not write retry state. Canceling retry.");
                    } else {
                        m32386a(context, (long) (c - (((int) cdji.f180981a.mo6606a().mo77672a()) / 2)), (long) ((int) cdji.m133561b()), z, 0);
                    }
                } else {
                    Log.w("ChimeraConfigService", "Retry attempt was throttled.");
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: qlo.a(int, boolean):android.os.Bundle
     arg types: [int, int]
     candidates:
      qlo.a(android.content.Context, qli):void
      qlo.a(int, boolean):android.os.Bundle */
    /* renamed from: a */
    private static final void m32388a(Context context, qli qli, int i, int i2, int i3) {
        qli.mo24078b(-1);
        StringBuilder sb = new StringBuilder(78);
        sb.append("Scheduling checkin every ");
        sb.append(i);
        sb.append(" seconds, with flex of ");
        sb.append(i2);
        sb.append(" seconds");
        Log.i("ChimeraConfigService", sb.toString());
        aeat a = aeat.m51532a(context);
        aebl aebl = new aebl();
        aebl.f63070a = (long) i;
        aebl.f63097i = "com.google.android.gms.chimera.container.ConfigService";
        aebl.mo34027b(1);
        aebl.f63102n = true;
        aebl.f63071b = (long) i2;
        aebl.mo34028b(0, 0);
        aebl.mo34024a(0, 0);
        aebl.f63107s = m32385a(i3, true);
        aebl.f63099k = "ChimeraConfigService";
        aebl.mo34026a(cdjh.m133553c());
        a.mo33984a(aebl.mo33974b());
        qli.mo24078b(i);
    }

    /* renamed from: a */
    public final void mo24089a(Context context) {
        m32390b(context, qli.m32351a(context));
    }
}
