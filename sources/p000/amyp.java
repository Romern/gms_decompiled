package p000;

import android.accounts.Account;
import android.content.ContentResolver;

/* renamed from: amyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amyp {

    /* renamed from: a */
    public final amvt f76396a;

    /* renamed from: b */
    public final amyq f76397b;

    /* renamed from: c */
    public final amym f76398c;

    /* renamed from: d */
    public final amwl f76399d;

    public amyp(amvt amvt, amyq amyq, Account account, ContentResolver contentResolver, amwl amwl) {
        this.f76396a = amvt;
        this.f76397b = amyq;
        this.f76399d = amwl;
        this.f76398c = new amym(amvt, account, contentResolver);
    }
}
