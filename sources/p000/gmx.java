package p000;

import android.content.Context;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

/* renamed from: gmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gmx extends gma {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: gma.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      gma.a(java.lang.String, java.lang.String):void
      gma.a(java.lang.String, boolean):void */
    public gmx(Context context) {
        super(context);
        mo12053a("service", "ac2dm");
        mo12054a("has_permission", true);
    }

    /* renamed from: a */
    public final void mo12068a(AccountCredentials accountCredentials) {
        super.mo12056b(accountCredentials);
    }

    /* renamed from: a */
    public final void mo12069a(CaptchaSolution captchaSolution) {
        super.mo12057b(captchaSolution);
    }
}
