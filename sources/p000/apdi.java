package p000;

import com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity;
import java.util.concurrent.Callable;

/* renamed from: apdi */
public final /* synthetic */ class apdi implements Callable {

    /* renamed from: a */
    private final ContactsRestoreSettingsChimeraActivity f84168a;

    /* renamed from: b */
    private final String f84169b;

    public apdi(ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity, String str) {
        this.f84168a = contactsRestoreSettingsChimeraActivity;
        this.f84169b = str;
    }

    public final Object call() {
        ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity = this.f84168a;
        if (aper.m70108a(contactsRestoreSettingsChimeraActivity.getApplicationContext(), this.f84169b, true)) {
            return true;
        }
        contactsRestoreSettingsChimeraActivity.f107294f.mo46985d("Restore from settings shared preference cannot be committed");
        throw new IllegalStateException("Preference could not be committed");
    }
}
