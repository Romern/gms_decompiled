package p000;

import android.accounts.Account;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;

/* renamed from: hxe */
public final /* synthetic */ class hxe implements roo {

    /* renamed from: a */
    private final SaveAccountLinkingTokenRequest f20517a;

    /* renamed from: b */
    private final String f20518b;

    /* renamed from: c */
    private final Account f20519c;

    /* renamed from: d */
    private final String f20520d;

    public hxe(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, String str, Account account, String str2) {
        this.f20517a = saveAccountLinkingTokenRequest;
        this.f20518b = str;
        this.f20519c = account;
        this.f20520d = str2;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = this.f20517a;
        String str = this.f20518b;
        Account account = this.f20519c;
        String str2 = this.f20520d;
        ((hwi) ((hwt) obj).mo25289B()).mo12585a(new hxf((aucf) obj2), saveAccountLinkingTokenRequest, str, account, str2);
    }
}
