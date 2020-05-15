package com.google.android.gms.auth.account.p016be.legacy;

import android.content.Context;
import android.os.SystemClock;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.auth.account.be.legacy.AuthCronChimeraService */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthCronChimeraService extends aeah {

    /* renamed from: a */
    public static final sek f10007a = new sek("GLSService", "[AuthCronService]");

    /* renamed from: b */
    private static final sek f10008b = ght.m13171a("AuthCronChimeraService");

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        String str = aecc.f63128a;
        if ("buffered_logs_update".equals(str)) {
            Context applicationContext = getApplicationContext();
            bjbp a = bjbp.m103161a(getApplicationContext());
            bjbq bjbq = new bjbq(getApplicationContext(), "ANDROID_AUTH");
            String a2 = jyj.m17509a(applicationContext);
            f10008b.mo25412b("Uploading buffered logs to clearcut", new Object[0]);
            bjbq.mo64978a(a2);
            a.mo64977a(a2);
            return 0;
        } else if ("auth_droidguard_recurring_run".equals(str)) {
            try {
                return ((Integer) snp.m35704b(9).mo25819b(new glm(this)).get((long) gnv.m13500J(), TimeUnit.SECONDS)).intValue();
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                return 1;
            }
        } else {
            f10008b.mo25416d("Unknown tag %s", str);
            return 2;
        }
    }

    /* renamed from: aZ */
    public final void mo7135aZ() {
        gln.f18476a.mo11909c(this);
    }

    /* renamed from: a */
    public final void mo7375a(long j, int i) {
        if (((double) new Random().nextFloat()) < gnv.m13499I()) {
            bxvd da = boct.f132600I.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boct boct = (boct) da.f164949b;
            boct.f132612c = 18;
            boct.f132610a |= 1;
            bxvd da2 = bocv.f132637d.mo74144da();
            long elapsedRealtime = SystemClock.elapsedRealtime() - j;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bocv bocv = (bocv) da2.f164949b;
            int i2 = bocv.f132639a | 2;
            bocv.f132639a = i2;
            bocv.f132641c = elapsedRealtime;
            bocv.f132640b = i - 1;
            bocv.f132639a = i2 | 1;
            bocv bocv2 = (bocv) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boct boct2 = (boct) da.f164949b;
            bocv2.getClass();
            boct2.f132629t = bocv2;
            boct2.f132610a |= 1048576;
            new qws(this, "ANDROID_AUTH", null).mo24335a(((boct) da.mo74062i()).mo73642k()).mo24327b();
        }
    }
}
