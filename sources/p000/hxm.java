package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: hxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hxm extends rjx implements hvd {

    /* renamed from: a */
    private static final rjo f20527a = new rjo("Auth.Api.Identity.Internal.API", f20529c, f20528b);

    /* renamed from: b */
    private static final rje f20528b = new rje();

    /* renamed from: c */
    private static final rjl f20529c = new hxg();

    public hxm(Context context, hvc hvc) {
        super(context, f20527a, hvc, rjw.f43159a);
    }

    /* renamed from: a */
    public final void mo12754a(String str, Account account, String str2) {
        sdo.m34977c(str);
        sdo.m34959a(account);
        sdo.m34959a((Object) str2);
        roz b = rpa.m34196b();
        b.f43472a = new hwx(str2, str, account);
        mo24701a(b.mo24977a());
    }

    /* renamed from: b */
    public final void mo12755b(String str, Account account, String str2) {
        sdo.m34977c(str);
        sdo.m34959a(account);
        sdo.m34959a((Object) str2);
        roz b = rpa.m34196b();
        b.f43472a = new hwy(str2, str, account);
        mo24701a(b.mo24977a());
    }
}
