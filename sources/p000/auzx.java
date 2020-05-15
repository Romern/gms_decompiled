package p000;

import android.accounts.Account;

/* renamed from: auzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auzx {

    /* renamed from: a */
    public Account f92843a = null;

    /* renamed from: a */
    public final auzy mo51097a() {
        sdo.m34966a(this.f92843a, "Must provide a valid account!");
        return new auzy(this.f92843a);
    }

    /* renamed from: a */
    public final void mo51098a(String str) {
        this.f92843a = new Account(str, "com.google");
    }
}
