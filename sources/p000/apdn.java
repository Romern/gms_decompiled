package p000;

import android.content.Context;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity;
import java.util.concurrent.Callable;

/* renamed from: apdn */
final /* synthetic */ class apdn implements Callable {

    /* renamed from: a */
    private final ContactsRestoreSettingsChimeraActivity f84178a;

    /* renamed from: b */
    private final String f84179b;

    /* renamed from: c */
    private final Long f84180c;

    public apdn(ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity, String str, Long l) {
        this.f84178a = contactsRestoreSettingsChimeraActivity;
        this.f84179b = str;
        this.f84180c = l;
    }

    public final Object call() {
        ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity = this.f84178a;
        String str = this.f84179b;
        Long l = this.f84180c;
        Context applicationContext = contactsRestoreSettingsChimeraActivity.getApplicationContext();
        long longValue = l.longValue();
        if (sto.m36305a()) {
            aoyg.f83841a.mo46985d("SharedPreference being modified on main thread - setRestoreFromSettings()");
        }
        return Boolean.valueOf(apel.m70102b(applicationContext).edit().putLong(str, longValue).commit());
    }
}
