package p000;

import com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity;

/* renamed from: apdm */
public final /* synthetic */ class apdm implements aubt {

    /* renamed from: a */
    private final ContactsRestoreSettingsChimeraActivity f84177a;

    public apdm(ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity) {
        this.f84177a = contactsRestoreSettingsChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity = this.f84177a;
        contactsRestoreSettingsChimeraActivity.f107294f.mo46980a(exc, "Getting contact counts failed");
        aoyj.m69819a().mo47002c(4);
        contactsRestoreSettingsChimeraActivity.mo58848a(false);
        contactsRestoreSettingsChimeraActivity.mo58853j();
        contactsRestoreSettingsChimeraActivity.mo58852i();
    }
}
