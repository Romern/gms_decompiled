package p000;

import android.accounts.Account;
import com.google.android.gms.auth.api.identity.GetDefaultAccountResult;

/* renamed from: hcq */
final /* synthetic */ class hcq implements bmxj {

    /* renamed from: a */
    private final hdf f19474a;

    /* renamed from: b */
    private final String f19475b;

    public hcq(hdf hdf, String str) {
        this.f19474a = hdf;
        this.f19475b = str;
    }

    public final Object apply(Object obj) {
        hdf hdf = this.f19474a;
        String str = this.f19475b;
        Account account = ((GetDefaultAccountResult) obj).f10223a;
        if (account != null && hdf.m14204a(account, str)) {
            hdf.f19506l = account;
        }
        return bmxv.m108566b(adcq.EXTERNAL_ACCOUNT_CHOOSER);
    }
}
