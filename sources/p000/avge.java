package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: avge */
final /* synthetic */ class avge implements bmxj {

    /* renamed from: a */
    private final Context f93121a;

    public avge(Context context) {
        this.f93121a = context;
    }

    public final Object apply(Object obj) {
        return new avfh(new avcd(this.f93121a, (Account) obj));
    }
}
