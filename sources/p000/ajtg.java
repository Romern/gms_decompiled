package p000;

import android.accounts.Account;
import com.google.android.gms.nearby.sharing.internal.SetAccountParams;

/* renamed from: ajtg */
final /* synthetic */ class ajtg implements roo {

    /* renamed from: a */
    private final Account f71267a;

    public ajtg(Account account) {
        this.f71267a = account;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        Account account = this.f71267a;
        int i = ajty.f71279a;
        akat akat = new akat();
        akat.f71543a.f81122a = account;
        rnt a = ajty.m59007a((aucf) obj2);
        SetAccountParams setAccountParams = akat.f71543a;
        setAccountParams.f81123b = a;
        ((ajyq) ((akbf) obj).mo25289B()).mo38653a(setAccountParams);
    }
}
