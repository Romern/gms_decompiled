package p000;

import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreContactsChimeraActivity;
import java.lang.ref.WeakReference;

/* renamed from: apcs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apcs implements aubt {

    /* renamed from: a */
    private final WeakReference f84143a;

    public apcs(ContactsRestoreContactsChimeraActivity contactsRestoreContactsChimeraActivity) {
        this.f84143a = new WeakReference(contactsRestoreContactsChimeraActivity);
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        ContactsRestoreContactsChimeraActivity contactsRestoreContactsChimeraActivity = (ContactsRestoreContactsChimeraActivity) this.f84143a.get();
        if (contactsRestoreContactsChimeraActivity != null) {
            Toast.makeText(contactsRestoreContactsChimeraActivity, (int) C0126R.string.common_something_went_wrong, 1).show();
            contactsRestoreContactsChimeraActivity.mo58838e();
            contactsRestoreContactsChimeraActivity.f107250b.mo46996a("error:restore_contacts_activity:no_data");
            contactsRestoreContactsChimeraActivity.f107250b.mo46997a(false);
            if (contactsRestoreContactsChimeraActivity.f107264p) {
                contactsRestoreContactsChimeraActivity.f107255g.mo47008a(false);
            }
        }
    }
}
