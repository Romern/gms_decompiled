package p000;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.pay.PayIntentArgs;

/* renamed from: alhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class alhs {

    /* renamed from: a */
    private final Intent f73517a;

    /* renamed from: b */
    private final alfq f73518b = new alfq();

    protected alhs(String str) {
        this.f73517a = new Intent(str).setClassName("com.google.android.gms", "com.google.android.gms.pay.main.PayActivity");
    }

    /* renamed from: a */
    public final Intent mo40351a() {
        mo40352a(this.f73518b);
        PayIntentArgs payIntentArgs = this.f73518b.f73507a;
        mo40354a(payIntentArgs);
        sef.m35071a(payIntentArgs, this.f73517a, "args");
        Account account = payIntentArgs.f81552a;
        if (account != null) {
            this.f73517a.putExtra("authAccount", account.name);
        }
        return this.f73517a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo40352a(alfq alfq);

    /* renamed from: a */
    public final void mo40353a(Account account) {
        this.f73518b.f73507a.f81552a = account;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo40354a(PayIntentArgs payIntentArgs);
}
