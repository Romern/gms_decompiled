package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import java.util.concurrent.TimeUnit;

/* renamed from: dqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dqk {
    /* renamed from: a */
    public static void m9089a(PendingIntent pendingIntent, Intent intent, String str) {
        boolean K = cdgp.f180782a.mo6606a().mo77519K();
        dqj dqj = new dqj(K);
        if (K) {
            drv k = dwq.m9667k();
            dqx dqx = dqj.f13819b;
            new Object[1][0] = dqx.f13840a;
            egr D = dwq.m9647D();
            if (D != null) {
                D.mo10106a(dqx);
            }
            dqx.mo9463b();
            drt drt = k.f13906c;
            int i = drt.f13896b;
            drt.mo9507a(D, dqx);
        }
        int i2 = Build.VERSION.SDK_INT;
        String creatorPackage = pendingIntent.getCreatorPackage();
        Object[] objArr = {pendingIntent, creatorPackage, str};
        sse.m36203a(pendingIntent, dwq.m9662f(), intent, dqj, str);
        if (!K) {
            try {
                if (!dqj.f13818a.await(5000, TimeUnit.MILLISECONDS)) {
                    bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                    bnsl.mo68432a("dqk", "a", 66, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68425a("[PendingIntentCompat] Timed out delivering to pendingIntent=%s, package=%s, permission=%s", pendingIntent, creatorPackage, str);
                }
            } catch (InterruptedException e) {
                bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                bnsl2.mo68432a("dqk", "a", 75, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68425a("[PendingIntentCompat] Interrupted while delivering pendingIntent=%s, package=%s, permission=%s", pendingIntent, creatorPackage, str);
            }
        }
    }
}
