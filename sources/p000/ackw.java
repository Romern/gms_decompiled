package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: ackw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ackw {

    /* renamed from: a */
    private static final bygz f60052a;

    static {
        bxvd da = bygz.f166410c.mo74144da();
        bxvd da2 = byhn.f166478e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byhn byhn = (byhn) da2.f164949b;
        int i = byhn.f166480a | 1;
        byhn.f166480a = i;
        byhn.f166481b = 553;
        byhn.f166480a = i | 2;
        byhn.f166482c = 158511070;
        byhm byhm = byhm.SYNC_LATEST_PER_SECONDARY_ID;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byhn byhn2 = (byhn) da2.f164949b;
        byhn2.f166483d = byhm.f166477e;
        byhn2.f166480a |= 4;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bygz bygz = (bygz) da.f164949b;
        byhn byhn3 = (byhn) da2.mo74062i();
        byhn3.getClass();
        bygz.f166413b = byhn3;
        bygz.f166412a = 2;
        f60052a = (bygz) da.mo74062i();
    }

    /* renamed from: a */
    public static void m49352a() {
        if (acwx.m49915a()) {
            acbt a = acbt.m48836a();
            try {
                baok baok = (baok) a.f59533h.mo6445a();
                baqf baqf = (baqf) a.f59537l.mo6445a();
                adyd a2 = adyd.m51363a((Context) a.f59480a.mo6445a());
                achs.f59877g.mo25414c("Received privacy bit update request", new Object[0]);
                Account[] b = a2.mo33922b();
                for (Account account : b) {
                    try {
                        if (baok.mo55832b("com.google.android.gms", account, f60052a) != null) {
                            baqf.mo55873a(f60052a, account, true, true);
                        }
                    } catch (banv | baoh e) {
                        achs.f59877g.mo25418e("Failed to notify about privacy bit update", new Object[0]);
                    }
                }
            } catch (RuntimeException e2) {
                acbq.m48833a().mo32707a("Failed to notify sync", e2);
            }
        }
    }
}
