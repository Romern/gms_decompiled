package p000;

import android.accounts.Account;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Callable;

/* renamed from: hbg */
final /* synthetic */ class hbg implements Callable {

    /* renamed from: a */
    private final hbj f19407a;

    /* renamed from: b */
    private final Account f19408b;

    public hbg(hbj hbj, Account account) {
        this.f19407a = hbj;
        this.f19408b = account;
    }

    public final Object call() {
        String str;
        String str2;
        hbj hbj = this.f19407a;
        Account account = this.f19408b;
        AuthorizationRequest authorizationRequest = hbj.f19413c;
        if (authorizationRequest.f10201c) {
            adag a = adag.m50070a(account, authorizationRequest.f10200b, authorizationRequest.f10199a);
            a.mo33283a(5);
            a.mo33288a(hbj.f19416f.contains(new Scope("email")));
            a.mo33290b(hbj.f19416f.contains(new Scope("profile")));
            a.mo33286a("auto");
            a.mo33287a(hbj.f19412b, hbj.f19414d);
            TokenResponse a2 = hbj.f19415e.mo13425a(a.mo33282a());
            if (a2 != null) {
                TokenData tokenData = a2.f10746w;
                if (a2.mo7647b() != izj.SUCCESS || tokenData == null) {
                    return bmvz.f131120a;
                }
                str = tokenData.f9944b;
            } else {
                throw new rjp(Status.f30109c);
            }
        } else {
            str = null;
        }
        ixl ixl = hbj.f19415e;
        adag a3 = adag.m50068a(account, hbj.f19416f);
        a3.mo33283a(5);
        a3.mo33287a(hbj.f19412b, hbj.f19414d);
        TokenResponse a4 = ixl.mo13425a(a3.mo33282a());
        if (a4 != null) {
            TokenData tokenData2 = a4.f10746w;
            if (a4.mo7647b() != izj.SUCCESS || tokenData2 == null) {
                return bmvz.f131120a;
            }
            String str3 = tokenData2.f9944b;
            bngx b = !tokenData2.f9947e ? bnfi.m109235a(hbj.f19416f).mo67501a(hbi.f19410a).mo67505b() : tokenData2.f9948f;
            if (b != null) {
                AuthorizationRequest authorizationRequest2 = hbj.f19413c;
                if (authorizationRequest2.f10202d) {
                    ixl ixl2 = hbj.f19415e;
                    Account account2 = authorizationRequest2.f10203e;
                    boolean z = false;
                    if (account2 != null && account.equals(account2)) {
                        z = true;
                    }
                    adag a5 = adag.m50069a(account, hbj.f19413c.f10200b);
                    a5.mo33283a(5);
                    a5.mo33287a(hbj.f19412b, hbj.f19414d);
                    if (!z) {
                        a5.mo33288a(hbj.f19416f.contains(new Scope("email")));
                        a5.mo33290b(hbj.f19416f.contains(new Scope("profile")));
                    }
                    TokenResponse a6 = ixl2.mo13425a(a5.mo33282a());
                    if (a6 != null) {
                        TokenData tokenData3 = a6.f10746w;
                        if (a6.mo7647b() != izj.SUCCESS || tokenData3 == null) {
                            return bmvz.f131120a;
                        }
                        str2 = tokenData3.f9944b;
                    } else {
                        throw new rjp(Status.f30109c);
                    }
                } else {
                    str2 = null;
                }
                if (hbj.f19413c.f10203e != null) {
                    soz.m35788a(hbj.f19411a, hbj.f19412b, account);
                }
                return bmxv.m108566b(new AuthorizationResult(str, str3, str2, b, hea.m14254a(hbj.f19411a, hbj.f19412b, account, hbj.f19416f, str2, str), null));
            }
            throw new rjp(Status.f30109c);
        }
        throw new rjp(Status.f30109c);
    }
}
