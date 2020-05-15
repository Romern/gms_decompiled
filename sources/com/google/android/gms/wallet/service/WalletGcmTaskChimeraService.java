package com.google.android.gms.wallet.service;

import android.content.Context;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WalletGcmTaskChimeraService extends aeah {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* renamed from: a */
    public static void m94097a(Context context) {
        spn.m35856a(context, "com.google.android.gms.wallet.service.WalletGcmTaskService", true);
        awsy.m80988a(context);
        aeat a = aeat.m51532a(context);
        if (((Boolean) awje.f94529a.mo58455c()).booleanValue()) {
            aebl aebl = new aebl();
            aebl.f63097i = "com.google.android.gms.wallet.service.WalletGcmTaskService";
            aebl.mo34023a(2);
            aebl.mo34024a(1, 1);
            aebl.f63099k = "WALLET_STORAGE_CLEAN_UP";
            aebl.mo34027b(0);
            if (cdny.m134354s()) {
                aebl.mo34009a(aebh.EVERY_DAY);
            } else {
                aebl.f63070a = TimeUnit.HOURS.toSeconds(24);
                aebl.f63071b = TimeUnit.HOURS.toSeconds(1);
            }
            a.mo33984a(aebl.mo33974b());
            return;
        }
        a.mo33986a("WALLET_STORAGE_CLEAN_UP", "com.google.android.gms.wallet.service.WalletGcmTaskService");
    }

    /* renamed from: aZ */
    public final void mo7135aZ() {
        m94097a(this);
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        awpl awpl;
        try {
            if (Log.isLoggable("WalletGcmTaskService", 4)) {
                Log.i("WalletGcmTaskService", String.format(Locale.US, "Running GcmTask w/ tag %s", aecc.f63128a));
            }
            String str = aecc.f63128a;
            if (str.equals("INSTANTBUY_REFRESH_INSTRUMENT_AVAILABILITY")) {
                awpl = new awsu(this);
            } else if (awsy.f95069a.contains(str)) {
                awpl = new awsy(this);
            } else if (!str.equals("WALLET_STORAGE_CLEAN_UP")) {
                Log.w("WalletGcmTaskService", String.format(Locale.US, "No GcmTask corresponding to tag %s", aecc.f63128a));
                awpl = null;
            } else {
                awpl = new awpk(this);
            }
            if (awpl != null) {
                return awpl.mo52449a(aecc);
            }
            return 2;
        } catch (Throwable th) {
            awye.m81493a(this, th);
            return 2;
        }
    }
}
