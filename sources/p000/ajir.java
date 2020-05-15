package p000;

import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity;

/* renamed from: ajir */
public final /* synthetic */ class ajir implements aubt {

    /* renamed from: a */
    private final ContactSelectChimeraActivity f70721a;

    public ajir(ContactSelectChimeraActivity contactSelectChimeraActivity) {
        this.f70721a = contactSelectChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        ContactSelectChimeraActivity contactSelectChimeraActivity = this.f70721a;
        if (!cfov.f185185a.mo6606a().mo82265A() || !(exc instanceof rjp) || ((rjp) exc).f43152a.f30115i != 4) {
            Toast.makeText(contactSelectChimeraActivity, contactSelectChimeraActivity.getResources().getString(C0126R.string.sharing_setup_toast_contact_mode_not_available), 1).show();
        } else {
            Toast.makeText(contactSelectChimeraActivity, contactSelectChimeraActivity.getResources().getString(C0126R.string.sharing_setup_toast_contact_mode_no_account), 1).show();
        }
        contactSelectChimeraActivity.f80866j.mo38899a(0);
        contactSelectChimeraActivity.mo44410e();
    }
}
