package com.google.android.gms.auth.account.p016be;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;

/* renamed from: com.google.android.gms.auth.account.be.RemoveAccountChimeraIntentService */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RemoveAccountChimeraIntentService extends TracingIntentService {

    /* renamed from: a */
    private static final sek f9978a = ght.m13171a("RemoveAccountChimeraIntentService");

    public RemoveAccountChimeraIntentService() {
        super("RemoveAccountIntentService");
    }

    /* renamed from: a */
    public static Intent m6276a(Context context, Account account) {
        Intent intent = new Intent();
        bmxy.m108581a(context);
        Intent putExtra = intent.setClassName(context, "com.google.android.gms.auth.account.be.RemoveAccountIntentService").putExtra("account", account);
        String valueOf = String.valueOf(account.name);
        return putExtra.setData(Uri.parse(valueOf.length() == 0 ? new String("intent://com.google.android.gms.auth.account.be.RemoveAccountChimeraIntentService?accountName=") : "intent://com.google.android.gms.auth.account.be.RemoveAccountChimeraIntentService?accountName=".concat(valueOf)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6499a(Intent intent) {
        Account account = (Account) intent.getParcelableExtra("account");
        if (account == null) {
            f9978a.mo25420f("account was not provided.", new Object[0]);
            return;
        }
        goa goa = (goa) goa.f18759a.mo13145b();
        goa.mo12092a();
        int i = Build.VERSION.SDK_INT;
        goa.f18760b.mo33925d(account);
    }
}
