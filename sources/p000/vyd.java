package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;

/* renamed from: vyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vyd {

    /* renamed from: a */
    public final Context f50224a;

    /* renamed from: b */
    private final vwf f50225b;

    public vyd(Context context) {
        this.f50224a = context;
        this.f50225b = vwf.m41483a(context);
    }

    /* renamed from: a */
    private static final aebi m41579a(long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("SCHEDULED_AT", System.currentTimeMillis());
        bundle.putLong("TASK_DEADLINE", System.currentTimeMillis() + (j * 1000));
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.droidguard.DroidGuardGcmTaskService";
        aebi.f63099k = "dg_task";
        aebi.f63107s = bundle;
        aebi.mo34027b(1);
        return aebi;
    }

    /* renamed from: c */
    private final boolean m41581c() {
        return vyq.m41600a(this.f50224a).mo28976e() > 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: d */
    private final aebj m41582d() {
        vyq a = vyq.m41600a(this.f50224a);
        if (a.mo28976e() >= a.mo28974c()) {
            return m41583e();
        }
        long max = Math.max(Math.max(0L, a.mo28970a() - System.currentTimeMillis()) / 1000, a.mo28976e());
        long c = a.mo28974c();
        aebi a2 = m41579a(c);
        a2.mo34004a(max, c);
        a2.mo34028b(cdny.m134343h() ^ true ? 1 : 0, 1);
        a2.mo34024a(cdny.m134343h() ^ true ? 1 : 0, 1);
        return a2.mo33974b();
    }

    /* renamed from: e */
    private final aebj m41583e() {
        long e = vyq.m41600a(this.f50224a).mo28976e();
        long min = Math.min(cdrh.m134735b(), 1 + e);
        aebi a = m41579a(min);
        a.mo34004a(e, min);
        a.mo34023a(0);
        a.mo34024a(0, cdny.m134339d() ? 1 : 0);
        return a.mo33974b();
    }

    /* renamed from: b */
    public final void mo28955b() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f50224a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || m41581c()) {
            m41580a(m41583e());
        } else {
            mo28954a("sa");
        }
    }

    /* renamed from: a */
    private final void m41580a(aeca aeca) {
        aeat.m51532a(this.f50224a).mo33984a(aeca);
    }

    /* renamed from: a */
    public final void mo28953a() {
        NetworkInfo activeNetworkInfo;
        vyq a = vyq.m41600a(this.f50224a);
        long currentTimeMillis = System.currentTimeMillis();
        int i = (currentTimeMillis >= a.mo28970a() ? currentTimeMillis < a.mo28973b() ? 2 : 3 : 1) - 1;
        if (i == 0) {
            m41580a(m41582d());
        } else if (i != 1) {
            mo28955b();
        } else {
            try {
                int intExtra = this.f50224a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
                if ((intExtra == 1 || intExtra == 2) && (activeNetworkInfo = ((ConnectivityManager) this.f50224a.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() != 0 && !m41581c()) {
                    mo28954a("su");
                    return;
                }
            } catch (Exception e) {
                this.f50225b.mo28911a(e);
            }
            m41580a(m41582d());
        }
    }

    /* renamed from: a */
    public final void mo28954a(String str) {
        new asfb(this.f50224a, 1, "DG:service", null, "com.google.android.gms").mo49111a(1000);
        Intent intent = new Intent("com.google.android.gms.droidguard.service.PING");
        intent.setClassName("com.google.android.gms", "com.google.android.gms.droidguard.DroidGuardService");
        bxvd da = vwa.f50105c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        vwa vwa = (vwa) da.f164949b;
        str.getClass();
        vwa.f50107a |= 1;
        vwa.f50108b = str;
        intent.putExtra("data", ((vwa) da.mo74062i()).mo73642k());
        this.f50224a.startService(intent);
    }
}
