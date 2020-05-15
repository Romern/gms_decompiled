package p000;

import android.content.Context;
import com.google.firebase.auth.ActionCodeSettings;

/* renamed from: brmz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brmz extends brmj {

    /* renamed from: g */
    private final String f143000g;

    /* renamed from: h */
    private final ActionCodeSettings f143001h;

    public brmz(String str, String str2, brps brps, String str3, ActionCodeSettings actionCodeSettings, brpp brpp) {
        super(str, str2, brps, brpp, "SendEmailVerification");
        this.f143000g = str3;
        this.f143001h = actionCodeSettings;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69748a(Context context, brph brph) {
        String str = this.f143000g;
        ActionCodeSettings actionCodeSettings = this.f143001h;
        brpj brpj = this.f142967a;
        sdo.m34977c(str);
        sdo.m34959a(brpj);
        brqo brqo = new brqo(bsmm.VERIFY_EMAIL);
        sdo.m34977c(str);
        brqo.f143192b = str;
        if (actionCodeSettings != null) {
            brqo.mo69797a(actionCodeSettings);
        }
        brph.mo69754a(brqo, brpj);
    }
}
