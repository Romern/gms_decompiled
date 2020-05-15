package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: ajvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajvw {

    /* renamed from: a */
    public final Context f71386a;

    public ajvw(Context context) {
        this.f71386a = context;
    }

    /* renamed from: a */
    public static aucb m59116a(bdtq bdtq) {
        return ahhf.m55772a(bdtq.mo58361b(), cfov.m142058k()).mo50382b(new ajvv(bdtq));
    }

    /* renamed from: a */
    public static bdtq m59117a(Context context, Account account) {
        return ajvy.m59121a(context).mo58362b(account);
    }

    /* renamed from: a */
    public final aucb mo38980a(Account account) {
        return m59116a(m59117a(this.f71386a, account));
    }
}
