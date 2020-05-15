package p000;

import android.accounts.Account;

/* renamed from: adxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adxr extends adwc {

    /* renamed from: a */
    final /* synthetic */ adxt f62874a;

    public adxr(adxt adxt) {
        this.f62874a = adxt;
    }

    /* renamed from: a */
    public final bqgg mo33877a(Account account, bbmw bbmw) {
        if (bbmw != null && !bbmw.mo56226a().isEmpty()) {
            this.f62874a.mo33879a(account, adxt.m51339c(account.name), System.currentTimeMillis());
        }
        return bqga.m112775a(bbjq.m88104b(null).mo56173a());
    }
}
