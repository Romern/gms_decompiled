package p000;

import android.content.DialogInterface;
import com.felicanetworks.mfc.C0126R;

/* renamed from: lle */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lle implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String f26295a;

    /* renamed from: b */
    final /* synthetic */ llg f26296b;

    public lle(llg llg, String str) {
        this.f26296b = llg;
        this.f26295a = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f26296b.f26301b.putInt("com.google.android.gms.autofill.ui.controllers.PasswordsManagerPolicymanipulationAction", C0126R.C0129id.password_delete);
        this.f26296b.f26301b.putString("com.google.android.gms.autofill.ui.controllers.PasswordsManagerPolicymanipulationDataEntryId", this.f26295a);
        llg llg = this.f26296b;
        llg.f26302c.mo15230a(true, llg.mo15244e());
    }
}
