package p000;

import android.accounts.Account;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: hpa */
final /* synthetic */ class hpa implements Callable {

    /* renamed from: a */
    private final hph f20150a;

    /* renamed from: b */
    private final Account f20151b;

    /* renamed from: c */
    private final int f20152c;

    public hpa(hph hph, Account account, int i) {
        this.f20150a = hph;
        this.f20151b = account;
        this.f20152c = i;
    }

    public final Object call() {
        hph hph = this.f20150a;
        Account account = this.f20151b;
        int i = this.f20152c;
        ixl ixl = hph.f20160a;
        adag a = adag.m50068a(account, bngx.m109356a(GoogleSignInOptions.f10329c));
        a.mo33283a(5);
        a.mo33287a(hph.f20162c, i);
        TokenResponse a2 = ixl.mo13425a(a.mo33282a());
        if (!izj.SUCCESS.equals(a2.mo7647b())) {
            return (izj.NEED_REMOTE_CONSENT.equals(a2.mo7647b()) || izj.NEED_PERMISSION.equals(a2.mo7647b())) ? bmxv.m108566b(new hpg(account, bngx.m109376e())) : bmvz.f131120a;
        }
        TokenData tokenData = a2.f10746w;
        sdo.m34959a(tokenData);
        List list = tokenData.f9948f;
        sdo.m34959a(list);
        return bmxv.m108566b(new hpg(account, bnfi.m109235a(list).mo67501a(hpb.f20153a).mo67502a(hpc.f20154a).mo67505b()));
    }
}
