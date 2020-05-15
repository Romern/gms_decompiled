package p000;

import android.accounts.Account;

/* renamed from: lij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lij {

    /* renamed from: a */
    public final lif f26155a;

    /* renamed from: b */
    public final String f26156b;

    /* renamed from: c */
    public final lii f26157c;

    /* renamed from: d */
    private final bqgj f26158d;

    public lij(bqgj bqgj, lif lif, String str, lii lii) {
        this.f26158d = bqgj;
        this.f26155a = lif;
        this.f26156b = str;
        this.f26157c = lii;
    }

    /* renamed from: a */
    public final bqgg mo15162a(String str, Account account) {
        return this.f26158d.mo25819b(new lig(this, str, account));
    }

    /* renamed from: a */
    public final bqgg mo15163a(String str, Account account, Object obj) {
        return this.f26158d.mo25819b(new lih(this, str, account, obj));
    }
}
