package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: avgb */
final /* synthetic */ class avgb implements bmxj {

    /* renamed from: a */
    private final Context f93118a;

    public avgb(Context context) {
        this.f93118a = context;
    }

    public final Object apply(Object obj) {
        return new avfh(new avcd(this.f93118a, (Account) obj));
    }
}
