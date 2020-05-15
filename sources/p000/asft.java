package p000;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: asft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class asft {

    /* renamed from: b */
    static final qws f88859b;

    /* renamed from: c */
    static final qxq f88860c = new qxq(f88859b, "PLATFORM_STATS_COUNTERS", 1024);

    /* renamed from: d */
    static final SharedPreferences f88861d;

    /* renamed from: e */
    public static final int[] f88862e = {0, 1, 2};

    static {
        rpr b = rpr.m34216b();
        f88859b = new qws(b, null, null);
        f88861d = b.getSharedPreferences("EastworldSharedPreference", 0);
    }

    /* renamed from: a */
    public static boolean m74000a(bxvd bxvd, String str, String str2, int i, bxvd bxvd2) {
        boolean z;
        rpr b = rpr.m34216b();
        if (cgtv.m147055b()) {
            rjx a = avtz.m79336a(b, new avty());
            aucb k = a.mo24755k(str2);
            try {
                aucu.m76783a(k, cgtd.f187715a.mo6606a().mo84473b(), TimeUnit.MILLISECONDS);
                if (!k.mo50384b() || k.mo50386d() == null || !((Boolean) k.mo50386d()).booleanValue()) {
                    if (cgtd.m146972d()) {
                        f88860c.mo24383c(str.length() == 0 ? new String("ConsentApiOptedOut") : "ConsentApiOptedOut".concat(str)).mo24359a();
                        f88860c.mo24388e();
                    }
                    return false;
                }
                asfq.m73990a(a, f88859b, f88860c, bxvd, false, new ArrayList(), false, false, str, str2, i, bxvd2);
                return true;
            } catch (ExecutionException | TimeoutException e) {
                if (cgtd.m146972d()) {
                    f88860c.mo24383c("ConsentApiEastworldFailure").mo24359a();
                    f88860c.mo24388e();
                }
                return false;
            } catch (InterruptedException e2) {
                if (cgtd.m146972d()) {
                    f88860c.mo24383c("ConsentApiEastworldFailure").mo24359a();
                    f88860c.mo24388e();
                }
                Thread.currentThread().interrupt();
                return false;
            }
        } else {
            boolean c = ashd.m74124c();
            new aseq();
            List a2 = aseq.m73886a(b);
            if (!a2.isEmpty()) {
                if (!cgsl.m146894b()) {
                    z = true;
                } else if (c) {
                    z = true;
                }
                boolean b2 = cgsu.m146907b();
                asfq.m73990a(null, f88859b, f88860c, bxvd, z, a2, c, b2, str, str2, i, bxvd2);
                return !c || z || b2;
            }
            z = false;
            boolean b22 = cgsu.m146907b();
            asfq.m73990a(null, f88859b, f88860c, bxvd, z, a2, c, b22, str, str2, i, bxvd2);
            if (!c) {
            }
        }
    }

    /* renamed from: a */
    public abstract void mo49140a(int i, boolean z, boolean z2, bxvd bxvd);
}
