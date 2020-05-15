package p000;

import android.accounts.Account;

/* renamed from: hpu */
public final /* synthetic */ class hpu implements bqeh {

    /* renamed from: a */
    private final Account f20198a;

    /* renamed from: b */
    private final String f20199b;

    /* renamed from: c */
    private final boolean f20200c;

    /* renamed from: d */
    private final hik f20201d;

    public hpu(hik hik, Account account, String str, boolean z) {
        this.f20201d = hik;
        this.f20198a = account;
        this.f20199b = str;
        this.f20200c = z;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bqgg bqgg;
        hik hik = this.f20201d;
        Account account = this.f20198a;
        String str = this.f20199b;
        boolean z = this.f20200c;
        hez hez = (hez) obj;
        hln a = hln.m14581a(hik.f19829a);
        adbj adbj = adbj.AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_SET_NEVER_SAVE_APP;
        acyr a2 = heb.m14255a(account);
        if (!z) {
            bqgg = bqdx.m112673a(a.f19985a.mo12618b(a2, hmt.m14619a(str)), new hli(), bqfb.INSTANCE);
        } else {
            bqgg = bqdx.m112673a(a.f19985a.mo12615a(a2, hmt.m14619a(str)), new hlh(), bqfb.INSTANCE);
        }
        hez.mo12448a(adbj, bqgg);
        return bqgg;
    }
}
