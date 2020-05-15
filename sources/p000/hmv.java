package p000;

import android.accounts.Account;
import android.content.Context;
import android.util.Patterns;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.HintRequest;

/* renamed from: hmv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hmv implements hkz {

    /* renamed from: a */
    private final adyd f20046a;

    public hmv(Context context) {
        this.f20046a = adyd.m51363a(context);
    }

    /* renamed from: a */
    public final bqgg mo12600a(acyr acyr, HintRequest hintRequest) {
        Credential credential;
        boolean contains = bnpf.m110050a(hintRequest.f10117e).contains("https://accounts.google.com");
        boolean z = hintRequest.f10115c;
        if (!z && !contains) {
            return bqga.m112775a((Object) bngx.m109376e());
        }
        bngs j = bngx.m109377j();
        Account[] b = this.f20046a.mo33922b();
        for (Account account : b) {
            if (!contains || !"com.google".equals(account.type)) {
                if (z && Patterns.EMAIL_ADDRESS.matcher(account.name).matches()) {
                    credential = new gvl(account.name).mo12267a();
                }
            } else {
                gvl gvl = new gvl(account.name);
                gvl.f19081e = "https://accounts.google.com";
                credential = gvl.mo12267a();
            }
            j.mo67668c(credential);
        }
        return bqga.m112775a((Object) j.mo67664a());
    }
}
