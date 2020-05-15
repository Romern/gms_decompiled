package p000;

import android.content.Context;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;

/* renamed from: gmy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gmy extends gma {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: gma.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      gma.a(java.lang.String, java.lang.String):void
      gma.a(java.lang.String, boolean):void */
    public gmy(Context context) {
        super(context);
        mo12053a("service", "ac2dm");
        mo12054a("has_permission", true);
        mo12054a("get_accountid", true);
    }

    /* renamed from: a */
    public final void mo12070a(AccountCredentials accountCredentials) {
        super.mo12056b(accountCredentials);
    }

    /* renamed from: b */
    public final void mo12072b(String str) {
        super.mo12062g(str);
    }

    /* renamed from: c */
    public final void mo12073c(String str) {
        super.mo12061f(str);
    }

    /* renamed from: a */
    public final void mo12071a(String str) {
        super.mo12060e(str);
    }
}
