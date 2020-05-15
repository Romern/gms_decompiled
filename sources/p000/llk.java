package p000;

import android.content.DialogInterface;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import java.util.Collection;

/* renamed from: llk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class llk implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ kct f26310a;

    /* renamed from: b */
    final /* synthetic */ llm f26311b;

    public llk(llm llm, kct kct) {
        this.f26311b = llm;
        this.f26310a = kct;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f26311b.f26315b.putBoolean("com.google.android.gms.autofill.ui.controllers.PasswordsPickerPolicytypeDialogShowing", false);
        int i2 = this.f26311b.f26315b.getInt("com.google.android.gms.autofill.ui.controllers.PasswordsPickerPolicycheckedItemPlusOne", -1);
        this.f26311b.f26315b.remove("com.google.android.gms.autofill.ui.controllers.PasswordsPickerPolicycheckedItemPlusOne");
        kpb kpb = kpb.USERNAME;
        if (i2 == 1) {
            kpb = kpb.PASSWORD;
        }
        kcs b = this.f26310a.mo14369b();
        String valueOf = String.valueOf(b.mo14375b());
        String valueOf2 = String.valueOf(b.mo14374a());
        this.f26311b.f26315b.putString("com.google.android.gms.autofill.ui.controllers.PasswordsPickerPolicypickedIdPasswordPicker", valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
        llm llm = this.f26311b;
        Bundle bundle = llm.f26315b;
        bngx bngx = llm.f26317d.f11641a;
        bngs j = bngx.m109377j();
        if (!bngx.isEmpty()) {
            FillField fillField = (FillField) llm.f26317d.f11641a.get(0);
            kqg a = FillField.m7129a();
            a.mo14801a(fillField.f11631a);
            a.f24794a = fillField.f11632b;
            a.mo14803a((Collection) fillField.f11633c);
            a.mo14804a(kpb);
            j.mo67668c(a.mo14800a());
        } else {
            llm.mo6481a((Throwable) new IllegalStateException("No fields present"));
        }
        bundle.putParcelable("com.google.android.gms.autofill.ui.controllers.PasswordsPickerPolicyselectedFillForm", new FillForm(j.mo67664a(), llm.f26317d.f11643c));
        llm llm2 = this.f26311b;
        llm2.f26316c.mo15230a(false, llm2.f26314a.getResources().getText(C0126R.string.autofill_complete_autofill));
    }
}
