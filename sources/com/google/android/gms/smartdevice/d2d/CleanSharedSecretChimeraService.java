package com.google.android.gms.smartdevice.d2d;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CleanSharedSecretChimeraService extends aeah {

    /* renamed from: a */
    private static final Executor f107856a = snp.m35704b(10);

    /* renamed from: b */
    private static final srl f107857b = aqza.f87134a;

    /* renamed from: a */
    public static void m92619a(Context context) {
        long g = cgps.f187469a.mo6606a().mo84250g();
        long seconds = TimeUnit.HOURS.toSeconds(12);
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.smartdevice.d2d.CleanSharedSecretService";
        aebi.f63099k = "cleanWorkProfile";
        aebi.mo34004a(g, seconds + g);
        aebi.mo34027b(1);
        aebi.f63102n = true;
        ((aeat) f107857b.mo21850a(context)).mo33984a(aebi.mo33974b());
    }

    /* renamed from: b */
    public static void m92620b(Context context) {
        long M = cgqs.f187523a.mo6606a().mo84300M();
        long seconds = TimeUnit.HOURS.toSeconds(1);
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.smartdevice.d2d.CleanSharedSecretService";
        aebi.f63099k = "cleanSharedSecret";
        aebi.mo34027b(1);
        aebi.mo34004a(M, seconds + M);
        aebi.f63102n = true;
        ((aeat) f107857b.mo21850a(context)).mo33984a(aebi.mo33974b());
    }

    /* renamed from: c */
    public static void m92622c(Context context) {
        long a = cgpv.f187483a.mo6606a().mo84257a();
        long seconds = TimeUnit.HOURS.toSeconds(12);
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.smartdevice.d2d.CleanSharedSecretService";
        aebi.f63099k = "cleanEsimActivation";
        aebi.mo34004a(a, seconds + a);
        aebi.mo34027b(1);
        aebi.f63102n = true;
        ((aeat) f107857b.mo21850a(context)).mo33984a(aebi.mo33974b());
    }

    /* renamed from: aZ */
    public final void mo7135aZ() {
        f107856a.execute(new aqyx(this));
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        String str = aecc.f63128a;
        aqxl a = arai.m72320a(this);
        if ("cleanSharedSecret".equals(str)) {
            arqc arqc = new arqc(this);
            long j = arqc.f88112a.getLong("session", 0);
            arqc.f88112a.edit().remove("sharedSecret").remove("session").apply();
            armd armd = arqc.f88113b;
            armd.mo48634a(3);
            armd.mo48635a(j);
            armd.mo48633a();
        }
        if ("cleanWorkProfile".equals(str) && m92621b()) {
            new arly(this, new adzt(Looper.getMainLooper())).f87870a.edit().clear().apply();
            ((beon) a.f87035b.mo6606a()).mo60861b(new Object[0]);
        }
        if ("cleanEsimActivation".equals(str)) {
            new aqzy(this).f87185a.edit().clear().apply();
        }
        return 0;
    }

    /* renamed from: b */
    public static boolean m92621b() {
        int i = Build.VERSION.SDK_INT;
        return cgps.f187469a.mo6606a().mo84248e();
    }
}
