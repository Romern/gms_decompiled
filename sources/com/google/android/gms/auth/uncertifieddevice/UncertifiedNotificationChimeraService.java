package com.google.android.gms.auth.uncertifieddevice;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UncertifiedNotificationChimeraService extends aeah {

    /* renamed from: a */
    private static final sek f11605a = ght.m13171a("UncertifiedDevice", "UncertifiedNotificationChimeraService");

    /* renamed from: b */
    private sex f11606b;

    /* renamed from: a */
    static aebj m7115a(long j, long j2) {
        aebi aebi = new aebi();
        aebi.mo34004a(j, j2);
        aebi.f63099k = "UncertifiedNotificationTask";
        aebi.f63097i = "com.google.android.gms.auth.uncertifieddevice.UncertifiedNotificationService";
        aebi.mo34023a(2);
        aebi.f63102n = true;
        aebi.mo34027b(1);
        return aebi.mo33974b();
    }

    /* renamed from: b */
    private final sex m7117b() {
        if (this.f11606b == null) {
            this.f11606b = sex.m35104a(this);
        }
        return this.f11606b;
    }

    /* renamed from: b */
    public static void m7118b(Context context) {
        aeat a = aeat.m51532a(context);
        sex a2 = sex.m35104a(context);
        if (!cdpf.m134588b() || gnv.m13536ai() != 2 || gnv.m13537aj() - System.currentTimeMillis() > 604800000) {
            a.mo33986a("UncertifiedNotificationTask", "com.google.android.gms.auth.uncertifieddevice.UncertifiedNotificationService");
            a2.mo25444a("UncertifiedNotificationChimeraService", 1);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    public static void m7116a(Context context) {
        aeat a = aeat.m51532a(context);
        long j = 0;
        long max = Math.max(0L, gnv.m13537aj() - System.currentTimeMillis()) - 604800000;
        if (max > 0) {
            j = max;
        }
        long j2 = j / 1000;
        a.mo33984a(m7115a(j2, gnv.m13531ad() + j2));
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        m7117b().mo25444a("UncertifiedNotificationChimeraService", 1);
        long aj = gnv.m13537aj() - System.currentTimeMillis();
        if (aj <= 0) {
            mo7925a(0);
        } else if (aj <= 604800000) {
            mo7925a(aj);
            long j = (aj % 86400000) / 1000;
            aeat.m51532a(this).mo33984a(m7115a(j, gnv.m13531ad() + j));
        } else {
            f11605a.mo25418e("UncertifiedNotificationChimeraService should not be triggered when remaining days to expire registration is 7 or more days.", new Object[0]);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7925a(long j) {
        String str;
        String str2;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse((String) gnv.f18726E.mo58455c()));
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 134217728);
        if (j <= 0) {
            str2 = getResources().getString(C0126R.string.uncertified_notification_expired_title);
            str = getResources().getString(C0126R.string.uncertified_notification_expired_content);
        } else {
            int i = ((int) (j / 86400000)) + (j % 86400000 > 0 ? 1 : 0);
            str2 = getResources().getString(C0126R.string.uncertified_notification_expiring_title);
            str = getResources().getQuantityString(C0126R.plurals.uncertified_notification_expiring_content, i, Integer.valueOf(i));
        }
        C1102je jeVar = new C1102je(this);
        jeVar.mo13640e(str2);
        jeVar.mo13632b(str);
        jeVar.mo13630b(qkj.m32287a(this, C0126R.C0127drawable.quantum_ic_warning_googred_24));
        jeVar.mo13633b(true);
        C1101jd jdVar = new C1101jd();
        jdVar.mo13593a(str);
        jeVar.mo13626a(jdVar);
        jeVar.f22258j = 2;
        jeVar.f22254f = activity;
        m7117b().mo25445a("UncertifiedNotificationChimeraService", 1, jeVar.mo13629b());
    }
}
