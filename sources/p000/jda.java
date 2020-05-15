package p000;

import android.accounts.Account;
import java.util.concurrent.Callable;

/* renamed from: jda */
final /* synthetic */ class jda implements Callable {

    /* renamed from: a */
    private final Account f22206a;

    /* renamed from: b */
    private final String f22207b;

    public jda(Account account, String str) {
        this.f22206a = account;
        this.f22207b = str;
    }

    public final Object call() {
        Account account = this.f22206a;
        String str = this.f22207b;
        jdc.m16536a();
        giu.m13225a(rpr.m34216b()).mo11918a(account, str);
        jdc.f22209a.mo25412b("Successfully received cookies", new Object[0]);
        return null;
    }
}
