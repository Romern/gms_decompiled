package p000;

import android.os.Build;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreContactsChimeraActivity;

/* renamed from: apcp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apcp extends aah {

    /* renamed from: a */
    final /* synthetic */ ContactsRestoreContactsChimeraActivity f84141a;

    public apcp(ContactsRestoreContactsChimeraActivity contactsRestoreContactsChimeraActivity) {
        this.f84141a = contactsRestoreContactsChimeraActivity;
    }

    /* renamed from: c */
    public final void mo34c(acc acc, acj acj) {
        super.mo34c(acc, acj);
        if (this.f84141a.f107251c.mo161a() > (mo84q() - mo83p()) + 1) {
            ContactsRestoreContactsChimeraActivity contactsRestoreContactsChimeraActivity = this.f84141a;
            if (contactsRestoreContactsChimeraActivity.f107262n) {
                int i = Build.VERSION.SDK_INT;
                this.f84141a.f107257i.setVerticalScrollBarEnabled(false);
                this.f84141a.f107256h.setVisibility(0);
            } else {
                contactsRestoreContactsChimeraActivity.f107256h.setVisibility(8);
            }
            ContactsRestoreContactsChimeraActivity contactsRestoreContactsChimeraActivity2 = this.f84141a;
            contactsRestoreContactsChimeraActivity2.f107257i.addOnScrollListener(new apcu(contactsRestoreContactsChimeraActivity2));
            return;
        }
        this.f84141a.f107256h.setVisibility(8);
    }
}
