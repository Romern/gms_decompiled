package p000;

import android.accounts.Account;

/* renamed from: adxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adxj extends adwc {

    /* renamed from: a */
    final /* synthetic */ boolean f62864a;

    /* renamed from: b */
    final /* synthetic */ adxl f62865b;

    public adxj(adxl adxl, boolean z) {
        this.f62865b = adxl;
        this.f62864a = z;
    }

    /* renamed from: a */
    public final bqgg mo33877a(Account account, bbmw bbmw) {
        boolean z = false;
        if (bbmw != null && !bbmw.mo56226a().isEmpty()) {
            z = true;
        }
        if (!this.f62864a && !z) {
            return bqga.m112775a(bbjq.m88103a());
        }
        adxt.m51334a();
        return bqga.m112775a(adxl.m51315a(account, adxt.m51346f(account.name)));
    }
}
