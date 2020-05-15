package p000;

import android.content.DialogInterface;
import com.google.android.gms.auth.api.phone.p024ui.UserConsentPromptChimeraActivity;

/* renamed from: iau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iau implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ String f20653a;

    /* renamed from: b */
    final /* synthetic */ String f20654b;

    /* renamed from: c */
    final /* synthetic */ UserConsentPromptChimeraActivity f20655c;

    public iau(UserConsentPromptChimeraActivity userConsentPromptChimeraActivity, String str, String str2) {
        this.f20655c = userConsentPromptChimeraActivity;
        this.f20653a = str;
        this.f20654b = str2;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        UserConsentPromptChimeraActivity userConsentPromptChimeraActivity = this.f20655c;
        userConsentPromptChimeraActivity.f10292e = 2;
        userConsentPromptChimeraActivity.mo7516a(this.f20653a, this.f20654b);
    }
}
