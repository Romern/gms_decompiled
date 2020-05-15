package com.google.android.gms.ads.social;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* renamed from: com.google.android.gms.ads.social.d */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0903d {

    /* renamed from: b */
    private static final Object f9470b = new Object();

    /* renamed from: c */
    private static C0903d f9471c;

    /* renamed from: a */
    public final Context f9472a;

    /* renamed from: d */
    private final aeat f9473d;

    /* renamed from: e */
    private final SharedPreferences f9474e;

    public C0903d(Context context, aeat aeat, SharedPreferences sharedPreferences) {
        this.f9472a = context;
        this.f9473d = aeat;
        this.f9474e = sharedPreferences;
    }

    /* renamed from: a */
    public static C0903d m6097a(Context context) {
        C0903d dVar;
        synchronized (f9470b) {
            if (f9471c == null) {
                f9471c = new C0903d(context, aeat.m51532a(context), context.getSharedPreferences("social.package_doritos", 4));
            }
            dVar = f9471c;
        }
        return dVar;
    }

    /* renamed from: b */
    public final void mo7128b() {
        int d = (int) cbsy.m128334d();
        int c = (int) cbsy.m128333c();
        StringBuilder sb = new StringBuilder(82);
        sb.append("Scheduling periodic DSID refresh task. period: ");
        sb.append(d);
        sb.append(" s, flex: ");
        sb.append(c);
        sb.append(" s.");
        C0633h.m5664a(sb.toString());
        aebl aebl = new aebl();
        aebl.f63097i = "com.google.android.gms.ads.social.GcmSchedulerWakeupService";
        aebl.f63099k = "ads.social.doritos";
        aebl.mo34024a(0, cdny.f181385a.mo6606a().mo78033d() ? 1 : 0);
        aebl.mo34023a(0);
        aebl.mo34027b(1);
        if (!cdny.f181385a.mo6606a().mo78046q()) {
            aebl.f63070a = cbsy.m128334d();
            aebl.f63071b = cbsy.m128333c();
        } else {
            aebl.mo34009a(aebh.m51568a(cbsy.m128334d()));
        }
        this.f9473d.mo33984a(aebl.mo33974b());
        this.f9474e.edit().putInt("gms:ads:social:doritos:doritos_refresh_period_s", d).putInt("gms:ads:social:doritos:doritos_refresh_flex_s", c).commit();
    }

    /* renamed from: c */
    public final void mo7129c() {
        long b = cbsy.m128332b();
        StringBuilder sb = new StringBuilder(67);
        sb.append("Scheduling one-off DSID refresh task. Flex: ");
        sb.append(b);
        sb.append(" s.");
        C0633h.m5664a(sb.toString());
        aeat aeat = this.f9473d;
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.ads.social.GcmSchedulerWakeupService";
        aebi.f63099k = "ads.social.doritos-oneoff";
        aebi.mo34024a(0, cdny.m134339d() ? 1 : 0);
        aebi.mo34023a(0);
        aebi.mo34027b(1);
        aebi.mo34004a(0, cbsy.m128332b());
        aeat.mo33984a(aebi.mo33974b());
    }

    /* renamed from: d */
    public final void mo7130d() {
        if (C0902c.m6094a(this.f9472a).mo7125a("ads.social.doritos-immediate") != 0) {
            C0633h.m5670c("Immediate DSID task failed. Scheduling one-off");
            mo7129c();
        }
    }

    /* renamed from: a */
    public final void mo7127a() {
        int i = this.f9474e.getInt("gms:ads:social:doritos:doritos_refresh_period_s", -1);
        long d = cbsy.m128334d();
        int i2 = this.f9474e.getInt("gms:ads:social:doritos:doritos_refresh_flex_s", -1);
        long c = cbsy.m128333c();
        if (((long) i) != d || ((long) i2) != c) {
            C0633h.m5664a("DSID periodic task parameters have changed.");
            mo7128b();
        }
    }
}
