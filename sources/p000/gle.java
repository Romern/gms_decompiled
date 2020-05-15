package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: gle */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gle implements gim {

    /* renamed from: a */
    public static final gle f18457a = new gle();

    private gle() {
    }

    /* renamed from: a */
    public final void mo11907a(Context context) {
    }

    /* renamed from: b */
    public final void mo11908b(Context context) {
    }

    /* renamed from: c */
    public final void mo11909c(Context context) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.account.be.accountstate.LoginAccountsChangedIntentService");
        className.setAction("BootOrGmsUpdated");
        asfd.m73947b(context, className);
    }
}
