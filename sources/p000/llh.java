package p000;

import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: llh */
final /* synthetic */ class llh implements View.OnClickListener {

    /* renamed from: a */
    private final llm f26306a;

    /* renamed from: b */
    private final kct f26307b;

    public llh(llm llm, kct kct) {
        this.f26306a = llm;
        this.f26307b = kct;
    }

    public void onClick(View view) {
        llm llm = this.f26306a;
        kct kct = this.f26307b;
        kcs b = kct.mo14369b();
        String valueOf = String.valueOf(b.mo14375b());
        String valueOf2 = String.valueOf(b.mo14374a());
        llm.f26315b.putString("com.google.android.gms.autofill.ui.controllers.PasswordsPickerPolicypickedIdPasswordPicker", valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
        llm.f26315b.putBoolean("com.google.android.gms.autofill.ui.controllers.PasswordsPickerPolicytypeDialogShowing", true);
        if (llm.f26315b.getParcelable("com.google.android.gms.autofill.ui.controllers.PasswordsPickerPolicyselectedFillForm") != null) {
            llm.f26316c.mo15230a(false, llm.f26314a.getResources().getText(C0126R.string.autofill_complete_autofill));
        } else {
            llm.mo15250a(kct);
        }
    }
}
