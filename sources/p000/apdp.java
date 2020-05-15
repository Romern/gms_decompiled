package p000;

import com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity;

/* renamed from: apdp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apdp implements arp {

    /* renamed from: a */
    final ContactsRestoreSettingsChimeraActivity f84182a;

    public apdp(ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity) {
        this.f84182a = contactsRestoreSettingsChimeraActivity;
    }

    /* renamed from: a */
    public final void mo2355a() {
        ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity = this.f84182a;
        if (!contactsRestoreSettingsChimeraActivity.f107293e) {
            contactsRestoreSettingsChimeraActivity.mo58848a(false);
        } else if (apel.m70099a(contactsRestoreSettingsChimeraActivity)) {
            if (this.f84182a.f107292d.mo64022e()) {
                this.f84182a.mo58851h();
            }
            this.f84182a.mo58849e();
        } else {
            this.f84182a.mo58850g();
            this.f84182a.mo58848a(false);
        }
    }
}
