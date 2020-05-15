package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity;
import java.lang.ref.WeakReference;

/* renamed from: apef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apef implements aubt {

    /* renamed from: a */
    private final WeakReference f84206a;

    public apef(ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity) {
        this.f84206a = new WeakReference(contactsRestoreSettingsChimeraActivity);
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity = (ContactsRestoreSettingsChimeraActivity) this.f84206a.get();
        if (contactsRestoreSettingsChimeraActivity != null) {
            if (!cgkf.m145856c()) {
                contactsRestoreSettingsChimeraActivity.mo58842a((int) C0126R.string.common_something_went_wrong);
            }
            aoyj.m69819a().mo46988a(10);
            if (!cgkf.m145856c()) {
                contactsRestoreSettingsChimeraActivity.mo58848a(false);
            }
        }
    }
}
