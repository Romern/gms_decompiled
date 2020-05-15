package p000;

import android.content.Context;
import com.google.firebase.auth.ActionCodeSettings;

/* renamed from: brna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brna extends brmj {

    /* renamed from: g */
    final String f143002g;

    /* renamed from: h */
    private final String f143003h;

    /* renamed from: i */
    private final ActionCodeSettings f143004i;

    public brna(String str, String str2, brps brps, String str3, ActionCodeSettings actionCodeSettings, String str4, brpp brpp) {
        super(str, str2, brps, brpp, "SendGetOobConfirmationCodeEmail");
        this.f143003h = str3;
        this.f143004i = actionCodeSettings;
        this.f143002g = str4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69748a(Context context, brph brph) {
        brqo brqo;
        String str = this.f143003h;
        ActionCodeSettings actionCodeSettings = this.f143004i;
        String str2 = this.f143002g;
        brpj brpj = this.f142967a;
        sdo.m34977c(str);
        sdo.m34959a(brpj);
        bsmm a = bsmm.m115978a(actionCodeSettings.f152387i);
        if (a != null) {
            brqo = new brqo(a);
        } else {
            brqo = new brqo(bsmm.OOB_REQ_TYPE_UNSPECIFIED);
        }
        sdo.m34977c(str);
        brqo.f143191a = str;
        brqo.mo69797a(actionCodeSettings);
        brqo.f143194d = str2;
        brph.f143125b.mo69782a(brqo, new brny(brpj));
    }
}
