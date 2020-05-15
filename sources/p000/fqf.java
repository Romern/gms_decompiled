package p000;

import android.os.Message;
import com.google.android.gms.app.settings.OpenSourceLicensesChimeraActivity;

/* renamed from: fqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fqf extends adzt {

    /* renamed from: a */
    final /* synthetic */ OpenSourceLicensesChimeraActivity f17125a;

    public fqf(OpenSourceLicensesChimeraActivity openSourceLicensesChimeraActivity) {
        this.f17125a = openSourceLicensesChimeraActivity;
    }

    public final void handleMessage(Message message) {
        CharSequence charSequence = message.getData().getCharSequence("license");
        OpenSourceLicensesChimeraActivity openSourceLicensesChimeraActivity = this.f17125a;
        bngx bngx = OpenSourceLicensesChimeraActivity.f9510b;
        openSourceLicensesChimeraActivity.f9513e.setText(charSequence);
    }
}
