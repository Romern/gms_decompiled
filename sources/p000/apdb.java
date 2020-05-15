package p000;

import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreDialogChimeraActivity;
import java.util.HashSet;

/* renamed from: apdb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apdb implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ContactsRestoreDialogChimeraActivity f84152a;

    public apdb(ContactsRestoreDialogChimeraActivity contactsRestoreDialogChimeraActivity) {
        this.f84152a = contactsRestoreDialogChimeraActivity;
    }

    public void onClick(View view) {
        ContactsRestoreDialogChimeraActivity contactsRestoreDialogChimeraActivity = this.f84152a;
        if (!apel.m70099a(contactsRestoreDialogChimeraActivity)) {
            contactsRestoreDialogChimeraActivity.f107271d.setEnabled(false);
            contactsRestoreDialogChimeraActivity.f107272e.mo64020c();
            return;
        }
        if (contactsRestoreDialogChimeraActivity.f107272e.mo64022e()) {
            contactsRestoreDialogChimeraActivity.f107272e.mo64021d();
        }
        HashSet hashSet = new HashSet();
        if (!aoyn.m69849a("android.permission.READ_CONTACTS")) {
            hashSet.add("android.permission.READ_CONTACTS");
        }
        if (!aoyn.m69849a("android.permission.WRITE_CONTACTS")) {
            hashSet.add("android.permission.WRITE_CONTACTS");
        }
        if (hashSet.isEmpty()) {
            contactsRestoreDialogChimeraActivity.mo58841g();
            return;
        }
        aoyj.m69819a().mo46988a(11);
        if (cgkf.f187143a.mo6606a().mo83974i()) {
            C1133kh.m17842a(contactsRestoreDialogChimeraActivity.getContainerActivity(), (String[]) hashSet.toArray(new String[0]), 0);
        } else {
            bhnh.m101201a(contactsRestoreDialogChimeraActivity.findViewById(16908290), (int) C0126R.string.common_something_went_wrong, 0).mo64020c();
        }
    }
}
