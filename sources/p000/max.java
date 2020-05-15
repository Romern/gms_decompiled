package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: max */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class max {
    /* renamed from: a */
    public static aucb m24779a(Context context, bsqv bsqv, Account account) {
        aucb aucb;
        if (account != null) {
            aucf aucf = new aucf();
            new maw(context, account, aucf).start();
            aucb = aucf.f91388a;
        } else {
            aucb = aucu.m76778a((Object) null);
        }
        return aucb.mo50382b(new mav(bsqv, account, context));
    }
}
