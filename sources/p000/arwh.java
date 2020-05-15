package p000;

import android.accounts.Account;

/* renamed from: arwh */
final /* synthetic */ class arwh implements aie {

    /* renamed from: a */
    private final arwj f88355a;

    /* renamed from: b */
    private final Account f88356b;

    /* renamed from: c */
    private final String f88357c;

    public arwh(arwj arwj, Account account, String str) {
        this.f88355a = arwj;
        this.f88356b = account;
        this.f88357c = str;
    }

    /* renamed from: a */
    public final Object mo753a(aic aic) {
        arwj arwj = this.f88355a;
        Account account = this.f88356b;
        String str = this.f88357c;
        arwj.f88359a.mo33906a(account, new String[]{str}, new arwi(aic));
        return "AccountManager.hasFeatures";
    }
}
