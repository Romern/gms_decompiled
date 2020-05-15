package p000;

import android.accounts.Account;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: hcv */
final /* synthetic */ class hcv implements Callable {

    /* renamed from: a */
    private final hdf f19480a;

    /* renamed from: b */
    private final int f19481b;

    public hcv(hdf hdf, int i) {
        this.f19480a = hdf;
        this.f19481b = i;
    }

    public final Object call() {
        TokenRequest tokenRequest;
        hdf hdf = this.f19480a;
        int i = this.f19481b;
        boolean z = true;
        if (i == 1) {
            adag a = adag.m50070a(hdf.f19506l, hdf.f19496b.f10200b, hdf.mo12403a());
            a.mo33283a(5);
            a.mo33288a(hdf.mo12403a().contains(new Scope("email")));
            a.mo33290b(hdf.mo12403a().contains(new Scope("profile")));
            a.mo33286a("auto");
            a.mo33287a(hdf.f19497c, hdf.f19508n);
            tokenRequest = a.mo33282a();
        } else if (i != 2) {
            Account account = hdf.f19496b.f10203e;
            if (account == null || !hdf.f19506l.equals(account)) {
                z = false;
            }
            adag a2 = adag.m50069a(hdf.f19506l, hdf.f19496b.f10200b);
            a2.mo33283a(5);
            a2.mo33287a(hdf.f19497c, hdf.f19508n);
            if (!z) {
                a2.mo33288a(hdf.mo12403a().contains(new Scope("email")));
                a2.mo33290b(hdf.mo12403a().contains(new Scope("profile")));
            }
            tokenRequest = a2.mo33282a();
        } else {
            adag a3 = adag.m50068a(hdf.f19506l, hdf.mo12403a());
            a3.mo33283a(5);
            a3.mo33287a(hdf.f19497c, hdf.f19508n);
            tokenRequest = a3.mo33282a();
        }
        hdf.f19511q = tokenRequest;
        hdf.f19512r = hdf.f19510p.mo13425a(hdf.f19511q);
        TokenResponse tokenResponse = hdf.f19512r;
        if (tokenResponse != null) {
            izj izj = izj.CLIENT_LOGIN_DISABLED;
            int ordinal = tokenResponse.mo7647b().ordinal();
            if (ordinal == 3) {
                TokenData tokenData = hdf.f19512r.f10746w;
                if (tokenData != null) {
                    List list = tokenData.f9948f;
                    if (list != null) {
                        hdf.f19509o = stc.m36281a(list);
                    }
                    hdf.mo12404a(i, tokenData.f9944b);
                    return bmxv.m108566b(adcq.AUTH_ACCOUNT);
                }
                throw new rjp(Status.f30109c);
            } else if (ordinal == 20) {
                return bmxv.m108566b(adcq.EXTERNAL_CONSENT_SHOW_NATIVE_ACTIVITY);
            } else {
                if (ordinal == 21) {
                    return bmxv.m108566b(adcq.CONSENT_GET_COOKIES);
                }
                throw new rjp(Status.f30109c);
            }
        } else {
            throw new rjp(Status.f30109c);
        }
    }
}
