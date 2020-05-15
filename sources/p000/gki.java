package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.account.p016be.AccountStatusChecker$InitializeIntentOperation;

/* renamed from: gki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gki implements gim {

    /* renamed from: a */
    public static final gki f18394a = new gki();

    private gki() {
    }

    /* renamed from: a */
    public final void mo11907a(Context context) {
    }

    /* renamed from: b */
    public final void mo11908b(Context context) {
    }

    /* renamed from: c */
    public final void mo11909c(Context context) {
        Intent startIntent = IntentOperation.getStartIntent(context, AccountStatusChecker$InitializeIntentOperation.class, "com.google.android.gms.auth.account.be.AccountStatusCheckerInitializeIntent");
        if (startIntent != null) {
            context.startService(startIntent);
        }
    }
}
