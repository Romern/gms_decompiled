package p000;

import android.accounts.Account;

/* renamed from: acgr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class acgr implements acjj {

    /* renamed from: a */
    public final Account f59808a;

    /* renamed from: b */
    final int f59809b;

    /* renamed from: c */
    final int f59810c;

    /* renamed from: d */
    final byhm f59811d;

    public acgr(Account account, int i, int i2, byhm byhm) {
        this.f59808a = account;
        this.f59809b = i;
        this.f59810c = i2;
        this.f59811d = byhm;
    }

    /* renamed from: a */
    public final bygz mo32663a() {
        return bafi.m86741a(this.f59809b, this.f59810c, this.f59811d);
    }

    /* renamed from: c */
    public final Account mo32666c() {
        return this.f59808a;
    }

    /* renamed from: d */
    public final boolean mo32667d() {
        return true;
    }
}
