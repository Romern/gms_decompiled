package p000;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.OperationCanceledException;
import android.os.Bundle;
import com.google.android.chimera.Activity;

/* renamed from: wbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wbb implements AccountManagerCallback {

    /* renamed from: a */
    private final bqgy f50375a;

    /* renamed from: b */
    private final Activity f50376b;

    public wbb(bqgy bqgy, Activity activity) {
        this.f50375a = bqgy;
        this.f50376b = activity;
    }

    /* renamed from: a */
    public final void mo29010a(AccountManagerFuture accountManagerFuture) {
        bmxy.m108588a(accountManagerFuture.isDone());
        try {
            Bundle bundle = (Bundle) accountManagerFuture.getResult();
            String string = bundle.getString("authAccount");
            bmxy.m108581a(string);
            String string2 = bundle.getString("accountType");
            bmxy.m108588a("com.google".equals(string2));
            bqgy bqgy = this.f50375a;
            wdb d = wdc.m41786d();
            d.mo29044a(2);
            d.f50529a = new Account(string, string2);
            bqgy.mo69138b(d.mo29043a());
        } catch (OperationCanceledException e) {
            Activity activity = this.f50376b;
            activity.startActivity(activity.getIntent());
        }
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        try {
            mo29010a(accountManagerFuture);
        } catch (Exception e) {
            this.f50375a.mo69136a((Throwable) e);
        }
    }
}
