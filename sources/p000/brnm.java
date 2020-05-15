package p000;

import android.content.Context;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.api.aidlrequests.VerifyBeforeUpdateEmailAidlRequest;

/* renamed from: brnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brnm extends brmj {

    /* renamed from: g */
    private final VerifyBeforeUpdateEmailAidlRequest f143022g;

    public brnm(String str, String str2, brps brps, VerifyBeforeUpdateEmailAidlRequest verifyBeforeUpdateEmailAidlRequest, brpp brpp) {
        super(str, str2, brps, brpp, "VerifyBeforeUpdateEmail");
        this.f143022g = verifyBeforeUpdateEmailAidlRequest;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69748a(Context context, brph brph) {
        VerifyBeforeUpdateEmailAidlRequest verifyBeforeUpdateEmailAidlRequest = this.f143022g;
        ActionCodeSettings actionCodeSettings = verifyBeforeUpdateEmailAidlRequest.f152486c;
        String str = verifyBeforeUpdateEmailAidlRequest.f152484a;
        String str2 = verifyBeforeUpdateEmailAidlRequest.f152485b;
        sdo.m34977c(str);
        sdo.m34977c(str2);
        sdo.m34959a(actionCodeSettings);
        brph.mo69754a(new brqo(bsmm.VERIFY_AND_CHANGE_EMAIL, actionCodeSettings, str2, str), this.f142967a);
    }
}
