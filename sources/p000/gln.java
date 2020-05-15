package p000;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: gln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gln implements gim {

    /* renamed from: a */
    public static final gln f18476a = new gln();

    private gln() {
    }

    /* renamed from: a */
    public final void mo11907a(Context context) {
    }

    /* renamed from: b */
    public final void mo11908b(Context context) {
    }

    /* renamed from: c */
    public final void mo11909c(Context context) {
        long j;
        aeat a = aeat.m51532a(context);
        if (rpr.m34216b().getSharedPreferences("auth_cron_chimera_service_storage", 0).getLong("key_failed_attempts", 0) <= gnv.m13572q()) {
            j = gnv.m13571p();
        } else {
            j = gnv.m13570o();
        }
        long j2 = -1 + j;
        int i = !cbxi.f178510a.mo6606a().mo75575c() ? 1 : 2;
        aebl aebl = new aebl();
        aebl.f63097i = "com.google.android.gms.auth.account.be.legacy.AuthCronService";
        aebl.f63070a = j;
        aebl.f63099k = "auth_droidguard_recurring_run";
        aebl.f63071b = j2;
        aebl.mo34027b(i);
        aebl.f63102n = true;
        aebl.mo34024a(0, cdny.m134339d() ? 1 : 0);
        aebl.mo34023a(0);
        a.mo33984a(aebl.mo33974b());
        aeat a2 = aeat.m51532a(context);
        aebl aebl2 = new aebl();
        aebl2.f63097i = "com.google.android.gms.auth.account.be.legacy.AuthCronService";
        aebl2.f63099k = "buffered_logs_update";
        aebl2.mo34009a(aebh.EVERY_7_DAYS);
        aebl2.f63071b = TimeUnit.HOURS.toSeconds(1);
        aebl2.mo34027b(0);
        aebl2.f63102n = true;
        aebl2.mo34024a(0, cdny.m134339d() ? 1 : 0);
        aebl2.mo34023a(1);
        a2.mo33984a(aebl2.mo33974b());
    }
}
